import java.util.Scanner;

public class areAllNumbersSame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a,b,c: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a==b && a==c) {
            System.out.println("Numbers are the same");
        }
        else System.out.println("Numbers are not the same");
    }
}
