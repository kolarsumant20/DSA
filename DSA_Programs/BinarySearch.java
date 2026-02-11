public class BinarySearch {
    public int search(int[] nums, int target){
        // int mid = nums.length/2;
        // if(nums[mid] == target){
        //     return mid;
        // }
        // else if(nums[mid] > target){
        //     for(int i = mid - 1; i >= 0; i--){
        //         if(nums[i] == target){
        //             return i;
        //         }
        //     }
        // }else{
        //     for(int i = mid + 1; i < nums.length; i++){
        //         if(nums[i] == target){
        //             return i;
        //         }
        //     }
        // }
        
        // return -1;

        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start +(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return-1;
    }
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 0;

        BinarySearch obj = new BinarySearch();
        System.out.println(obj.search(nums, target));        
    }
}
