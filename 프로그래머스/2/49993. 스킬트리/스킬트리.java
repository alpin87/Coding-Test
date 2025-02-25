class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        for(String a : skill_trees){
            if(skill.indexOf(a.replaceAll(String.format("[^%s]", skill), "")) == 0)
                answer++;
        }
        
        return answer;
    }
}