public class PatternNumberIncreasingPyramid {
    public static void numIncrPyramid(int n){
        // outer loop to handle number of rows
        for(int i = 1; i <= n; i++){
            // inner loop to handle number of columns
            for(int j = 1; j <= i; j++){
                // printing column values upto the row value
                System.out.print(j + " ");
            }
            // print new line for each row
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 4;
        numIncrPyramid(n);
/*
1 
1 2 
1 2 3 
1 2 3 4 
*/
    }
}
