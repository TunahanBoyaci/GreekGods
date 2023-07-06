package GreekGods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Greek Gods and Goddesses show...");
        System.out.println("Press q to exit");

        while (true){
            System.out.println("Which Gods and Goddesses you want to produce?");
            String answer = scanner.nextLine();

            if (answer.equals("q")){
                System.out.println("Exiting from the Greek World.");
                break;
            }
            else {
                GodFactory godFactory = new GodFactory();
                GreekGods_Goddesses greekGodsGoddesses = godFactory.produceGodGoddess(answer);

                if (greekGodsGoddesses == null){
                    System.out.println("Please enter a valid God Name");
                }
                else {
                    greekGodsGoddesses.printInfo();
                    greekGodsGoddesses.attack();
                    greekGodsGoddesses.exposeSecretPower();
                }
            }
        }
    }
}

