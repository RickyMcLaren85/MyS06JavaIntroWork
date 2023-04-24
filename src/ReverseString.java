import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        System.out.println("--This program will reverse any word!--");
        System.out.println("--Please enter your chosen word--");
        Scanner reader = new Scanner (System.in);
        char[] letters= reader.nextLine().toCharArray();
        System.out.println("The word in reverse is:");
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print( letters[i]);
        }
    }
}
