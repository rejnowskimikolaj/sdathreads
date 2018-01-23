package sms;

import java.util.Observable;

public class SmsRequest extends Observable implements Runnable {

    private Message message;


    public SmsRequest(Message message) {
        this.message = message;
    }

    @Override
    public void run() {

        int numberOfCharacters = message.getText().length();
        for (int i = 0; i < numberOfCharacters; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        setChanged();
        notifyObservers(message);

    }
}
