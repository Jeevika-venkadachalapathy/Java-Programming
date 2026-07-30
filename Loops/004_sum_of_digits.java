import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long m = n;
        long sum=0;
        while(n>0){
            m=n%10;
            sum+=m;
            n=n/10;
        }
        System.out.println(sum);
    }
}
