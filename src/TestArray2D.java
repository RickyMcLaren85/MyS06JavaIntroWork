public class TestArray2D {
    public static void main (String [] args){
        //Multidimensional array =  multiple rows and multiple cols
        String [][] myArray = {{"Ford", "Vauxhall", "Volkswagen", "Renault", "Peugeot"},
                {"Focus", "Astra", "Golf", "Megane", "308"}};
        for (int i=0; i<myArray.length; i++){
        for (int j=0; j<myArray[i].length; j++){
            System.out.println(myArray[i][j]);
            }
       }
    }
}