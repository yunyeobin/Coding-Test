
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == 0 && b == 0){
                break;
            }
            System.out.println(a+b);
            
        }

    }
}