import java.util.Scanner;

class TriangleValidator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        if (a + b > c && a + c > b && b + c > a)
            System.out.println("Valid Triangle");
        else
            System.out.println("Invalid Triangle");
    }
}
