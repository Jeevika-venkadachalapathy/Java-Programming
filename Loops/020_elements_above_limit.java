import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num, count=0;
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int lim = sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]>=lim){
                System.out.print(arr[i]+" ");
                count++;
            } 
        }
        if(count==0) System.out.print(-1);
    }
}
