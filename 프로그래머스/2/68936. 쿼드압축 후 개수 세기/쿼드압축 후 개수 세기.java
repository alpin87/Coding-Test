class Solution {
    
    static int[] answer = new int[2];
    
    public int[] solution(int[][] arr) {
        int ts = arr.length;
        quad(0,0,ts,arr);
        return answer;
    }
    
    public static boolean check(int x, int y, int size, int[][]arr){
        for(int i=x;i<x+size;i++){
            for(int j=y;j<y+size;j++){
                if(arr[x][y] != arr[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
    
    public void quad(int sx, int sy, int size, int[][] arr){
        if(check(sx, sy, size, arr)){
            answer[arr[sx][sy]]++;
            return;
        }
        quad(sx,sy,size/2,arr);
        quad(sx + size /2, sy, size / 2, arr);
        quad(sx, sy + size / 2, size / 2, arr);
        quad(sx + size / 2 , sy + size / 2, size / 2, arr);
    }
}