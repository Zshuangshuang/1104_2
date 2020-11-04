import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:针对每组输入，反向输出对应四位数。
 * User: 14342
 * Date: 2020-11-04
 * Time: 21:26
 **/
public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        while(num != 0){
            System.out.print(num % 10+" ");
            num = num/10;
        }

    }
}
