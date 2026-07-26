import java.util.Scanner;

class BMIChecker {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter BMI: ");
        double bmi = s.nextDouble();

        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal Weight");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}
