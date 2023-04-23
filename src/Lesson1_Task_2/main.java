package Lesson1_Task_2;

import javax.sound.midi.Soundbank;
import java.util.Random;
import java.util.logging.SocketHandler;

public class main {
    public static void main(String[] args) {
        Random rnd = new Random();
        int matrix[][] = new int[3][2];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rnd.nextInt(2);
            }
        }
        System.out.println(calculate(matrix));

    }

    private static int calculate(int[][] matrix) {
        if (matrix.length != matrix[0].length) {
            throw new RuntimeException("массив не квадратный");
        }
        int sum = 0;
        for (int[] row : matrix) {
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
