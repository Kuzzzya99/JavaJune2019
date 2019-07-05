import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = in.nextInt();
        int firstNumeral = number / 1000000;
        int secondNumeral = number % 1000000 / 100000;
        int thirdNumeral = number % 100000 / 10000;
        int fourthNumeral = number % 10000 / 1000;
        int fifthNumeral = number % 1000 / 100;
        int sixthNumeral = number % 100/10;
        int seventhNumeral = number %10;
        System.out.println("Reverse number: " +
                seventhNumeral+sixthNumeral+fifthNumeral+fourthNumeral+thirdNumeral+secondNumeral+firstNumeral);
    }
}
