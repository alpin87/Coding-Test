import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[8];

        for(int i=0; i<arr.length;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        boolean asc = true;
        boolean desc = true;

        for(int i = 0; i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                asc = false;
            }
            if (arr[i] < arr[i+1]){
                desc = false;
            }
        }

        if(asc){
            System.out.println("ascending");
        }
        else if(desc){
            System.out.println("descending");
        }
        else{
            System.out.println("mixed");
        }
    }
}
