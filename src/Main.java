import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("This program is a basic calculator that will run all 5 math calculations based on the 2 input numbers.");

        int errorCount = 0;
        double op1;
        double op2;
        while (true) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter any double for this program: ");
                op1 = input.nextDouble();
                if (Double.isFinite(op1)) {
                    break;
                } else {
                    System.out.println("Woah! Your number is either really big or really small! Try again.");
                    errorCount++;
                }
            } catch (InputMismatchException e) {
                e.printStackTrace();
                System.err.flush();
                System.out.println("Error code PEBKAC. Try again.");
                errorCount++;
            }
        }
        System.out.println("Excellent, now do the same thing again.");
        while (true) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter any double for this program: ");
                op2 = input.nextDouble();
                if (Double.isFinite(op2)) {
                    break;
                } else {
                    System.out.println("Woah! Your number is either really big or really small! Try again.");
                    errorCount++;
                }
            } catch (InputMismatchException e) {
                e.printStackTrace();
                System.err.flush();
                System.out.println("Error code PEBKAC. Try again.");
                errorCount++;
            }
        }
        System.out.println("Good job, doing the math now...");

        double a1;
        double a2;
        double a3;
        double a4;
        double a5;

        try {
            a1 = op1 + op2;
            if (Double.isFinite(a1)) {
                System.out.println("The addition answer is: " + a1);
            } else {
                System.out.println("Your number resulted in something too big or too small. The addition answer is: " + a1);
                errorCount++;
            }
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.err.flush();
            System.out.println("Something went wrong while doing addition. Moving on to the next one...");
            errorCount++;
        }

        try {
            a2 = op1 - op2;
            if (Double.isFinite(a2)) {
                System.out.println("The subtraction answer is: " + a2);
            } else {
                System.out.println("Your number resulted in something too big or too small. The subtraction answer is: " + a2);
                errorCount++;
            }
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.err.flush();
            System.out.println("Something went wrong while doing subtraction. Moving on to the next one...");
            errorCount++;
        }

        try {
            a3 = op1 * op2;
            if (Double.isFinite(a3)) {
                System.out.println("The multiplication answer is: " + a3);
            } else {
                System.out.println("Your number resulted in something too big or too small. The multiplication answer is: " + a3);
                errorCount++;
            }
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.err.flush();
            System.out.println("Something went wrong while doing multiplication. Moving on to the next one...");
            errorCount++;
        }

        try {
            a4 = op1 / op2;
            if (Double.isFinite(a4)) {
                System.out.println("The division answer is: " + a4);
            } else {
                System.out.println("Your number resulted in something too big or too small. The division answer is: " + a4);
                errorCount++;
            }
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.err.flush();
            System.out.println("Something went wrong while doing division. Moving on to the next one...");
            errorCount++;
        }

        try {
            a3 = op1 % op2;
            if (Double.isFinite(a3)) {
                System.out.println("The modulus answer is: " + a3);
            } else {
                System.out.println("Your number resulted in something too big or too small. The modulo answer is: " + a3);
                errorCount++;
            }
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.err.flush();
            System.out.println("Something went wrong while doing modulus. Moving on to the next one...");
            errorCount++;
        }

        System.out.println("The program finished with " + errorCount + " errors.");
    }
}