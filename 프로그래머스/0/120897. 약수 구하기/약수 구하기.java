import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> num = new ArrayList<>();
        
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                num.add(i);
                if (i != n/i) {
                    num.add(n/i);
                }
            }
        }   
        Collections.sort(num);
        
        return num.stream().mapToInt(Integer::intValue).toArray();
    }
}