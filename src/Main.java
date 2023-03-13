import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Scanner scan = new Scanner(System.in);
        int user = scan.nextInt();
        int sum = 0;
        for (int i = 1; i <= user; i++) {
            sum += i;
        }
            System.out.print(sum);*/

        Scanner scan = new Scanner(System.in);
        int user = scan.nextInt();
        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i <= user; i++) {
            if (i % 2 == 0) {
                sum += i;
            } else if (i % 2 == 1) {
                sum2 += i;
            }
        }
        int run = sum + sum2;
        System.out.println(sum);
        System.out.println(sum2);
        if (run % 2 == 0) {
            System.out.println(run + " = " + true);
        } else if (run % 2 == 1) {
            System.out.println(run + " = " + false);
        }
    }
}