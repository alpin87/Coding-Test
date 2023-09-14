import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> m=new HashMap<>();
        
        for(int t:tangerine){
            m.put(t, m.getOrDefault(t, 0)+1);    //hashmap에 키값과 데이터 삽입
        }

        List<Integer> list=new ArrayList<>(m.values());    //라스트생성후 map선언값을 삽입
        Collections.sort(list, Collections.reverseOrder()); //거꾸로정렬시켜서 큰수부터 
        
        for(Integer a:list){
            k-=a;
            answer++;
            if(k<1){
                return answer;
            }
        }                                                                                                                                                                                                                                                                                                                                                                                      
        
        return answer;
    }
}