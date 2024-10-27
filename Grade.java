
//NUMBER GUESSING GAME
import java.util.*;
import javax.swing.JOptionPane;

public class Guess {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = (int) Math.floor(Math.random() * 101);
        boolean isCorrect = false;
        int chances = 0;
        System.out.println("Welcome to Number Guess game😁");
        System.out.println("");
        System.out.println("How to play:");
        System.out.println("1.You have to guess a number between 1 and 100.");
        System.out.println("2.You have 3 chances and in each chance you will have 7 attempts.");
        System.out.println("3.Your Final score will be calculated based on your chances.");
        System.out.print("Are You Ready(yes/no): ");
        System.out.println("");
        String consent = sc.next();
        int guess = 0;
        if (consent.equalsIgnoreCase("yes")) {
            JOptionPane.showMessageDialog(null, "You have 3 chances to guess. Best of luck👍.");
            System.out.println("This is your first chance");

            while (!isCorrect && chances < 3) {
                int choices = 0;

                while (choices < 7) {
                    System.out.println("Enter your guess🧐:");
                    try {
                        guess = sc.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("The entered input is not an integer");
                        sc.next();
                        continue;
                    }
                    choices++;
                    if (x == guess) {
                        isCorrect = true;
                        JOptionPane.showMessageDialog(null, " Congrats!🙌 Your guess is correct🥳.");
                        JOptionPane.showMessageDialog(null, " You took " + choices + " choice(s)👏.");
                        break;
                    } else if (guess > x) {
                        JOptionPane.showMessageDialog(null, "Your guess is too high");
                    } else {
                        JOptionPane.showMessageDialog(null, "Your guess is too low");
                    }

                }
                JOptionPane.showMessageDialog(null, "Ohhh...You have exhausted all your chances!");
                JOptionPane.showMessageDialog(null, "Try Again!👍");
                chances++;
                int num = chances + 1;
                System.out.println("This is your" + num + "chance");
            }

            if (isCorrect) {
                int score = calculateScore(chances);
                JOptionPane.showMessageDialog(null, "Your score is " + score + ".");
            } else {
                JOptionPane.showMessageDialog(null, "Oops you lose!😓 Better Luck next time😊");
            }
        }
        sc.close();
    }

    private static int calculateScore(int chances) {
        if (chances == 1) {
            return 100;
        } else if (chances == 2) {
            return 90;
        } else {
            return 80;
        }
    }
}
