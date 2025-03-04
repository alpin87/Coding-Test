import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> h1 = new HashMap<>();
        
        for(String p : participant){
            h1.put(p, h1.getOrDefault(p,0)+1);
        }
        for(String c : completion){
            h1.put(c, h1.get(c) - 1);
        }
        for(String p : h1.keySet()){
            if(h1.get(p) > 0){
                return p;
            }
        }
        
        return "";
    }
}