class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();
        int left=0;
        for(char ch:s1.toCharArray()){ map1.put(ch,map1.getOrDefault(ch,0)+1); }
        int window=s1.length();
        for(int i=0; i<s2.length(); i++){
            char ch=s2.charAt(i);
            map2.put(ch,map2.getOrDefault(ch,0)+1);

            if(i-left+1>window){ 
                char leftChar=s2.charAt(left);
                if(map2.get(leftChar)>1) map2.put(leftChar,map2.get(leftChar)-1);
                else map2.remove(leftChar);
                left++;
                }
            if(i-left+1==window){
                if(map1.equals(map2)) return true;
            }
        }
        return false;
        
    }
}