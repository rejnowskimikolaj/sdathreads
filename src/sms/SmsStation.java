package sms;

import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SmsStation implements Observer{

    private ExecutorService executorService = Executors.newFixedThreadPool(5);

    private void sendMessage(String text, String number){
        SmsRequest request = new SmsRequest(new Message(text,number));
        request.addObserver(this);

        executorService.execute(request);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof SmsRequest){
            if(arg instanceof Message)onMessageReceived((Message )arg);
        }
    }

    private void onMessageReceived(Message message) {
        System.out.println("Message "+message.getText()+" has been sent to: "+message.getNumber());
    }

    public void sendMessage(String line) {

        String[]splits = line.split(" ");

        String number = splits[0];
        String text = "";
        for(int i=1;i<splits.length;i++){
            text+=splits[i]+" ";
        }

        sendMessage(text,number);
    }


    public void shutdown(){
        this.executorService.shutdown();
    }
}
