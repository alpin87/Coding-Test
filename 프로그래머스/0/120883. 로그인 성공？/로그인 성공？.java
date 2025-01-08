class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        
        for(String[] userInfo : db) {
            if(id_pw[0].equals(userInfo[0])) {
                if(id_pw[1].equals(userInfo[1])) {
                    return "login";
                } 
                else {
                    answer = "wrong pw";
                }
            }
        }
        
        return answer;
    }
}