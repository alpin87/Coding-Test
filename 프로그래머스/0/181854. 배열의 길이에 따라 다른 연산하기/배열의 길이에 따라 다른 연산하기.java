class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];
        
        boolean a = arr.length % 2 == 1;
        
        for (int i = 0; i < arr.length; i++) {
            if ((a && i % 2 == 0) || (!a && i % 2 == 1)) {
                answer[i] = arr[i] + n;
            } else {
                answer[i] = arr[i];
            }
        }
        
        return answer;
    }
}