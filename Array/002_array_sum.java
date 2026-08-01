import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long arr[] = new long[n];
        long sum=0;
        for(int i=0;i<n;i++){
            arr[i] = s.nextLong();
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
