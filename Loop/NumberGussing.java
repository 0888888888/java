import java.util.Scanner;

public class NumberGussing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 5 , guess;
        System.out.println("Welcome to the Number Guessing Game!\n");

        do {
            System.out.println("Please enter a number between 1 and 10: ");
            guess = input.nextInt();
        } while (num != guess);
        
        System.out.println("You have successfully guessed the number!");
    }
}
