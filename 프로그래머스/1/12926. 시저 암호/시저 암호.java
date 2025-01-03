class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        
        for(char c : s.toCharArray()){
            if(c == ' '){
                sb.append(c);
                continue;
            }
            int start = Character.isUpperCase(c) ? 'A' : 'a';
            char newc = (char)(start + (c - start + n) % 26);
            sb.append(newc);
        }       
        
        return sb.toString();
    }
}