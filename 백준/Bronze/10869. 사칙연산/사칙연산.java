import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int sum = A+B;
        int minus = A-B;
        int multi = A*B;
        int divis = A/B;
        int remain = A%B;

        System.out.println(sum);
        System.out.println(minus);
        System.out.println(multi);
        System.out.println(divis);
        System.out.println(remain);
    }
}
