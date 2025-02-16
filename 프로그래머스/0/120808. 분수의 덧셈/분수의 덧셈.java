class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        int n = numer1 * denom2 + numer2 * denom1;
        int d = denom1 * denom2;
        
        int gcd =  g(n, d);
        
        n /= gcd;
        d /= gcd;
        
        
        return new int[]{n,d};
    }
    
    public int g (int a, int b){
        while(b != 0){
            int c = a % b;
            a = b;
            b = c;
        }
        return a;
    }
}