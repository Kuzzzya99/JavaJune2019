import java.util.Scanner;

public class areNumeralsInIncreasingSequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = in.nextInt();
        int firstNumeral = number / 1000;
        int secondNumeral = number % 1000 / 100;
        int thirdNumeral = number % 100 / 10;
        int fourthNumeral = number % 10;
        if (firstNumeral < secondNumeral && secondNumeral < thirdNumeral && thirdNumeral < fourthNumeral) {
            System.out.println("All numbers are in increasing sequence");
        }
        else {
            if (firstNumeral > secondNumeral && secondNumeral > thirdNumeral && thirdNumeral > fourthNumeral) {
                System.out.println("All numbers are in decreasing sequence");
            } else System.out.println("There is no sequence");
        }
    }
}
