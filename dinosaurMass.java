import java.util.Scanner;

public class dinosaurMass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter mass in kilos: ");
        double massOfDinosaur = in.nextInt();
        double massInMilligrams = massOfDinosaur*1000000;
        double massInGrams = massOfDinosaur*1000;
        double massInTones = massOfDinosaur/1000;
        System.out.println("Mass in milligrams: " + massInMilligrams);
        System.out.println("Mass in grams: "+ massInGrams);
        System.out.println("Mass in tones: " + massInTones);
    }
}
