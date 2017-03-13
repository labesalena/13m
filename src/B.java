import java.util.Scanner;
/**
 * Created by labesai.18 on 13.03.2017.
 */
public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i < n; i++) {
                boolean a = true;
               int q = (int) Math.sqrt(i);
                for (int j = 2; j <=q; j++) {
                    if ((i % j) == 0) {
                        a = false;
                        break;
                    }
                }
                if (a) {
                    System.out.print(i + " ");
                }
        }
    }
}
