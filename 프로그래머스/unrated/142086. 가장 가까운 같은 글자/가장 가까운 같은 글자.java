class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0] = -1; //맨앞이니 무조건 -1 출력 [1]번째 시작

        for(int i = 1; i<s.length(); i++){  // ->순으로 검사
            for(int j=i-1; j>=0; j--){        // <-순으로 검사
                if(s.charAt(i)==s.charAt(j)){   //charAt()으로 같은지
                    answer[i] = i-j;
                    break;
                }
                else{
                    answer[i] = -1;
                }
            }
        }
        return answer;
    }
}