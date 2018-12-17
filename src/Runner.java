import java.util.Scanner;

public class Runner {
    public static void main(String[] args)
    {
        HiddenWord trial1 = new HiddenWord("APPLE");
        Scanner in = new Scanner(System.in);
        System.out.println("What's your guess?");
        String guess = in.nextLine().substring(0,5).toUpperCase();
        String hint = trial1.getHint(guess);
        while(!hint.equals("APPLE")){
            System.out.println("Your hint: " + hint);
            System.out.println("What's your next guess?");
            guess = in.nextLine().substring(0,5).toUpperCase();
            hint = trial1.getHint(guess);
        }
        System.out.println("Congrats!");
    }

    }

