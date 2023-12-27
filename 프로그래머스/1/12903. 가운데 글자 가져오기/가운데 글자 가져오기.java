class Solution {
    public String solution(String s) {
        String answer = "";
        
        int a = s.length() / 2;
        answer = s.length() % 2 == 0 ? s.substring(a-1, a+1) : s.substring(a, a+1);
        
        return answer;
    }
}