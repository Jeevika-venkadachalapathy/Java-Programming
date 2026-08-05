 import java.util.Scanner;
 public class Main{
     public static void main(String[] args){
         Scanner s = new Scanner(System.in);
         int n1 = s.nextInt();
         int n2 = s.nextInt();
         int perNum, sum;
         
         for(int i=n1;i<=n2;i++){
             sum=0;
             for(int j=1;j<i;j++){
                 if(i%j==0) sum+=j;
             }
             if(sum==i) System.out.print(i+" ");
         }
     }
 }
