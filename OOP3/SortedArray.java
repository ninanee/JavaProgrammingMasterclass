import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++){
            System.out.println("Element " + i + " content " + array[i]);
        }
    }

    public static int[] getIntegers(int number) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter " + number + " numbers. \r");
        int[] value = new int[number];

        for(int i = 0; i < value.length; i ++){
            value[i] = scanner.nextInt();
        }
        scanner.close();
        return value;

    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp = 0;

        while(flag) {
            flag = false;

            for(int i = 0; i < sortedArray.length - 1; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

}
