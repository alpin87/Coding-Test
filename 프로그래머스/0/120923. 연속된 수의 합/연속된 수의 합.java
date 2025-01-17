class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        int a = total/num;
        int b = total % num == 0 ? num / 2 : num / 2 -1;
        int c = a - b;
        
        for(int i=0; i < num; i++){
            answer[i] = c + i;
        }
        
        return answer;
    }
}