class Solution {
    public int[][] solution(int[][] arr) {
        int rowCount = arr.length;
        int colCount = arr[0].length;
        
        if (rowCount == colCount) {
            return arr;
        }
        
        int maxCount = Math.max(rowCount, colCount);
        int[][] answer = new int[maxCount][maxCount];
        
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                answer[i][j] = arr[i][j];
            }
        }
        
        return answer;
    }
}
