class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        int diff;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            diff=target-nums[i];
            if(map.containsKey(diff)==true){
                arr[0]=map.get(diff);
                arr[1]=i;
                break;
            }
            map.put(nums[i],i);
        }
        return arr;
    }
}
