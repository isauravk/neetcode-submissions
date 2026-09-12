class Solution {
    public int trap(int[] height) {
        if(height.length==1) return 0;
        int l=0;
        int r=height.length-1;
        int total=0;
        int lMax=height[l]; int rMax=height[r];
        while(l<r){

            if(height[l]<=height[r]) {
                total=total+Math.min(lMax,rMax)-height[l];
                l++;
                lMax=Math.max(lMax,height[l]);
            }
            else{
                total=total+Math.min(lMax,rMax)-height[r];
                r--;
                rMax=Math.max(rMax,height[r]);
            }
        }
        
        return total;
    }
}
