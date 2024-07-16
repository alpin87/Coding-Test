class Solution {
    public int solution(String binomial) {
        String[] parts = binomial.split(" ");
        
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[2]);
        
        String operator = parts[1];
        
        int result = 0;
        
        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
        }
        return result;
    }
}
