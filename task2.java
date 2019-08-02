
import java.util.Random;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Random rnd = new Random(System.currentTimeMillis());// Инициализируем генератор
        int numOfFlips = 1 + rnd.nextInt(1000);
        headsOrTails (numOfFlips);

        int number = 1 + rnd.nextInt(1000000);
        getGreatestDigit (number);

        polyndromeCheck () ;

        simpleCheck();

        simpleDeviders ();

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to find GCD and LCM: ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("GCD of " + a +" and " + b + " is " + nokAndNod.gcd(a, b));
        System.out.println("LCM of " + a +" and " + b + " is " + nokAndNod.lcm(a, b));

        differentDigitsCount();

        perfectNumber();
        
        System.out.println("Enter min and max of range to find friendly numbers: ");
        int firstNum = in.nextInt();
        int secondNum = in.nextInt();
        friendlyNumbersCheck(firstNum,secondNum);
    }

    public static void headsOrTails(int numOfFlips) { //Орёл или Решка
        Random rand = new Random(System.currentTimeMillis());

        int headsCount = 0;
        int tailsCount = 0;
        boolean coinFlip = true;

        for (int i = 1; i <= numOfFlips; i++) {

            coinFlip = rand.nextBoolean();
            if (coinFlip == true) {
                headsCount++;
            } else {
                tailsCount++;
            }

        }
        System.out.println("Heads count - " + headsCount + ", Tails count - " + tailsCount);
    }

    public static void getGreatestDigit(int number) { //максимальная цифра в числе
        int maxDigit = 0;
        System.out.println("The number is " + number);

        maxDigit = number % 10;
        number = number / 10;
        while (number > 0) {
            if (number % 10 > maxDigit)
                maxDigit = number % 10;
            number = number / 10;
        }

        System.out.println("Max digit of the number is " + maxDigit);
    }

    public static void polyndromeCheck() { //проверка на полиндром
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number for checking if this number is polyndrome: ");
        int ifPolyndrome = in.nextInt();
        int temp = 0;
        int temp2 = ifPolyndrome;

        while (temp2 > 0) {
            temp = (temp * 10) + (temp2 % 10);
            temp2 = temp2 / 10;
        }

        if (ifPolyndrome == temp) {
            System.out.println("Number is polyndrome ");
        } else {
            System.out.println("Number is not polyndrome ");
        }
    }

    public static void simpleCheck() { //простое ли число
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number for checking if this number is simple: ");
        int ifSimple = in.nextInt();
        int i = 1;
        int k = 0;

        while (i < ifSimple) {
            if (ifSimple % i == 0) {
                k++;
            }
            i++;
        }

        if (k > 2) {
            System.out.println("Number is not simple");
        } else {
            System.out.println("Number is simple");
        }
    }

    public static void simpleDeviders() { //нахождение простых множителей
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to find simple deviders: ");
        int numberForSimpleDeviders = in.nextInt();
        double sqrt = Math.sqrt(numberForSimpleDeviders);
        int currentValue = numberForSimpleDeviders;
        int multiplier = 2;
        while (currentValue > 1 && multiplier <= sqrt) {
            if (currentValue % multiplier == 0) {
                System.out.print(multiplier + " ");
                currentValue /= multiplier;
            } else if (multiplier == 2) {
                multiplier++;
            } else {
                multiplier += 2;
            }
        }
        if (currentValue != 1) {
            System.out.print(currentValue);
        }
    }


    static class nokAndNod {
        // Recursive method to return gcd of a and b
        static int gcd(int a, int b) {
            if (a == 0)
                return b;
            return gcd(b % a, a);
        }

        // method to return LCM of two numbers
        static int lcm(int a, int b) {
            return (a * b) / gcd(a, b);
        }

    }

    public static void differentDigitsCount() {
        long n;
        int differentDigitsCount = 0;
        int[] digitsCount = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to find number of different digits: ");
        n = scanner.nextLong();

        while (n != 0) {
            digitsCount[(int) (n % 10)]++;
            n /= 10;
        }
        for (int i = 0; i < 10; i++) {
            if (digitsCount[i] > 0) differentDigitsCount++;
        }

        System.out.println(differentDigitsCount);
    }

    public static boolean isFriendly(int num1, int num2) {// метод для проверки 2 чисел на дружественность

        int dividersSumm1 = 0, dividersSum2 = 0;
        if (num1 == num2) {
            return false;
        }
        for (int i = 1; i <= (num1 / 2); i++) {
            if((num1 % i) == 0) {
                dividersSumm1 += i;
            }
        }
        for (int j = 1; j <= (num2 / 2); j++) {
            if((num2 % j) == 0) {
                dividersSum2 += j;
            }
        }
        if ((dividersSumm1 == num2) && (dividersSum2 == num1)) {
            return true;
        } else {
            return false;
        }
    }


    public static void perfectNumber() {
        System.out.print("Enter A Number: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int sumOfDivisors = 0;

        for (int divisor = 1; divisor < input; divisor++) {

            if (input % divisor == 0) {
                sumOfDivisors += divisor;
                System.out.println(divisor + " ");
            }
        }

        if (sumOfDivisors == input) {
            System.out.printf("Therefore %,d is a perfect number.%n%n", input);
        } else {
            System.out.printf("Therefore %,d is not a perfect number.%n%n", input);
        }
    }



    public static void friendlyNumbersCheck(int firstNum, int secondNum) {

        for (int i = firstNum; i <= secondNum; i++) { //цикл переребирает диапазон
            for (int j = (i + 1); j <= secondNum; j++) {// цикл сравнивает каждый делитель i поочереддно с диапазоном

                if (isFriendly(i, j)) {
                    System.out.println("Numbers " + i + " and " + j+" are friendly");
                }
            }
        }

    }
}



