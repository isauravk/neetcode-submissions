class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // Map<Character,Integer> map1=new HashMap<>();
        // Map<Character,Integer> map2=new HashMap<>();
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        int left = 0;
        int window = s1.length();

        for (char ch : s1.toCharArray()) {
            arr1[ch-'a']++;
        }

        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            arr2[ch-'a']++;

            if (i - left + 1 > window) {
                char leftChar = s2.charAt(left);
                arr2[leftChar-'a']--;
                left++;
            }
            if (i - left + 1 == window) {
                if (Arrays.equals(arr1,arr2)) return true;
            }
        }
        return false;
    }
}