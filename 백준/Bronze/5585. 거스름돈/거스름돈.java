import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] coin = {500, 100, 50, 10, 5, 1};
        int N = Integer.parseInt(br.readLine());
        int change = 1000 - N;
        int count = 0;

        for(int i = 0; i < coin.length; i++){
            count += change / coin[i];
            change = change % coin[i];
        }
        
        System.out.println(count);
    }
}