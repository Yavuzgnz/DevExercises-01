package day04;

import java.util.Scanner;

public class ArrayMaximalwert {

    public static void main(String[] args) {

        // Create Scanner
        Scanner sc = new Scanner(System.in);

        // Input vom Scanner
        System.out.println("Please enter the numbers divided by space: ");
        String input = sc.nextLine();

        // Close Scanner
        sc.close();

        // Input in Array umwandeln
        String[] numberString = input.split(" ");
        int[] numberInt = new int[numberString.length];

        // Loop to parse the values to the array from string[] to int[]
        for (int i = 0; i < numberString.length; i++) {
            numberInt[i] = Integer.parseInt(numberString[i]);
        }

        // Determine the highest value in the array numberInt[]
        int highestValue = findHighestValue(numberInt);
        System.out.println("The highest value is: " + highestValue);
    }

    // Methode for determining the highest value in an int[] array.
    public static int findHighestValue(int[] num) {
        int highest = num[0];  // Initialize with the first element
        for (int j : num) {
            if (j > highest) {
                highest = j;
            }
        }
        return highest;
    }
}