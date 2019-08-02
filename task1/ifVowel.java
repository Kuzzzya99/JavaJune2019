import java.util.Scanner;

public class ifVowel {
    public static void main(String[] args) {
        char[] vowels = {'а', 'о', 'и', 'е', 'ё', 'э', 'ы', 'у', 'ю', 'я'};
        boolean isVowel = false;
        char input;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите букву");
        input = scan.nextLine().toLowerCase().toCharArray()[0];
        for (char c : vowels) {
            if (input == c) {
                isVowel = true;
            }
        }
        if (isVowel) {
            System.out.println("Буква " + input + " гласная");
        } else
            System.out.println("Буква " + input + " coгласная");
    }
}
