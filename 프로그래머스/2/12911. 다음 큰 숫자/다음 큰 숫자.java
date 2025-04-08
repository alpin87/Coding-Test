class Solution {
    public int solution(int n) {
        int answer = n;
        String str = Integer.toBinaryString(n);
        String str1 = str.replace("0","");
        int count = str1.length();
        
        while(true){
            answer++;
            str = Integer.toBinaryString(answer);
            str1 = str.replace("0","");
            int count1 = str1.length();
            if(count == count1) return answer;
        }
    }
}