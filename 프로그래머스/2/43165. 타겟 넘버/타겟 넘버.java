class Solution {
    static int result = 0;
    
    public int solution(int[] numbers, int target) {
        dfs(0, numbers, target, 0);
        return result;
    }
    
    public static void dfs(int idx, int[] num, int target, int sum){
        if(idx == num.length){
            if(target == sum){
                result++;
            }
            return;
        }
        dfs(idx + 1, num, target, sum+num[idx]);
        dfs(idx + 1, num, target, sum-num[idx]);
    }
}