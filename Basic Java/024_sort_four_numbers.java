import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();

        int temp;

        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        if (a > c) {
            temp = a;
            a = c;
            c = temp;
        }

        if (a > d) {
            temp = a;
            a = d;
            d = temp;
        }

        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }

        if (b > d) {
            temp = b;
            b = d;
            d = temp;
        }

        if (c > d) {
            temp = c;
            c = d;
            d = temp;
        }

        System.out.println(a + "<" + b + "<" + c + "<" + d);
    }
}
