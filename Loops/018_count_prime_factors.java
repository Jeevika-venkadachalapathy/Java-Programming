 import java.util.Scanner;
 public class Main{
     public static void main(String[] args){
         Scanner s = new Scanner(System.in);
         long n = s.nextLong();
         long count=0;
         for(long i=2;i<=n;i++){
             while(n%i==0){
                 count++;
                 n=n/i;
             }
         }
         System.out.print(count+" ");
     }
 }
