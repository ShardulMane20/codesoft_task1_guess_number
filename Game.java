import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int choice = 0, count = 0;

        int genNum = rand.nextInt(1,101);

        System.out.println("Number Guessing Game by Shardul Mane.\n\n");
        System.out.println("Guess the number between 1 to 100.");

        while(true) {
            count++;
            System.out.println("\n\nEnter your guess :");
            choice = sc.nextInt();

            if (choice==genNum) break;

            if (choice > genNum) System.out.println("Bit smaller number please.");
            else System.out.println("Bit bigger number please.");
        }

        System.out.printf("You guessed the number in %d turn%s.", count, count==1?"":"s");
    }
}
