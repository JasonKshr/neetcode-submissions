class Solution {
    public int lengthOfLongestSubstring(String s) {

        if(s.length() == 0) return 0;
        if(s.length() == 1) return 1;

        int max = 1;
        int curr = 1;
        int left = 0;
        int right =1;

        HashSet<Character> seen = new HashSet<>();
        seen.add(s.charAt(0));

        while(right < s.length()){
            if(!seen.contains(s.charAt(right))){
                seen.add(s.charAt(right));
                curr++;
                right++;
                max = Math.max(max, curr);
            }
            else{
                while(seen.contains(s.charAt(right))){
                    seen.remove(s.charAt(left));
                    left++;
                    curr--;
                }
            }
        }
        
        return max;
    }
}
