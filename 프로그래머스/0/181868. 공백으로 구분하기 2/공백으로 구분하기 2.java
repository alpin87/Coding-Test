import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        StringTokenizer tk = new StringTokenizer(my_string, " ");
        List<String> words = new ArrayList<>();
        
        while (tk.hasMoreTokens()) {
            words.add(tk.nextToken());
        }
        
        return words.toArray(new String[0]);
    }
}
