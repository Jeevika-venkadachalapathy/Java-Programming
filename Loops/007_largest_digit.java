import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long m,p=0;
        while(n>0){
            m=n%10;
            if(m>p){
                p=m;
            }
            n=n/10;
        }
        System.out.println(p);
    }
}
