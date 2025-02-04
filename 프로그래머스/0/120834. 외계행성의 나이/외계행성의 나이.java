class Solution {
    public String solution(int age) {
        StringBuilder st = new StringBuilder();
        String a = String.valueOf(age);
        
        for(char c : a.toCharArray()){
            st.append((char)(c-'0'+'a'));
        }
        return st.toString();
    }
}