import java.util.Scanner;

public class ifVowel2 {
    public static void main(String[] args) {
        char input;
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите букву");
        input=scan.nextLine().toLowerCase().toCharArray()[0];
        switch (input){
            case 'а':{}
            case 'о':{}
            case 'и':{}
            case 'е':{}
            case 'э':{}
            case 'ы':{}
            case 'у':{}
            case 'ю':{}
            case 'я':{}
            case 'ё':{
                System.out.println("Буква "+input+" гласная");
            }
            break;
            default:{
                System.out.println("Буква "+input+" coгласная");
            }
        }
    }
}
