import java.util.Scanner;
public class OrOperator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Will these shoes suit you??");
        System.out.println("What colour you thinking of choosing??");
        String response = reader.nextLine();

        if (response.equals("Black") || response.equals("Brown") || response.equals("black") || response.equals("brown") ){
            System.out.println("They will!! Excellent.");
        }
        else {
            System.out.println("Nah, they ain't for you.");
        }
    }
}
