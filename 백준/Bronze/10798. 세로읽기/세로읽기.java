import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[5][15];
        int max = 0;
        for (int i = 0; i < 5; i++) {
            String str = sc.next();
            max = Math.max(max, str.length());
            for (int j = 0; j < str.length(); j++) {
                board[i][j] = str.charAt(j);

            }
        }
        for(int i=0; i<max; i++) {
            for(int j=0; j<5; j++) {
                if(board[j][i] == '\0')	// char 배열의 초깃값 = '\0'
                    continue;
                System.out.print(board[j][i]);
            }
        }
        sc.close();

    }
}