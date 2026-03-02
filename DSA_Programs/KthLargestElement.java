import java.util.PriorityQueue;

public class KthLargestElement {
    public static int LargestEle(int[] nums, int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        //By default, Java's PriorityQueue is a Min Heap. & Smallest element is always at the top
        for(int num : nums){
            minHeap.add(num);
            if(minHeap.size() > k){
                minHeap.poll();
                //poll() -> Remove smallest element
            }
        }
        return minHeap.peek();
        //peek() -> Gives smallest element
    } 
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 4;
        System.out.println(LargestEle(nums, k));
    }
}
