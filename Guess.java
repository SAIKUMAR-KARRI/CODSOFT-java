//NUMBER GUESSING GAME

import javax.swing.JOptionPane;

public class Guess {

    public static void main(String[] args) {
        int x = (int) Math.floor(Math.random() * 100);
        boolean isCorrect = false;
        int chances = 0;

        JOptionPane.showMessageDialog(null, "You have 3 chances to guess. Best of luck👍.");

        while (!isCorrect && chances < 3) {
            int choices = 0;
            while (choices < 7) {
                String input = JOptionPane.showInputDialog(null, "Enter your guess");
                int guess = Integer.parseInt(input);
                choices++;
                if (x == guess) {
                    isCorrect = true;
                    JOptionPane.showMessageDialog(null, " Congrats!🙌 Your guess is correct🥳.");
                    JOptionPane.showMessageDialog(null, " You took " + choices + " choice👏.");
                    break;
                } else if (guess > x) {
                        JOptionPane.showMessageDialog(null, "Your guess is too high");
                } else {
                        JOptionPane.showMessageDialog(null, "Your guess is too low");
                }
                
            }
            JOptionPane.showMessageDialog(null,"Ohhh...You have exhausted all your chances!");
            JOptionPane.showMessageDialog(null,"Try Again!👍");
            chances++;
        }

        if (isCorrect) {
            int score = calculateScore(chances);
            JOptionPane.showMessageDialog(null, "Your score is " + score + ".");
        } else {
            JOptionPane.showMessageDialog(null, "Oops you lose!😓 Better Luck next time😊");
        }
    }

    private static  int calculateScore(int chances) {
        if (chances == 1) {
            return 100;
        } else if (chances == 2) {
            return 90;
        } else {
            return 80;
        }
    }
}
