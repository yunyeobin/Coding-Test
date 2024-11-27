import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number;
        int count=0;
        
        for(int i=0; i<n; i++){
            number = sc.nextInt();
            for(int j=2; j<=number; j++){
                if(j == number){
                    count++;
                }
                if(number % j == 0){
                    break;
                }
            }
        }
        sc.close();
        System.out.println(count);
    }
}