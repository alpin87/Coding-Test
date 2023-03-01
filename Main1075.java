import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        a /= 100;
        a *= 100;

        int b = Integer.parseInt(br.readLine());
        int result = 0;

        while(a % b != 0){
            a++;
            result++;
        }
        if (result < 10){
            System.out.println("0" + result);
        }
        else{
            System.out.println(result);
        }
    }
}
