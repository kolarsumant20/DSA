import java.util.Arrays;

public class FirstLastPositionOfSortedArray {
    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};

        result[0] = findFirst(nums, target);
        result[1] = findLast(nums, target);

        return result;
    }

    private static int findFirst(int[] nums, int target){
        int start = 0, end = nums.length - 1;
        int index = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(nums[mid] >= target){
                end = mid - 1;
            } else {
                start = mid + 1;
            }

            if(nums[mid] == target){
                index = mid;
            }
        }
        return index;
    }

    private static int findLast(int[] nums, int target){
        int start = 0, end = nums.length - 1;
        int index = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(nums[mid] <= target){
                start = mid + 1;
            } else {
                end = mid - 1;
            }

            if(nums[mid] == target){
                index = mid;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10}; int target = 8;  // Output: [3,4]
        //int[] nums = {5,7,7,8,8,10}; int target = 6;  // Output: [-1,-1]
        //int[] nums = {}; int target = 0;  // Output: [-1,-1]

        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
}
