public class NestedLoop {
    public static void main(String[] args) {

        for(int i=1; i<=9; i++){ // outer loop starts
            for(int j=0; j<=9; j++) { // inner loop starts
                System.out.println(i + " " + j);
            }// end of inner loop
        } // end of outer loop

    }
}
