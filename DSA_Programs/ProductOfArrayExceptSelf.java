import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static int[] prodExceptSelf(int[] nums){
        
        int product = 1; 
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                continue;
            }
            else{
                product *= nums[i];
            } 
        }
        for(int i = 0; i < nums.length; i++){
            
            result[i] = product / nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        //int[] nums = {1,2,3,4};
        int[] nums = {-1,1,0,-3,3};

        System.out.println(Arrays.toString(prodExceptSelf(nums)));

    }
}