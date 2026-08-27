class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Set<Integer> set=new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        int maxLength=1;
       for (int x : set) {

            // Only start if x is the beginning of a sequence
            if (!set.contains(x - 1)) {

                int current = x;
                int length = 1;

                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                maxLength = Math.max(maxLength, length);
            }
        }
        return maxLength;
    }
}
