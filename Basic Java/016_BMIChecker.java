import java.util.Scanner;

class MovieTicket {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = s.nextInt();

        if (age < 5)
            System.out.println("Free Entry");
        else if (age <= 18)
            System.out.println("Child Ticket");
        else if (age <= 60)
            System.out.println("Adult Ticket");
        else
            System.out.println("Senior Citizen Ticket");
    }
}
