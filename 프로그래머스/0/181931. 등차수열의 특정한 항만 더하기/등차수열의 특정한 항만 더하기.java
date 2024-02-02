import java.util.*;

class Solution {
    public int solution(int a, int d, boolean[] included) {
        List<Integer> common_difference = new ArrayList<>();
        List<Integer> trueIdx = new ArrayList<>();
        int temp, result = 0;

        for (int i = 0; i < included.length; i++) {
            common_difference.add(a + (i * d));
            if (included[i])
                trueIdx.add(i);
        }

        for (int index : trueIdx) {
            result += common_difference.get(index);
        }
        return result;
    }
}