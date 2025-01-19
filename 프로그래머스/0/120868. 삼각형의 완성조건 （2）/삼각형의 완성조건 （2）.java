import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int mx = Math.max(sides[0], sides[1]);
        int mn = Math.min(sides[0], sides[1]);
        
        for(int i = mx - mn; i < mx; i++){
            answer++;
        }
        for(int i = mx + mn - 1; i > mx; i--){
            answer++;
        }
        
        return answer;
    }
}