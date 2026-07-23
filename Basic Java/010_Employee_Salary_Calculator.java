import java.util.Scanner;
public class celsius {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String ID = s.nextLine();
        int Hour = s.nextInt();
        int Sal = 25000;
        float Salary = Hour*Sal;
        System.out.printf("Empoyee ID : %s\n ",ID);
        System.out.printf("Salary : %.3f ",Salary);
    }    
}
