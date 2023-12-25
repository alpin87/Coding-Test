class Solution {
    public int solution(int n) {
        String answer = "";
        String a = Integer.toString(n,3);
        
        for(int i = a.length() - 1; i >= 0; i--){
            answer += a.charAt(i);
        }
        
        
        return Integer.parseInt(answer, 3);
    }
}