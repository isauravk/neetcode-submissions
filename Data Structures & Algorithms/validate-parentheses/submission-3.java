class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0) return false;
        char[] stack=new char[s.length()];
        int top=-1;
        for(char ch: s.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='[') {
                top++;
                stack[top]=ch;
            }
            else{
                if(top==-1) return false;
                if( (stack[top]=='(' && ch==')') || (stack[top]=='{' && ch=='}') || (stack[top]=='[' && ch==']')  ){
                    top--;
                }
                else return false;
            }
        }
        return top == -1;
    }
}
