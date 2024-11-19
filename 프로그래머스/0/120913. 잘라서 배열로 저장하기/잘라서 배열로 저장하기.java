class Solution {
    public String[] solution(String my_str, int n) {
        int arraySize = (my_str.length() + n - 1) / n;
        String[] answer = new String[arraySize];
        
        for (int i = 0; i < arraySize; i++) {
            int startIndex = i * n;
            int endIndex = Math.min(startIndex + n, my_str.length());
            answer[i] = my_str.substring(startIndex, endIndex);
        }
        
        return answer;
    }
}