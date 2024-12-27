class Solution {
   public long solution(String numbers) {
       String[] numWords = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
       
       for(int i = 0; i < numWords.length; i++) {
           numbers = numbers.replace(numWords[i], String.valueOf(i));
       }
       
       return Long.parseLong(numbers);
   }
}