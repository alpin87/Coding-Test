import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] answer = myStr.split("[abc]");
        List<String> result = new ArrayList<>();
        
        for(String answers : answer){
            if(!answers.isEmpty()){
                result.add(answers);
            }
        }
            
            if(result.isEmpty()){
                result.add("EMPTY");
            }       
        
        return result.toArray(new String[0]);
    }
}