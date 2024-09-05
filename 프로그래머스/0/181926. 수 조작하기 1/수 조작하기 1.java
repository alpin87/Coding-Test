class Solution {
    public int solution(int n, String control) {
        
        for(int i = 0; i < control.length(); i++){
            char a = control.charAt(i);
            
            if(a == 'w'){
                n++;
            }
            else if(a == 's'){
                n--;
            }
            else if(a == 'd'){
                n += 10;
            }
            else{
                n -= 10;
            }
        }
        
        return n;
    }
}
