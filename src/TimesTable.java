import java.util.Scanner;
public class TimesTable {
    public static void main(String[] args) {
        Scanner reader = new Scanner (System.in);
        System.out.println("What times table would you like?  ");
        int answer = reader.nextInt();
        for (int x=1; x<=12; x=x+1)
        {
            System.out.print(answer + " x " + x + " = " + (answer * x));
            System.out.print("\n");
        }
    }
}
