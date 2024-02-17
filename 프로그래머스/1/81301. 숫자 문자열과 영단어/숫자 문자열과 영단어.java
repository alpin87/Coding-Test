class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] s1 ={"zero", "one", "two", "three","four","five","six","seven","eight","nine"};
      
        for(int i=0;i<10;i++){
            s=s.replace(s1[i],Integer.toString(i));
        }
        answer = Integer.parseInt(s);
           
        return answer;
    }
}