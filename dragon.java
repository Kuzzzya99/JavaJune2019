import java.util.Scanner;

public class dragon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = in.nextInt();
        int headNum = 3;
        for(int i=1;i<=age && i<200; i++){
            headNum+=3;
        }
        for(int i=200; i<=age && i<300; i++){
            headNum+=2;
        }
        for(int i=300; i<=age; i++){
            headNum++;
        }
        System.out.println("Голов - "+headNum+", глаз - "+headNum*2);

    }
}
