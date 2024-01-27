class Solution {
    public int solution(int a, int b) {
        String num1 = Integer.toString(a) + Integer.toString(b);
        String num2 = Integer.toString(b) + Integer.toString(a);

        int answer1 = Integer.parseInt(num1);
        int answer2 = Integer.parseInt(num2);
        
        int result;
        if(answer1 >= answer2){
            result = answer1;
        }
        else{
            result = answer2;
        }
        
        return result;
    }
}
