package factoriallive;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);

        int number =0;
        while(true){
            System.out.println("Podaj liczbę: ");
            number = scanner.nextInt();
            if(number!=-1)calculator.countFactorial(number);
            else break;

        }

        calculator.shutdown();

        System.out.println(calculator.getResults());
    }
}
