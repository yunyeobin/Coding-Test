
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.next();
        sc.close();
        System.out.println(a * (b.charAt(2)-'0'));
        System.out.println(a * (b.charAt(1)-'0'));
        System.out.println(a * (b.charAt(0)-'0'));
        System.out.println(a * (Integer.parseInt(b)));
    }
}