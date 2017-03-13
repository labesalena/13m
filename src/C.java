import java.util.Scanner;

/**
 * Created by labesai.18 on 13.03.2017.
 */
public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            sum+=a;
        }
        System.out.println(sum/n);
    }
}
