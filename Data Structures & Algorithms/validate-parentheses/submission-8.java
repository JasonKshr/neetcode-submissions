class Solution {
    public boolean isValid(String s) {
        Stack<Character> Jason = new Stack<>();

        if(s.length() == 1) return false;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                Jason.add(s.charAt(i));
                continue;
            }
            if(Jason.isEmpty()) return false;
            if(s.charAt(i) == ')' && Jason.peek() == '('){
                 Jason.pop();
                 continue;
            }
            if(s.charAt(i) == ']' && Jason.peek() == '['){
                 Jason.pop();
                 continue;
            }
            if(s.charAt(i) == '}' && Jason.peek() == '{'){
                 Jason.pop();
                 continue;
            }
            return false;
        }

        return Jason.isEmpty();
    }
}
