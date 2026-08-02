import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        double a=s.nextDouble();
        int f=(int)(a/30.48);
        float i=(float)(a/2.54)-(f*12);
        System.out.printf("Height in feet and inches: %d' %.1f\"",f,i);
    }
}
