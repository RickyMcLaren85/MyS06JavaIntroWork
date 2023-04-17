import java.util.Scanner;
public class StoreOpen {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Is the store open? Enter Y or N to find out!!");
        String response = reader.nextLine();
        if (  response.equals("Y") || response.equals("N")){
        if (! response.equals ("Y"))
            System.out.println("Sorry not today");
        else if (! response.equals ("N"))
            System.out.println("Come on in, were open today");
        }
        else System.out.println("Please enter valid response");

        }
    }

