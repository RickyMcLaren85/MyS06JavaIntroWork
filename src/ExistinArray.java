// 1. import java scanner
import java.util.Scanner;
public class ExistinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {22, 110, 18, 45, 6};
         System.out.println("Please guess a number");
        int searchValue = sc.nextInt();
        boolean isFound = false;
        for (int index=0; index < numbers.length; index++) {
            if (searchValue == numbers[index]) {
                //update boolean var to true
                isFound = true;
            }
        }
        if (isFound == true) {
            System.out.println("Value " + searchValue + " found in array");
        }
        else {
            System.out.println( "Value was not found in array");
        }
    }
}
