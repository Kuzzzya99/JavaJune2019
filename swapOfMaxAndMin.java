import java.util.Random;
import java.util.Scanner;

public class swapOfMaxAndMin {
    public static void main(String[] args) {
        int[] arr = createArr();
        int max = findMax(arr.length, arr);
        int min = findMin(arr.length, arr);
        swap(max, min, arr);
    }

    public static boolean checkLength(int n) {
        if (n < 2) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean checkIfMaxAndMinAreTheSame(int n, int arr[]) {

        if (findMin(n, arr) == findMax(n, arr) ) {
            return false;
        } else {
            return true;
        }

    }

    public static int[] createArr() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во чисел в последовательности:");
        int n = in.nextInt();

        if (checkLength(n)==true) {
            int[] A = new int[n];
            Random random = new Random(); //заполняем массив и выводим и определяем индексы максимума и минимума
            System.out.println("Исходный массив: ");

            for (int i = 0; i < n; i++) {
                A[i] = random.nextInt() % 100;
                System.out.print(A[i] + " ");
            }

            if (checkIfMaxAndMinAreTheSame(n, A) == true){
                return A;
            } else {
                System.out.println("Минимальный и максимальный элементы равны!");
            }
        } else {
            System.out.println("Неверный формат введённых данных!");
        }
        System.out.println("Попробуйте ещё раз!");
    return createArr();
    }

    public static int findMax(int n, int[] A) {

        int max = Integer.MIN_VALUE;
        int imax = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] > max) {
                max = A[i];
                imax = i;
            }
        }
        return imax;
    }

    public static int findMin(int n, int[] A) {
        int min = Integer.MAX_VALUE;
        int imin = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] < min) {
                min = A[i];
                imin = i;
            }
        }
        return imin;
    }



    public static void swap (int imax, int imin, int[] A) {
        int swap;
        swap = A[imin];
        A[imin] = A[imax];
        A[imax] = swap;
        System.out.println("Массив после обмена:");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
