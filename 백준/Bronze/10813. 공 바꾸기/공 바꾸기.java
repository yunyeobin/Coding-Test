import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] basket = new int[N];
        int M = sc.nextInt();
        for (int i = 0; i < N; i++) {
            basket[i] = i+1;
        }
        int temp;
        for (int i = 0; i < M; i++) {
            int I = sc.nextInt();
            int J = sc.nextInt();
            temp = basket[I-1];
            basket[I-1] = basket[J-1];
            basket[J-1] = temp;
        }
        for (int i = 0; i < N; i++) {
            System.out.print(basket[i]+" ");
        }
    }
}
