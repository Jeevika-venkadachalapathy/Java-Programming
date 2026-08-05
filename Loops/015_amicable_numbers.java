 import java.util.Scanner;
 public class Main{
     public static void main(String[] args){
         Scanner s = new Scanner(System.in);
         int n1 = s.nextInt();
         int n2 = s.nextInt();
         int sum1=0, sum2=0;
         for(int i=1;i<n1;i++){
             if(n1%i==0){
               sum1+=i;  
             } 
         }
         for(int j=1;j<n2;j++){
             if(n2%j==0){
               sum2+=j;  
             } 
         }
         if(n1+1==sum2&&n2+1==sum1) System.out.println("Yes");
            else System.out.println("No");
     }
 }
