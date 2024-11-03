
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] number = new int[9][9];
        int max = number[0][0];
        int row = 1;
        int col = 1;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                number[i][j] = sc.nextInt();
                if (max<number[i][j]){
                    max = number[i][j];
                    row = i+1;
                    col = j+1;
                }
            }
        }
            System.out.println(max);
            System.out.print(row+" "+col);


    }
}