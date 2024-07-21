class Solution {
    public int solution(String my_string, String is_suffix) {
        if (my_string.endsWith(is_suffix)) {
            return 1;  // 접미사인 경우
        }
        return 0;  // 접미사가 아닌 경우
    }
}
