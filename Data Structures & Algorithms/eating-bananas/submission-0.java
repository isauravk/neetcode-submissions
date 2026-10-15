class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0; int min=-1;
        int low=1;
        for(int banana:piles){
            max=Math.max(max,banana);
        }
        int high=max;

        while(low<=high){
            int k=low+(high-low)/2;
            int totaltime=0;
            for(int banana:piles){
                int time=(banana+k-1)/k;
                totaltime=totaltime+time;
            }

            if(totaltime<=h){
                min=k;
                high=k-1;
            }
            else low=k+1;
        }
        return min;
    }
}
