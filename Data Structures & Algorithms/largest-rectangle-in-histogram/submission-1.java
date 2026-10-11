class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxarea=0; 
        Stack<Integer> stack=new Stack<>();
        //monotonic stack
        for(int i=0;i<heights.length;i++){
            while(!stack.isEmpty() && heights[i]<heights[stack.peek()]) {
                int height=heights[stack.pop()];
                int width;
                if(stack.isEmpty()) width=i;
                else width=i-stack.peek()-1;
                if(height*width >maxarea) maxarea=height*width;
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            int height=heights[stack.pop()];

            int width;
            if(stack.isEmpty()) width=heights.length;
            else width=heights.length-stack.peek()-1;
            if(height*width >maxarea) maxarea=height*width;
        }
        return maxarea;
    }
}
