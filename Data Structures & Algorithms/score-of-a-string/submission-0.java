class Solution {
    public int scoreOfString(String s) {
        int difference = 0;
        for(int i = 1; i < s.length(); i++){
            int sum = 0;
            sum = Math.abs(s.charAt(i)- s.charAt(i-1));
            difference += sum;
        }
        return difference;
    }
}