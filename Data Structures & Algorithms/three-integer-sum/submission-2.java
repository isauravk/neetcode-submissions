class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        //1st loop to traverse each element
        for(int i=0;i<nums.length;i++){
            int left=i+1;
            int right=nums.length-1;
            if(i>0 && nums[i]==nums[i-1]) continue;

            //2nd loop to find its 2 elements which on addition give 0
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum<0) left++;
                else if(sum>0) right--;
                else if(sum==0){
                    List<Integer> triplet=new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[left]);
                    triplet.add(nums[right]);
                    list.add(triplet);
                    left++;
                    right--;
                    while(left<right && nums[left]==nums[left-1] ){ left++; }
                    while(left<right && nums[right]==nums[right+1]){ right--; }
                }
            }

        }
        return list;
    }
}