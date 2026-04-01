public class PatternNumberTriangular {
    public static void numberTriangular(int n){
        // outer loop to handle number of rows
        for(int i = 1; i <= n; i++){
            // inner loop to print space
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            // inner loop to print star/number
            for(int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            // print new line for each row
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 6;
        numberTriangular(n);

    /*       1 
            2 2
           3 3 3
          4 4 4 4
         5 5 5 5 5
        6 6 6 6 6 6
        */
    }
    
}
