import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] parts = myString.split("x");

        List<String> list = new ArrayList<>();
        for (String part : parts) {
            if (!part.isEmpty()) {
                list.add(part);
            }
        }

        Collections.sort(list);

        String[] answer = list.toArray(new String[list.size()]);
        return answer;
    }
}
