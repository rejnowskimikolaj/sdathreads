package factoriallive;

public class Request implements Runnable {

    private static final long SLEEP_MS = 200;
    private OnFactioralCountedListener listener;

    int number;

    public Request(int number,OnFactioralCountedListener listener) {
        this.number = number;
        this.listener = listener;
    }

    @Override
    public void run() {

        System.out.println("New thread for factorial for number: "+number+ " has just started.");
        countFactorial();

    }

    private void countFactorial() {

        long result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
            try {
                Thread.sleep(SLEEP_MS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("factorial of: " + number + " is: " + result);
        listener.onFactorialCounted(result,number);

    }


}
