 import java.util.Scanner;
 public class Main{
     public static void main(String[] args){
         Scanner s = new Scanner(System.in);
         long n = s.nextLong();
         for(long i=2;i<=n;i++){
                 while(n%i==0){
                    System.out.print(i+" "); 
                    n=n/i;
                 }
        }
     }
 }
