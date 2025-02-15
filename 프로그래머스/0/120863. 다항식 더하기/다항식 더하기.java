class Solution {
    public String solution(String polynomial) {
        String[] answer = polynomial.split(" \\+ ");
        int x = 0, num = 0;
        
        for(String s : answer){
            if(s.contains("x")){
                x += s.equals("x") ? 1 : Integer.parseInt(s.replace("x",""));
            }
            else{
                num += Integer.parseInt(s);
            }
        }
        
        return (x != 0 ? (x > 1 ? x + "x" : "x") : "") + (num != 0 ? (x != 0 ? " + " : "") + num : x == 0 ? "0" : "");
    }
}