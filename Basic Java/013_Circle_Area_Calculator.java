import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        float r =s.nextFloat();
        double area = 3.14159*r*r;
        System.out.printf("%.3f",area);
    }
}
