package sms;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SmsStation smsStation = new SmsStation();
        String line = "";

        while(true){
            System.out.println("give line:");
            line = scanner.nextLine();
            if(line.toLowerCase().equals("stop"))break;
            smsStation.sendMessage(line);
        }

        smsStation.shutdown();
    }
}
