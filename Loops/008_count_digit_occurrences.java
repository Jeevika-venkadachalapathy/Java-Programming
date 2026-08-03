import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        long num = s.nextLong();
        int digit = s.nextInt();
        long n, count=0;
        while(num>0){
            n=num%10;
            if(n==digit) count++;
            num/=10;
        }
        System.out.println(count);
    }
}
