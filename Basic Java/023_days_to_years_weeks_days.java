import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int p=n%365;
        int q=p%7;
        System.out.println("Years: "+n/365);
        System.out.println("Weeks: "+p/7);
        System.out.println("Days: "+q/1);
    }
}
