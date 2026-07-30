import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long c,p=1;
        while(n>0){
            c=n%10;
            p*=c;
            n/=10;
        }
        System.out.println(p);
    }
}
