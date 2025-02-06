class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] a = my_string.split("");
        for(int i=0;i<a.length;i++){
            answer += a[i].repeat(n);
        }
        return answer;
    }
}