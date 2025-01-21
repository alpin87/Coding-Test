import java.util.*;

class Solution {
    public int[] solution(int n) {
        Set<Integer> fc = new HashSet<>();
        
        for (int i=2; i<=n; i++){
            while(n % i == 0){
                fc.add(i);
                n /= i;
            }
        }
        
        return fc.stream()
            .sorted()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}