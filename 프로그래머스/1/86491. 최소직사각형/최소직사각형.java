import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int Maxsize = 0;
        int Minsize = 0;
        for(int[] size : sizes){
            int mMax = Math.max(size[0], size[1]);
            int mMin = Math.min(size[0], size[1]);

            Maxsize = Math.max(mMax, Maxsize);
            Minsize = Math.max(mMin, Minsize);
        }
        return Maxsize * Minsize;
    }
}