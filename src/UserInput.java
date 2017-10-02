import java.util.Scanner;

public class UserInput {
    public static void main (String args[])
    {
        String name, level, major, location, interest;

        System.out.println("Hello, my name is");
        Scanner keyboard = new Scanner(System.in);
        name = keyboard.nextLine();
        System.out.println("Hello, my name is:" +name);

        System.out.println("My level of experience with Java:");
        level = keyboard.nextLine();
        keyboard.nextLine();

        System.out.println("My level of experience with Java:" +level);

        System.out.println("Major in College");
        major = keyboard.nextLine();
        keyboard.nextLine();

        System.out.println("Major in College:" +major);

        System.out.println("Where are you from?");
        location = keyboard.nextLine();
        keyboard.nextLine();

        System.out.println("Where are you from?:" +location);

        System.out.println("Something interesting about you");
        interest = keyboard.nextLine();
        keyboard.nextLine();

        System.out.println("Something interesting about you:" + interest);

    }
}
