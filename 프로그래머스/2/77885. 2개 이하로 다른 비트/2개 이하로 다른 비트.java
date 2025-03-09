class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {
            long num = numbers[i];

            if ((num & 1) == 0) {
                answer[i] = num + 1;
            } else {
                long lastZeroPos = 1;
                while ((num & lastZeroPos) != 0) {
                    lastZeroPos <<= 1;
                }
                answer[i] = num + lastZeroPos - (lastZeroPos >> 1);
            }
        }
        
        return answer;
    }
}