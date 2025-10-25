class Solution {
    public boolean isValid(String s1) {
        Stack<Character> st = new Stack<>();
        for(char s : s1.toCharArray()){
            if( s== '(' || s =='{' || s == '['){
                st.push(s);
            }else if(s == ')'){
                if(st.isEmpty() || st.pop() != '(') return false;
            }
            else if(s == '}'){
                if(st.isEmpty() || st.pop() != '{') return false;
            }
            else if(s == ']'){
                if(st.isEmpty() || st.pop() != '[') return false;
            }
        }
            return st.isEmpty();
               }
}