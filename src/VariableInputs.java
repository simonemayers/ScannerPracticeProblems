import java.util.Scanner;

public class VariableInputs {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string of text: ");
        String text = input.nextLine();
        System.out.println("Enter an integer: ");
        int integer = input.nextInt();
        System.out.println("Enter a double");
        double doubleInput = input.nextDouble();
        System.out.println("Enter a boolean value: ");
        boolean booleanInput = input.nextBoolean();
        System.out.println("Your string is " + text);
        System.out.println("Your integer is " + integer);
        System.out.println("Your double is " + doubleInput);
        System.out.println("Your boolean is " + booleanInput);
    }
}
