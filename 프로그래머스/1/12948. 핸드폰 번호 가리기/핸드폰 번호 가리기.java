import java.util.*;

class Solution {
    public String solution(String phone_number) {
        
        String answer = phone_number.substring(phone_number.length() - 4);
        StringBuilder a = new StringBuilder();
        
        for(int i = 0; i < phone_number.length() - 4; i++){
            a.append("*");
        }
        
        return a.toString().concat(answer);
    }
}