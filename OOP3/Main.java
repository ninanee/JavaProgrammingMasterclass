import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem() {
        System.out.println("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.println("Current the item number: ");
        String itemNo = scanner.nextLine();
        System.out.println("Enter the replace item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo, newItem);
    }

    public static void removeItem() {
        System.out.println("Enter the item number: ");
        String itemNo = scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    public static void searchItem() {
        System.out.println("Item to search for: ");
        String searchItem = scanner.nextLine();
        if(groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem + " in your grocery list");
        }else {
            System.out.println(searchItem + "not in your grocery list");
        }
    }
    public static void main(String[] args) {
//        boolean quit = false;
//        int choice = 0;
//        printInstructions();
//        while (!quit){
//            System.out.println("Enter your choice: ");
//            choice = scanner.nextInt();
//            scanner.nextLine(); //clear the input buffer
//
//            switch (choice){
//                case 0:
//                    printInstructions();
//                    break;
//                case 1:
//                    groceryList.printGroceryList();
//                    break;
//                case 2:
//                    addItem();
//                    break;
//                case 3:
//                    modifyItem();
//                    break;
//                case 4:
//                    removeItem();
//                    break;
//                case 5:
//                    searchItem();
//                    break;
//                case 6:
//                    quit = true;
//                    break;
//            }
//
//    }


}

//
//    private static void modifyArray(int[] array){
//        array[0] = 2;
//        array = new int[] {1, 2, 4, 5, 6}; //dereference array
//    }


//    public static Scanner scanner = new Scanner(System.in);
//
//    public static int[] getInteger(int number){
//        System.out.println("Please enter 5 numbers.\r");
//        int[] array = new int[number];
//
//        for (int i = 0; i < array.length; i++){
//            array[i] = scanner.nextInt();
//        }
//        return array;
//    }
//
//    public static double getAverage(int[] array) {
//        int sum = 0;
//        for(int i = 0; i < array.length; i++){
//            sum += array[i];
//        }
//        return (double) sum /(double) array.length;
//    }
//
//    public static void printArray(int[] array){
//        for(int i = 0; i < array.length; i++){
//            System.out.println("Elements = " + i + ", Values = " + array[i]);
//        }
//    }
//

}
