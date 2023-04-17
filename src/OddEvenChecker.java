import java.util.Scanner;
public class OddEvenChecker {
    public static void main(String[] args) {
        Scanner reader = new Scanner (System.in);
        System.out.println("Go on then, give me a number to check!");
        int number = reader.nextInt();
        if (number <0) {
            System.out.println("number is negative");
        }
        else if (number == 0) {
            System.out.println("Your number exists in a realm where it is neither odd nor even!!!");
        }
        else if(number % 2 == 0) {
            System.out.println("number is even");
        }
        else  {
            System.out.println("number is odd");
        }
        System.out.println("Thank you for using Rick's number checker!!");
    }
}
