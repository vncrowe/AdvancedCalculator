package io.veronicacrowe;

/**
 * Created by veronicacrowe on 5/1/16.
 */
public class Display {


    public Display() {
        System.out.println("CALCULATOR ON");
    }

    Calculator calculator = new Calculator();
    User user = new User();
    private static double currentNumberDisplayed;
    private boolean calculatorOn = true;
    private double decimalNumber;
    private String commandEntered;



    public void runCalculator() {
        showCommandMenu();
        while (calculatorOn) {
            checkCurrentNumberOnDisplay();
            showCurrentNumberOnDisplay();
            commandEntered = user.getCommandFromUser().toUpperCase();
            calculatorOptions calculatoroptions = calculatorOptions.valueOf(commandEntered);
            switch (calculatoroptions) {
                case ADD:
                    currentNumberDisplayed = calculator.add(currentNumberDisplayed, user.getNumberFromUser());
                    break;
                case SUBTRACT:
                    currentNumberDisplayed = calculator.subtract(currentNumberDisplayed, user.getNumberFromUser());
                    break;
                case MULTIPLY:
                    currentNumberDisplayed = calculator.multiply(currentNumberDisplayed, user.getNumberFromUser());
                    break;
                case DIVIDE:
                    currentNumberDisplayed = calculator.divide(currentNumberDisplayed, user.getNumberFromUser());
                    break;
                case SQUAREROOT:
                    currentNumberDisplayed = calculator.squareRoot(currentNumberDisplayed);
                    break;
                case SQUARE:
                    currentNumberDisplayed = calculator.square(currentNumberDisplayed);
                    break;
                case INVERSE:
                    currentNumberDisplayed = calculator.inverse(currentNumberDisplayed);
                    break;
                case EXPONENT:
                    currentNumberDisplayed = calculator.exponent(currentNumberDisplayed, user.getNumberFromUser());
                    break;
                case CLEAR:
                    currentNumberDisplayed = calculator.currentNumberDisplayed();
                    break;
                case INVERT:
                    currentNumberDisplayed = calculator.invertSign(currentNumberDisplayed);
                    break;
                case SAVE:
                    System.out.println("Store a number in storage");
                    calculator.storeAValueInMemory(user.getNumberFromUser());
                    break;
                case RETRIEVE:
                    System.out.println("Number stored in Memory: ");
                    System.out.println(calculator.getValueStoredInMemory());
                    break;
                case RESETMEMORY:
                    System.out.println("Memory value is now 0");
                    calculator.resetValueStoredInMemory();
                    break;
                case SIN:
                    currentNumberDisplayed = calculator.sine(currentNumberDisplayed);
                    break;
                case COS:
                    currentNumberDisplayed = calculator.cosine(currentNumberDisplayed);
                    break;
                case TAN:
                    currentNumberDisplayed = calculator.tangent(currentNumberDisplayed);
                    break;
                case INVERSESINE:
                    currentNumberDisplayed = calculator.inverseSin(currentNumberDisplayed);
                    break;
                case INVERSECOS:
                    currentNumberDisplayed = calculator.inverseCosine(currentNumberDisplayed);
                    break;
                case INVERSETAN:
                    currentNumberDisplayed = calculator.inverseTangent(currentNumberDisplayed);
                    break;
                case LOG:
                    currentNumberDisplayed = calculator.log(currentNumberDisplayed);
                    break;
                case INVERSELOG:
                    currentNumberDisplayed = calculator.inverseLog(currentNumberDisplayed);
                    break;



                    currentNumberDisplayed = calculator.naturalLog(currentNumberDisplayed);
                    break;
                case INVERSENL:
                    currentNumberDisplayed = calculator.inverseNaturalLog(currentNumberDisplayed);
                    break;
                case FACTORIAL:
                    currentNumberDisplayed = calculator.calculateTheFactorial(currentNumberDisplayed);
                    break;
                case OFF:
                    calculatorOn = false;
                    break;
                case MENU:
                    showCommandMenu();
                    break;
                default:
                    System.out.println("Did not enter a valid command");
                    break;
            }
        }
    }





    public double getCurrentNumberOnDisplay() {
        return currentNumberDisplayed;
    }

    public void setCurrentNumberOnDisplay(double currentNumberOnDisplay) {
        this.currentNumberDisplayed = currentNumberOnDisplay;
    }

    public void showCurrentNumberOnDisplay() {
        System.out.println("Current Number On Display: " + currentNumberDisplayed);
    }



    public void showCommandMenu() {

        System.out.print("Please pick a command\nADD\nSUBTRACT\nMULTIPLY\nDIVIDE\nSQUAREROOT\nSQUARE\nINVERSE\nEXPONENENTIAL\nCLEAR\nINVERST\nSAVE\nRETRIEVE\nRESET MEMORY\nSIN\nCOS\nTAN\n INVERSE SINE\nINVERSE COSINE\nINVERSE TAN\nLOG\nINVERSE LOG\nNATURAL LOG\n INVERSE NATURAL LOG\nFACTORIAL\nOFF");

    }
}
