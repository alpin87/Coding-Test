import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] numbers) {
        int n = numbers.length;
        int[] answer = IntStream.range(0, n)
            .map(v -> -1)
            .toArray();
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
                int index = stack.pop();
                answer[index] = numbers[i];
            }
            stack.push(i);
        }
        
        return answer;
    }
}
