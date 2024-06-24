import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int x = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] < x){
                System.out.println(a[i]);
            }
        }
    }
}
