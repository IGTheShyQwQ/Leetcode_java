import java.lang.reflect.Array;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

        char[][] board = new char[3][3];


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
        System.out.println(board);


    }
}
