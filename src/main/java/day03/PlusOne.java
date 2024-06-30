package day03;

import java.util.Arrays;
import java.util.Scanner;


public class PlusOne {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Schritt 1: Eingabe als Zeichenkette einlesen
        System.out.print("Geben Sie eine Zahl ein: ");
        String input = scanner.nextLine();

        // Schritt 2: Länge der Eingabezeichenkette bestimmen und Array erstellen
        int arrayLength = input.length();
        int[] array = new int[arrayLength];

        // Schritt 3: Array mit den Ziffern der Eingabezeichenkette füllen
        for (int i = 0; i < arrayLength; i++) {
            array[i] = Character.getNumericValue(input.charAt(i));
        }
        // Scanner schließen
        scanner.close();

        System.out.println(Arrays.toString(plusOne(array)));
    }



    public static int[] plusOne(int[] digits) {

        int n = digits.length;

        digits[n-1] += 1;

        for (int i = n - 1; i > 0; i--) {
            if (digits[i] == 10) {
                digits[i] = 0;
                digits[i - 1] += 1;
            }
        }

        if (digits[0] == 10) {
            digits[0] = 0;
            int[] newDigits = new int[n + 1];
            newDigits[0] = 1;
            System.arraycopy(digits, 0, newDigits, 1, n);
            return newDigits;
        }

        return digits;



    }



}
