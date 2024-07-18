class Solution {
    public int solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder();
        
        for (char c : myString.toCharArray()) {
            if (c == 'A') {
                sb.append('B');
            } else {
                sb.append('A');
            }
        }
        
        if (sb.toString().contains(pat)) {
            return 1;
        }
        
        return 0;
    }
}
