import java.util.Scanner;

public class AllRecursive {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Recursive Operations Menu");
        System.out.println("1. Power");
        System.out.println("2. Factoring");
        System.out.println("3. Summation");
        System.out.println("0. Exit");


        int choice = userInput.nextInt();
        switch (choice) {
            case 0:
                System.out.println("Exiting...");
                userInput.close();
                return;
            case 1:
                powerMenu();
                break;
            case 2:
                factorMenu();
                break;
            case 3:
                summationMenu();
                break;
            default:
                System.out.println("Invalid choice! Please try again.");

        }
        menu();
    }

    public static void powerMenu() {
        Scanner powerInput = new Scanner(System.in);
        System.out.println("Calculate the power of the number");
        System.out.println("Enter the base number (The number cannot be negative >:C)");
        int baseNumber = powerInput.nextInt();
        System.out.println("Enter the exponent(The number cannot be negative >:C)");
        int expoInt = powerInput.nextInt();

        try {
            int powerResult = power(baseNumber, expoInt);
            System.out.println("Answer: " + powerResult);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            powerInput.close();
        }
    }

    public static int power(int baseNumber, int expoInt) {
        if (expoInt < 0)
            throw new IllegalArgumentException("Exponent cant be a negative number. >:C");
        if (expoInt == 0)
            return 1;
        return baseNumber * power(baseNumber, expoInt - 1);
    }

    public static void factorMenu() {
        Scanner factorInput = new Scanner(System.in);
        System.out.println("Factor the given number");
        System.out.println("Enter a number. (The number cannot be negative >:C)");
        int factorNumber = factorInput.nextInt();
    
        try {
            int factorResult = factorial(factorNumber);
            System.out.println("Answer: " + factorResult);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());  
        } finally {
            factorInput.close();
        }
    }

    public static int factorial(int factorNumber) {
        if (factorNumber < 0)
            throw new IllegalArgumentException("yo...the number cannot be negative >:C ");
        if (factorNumber == 0) 
            return 1;
        if (factorNumber > 12)
            throw new IllegalArgumentException("numbah too big");
            return factorNumber * factorial(factorNumber - 1); 

    }

    public static void summationMenu() {
        Scanner summationInput = new Scanner(System.in);
        System.out.println("Calculates the summation.");
        System.out.println("Enter a number(The number cannot be negative >:C)");
        int summationNumber = summationInput.nextInt();

        try {
            int summationResult = summation(summationNumber);
            System.out.println("Answer: " + summationResult);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            summationInput.close();
        }
    }

    public static int summation (int summationNumber) {
        if (summationNumber < 0)
            throw new IllegalArgumentException("yo!..number cannot be a negativ...");
        if (summationNumber == 0 )
            return 0;
            return summationNumber + summation(summationNumber - 1);
    }
}
