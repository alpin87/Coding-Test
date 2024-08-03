class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        
        for(int[] que : queries){
            int n = que[0];
            int m = que[1];
            
            int t = arr[n];
            arr[n] = arr[m];
            arr[m] = t;
        }
    
        return arr;
    }
}