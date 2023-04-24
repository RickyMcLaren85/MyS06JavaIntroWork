import java.util.Random;
public class MaxandMin {
    public static void main(String[] args) {
        Random random = new Random();
        int[] myArray = new int[10];
        System.out.println("Generating 10 random numbers....");
        System.out.println("\nNumbers generated are: ");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(500) + 1;
            System.out.print(  myArray[i] + " ");
        }
        int max = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }
        int min = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] < min) {
                min = myArray[i];
            }
            }
            System.out.println(" ");
            System.out.println("\nBiggest number on the sequence is " + max);
            System.out.println("\nSmallest number on the sequence is " + min);
    }
}
