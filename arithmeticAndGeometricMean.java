import java.util.Scanner;

public class arithmeticAndGeometricMean {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = in.nextInt();
        int firstNumeral = number / 100000;
        int secondNumeral = number % 100000 / 10000;
        int thirdNumeral = number % 10000 / 1000;
        int fourthNumeral = number % 1000 / 100;
        int fifthNumeral = number % 100 / 10;
        int sixthNumeral = number % 10;
        float summ = firstNumeral + secondNumeral + thirdNumeral + fourthNumeral + fifthNumeral + sixthNumeral;
        float composition = fifthNumeral * secondNumeral * thirdNumeral * fourthNumeral * fifthNumeral * sixthNumeral;

        double arithmeticMean = summ / 6;
        double geometricMean = Math.pow(composition, 1.0 / 6);
        System.out.println("Arithmetic mean: " + arithmeticMean);
        System.out.println("Geometric mean: " + geometricMean);
    }
}