import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int max = nums.length / 2;
        HashSet<Integer> a = new HashSet<>();
        
        for(int n : nums){
            a.add(n);
        }
        
        for(int j = 0; j < nums.length; j++){
            if(a.size() > max){
                return max;
            }
            else{
                return a.size();
            }
        }
        
        return max;
    }
}