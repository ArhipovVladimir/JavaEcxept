package Lesson1_Task_2;


import java.util.Random;

public class main {
    public static void main(String[] args) {
        Random rnd = new Random();
        int matrix[][] = new int[10][10];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rnd.nextInt(2);
            }
        }
        printMatrix(matrix);
        System.out.println(calculate(matrix));

    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();

        }
    }

    private static int calculate(int[][] matrix) {

        int sum = 0;
        for (int i = 0; i < matrix.length; i++)
        {
            int[] row = matrix[i];
            if (matrix.length != matrix[i].length) {
                throw new RuntimeException("массив не квадратный");
            }
            for (int cell : row) {
                if (cell != 0 && cell != 1) {
                    throw new RuntimeException("массив не из 0 и 1");
                }
                sum += cell;

            }
        }

        return sum;
    }


}
