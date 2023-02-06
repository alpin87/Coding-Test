import java.io.InputStreamReader;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;

public class Main4673 {
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        int sum = 0;

        for (int i=0; i<A; i++){
            int num = Integer.parseInt(br.readLine());
            if (num == 0){
                stack.pop();
            }
            else {
                stack.push(num);
            }
        }
        for (int i : stack){
            sum += i;
        }
        System.out.println(sum);
    }
}
