class Solution {
    public int solution(int[][] lines) {
        int[] answer = new int[201];
        
        for(int[] line : lines){
            int st = line[0] + 100;
            int en = line[1] + 100;
            
            for(int i=st;i<en;i++){
                answer[i]++;
            }
        }
        int cnt = 0;
        for(int c : answer){
            if(c >= 2){
                cnt++;
            }
        }
        
        return cnt;
    }
}