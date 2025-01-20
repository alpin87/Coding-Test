class Solution {
    public int solution(String[] spell, String[] dic) {
        for(String word : dic){
            boolean isMt = true;
            for(String s : spell){
                if(!word.contains(s)){
                    isMt = false;
                    break;
                }
            }
            if(isMt && word.length() == spell.length){
                return 1;
            }
        }
        return 2;
    }
}