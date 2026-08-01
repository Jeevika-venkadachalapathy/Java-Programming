import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long arr[] = new long[n];
        long big =Long.MIN_VALUE;
        for(int i=0;i<n;i++){
            arr[i] = s.nextLong();
            
        }
            for(int i=0;i<n;i++){
            if(arr[i]>big) big=arr[i];
        }
        System.out.print(big);
    }
}
