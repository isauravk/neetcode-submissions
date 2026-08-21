class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        int diff;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            diff=target-nums[i];
            if(map.containsKey(diff)){
                return new int[]{map.get(diff),i};
            }
            else map.put(nums[i],i);
        }
        return arr;
    }
}
