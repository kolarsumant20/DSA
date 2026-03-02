public class SecondLargestElement {
    public static int FindSecLargest(int[] nums){
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > largest){
                secondLargest = largest;
                largest = nums[i];
            }
            else if(nums[i] > secondLargest && nums[i] < largest){
                secondLargest = nums[i];
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int[] arr = {4, 1, 7, 3, 9};
        System.out.println(FindSecLargest(arr));
    /*  
        | num | largest | secondLargest |
        | --- | ------- | ------------- |
        | 4   | 4       | -∞            |
        | 1   | 4       | 1             |
        | 7   | 7       | 4             |
        | 3   | 7       | 4             |
        | 9   | 9       | 7             |
    */
    }
}
