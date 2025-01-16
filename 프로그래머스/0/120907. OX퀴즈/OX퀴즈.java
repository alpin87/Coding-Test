class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i = 0; i< quiz.length; i++){
            String[] parts = quiz[i].split(" ");
            int a = Integer.parseInt(parts[0]);
            String oper = parts[1];
            int b = Integer.parseInt(parts[2]);
            int result = Integer.parseInt(parts[4]);
            
            int c;
            if(oper.equals("+")){
                c = a + b;
            }
            else{
                c = a - b;
            }
            answer[i] = (c == result) ? "O" : "X";
        }
        return answer;
    }
}