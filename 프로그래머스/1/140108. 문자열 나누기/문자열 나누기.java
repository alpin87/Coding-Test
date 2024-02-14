class Solution {
    public int solution(String s) {
        int answer = 0;
        char first = s.charAt(0);
        int fi = 0;
        int end = 0;
        for(int i=0; i < s.length(); i++){
            if(fi == end){
                answer++;
                first = s.charAt(i);
            }
            if(s.charAt(i)==first){
                fi++;
            }
            else{
                end++;
            }
        }
        return answer;
    }
}