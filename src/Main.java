import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-04
 * Time: 20:31
 **/
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bufferedReader.readLine().split(" ");
        System.out.println("score1=" + str[0] + ",score2=" + str[1] + ",score3=" + str[2]);
    }
}
