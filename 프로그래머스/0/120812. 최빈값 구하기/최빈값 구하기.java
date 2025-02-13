class Solution {
    public int solution(int[] array) {
        int answer = -1;
        int max = 0;
        int[] cnt = new int[1000];
        
        for(int num : array){
            cnt[num]++;
            
            if(cnt[num] > max){
                max = cnt[num];
                answer = num;
            }
            else if(cnt[num] == max){
                answer = -1;
            }
        }
        
        return answer;
    }
}