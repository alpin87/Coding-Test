class Solution {
    
    static int[] dy = { -1, 1, 0, 0, -1, -1, 1, 1 };
    static int[] dx = { 0, 0, -1, 1, -1, 1, -1, 1 };
    
    public int solution(int[][] board) {
        int n = board.length;
        boolean[][] dg = new boolean[n][n];
        
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                if (board[x][y] == 1) {
                    for (int d = 0; d < 8; d++) {
                        int ny = y + dy[d];
                        int nx = x + dx[d];

                        if (ny >= 0 && ny < n && nx >= 0 && nx < n) {
                            dg[nx][ny] = true;
                        }
                    }
                }
            }
        }
        
        int sac = 0;
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                if (board[x][y] == 0 && !dg[x][y]) {
                    sac++;
                }
            }
        }
        
        return sac;
    }
}
