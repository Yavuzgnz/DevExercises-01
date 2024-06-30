package day05;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAvarage {

    public static double calcAverage(int[] num) {

        double sum = 0;
        for (int n: num ) {
            sum += n;
        }
        return sum/num.length;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers seperated by spaces to calculate the average: ");
        String input = sc.nextLine();

        try {
            String[] numString = input.split(" ");
            int[] numArray = new int[numString.length];

            for (int i = 0; i < numString.length; i++) {
                numArray[i] = Integer.parseInt(numString[i]);
            }

            double average = calcAverage(numArray);
            System.out.println("The average of the given numbers is: " + average);

        } catch (NumberFormatException e) {
            System.out.println("Please enter valid integers separated by spaces (\"1 2 3\"): ");
        }finally {
            sc.close();
        }


    }

}
