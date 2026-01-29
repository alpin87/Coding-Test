import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String doc = br.readLine();
        String word = br.readLine();
        int count = 0;
        int idx = 0;
        while(true){
            idx = doc.indexOf(word, idx);
            if(idx == -1){
                break;
            }
            count++;
            idx += word.length();
        }
        System.out.println(count);
    }
}
