import java.util.Scanner;
public class Main 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        double m = (float)(n*0.0254);
        System.out.printf("%d inch is %.2f meters",n,m);
    }
}
