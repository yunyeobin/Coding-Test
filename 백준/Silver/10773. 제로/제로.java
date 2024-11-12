
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int last = -1;
        int k = sc.nextInt();
        int[] arr = new int[k];

        for(int i = 0; i < k; i++) {
            int number = sc.nextInt();
            if (number == 0) {
                last--;
            }
            else {
                last++;
                arr[last] = number;
            }
        }
        
        int sum = 0;
        for (int i = 0; i <= last; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}