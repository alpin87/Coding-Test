import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        List<Integer> list = new ArrayList<>();
        int idx = 0;
        
        for(int i=0;i<arr.length;i++){
            if(!list.contains(arr[i]) && idx < k){
                answer[idx++] = arr[i];
                list.add(arr[i]);
            }
        }
        
        for(int i=idx;i<k;i++){
            answer[i]=-1;
        }
        
        return answer;
    }
}