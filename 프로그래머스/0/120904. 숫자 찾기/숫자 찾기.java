class Solution {
    public int solution(int num, int k) {
        int result = -1;     
        String strNum = String.valueOf(num);
        
        for (int i = 0; i < strNum.length(); i++) {
            if (strNum.charAt(i) - '0' == k) {
                result = i + 1;
                return result;
            }
        }    
        return result;
    }
}
