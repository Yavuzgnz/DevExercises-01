package day01;

import java.util.Scanner;

public class ArraySummation {

    /*
    * Task
    * Schreibe eine Funktion, die ein Array von Zahlen als Eingabe nimmt und die Summe dieser Zahlen berechnet.
    * */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a list of numbers divided by space only: ");

        String input = sc.nextLine();
        String[] inputArray = input.split(" ");
        int[] numbers = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            numbers[i] = Integer.parseInt(inputArray[i]);
        }

        sc.close();

        int result = sumArray(numbers);

        System.out.println(result);

    }

    private static int sumArray(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

}
