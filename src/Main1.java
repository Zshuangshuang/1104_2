import java.io.IOException;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-04
 * Time: 20:55
 **/
public class Main1 {

    public static void main(String[] args) throws IOException {
        char c = (char)System.in.read();
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(c+" ");
            }
            System.out.println();
        }

    }
}
