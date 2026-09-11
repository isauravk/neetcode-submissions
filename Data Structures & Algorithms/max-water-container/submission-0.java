class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int maxCapacity=0;
        while(left<right){
            int pillar=Math.min(heights[left],heights[right]);
            int gap=right-left;
            int capacity=pillar*gap;
            maxCapacity=Math.max(capacity,maxCapacity);
            if(heights[left]<heights[right]) left++;
            else right--;
        }
        return maxCapacity;
    }
}
