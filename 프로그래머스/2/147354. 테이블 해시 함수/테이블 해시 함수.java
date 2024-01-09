import java.util.*;

class Solution {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        int answer = 0;
        
        col -= 1;
        row_begin -= 1;
        
        int sortC = col;
        Arrays.sort(data, (n1, n2) -> {
            if(n1[sortC] == n2[sortC]) return n2[0] - n1[0];
            return n1[sortC] - n2[sortC];
        });
        
        for(int i = row_begin; i < row_end; i++){
            int lastI = i + 1;
            int dataTotal = Arrays.stream(data[i])
                .map(j -> j % lastI)
                .sum();
            
            answer = (answer ^ dataTotal);
        }
        return answer;
    }
}