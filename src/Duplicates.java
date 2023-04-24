import java.util.Random;public class Duplicates {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        System.out.println("Generating Array 1, random values between 1 to 20");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = rand.nextInt(20) + 1;
            System.out.print(array1[i] + " ");
        }
        System.out.println("\nGenerating Array 2, random values between 1 to 20");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = rand.nextInt(20) + 1;
            System.out.print(array2[i] + " ");
        }
        System.out.println("\nPrinting duplicates");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.print(array1[i] + " ");
                }
            }
        }
    }
}
