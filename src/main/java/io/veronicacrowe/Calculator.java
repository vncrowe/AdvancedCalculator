package io.veronicacrowe;
import java.util.Scanner;


/**
 * Created by veronicacrowe on 5/1/16.
 */

public class Calculator {


    public static int displayAnswer;
    boolean calculatorOn = true;
    calculatorOptions calculatorOptions;
    Calculator calculator;


    public static double add(double value1, double value2) {
        return value1 + value2; //sum values

    }

    public static double subtract(double value1, double value2) {
        return value1 - value2; //subtract values

    }

    public static double multiply(double value1, double value2) {
        return value1 * value2; //multiply values

    }

    public static double divide(double value1, double value2) {
        return value1 / value2; //divide values

    }

    public static double square(double value1){

        return value1 * value1;
    }

    public static double squareRoot(double value1){
        return Math.sqrt(value1);
    }

    public static double exponent(double value1, double value2){
        return Math.pow(value1,value2);
    }

    public static double inverse(double value1){
        return 1 / value1;
    }

    public static double invertSign(double value1){
        return value1 * -1;
    }


    public static double sine(double value1){
        return Math.sin(value1);
    }

    public static double cosine(double value1){
        return Math.cos(value1);
    }

    public static double tangent(double value1){
        return Math.tan(value1);
    }

    public static double inverseSin(double value1){
        return Math.atan(value1);
    }

    public static double inverseCosine(double value1){
        return Math.acos(value1);
    }

    public static double inverseTangent(double value1){
        return Math.atan(value1);
    }

    public static double log(double value1){
        return Math.log10(value1);
    }

    public static double inverseNaturalLog(double value1) {
        return Math.pow(Math.E, (Math.log(value1)));
    }

    public static double naturalLog(double value1){
        return Math.log(value1);
    }

    public static double inverseLog(double value1){
        return Math.pow(10, value1);
    }

    public double calculateTheFactorial(double value1) {
        if (value1 == 1) {
            return 1;
        } else {
            return calculateTheFactorial(value1 - 1) * value1;
        }
    }
    public  double calculatePieOfValue(double value1){
        return  3.14159265358979323846264338327950288419716939937510 * value1;

    }



    public calculatorOptions askUserCalculationSelection() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the calculation you'd like to perform from the options below:\nADD\nSUBTRACT\nMULTIPLY\nDIVIDE");
        calculatorOptions selection = calculatorOptions.valueOf(sc.next().toUpperCase());
        return selection;
    }

    public int askForFirstNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number:");
        int firstValue = sc.nextInt();
        return firstValue;
    }

    public int askForSecondNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter second number:");
        int secondValue = sc.nextInt();
        return secondValue;
    }

    public void pickAnOption(calculatorOptions calculatorOption) {
        switch (calculatorOption) {
            case ADD:
                System.out.println(calculator.add(askForFirstNumber(), askForSecondNumber()));
                break;
            case SUBTRACT:
                System.out.println(calculator.subtract(askForFirstNumber(), askForSecondNumber()));
                break;
            case MULTIPLY:
                System.out.println(calculator.multiply(askForFirstNumber(), askForSecondNumber()));
                break;
            case DIVIDE:
                System.out.println(calculator.divide(askForFirstNumber(), askForSecondNumber()));
                break;
            default:
                System.out.println("Please make a valid selection (ADD, SUBTRACT, MULTIPLY, DIVIDE");
        }
    }

    public void runCalculator() {
        calculator = new Calculator();
        while (calculatorOn) {
            pickAnOption(askUserCalculationSelection());

            calculatorOn = false;
        }
    }
}
