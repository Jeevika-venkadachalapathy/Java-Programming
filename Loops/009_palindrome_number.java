import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long num=n;
        long m, rev=0;
        while(n>0){
            m=n%10;
            rev=rev*10+m;
            n/=10;
        }
        if(num==rev) System.out.println("Yes");
        else System.out.println("No");
    }
}
