public class SumAvgArray {
    public static void main(String[] args) {
        int sum = 0;
        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("Sum: " + sum);
        double average = (double) sum / numbers.length;
        System.out.println("Average: " + average);
    }
}
