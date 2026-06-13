class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.getOrDefault(nums[i],0)<1) map.put(nums[i],1);
            else return true;
        }
        return false;
    }
}