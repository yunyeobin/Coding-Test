
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        for(int i = 1; i <= N; i++) {		// 행 반복
            for(int j = 1; j <= N - i; j++){	// 공백 반복
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){	// 별 반복
                System.out.print("*");
            }
            System.out.println();		// 줄 바꿈
        }

    }
}