class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[' )
            {
                st.push(ch);
            }
            else {
                if(ch == ']'){
                    if(st.isEmpty() || st.pop() != '[') return false;
                }
                if(ch == ')'){
                    if(st.isEmpty() || st.pop() != '(') return false;
                }
                if(ch == '}'){
                    if(st.isEmpty() || st.pop() != '{') return false;
                }
            }
        } 
        return st.isEmpty();
    }
}