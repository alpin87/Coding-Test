import java.util.*;

class Solution {
    public int[] solution(String s) {
        s = s.substring(2, s.length() - 2);
        s = s.replace("},{", "-");
        
        String[] parts = s.split("-");
        
        Arrays.sort(parts, (a, b) -> a.length() - b.length());
        
        Set<Integer> set = new HashSet<>();        
        List<Integer> answerList = new ArrayList<>();
        
        for (String part : parts) {
            for (String numStr : part.split(",")) {
                int num = Integer.parseInt(numStr);
                
                if (!set.contains(num)) {
                    set.add(num);
                    answerList.add(num);
                }
            }
        }
        
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}