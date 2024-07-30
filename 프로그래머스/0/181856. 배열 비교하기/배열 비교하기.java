class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int a = arr1.length;
        int b = arr2.length;
        int aa = 0;
        int bb = 0;
        
        if(a < b){
            answer = -1;
        }
        else if(a>b){
            answer = 1;
        }

        else{
            for(int i=0; i<arr1.length;i++){
                for(int j=0;j<arr2.length;j++){
                    aa += arr1[i];
                    bb += arr2[i];
                    if(a == b){
                        answer = 0;
                    }
                    if(aa > bb){
                        answer = 1;
                    }
                    else if(aa < bb){
                        answer = -1;
                    }
                }
            }
        }
        
        
           
        return answer;
    }
}