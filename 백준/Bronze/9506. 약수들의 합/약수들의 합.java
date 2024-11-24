
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            int n = Integer.parseInt(br.readLine());
            if(n == -1)
                break;

            int[] arr = new int[n];
            int sum = 0;
            int index = 0;
            for(int i=1; i<n; i++) {
                if(n%i == 0) {
                    arr[index++] = i;
                    sum += i;
                }
            }

            if(sum != n) {
                System.out.println(n + " is NOT perfect.");
                continue;
            }

            System.out.print(n + " = ");
            for(int i=0; i<index; i++) {
                if(i == index-1)
                    System.out.print(arr[i]);
                else
                    System.out.print(arr[i] + " + ");
            }
            System.out.println();
        
    }
        br.close();
    }
}