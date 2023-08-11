public class Solution {

    public int solution(String t, String p) {
        int answer = 0;
        Long ps = Long.parseLong(p);
        
        for(int i = 0; i <= t.length() - p.length(); i++) {
            Long tt = Long.parseLong(t.substring(i, i+p.length()));
            if(ps >= tt){
                answer++;
            }
        }
        
        return answer;
    }

}
