class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();

        for(char ch:t.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }

        int min=Integer.MAX_VALUE;
        int start=0;
        int left=0; 
        int formed=0;
        int required=map1.size();
        String str="";

        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
            
            if(map1.containsKey(ch) && map1.get(ch).equals(map2.get(ch))) formed++;

            while(formed==required){
                if(right-left+1<min){
                    min=right-left+1;
                    start=left;
                }

                //shrink left
                char lchar=s.charAt(left);
                map2.put(lchar,map2.get(lchar)-1);
                left++;

                if(map1.containsKey(lchar) && map2.get(lchar)<map1.get(lchar)) formed--;
            }
        }
        if(min==Integer.MAX_VALUE) return "";
        return s.substring(start,start+min);
    }
}
