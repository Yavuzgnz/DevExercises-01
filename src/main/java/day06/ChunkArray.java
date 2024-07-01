package day06;

import java.util.Arrays;

public class ChunkArray {

    public static int[][] toChunk(int[] arr, int size) {
        // Berechne die Anzahl der Chunks
        int numChunks = (arr.length + size - 1) / size;
        int[][] arrayResult = new int[numChunks][];

        for (int i = 0; i < numChunks; i++) {
            // Bestimme die Größe des aktuellen Chunks
            int chunkSize = Math.min(size, arr.length - i * size);
            arrayResult[i] = new int[chunkSize];

            for (int j = 0; j < chunkSize; j++) {
                arrayResult[i][j] = arr[i * size + j];
            }
        }

        return arrayResult;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int size = 1;

        int[][] arr2 = toChunk(arr, size);
        System.out.println(Arrays.deepToString(arr2));
    }
}