class Solution {
    public int solution(int a, int b) {
        int gcd = getGcd(a, b);
        b /= gcd;
        
        while(b % 2 == 0) b /= 2;
        while(b % 5 == 0) b /= 5;
        
        return b == 1 ? 1 : 2;
    }
    
    private int getGcd(int a, int b) {
        return b == 0 ? a : getGcd(b, a % b);
    }
}