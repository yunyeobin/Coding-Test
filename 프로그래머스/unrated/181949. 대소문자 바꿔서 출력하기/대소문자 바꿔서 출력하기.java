import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String result = "";
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if ((65 <= c) && (c <= 90)) {
                c += 32;
            }
            else if ((97 <= c) && (c <= 122)) {
                c -= 32;
            }
            result += c;
        }
        System.out.println(result);
    }
}