package factoriallive;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Calculator {


    private ExecutorService service = Executors.newFixedThreadPool(3);
    private List<String> results = Collections.synchronizedList(new ArrayList<>());

    public void countFactorial(int number){

        Request request = new Request(number,this);
        service.execute(request);


    }

    public void shutdown(){
        this.service.shutdown();
    }

    public void onFactorialCounted(long result,int number){
        String equation = number+"! = "+number;
        System.out.println("saving to list: "+equation);
        results.add(equation);
    }

    public List<String> getResults() {
        return results;
    }


}
