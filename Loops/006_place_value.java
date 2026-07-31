import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long count=1;
        while(n>=10){
            n/=10;
            count*=10 ;
        }
        System.out.println(count);
    }
}
