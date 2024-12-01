class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String strNum = Integer.toString(n);
        
        for(int i = 0; i < strNum.length(); i++) {
            answer += Character.getNumericValue(strNum.charAt(i));
        }
        
        return answer;
    }
}