import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int longCount = N/4;
        for (int i = 0; i < longCount; i++) {
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
