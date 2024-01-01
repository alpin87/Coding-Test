import java.util.*;

class Solution {
    public int solution(int[] elements) {
     
        Set<Integer> set = new HashSet<>();
        int s = 1;
        
        while(s <= elements.length){
            for(int i = 0; i < elements.length; i++){
                int v = 0;
                for(int j = i; j < i + s; j++){
                    v += elements[j % elements.length];
                }
                set.add(v);
            }
            s++;
        }
        return set.size();
    }
}