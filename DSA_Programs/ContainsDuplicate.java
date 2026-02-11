//import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean duplicate(int[] nums){
        /*Arrays.sort(nums);
        //System.out.println(Arrays.toString(nums));
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }

        return false;*/

        HashSet<Integer> arrSet = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(arrSet.contains(nums[i])){
                return true;
            }
            arrSet.add(nums[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        //int[] nums = {1,2,3,1};
        int[] nums = {1,2,3,4};
        //int[] nums = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(duplicate(nums));

    }
}