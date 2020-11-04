import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-04
 * Time: 21:14
 **/
public class Main4 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bufferedReader.readLine().split(",");
        String s1 = s[0].split("=")[1];
        String s2 = s[1].split("=")[1];
        System.out.println("a="+s2+","+"b="+s1);

    }
}
