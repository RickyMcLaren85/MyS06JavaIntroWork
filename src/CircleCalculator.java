import java.util.Scanner;
public class CircleCalculator {
    public static void main(String[] args) {

        Scanner reader = new Scanner (System.in);
        System.out.println("Please enter radius");
        double circleRadius =reader.nextDouble() ;
        double circleDiameter = 2*(circleRadius);
        double circleCircumfrance = 2*3.14*(circleRadius);
        double circleArea = 3.14*(circleRadius)*(circleRadius);
        System.out.println("circleRadius " + circleRadius);
        System.out.println( "The circle diameter is " + circleDiameter);
        System.out.println( "The circle circumfrance is " + circleCircumfrance);
        System.out.println( "The circle area is " + circleArea);

    }
}
