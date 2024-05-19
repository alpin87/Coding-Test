public class Solution {
    public static int[] solution(int[] num_list, int n) {
        // num_list의 길이를 기반으로 새로운 배열 생성
        int[] result = new int[num_list.length];

        System.arraycopy(num_list, n, result, 0, num_list.length - n);
        System.arraycopy(num_list, 0, result, num_list.length - n, n);
        
        return result;
    }
}
