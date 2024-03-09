import java.util.Scanner;

public class ListingRE {
    public static void main(String[] args) {
        HList houseList = new HList();
        Scanner userInput = new Scanner(System.in);
        int userChoice;

        do {
            displayMenu();
            
            try {
                userChoice = userInput.nextInt();
                userInput.nextLine(); 
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                userInput.nextLine(); 
                continue;
            }

            switch (userChoice) {
                case 1:
                    addHouse(userInput, houseList);
                    break;
                case 2:
                    removeHouse(userInput, houseList);
                    break;
                case 3:
                    printHousesBelowPrice(userInput, houseList);
                    break;
                case 4:
                    printAllHouses(houseList);
                    break;
                case 0:
                    System.out.println("Program ended.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 0 and 4.");
            }

        } while (userChoice != 0);

        userInput.close();
    }

    private static void displayMenu() {
        System.out.println("1. Add a house");
        System.out.println("2. Remove a house");
        System.out.println("3. Print houses that cost less than a given price");
        System.out.println("4. Print all the houses");
        System.out.println("0. End this program");
        System.out.print("Enter your choice: ");
    }


    private static void addHouse(Scanner userInput, HList houseList){
        System.out.println("Enter MLS: ");
        int mls = userInput.nextInt();

        if (houseList.containsMLS(mls)){
            System.out.println("House with MLS" + mls + "already listed.");
        }
        System.out.println("Enter bedrooms: ");
        int bedrooms = userInput.nextInt();

        System.out.println("Enter Price: ");
        double price = userInput.nextDouble();

        System.out.println("Enter seller name: ");
        userInput.nextLine();
        String seller = userInput.nextLine();

        try {
            House newListHouse = new House(mls, bedrooms, price, seller);
            houseList.addHouse(newListHouse);
            System.out.println("House Listed!");
        } catch (HouseException e) {
            System.out.println("Exeption: " + e.getMessage());
        }
    }
    
    private static void removeHouse (Scanner userInput, HList houseList){
        System.out.println("Enter MLS of the house to remove: ");
        int removeListing = userInput.nextInt();
        houseList.removeHouse(removeListing);
    }

    private static void printHousesBelowPrice (Scanner userInput, HList houseList){
        System.out.println("Enter the max price: ");
        double maxPrice = userInput.nextDouble();
        houseList.printLower(maxPrice);
    }

    private static void printAllHouses (HList houseList) {
        houseList.printAll();
    }
}