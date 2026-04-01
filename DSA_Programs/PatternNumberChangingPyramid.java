public class PatternNumberChangingPyramid {
    public static void numChangePyramid(int n){
        int num = 1;
        // outer loop to handle number of rows
        for(int i = 1; i <= n; i++){
            // inner loop to handle number of columns
            for(int j = 1; j <= i; j++){
                // printing value of num in each iteration
                System.out.print(num + " ");
                // increasing the value of num
                num++;
            }
            // printing new line for each row
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 4; //no. of rows
        numChangePyramid(n);
/*
1 
2 3 
4 5 6 
7 8 9 10 
*/
    }
}
