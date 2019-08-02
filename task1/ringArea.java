import java.util.Scanner;

public class ringArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter R1 and R2: ");
        int R1 = in.nextInt();
        int R2 = in.nextInt();
        while (R1<R2 || R1<0 || R2<0){
            System.out.println("Incorrect values. Try again");
            R1 = in.nextInt();
            R2 = in.nextInt();
        }
        double areaOfOuterCircle = Math.PI * (R1 * R1);
        double areaOfInnerCircle = Math.PI * (R2 * R2);
        double areaOfRing = areaOfOuterCircle-areaOfInnerCircle;
        System.out.println("Area of the ring is: " + areaOfRing );
    }
}
