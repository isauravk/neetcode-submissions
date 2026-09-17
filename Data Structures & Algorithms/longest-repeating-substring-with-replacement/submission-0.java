class Solution {
    public int characterReplacement(String s, int k) {
        int left=0; int maxFreq=0; int maxlength=0;
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(map.get(ch)>maxFreq) maxFreq=map.get(ch);
            int window=i-left+1;
            
            if(k<window-maxFreq){
                char leftChar=s.charAt(left);
                map.put(leftChar,map.get(leftChar)-1);
                left++;
                window--;
            }
            maxlength=Math.max(window,maxlength);
        }
        return maxlength;
        
    }
}
