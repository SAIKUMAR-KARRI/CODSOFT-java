//ATM INTERFACE

import java.util.*;

class Atm {
    int Balance = 5000; 

     void Withdraw(int amount) { 
        int money = amount;
        if (money > Balance) {
            System.err.println("You have insufficient balance.");
            System.out.println("Your Transaction is Failed!");

        } else {
            System.out.println(money + " amount is debited from your account.");
            Balance = Balance - money;
            System.out.println("Your balance amount is " + Balance);
            System.out.println("Your Transaction is succuessful!");
        }
    }

     void Deposit(int amount) { 
        int money = amount;
        System.out.println(money + " amount is credited to your account.");
        Balance = Balance + money;
        System.out.println("Your balance amount is " + Balance);
        System.out.println("Your Transaction is succuessful!");
    }

     void CheckBalance() { 
        System.out.println("Your remaining balance amount is " + Balance);
        System.out.println("Your Transaction is succuessful!");
    }
}

public class User {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Atm obj = new Atm(); 
        System.out.println("Welcome! to ATM");
        System.out.println();
        System.out.println("1.Withdraw" + "\n" + "2.Deposit" + "\n" + "3.Check Balance" + "\n");
        System.out.print("Enter your choice:");
        System.out.println();
        int choice = sc.nextInt();
        int amount;
        switch (choice) {
            case 1:
                System.out.print("Enter the amount:");
                System.out.println();
                amount = sc.nextInt();
                obj.Withdraw(amount);
                break;
            case 2:
                System.out.print("Enter the amount:");
                System.out.println();
                amount = sc.nextInt();
                obj.Deposit(amount);
                break;
            case 3:
                obj.CheckBalance();
                break;
            default:
                System.out.println("You have choosen wrong option." + "\n");
                System.out.println("Your Transaction is Failed!");
                break;
        }
        sc.close();
    }
}
