import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String a = Arrays.toString(array);
        
        for(int i=0; i < a.length(); i++){
            if (a.charAt(i) == '7'){
                answer++;
            }
        }
        
        return answer;
    }
}