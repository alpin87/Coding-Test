class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < my_strings.length; i++) {
            String str = my_strings[i];
            
            int start = parts[i][0];
            int end = parts[i][1];

            String subStr = str.substring(start, end + 1);

            result.append(subStr);
        }
        
        return result.toString();
    }
}
