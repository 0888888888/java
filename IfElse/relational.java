import java.util.Scanner;

public class relational {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Driving License Exam");

        System.out.println("Please enter your age: ");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to drive");
        } else {
            System.out.println("You are not eligible to drive");
        }
    }
}
