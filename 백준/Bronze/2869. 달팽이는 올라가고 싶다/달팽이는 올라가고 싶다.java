import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] parts = input.split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        int v = Integer.parseInt(parts[2]);

        // 하루에 실제로 올라갈 수 있는 높이는 a - b 이며 마지막 날에는 미끄러지지 않음.
        int days = (v - b - 1) / (a - b) + 1;

        System.out.println(days);
    }
}
