import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] bet = s.split("");
        
        int idx = 0;
        for(int i = 0; i < bet.length; i++){
            if(bet[i].equals(" ")){
                idx = 0;
            }
            else if(idx % 2 == 0){
                bet[i] = bet[i].toUpperCase();
                idx++;
            }
            else if(idx % 2 != 0){
                bet[i] = bet[i].toLowerCase();
                idx++;
            }
            answer += bet[i];
        }
        return answer;
    }
}