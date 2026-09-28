class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        Deque<Integer> deque=new ArrayDeque<>();
        int[] arr=new int[nums.length-k+1];
        int left=0;
        int index=0;
        for(int i=0;i<nums.length;i++){
            //remove expired
            if(!deque.isEmpty() && left>deque.peekFirst()){
                while(!deque.isEmpty() && left>deque.peekFirst() ){
                    deque.removeFirst();
                }
            }
            //remove smaller from back
            while(!deque.isEmpty() && nums[i] > nums[deque.peekLast()] ){
                    deque.removeLast();
                }
            deque.addLast(i);

            if(i-left+1 <k) continue;
            left++;
            arr[index]=nums[deque.peekFirst()];
            index++;
        }
        return arr;
    }
}