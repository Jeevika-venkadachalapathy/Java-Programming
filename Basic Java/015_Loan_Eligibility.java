import java.util.Scanner;

class LoanEligibility {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = s.nextInt();

        System.out.print("Enter Monthly Salary: ");
        int salary = s.nextInt();

        if (age >= 21 && salary >= 25000)
            System.out.println("Loan Approved");
        else
            System.out.println("Loan Rejected");
    }
}
