import java.util.Scanner;

public class Greeting {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What's your name? ");
        System.out.println("Hi " + input.next());
    }
}
