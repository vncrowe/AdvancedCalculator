package io.veronicacrowe;

import java.util.Scanner;

/**
 * Created by veronicacrowe on 5/21/16.
 */
public class User {

    public String getCommandFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a command");
        return input.next();
    }

    public double getNumberFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        return input.nextDouble();
    }

}
