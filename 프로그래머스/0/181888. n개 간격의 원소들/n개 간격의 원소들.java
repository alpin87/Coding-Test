import java.util.*;

public class Solution {
    public int[] solution(int[] num_list, int n) {
        int size = (num_list.length + n - 1) / n;
        int[] result = new int[size];

        for (int i = 0, j = 0; i < num_list.length; i += n, j++) {
            result[j] = num_list[i];
        }

        return result;
    }
}