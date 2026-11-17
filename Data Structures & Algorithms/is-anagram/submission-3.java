class Solution {
    public boolean isAnagram(String s, String t) {
    if(s.length() != t.length()) return false;
    int[] Jason = new int[26];

    s = s.toLowerCase();
    t = t.toLowerCase();

    for(int i = 0; i< s.length(); i++){
        Jason[s.charAt(i)-'a']++;
        Jason[t.charAt(i)-'a']--;
    }
    for(int i = 0; i< 26; i++){
        if(Jason[i] != 0) return false;
    }
    return true;

    
    

    }
}
