import java.util.*;

class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = {};
        
        int w = Integer.MAX_VALUE;
        int s = Integer.MAX_VALUE;
        int a = Integer.MIN_VALUE;
        int d = Integer.MIN_VALUE;
            
        for(int i=0; i< wallpaper.length; i++){
            for(int j = 0; j<wallpaper[i].length(); j++){
                if(wallpaper[i].charAt(j) == '#'){
                    w = Math.min(i, w);
                    s = Math.min(j, s);
                    a = Math.max(i + 1, a);
                    d = Math.max(j + 1, d);
                }
            }
        }
        return new int[]{w, s, a, d};
    }
}
