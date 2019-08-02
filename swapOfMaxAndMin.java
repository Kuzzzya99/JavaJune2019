import java.util.Random;
import java.util.Scanner;

public class swapOfMaxAndMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во чисел в последовательности:");
        int n = in.nextInt();

        swap(n, createArr(n));
    }
    
    public static boolean check(int n) {
        if (n < 2) {
            return false;
        } else {
            return true;
        }
    }

    public static int[] createArr(int n) {
        int[] A = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int imax = 0;
        int imin = 0;

        Random random = new Random(); //заполняем массив и выводим и определяем индексы максимума и минимума
        System.out.println("Исходный массив: ");
        for (int i = 0; i < n; i++) {
            A[i] = random.nextInt() % 100;
            System.out.print(A[i] + " ");
            if (A[i] < min) {
                min = A[i];
                imin = i;
            }
            if (A[i] > max) {
                max = A[i];
                imax = i;
            }
        }
        return A;
    }

    public static void swap(int n, int[] A) {
        //Меняем местами и выводим
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int imax = 0;
        int imin = 0;
        int swap;
        for (int i = 0; i < n; i++) {
            if (A[i] < min) {
                min = A[i];
                imin = i;
            }
            if (A[i] > max) {
                max = A[i];
                imax = i;
            }
        }

        System.out.println("\nмаксимальное число = " + A[imax]);
        System.out.println("минимальное число = " + A[imin]);
        swap = A[imin];
        A[imin] = A[imax];
        A[imax] = swap;
        System.out.println("Массив после обмена:");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }

    }

}
