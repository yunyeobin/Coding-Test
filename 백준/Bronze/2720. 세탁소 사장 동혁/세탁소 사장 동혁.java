
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int C = sc.nextInt();
            int q = C / 25;
            C %= 25;
            int d = C / 10;
            C %= 10;
            int n = C / 5;
            C %= 5;
            int p = C;
            System.out.println(q + " " + d + " " + n + " " + p);
        }

        sc.close();

    }
}