import java.util.Scanner;
public class ifElse {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Hey there, enter your age >> ");
        int age = keyboard.nextInt();
        if(age >= 16) {
            System.out.println("Congrats, you're old enough to drive :)");
            if(age >= 21)
                System.out.println("You're old to drive and you're old enough to drink");
            else
                System.out.println("You're old enough to drive but you can't drink yet.");
        }
        else
            System.out.println("Oh no! You're not old enough to drive yet :(");

    }
}
