class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int index=0;
        int count=0;
        int maxcount=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!set.contains(ch)) {
                set.add(ch);
                count++;
            }
            else {
                while(set.contains(ch)){
                    set.remove(s.charAt(index));
                    index++;
                }
                set.add(ch);
                count=i-index+1;
            }
            maxcount=Math.max(maxcount,count);
        }
        return maxcount;

    }
}
