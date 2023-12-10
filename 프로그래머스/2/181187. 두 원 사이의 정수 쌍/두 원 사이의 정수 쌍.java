import java.util.*;
class Solution {
    public long solution(int r1, int r2) {
        long answer = 0;
        
        for(int i = 1; i <= r2; i++) {
            double yy = Math.sqrt(Math.pow(r2, 2) - Math.pow(i, 2));
            double y = Math.sqrt(Math.pow(r1, 2) - Math.pow(i, 2));

            answer += ((long)yy - (long)Math.ceil(y) + 1);
        }
        answer *= 4;
        return answer;
    }
}