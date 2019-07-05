import java.util.Scanner;

public class changeNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a,b: ");
        int a = in.nextInt();
        int b = in.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println ("Содержимое двух переменных изменено: a:" + a +" b:" +b);
    }
}
