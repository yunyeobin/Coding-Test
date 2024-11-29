import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());
        int cross = 1;
        int sum = 0;

        while (true) {
            if (X <= sum + cross) {
                if (cross % 2 == 1) {
                    System.out.println((cross - (X - sum - 1) + "/" + (X - sum)));
                    break;
                } else {
                    System.out.println((X - sum) + "/" + (cross - (X - sum - 1)));
                    break;
                }
            } else {
                sum += cross;
                cross++;
            }
        }
        br.close();

    }
}