class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map=new HashMap<>();

        for(int i=0;i<strs.length;i++){
            String str=strs[i];
            char[] charArray=str.toCharArray();
            Arrays.sort(charArray);
            String sorted=new String(charArray);
            if(map.containsKey(sorted)){
                ArrayList<String> list=new ArrayList<>();
                list=map.get(sorted);
                list.add(str);
                map.put(sorted,list);
            }
            else{
                ArrayList<String> list=new ArrayList<>();
                list.add(str);
                map.put(sorted,list);
            }
        }
        List<List<String>> finalList=new ArrayList<>();

        for(List<String> subList:map.values()){
            if(subList!=null) finalList.add(subList);
        }
        return finalList;
    }
}
