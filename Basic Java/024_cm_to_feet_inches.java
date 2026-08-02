import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=n/1000;
        int b=(n/100)%10;
        int c=(n/10)%10;
        int d=n%10;
        System.out.print((a+2)%10);
        System.out.print((b+2)%10);
        System.out.print((c+2)%10);
        System.out.print((d+2)%10);
    }
}
