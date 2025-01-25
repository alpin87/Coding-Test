class Solution {
    public int solution(int n) {
        int answer = 0;
        int nu = 1;
        int k = 1;
        
        while(true){
            nu *= k;
            if(nu > n){
                answer = k;
                break;
            }
            k++;
        }
        
        return answer-1;
    }
}