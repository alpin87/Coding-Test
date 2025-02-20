import java.util.*;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        
        int answer = citations.length;
        for(int i=0;i<answer;i++){
            if(citations[i] >= answer - i){
                return answer - i;
            }
        }
        return 0;
    }
}