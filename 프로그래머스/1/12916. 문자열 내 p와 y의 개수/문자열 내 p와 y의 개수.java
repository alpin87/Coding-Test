class Solution {
boolean solution(String s) {
boolean answer = true;
int pSum=0;
int ySum=0;

    char[] sArray = s.toCharArray();

    for(int i=0; i<sArray.length; i++) {
        if((sArray[i]== 'p') || (sArray[i]=='P')) {
        pSum += 1;
    } else if ((sArray[i] == 'y') ||  (sArray[i] =='Y')) {
            ySum += 1;

    } }
    if(pSum == ySum){
      answer = true;
    }else {
        answer = false;
    }
    return answer;
}
}