class Solution {

    public int solution(int n) {
        int num = 0;
        int answer = 1;
        int count = 1;
        while(count < n){
            int num1 = num;
            num = answer;
            answer = (num1 + answer) % 1234567;
            count++;
        }
        return answer;
    }
}