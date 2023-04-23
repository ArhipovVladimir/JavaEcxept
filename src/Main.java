import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("> ");
        int scanerNumber = scanner.nextInt();
        int[] array = {1,2,3,4,5};
        int res = arrayN (array, scanerNumber);
        switch (res){
            case -3 -> System.out.println("Массив не может быть null");
            case -4 -> System.out.println("длинна массива равна нулю");
            case  -1 -> System.out.printf("Массив мень заданной длинны (3)");
            case - 2 -> System.out.printf("%dЧисло не найдено", scanerNumber);
            default -> System.out.printf("%d имеет индекс %d", scanerNumber, res);
        }
        scanner.close();
    }

    private static int arrayN(int[] array, int n1) {
        if (array == null) {
            return -3;
        }
        if (array.length == 0) {
            return  -4;
        }
        if (array.length < 3) {
            return -1;
        }
        else  {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == n1) return i;

                 }
            }

        return -2;
    }
}