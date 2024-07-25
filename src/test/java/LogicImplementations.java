public class LogicImplementations {


    public static void main(String[] args) {

        int[] myArray = {1, -2, 100, 10, 13, 7, 41};

       for(int i  = 0 ; i < myArray.length/2; i++){

           int temp  = myArray[i];

           myArray[i] = myArray[myArray.length-i-1];
           myArray[myArray.length-i-1] = temp;

       }
       for(int x : myArray){
           System.out.print(" " + x);
       }


    }
}


