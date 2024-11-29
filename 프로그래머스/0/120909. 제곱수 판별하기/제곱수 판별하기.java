class Solution {
    public int solution(int n) {
        int answer = 2;
        double a = Math.sqrt(n);
        if(a % 1 == 0){
            answer = 1;
        }
        return answer;
    }
}