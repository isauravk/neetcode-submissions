class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String s=tokens[i];

            if(Character.isDigit(s.charAt(0)) || s.length()>1 ){
                int num=Integer.parseInt(s);
                stack.push(num);
            } 
            else{
                int second=stack.peek();
                stack.pop();
                int first=stack.peek();
                stack.pop();
                if(s.charAt(0)=='+')  stack.push(first+second);
                else if(s.charAt(0)=='-') stack.push(first-second);
                else if(s.charAt(0)=='*') stack.push(first*second);
                else if(s.charAt(0)=='/') stack.push(first/second);
            }

        }
        return stack.peek();
    }
}
