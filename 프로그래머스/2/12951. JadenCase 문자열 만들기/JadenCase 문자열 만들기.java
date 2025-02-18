class Solution {
    public String solution(String s) {
        String answer = s.toLowerCase();
        StringBuffer sb = new StringBuffer();

        boolean isFirst = true;
        
        for(int i = 0; i < answer.length(); i++) {
            char curr = answer.charAt(i);
            
            if(isFirst && Character.isLetter(curr)) {
                sb.append(Character.toUpperCase(curr));
            } else {
                sb.append(curr);
            }
            
            isFirst = curr == ' ' ? true : false;
        }
        
        return sb.toString();
    }
}