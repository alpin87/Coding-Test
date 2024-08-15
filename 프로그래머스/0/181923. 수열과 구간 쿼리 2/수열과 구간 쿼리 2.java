class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        int idx = 0;
        for(int[] que : queries){
            int s = que[0];
            int e = que[1];
            int k = que[2];
            
            int min = Integer.MAX_VALUE;
            for(int i = s; i <= e; i++){
                if(arr[i] > k && arr[i] < min){
                    min = arr[i];
                }
            }
            if(min < Integer.MAX_VALUE){
                answer[idx++] = min;
            }
            else{
                answer[idx++] = -1;
            }
            
        }
        
        return answer;
    }
}