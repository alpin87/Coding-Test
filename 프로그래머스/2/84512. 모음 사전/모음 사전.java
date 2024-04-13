import java.util.*;

class Solution {
    final char[] vowels = {'A','E','I','O','U'};
    final int MAX_LENGTH = 5;
    
    public int solution(String word) {
        List<String> elements = new ArrayList<>();
        dfs(elements, "");
        
        for(int i = 0; i < elements.size(); i++){
            if(elements.get(i).equals(word)){
                return i + 1;
            }
        }
        return 0;
    }
    
    void dfs(List<String> elements, String current) {
        if(current.length() > MAX_LENGTH) 
            return;
        
        if(!current.equals(""))
            elements.add(current);
    
        for(int i = 0; i < vowels.length; i++){
            dfs(elements, current + vowels[i]);
        }
    }
}