import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int h = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        if (m < 45) {
            m += 60;
            h--;
            if (h < 0) {
                h = 23;
            }
        }
        m -= 45;

        System.out.println(h + " " + m);
        br.close();
    }
}
