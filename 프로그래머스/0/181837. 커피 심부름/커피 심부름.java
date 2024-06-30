class Solution {
    public int solution(String[] order) {
        int answer = 0;
        
        for(int i=0; i<order.length; i++){
            if(order[i].contains("americano")){
                answer += 4500;
            }
            if(order[i].contains("cafelatte")){
                answer += 5000;
            }
            if(order[i].contains("anything")){
                answer += 4500;
            }
        }
        return answer;
    }
}