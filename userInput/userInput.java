import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Hello " + name);

        System.out.println(name + " Enter your age: ");
        int age = input.nextInt();
        System.out.println("Your age is " + age);
    }
}
