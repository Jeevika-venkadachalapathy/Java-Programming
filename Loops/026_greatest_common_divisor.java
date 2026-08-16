import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n1 = sc.nextLong(), n2 = sc.nextLong();
        while(n2!=0){
            long reminder = n1%n2;
            n1=n2;
            n2=reminder;
        }
        System.out.print(n1);
    }
}
