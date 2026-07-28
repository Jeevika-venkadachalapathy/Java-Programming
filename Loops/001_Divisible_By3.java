import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        int i = 1;
        while(i<=n){
            if(i%3==0)
            System.out.print(i+" ");
            i++;
        }
    }
}
