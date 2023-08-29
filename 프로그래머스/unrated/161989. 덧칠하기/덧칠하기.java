class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int ma = 0;
 
        for(int i = 0; i < section.length; i++){
            if(section[i] < ma){
                continue;
            }
            answer++;
            ma = section[i] + m;
        }
        return answer;
    }
}