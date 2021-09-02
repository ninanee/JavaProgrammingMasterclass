import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class StringPractice {

    public static void printSquareStar(int number){
        if(number < 5){
            System.out.println("Invalid Value");
        }

        for(int row = 0; row < number; row++){
            for(int column = 0; column < number; column++){
                if(row==0 || row==number-1 || column==0 || column==number-1
                        || column==row || column==number-1-row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //handle the user input challenge

    public static void handleInputChallenge() {
        int counter = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        while (true){
            int order = counter + 1;
            System.out.println("Please enter number#" + order + ":");

            if(scanner.hasNextInt()){
                int number = scanner.nextInt();
                counter++;
                sum += number;
                if(counter == 10){
                    break;
                }
            }else {
                System.out.println("Invalid input");
            }
                scanner.nextLine(); //handle the enter button

        }
        System.out.println("The sum is " + sum);
        scanner.close();
    }

    //minimum and maximum challenge;
    public static void maxAndMinimum(){

        int maximum = 0;
        int minimum = 0;
        //solution2
//        int max = Integer.MAX_VALUE;
//        int min = Integer.MIN_VALUE;

        Scanner scanner = new Scanner(System.in);

        //solution1:
        boolean first = true;

        while(true){
            System.out.println("Please enter the number:");

            if(scanner.hasNextInt()){
                int number = scanner.nextInt();

                //这是一种解决方案，先要把number赋值过去
                if(first){
                    first = false;
                    maximum = number;
                    minimum = number;
                }

                if(number > maximum){
                    maximum = number;
                }

                if(number < minimum){
                    minimum = number;
                }
            }else {
                System.out.println("Invalid Number");
                break;
            }
            scanner.nextLine();
        }
        System.out.println("The maximum number is: " + maximum + " and the minimum number is: " + minimum);
    }

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        double sum = 0;
        long average = 0;

        while (true){
//            System.out.println("Please enter the num#" + order);
            if(scanner.hasNextInt()){
                int number = scanner.nextInt();
                counter++;
                sum += number;
                average = Math.round(sum / counter);

            }else {
//                System.out.println("Invalid input");
                break;
            }
            scanner.nextLine();
        }
        System.out.println("SUM = " + (int)sum + " AVG = " + average);
        scanner.close();
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width <= 0 || height <= 0|| areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }
        return (int)Math.ceil((((width * height) / areaPerBucket) - extraBuckets));
    }

    //overload method getBucketCount
    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width <= 0 || height <= 0|| areaPerBucket <= 0){
            return -1;
        }
        return (int)Math.ceil(((width * height) / areaPerBucket));
    }

    //overload method getBucketCount
    public static int getBucketCount(double areaPerBucket, double extraBuckets){
        if(areaPerBucket <= 0 ||  extraBuckets <= 0){
            return -1;
        }
        return (int)Math.ceil(areaPerBucket / extraBuckets);
    }


    public static void main(String[] args){
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(-3.4, 2.1, 1.5));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(7.25, 4.3, 2.35));
        System.out.println(getBucketCount(3.4, 1.5));
        System.out.println(getBucketCount(6.26, 2.2));
        System.out.println(getBucketCount(3.26, 0.75));
    }
}

