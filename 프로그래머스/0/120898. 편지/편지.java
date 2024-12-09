class Solution {
    public int solution(String message) {
        int answer = 0;
        
        String[] a = message.split("");
        
        for(int i=0;i<a.length;i++){
            answer++;
        }
        
        return answer * 2;
    }
}