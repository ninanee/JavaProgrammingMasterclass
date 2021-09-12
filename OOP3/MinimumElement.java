import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {
    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        int element = scanner.nextInt();
        scanner.close();
        return element;
    }

    private static int[] readElements(int count) {
        Scanner scanner = new Scanner(System.in);
        int[] myArray = new int[count];

        for(int i = 0; i < myArray.length; i++){
            int number = scanner.nextInt();
            scanner.nextLine();
            myArray[i] = number;
        }

        scanner.close();
        return myArray;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < array.length; i++){
            if(array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    private static void reverse(int[] arr){
        int maxLength = arr.length - 1;
        int halfLength = arr.length / 2;

        for(int i = 0; i < halfLength; i++) {
            int temp = arr[i];
            arr[i] = arr[maxLength - i];
            arr[maxLength - i] = temp;
        }
    }

}
