import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score); // 배열 정렬
        
        for(int i = score.length-1; i >= 0; i--){ // 배열 길이-1지정후 배열길이만큼 비교
            if((score.length-i) % m == 0) // 배열의 길이를 i값을 빼고 사과의수를 퍼센트하여 0 과일치하는지
                answer += score[i] * m; // 결과출력에 마지막 곱한가격출력
        }
        return answer;
    }
}