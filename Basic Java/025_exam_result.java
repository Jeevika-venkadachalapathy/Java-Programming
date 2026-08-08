import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int n3 = s.nextInt();
        int t = n1+n2+n3;
        if(n1>=40&&n2>=40&n3>=40)
            System.out.println("PASS");
        else if((n1>=35&&n2>=40&&n3>=40||n1>=40&&n2>=35&&n3>=40||n1>=40&&n2>=40&&n3>=35)&&t>=150)
            System.out.println("GRACE PASS");
        else
        System.out.println("FAIL");
    }
}
