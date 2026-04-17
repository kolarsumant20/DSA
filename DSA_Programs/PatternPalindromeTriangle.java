public class PatternPalindromeTriangle {
    public static void paliTriangle(int n){
        // outer loop to handle number of rows
        for(int i = 1; i <= n; i++){
            // inner loop to print the spaces (2 times because for 4 rows, 4 numbers + 4 spaces)
            for(int j = 1; j <= 2*(n-i); j++){
                System.out.print(" ");
            }
            // inner loop to print the first part (reverse numbers)
            for(int j = i; j >= 1; j--){
                System.out.print(j + " ");
            }
            // inner loop to print the second part (starts from 2 because 1 is already printed from the above for loop)
            for(int j = 2; j <= i; j++){
                System.out.print(j + " ");
            }
            // printing new line for each row
            System.out.println();

        }
    }
    public static void main(String[] args) {
        int n = 4;
        paliTriangle(n);
/*
      1 
    2 1 2
  3 2 1 2 3
4 3 2 1 2 3 4
*/
    }
}
