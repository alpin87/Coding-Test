import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        int count = 0;
        Stack<Integer> st = new Stack<>();
        
        for(int i = 1; i <= order.length; i++){
            boolean ck = false;       
            if(i == order[count]){
                count++;
                answer++;
                ck = true;
            }
            while(!st.isEmpty() && st.peek() == order[count]){
                st.pop();
                count++;
                answer++;
                ck = true;
            }
            if(!ck){
                st.add(i);
            }
        }
        while(!st.isEmpty() && st.peek() == order[count]){
            st.pop();
            count++;
            answer++;
        }
        return answer;
    }
}