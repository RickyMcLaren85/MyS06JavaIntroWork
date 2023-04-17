import java.util.Scanner;
public class SquareCalculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner (System.in);
        System.out.println("Enter Width");
        double width = reader.nextDouble();
        System.out.println("Enter Height");
        double height = reader.nextDouble();
        double perimiter = 2*(width + height);
        System.out.println("width " + width);
        System.out.println("height  " + height);
        System.out.println("Perimiter is " + perimiter);
    }
}
