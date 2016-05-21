package io.veronicacrowe;
import java.util.Scanner;

/**
 * Created by veronicacrowe on 5/1/16.
 */
public class App {
    public static void main(String[] args) {
        Display display = new Display();
        try {
            display.runCalculator();
        } catch (Exception e) {
            System.out.println("Error");
            display.runCalculator();
        }
    }
}
