import java.util.*;

public class AtMachine {
    static Bank banke = new Bank();
    public static void main(String... args){
        backToMenu();

    }

    static String input(){
        Scanner input = new Scanner(System.in);
        String stringCollector = input.next();
        return stringCollector;
    }

    static int numbers(){
        Scanner input = new Scanner(System.in);
        int intCollector = input.nextInt();
        return intCollector;
    }

    static void print(Object element){
        System.out.println(element);
    }

    static void exitApplication(){
        System.exit(0);
    }

    static void createAccount(){
        print("Enter your name: ");
        String userName = input();
        print("Enter pin: ");
        String userPin = input();
        banke.addAccount(userName, userPin);
        banke.showAccounts();
        print("........Account created successfully...........");
        backToMenu();
    }

    static void mainDeposit(){
        print("Enter account number: ");
        int userAcctNo = numbers();
        print("Enter deposit amount: ");
        int amount = numbers();
        banke.bankDeposit(userAcctNo, amount);
        print("Deposit of " + amount + " naira Successfull");
        backToMenu();
    }

    static void mainWithdrawal(){
        print("Enter account number: ");
        int userAcctNo = numbers();
        print("Enter withdraw amount: ");
        int amount = numbers();
        print("Enter your pin: ");
        String userPin = input();
        banke.bankWithdraw(userAcctNo, amount, userPin);
        print("withdrawal of " + amount + " naira Successfull");
        backToMenu();
    }

    static void mainTransfer(){
        print("Enter your account number: ");
        int userAcctNo = numbers();
        print("Enter your pin: ");
        String userPin = input();
        print("Enter transfer amount: ");
        int amount = numbers();
        print("Enter your reciever account number: ");
        int receiverAcctNo = numbers();
        banke.bankTransfer(userAcctNo, receiverAcctNo, amount, userPin);
        print("Transfer of " + amount + " naira Successfull");
        backToMenu();
    }

    static void mainCheckBalance(){
        print("Enter account number: ");
        int acctNo = numbers();
        print(banke.checkBalance(acctNo));
        backToMenu();
    }

    static void printAccounts(){
        banke.showAccounts();
        backToMenu();
    }

    static void backToMenu(){
        print("""
                ====================================
                WELCOME TO IFY'S BANK PLC
                ====================================
                
                WHAT DO YOU WANT TO DO
                
                1 -> Create Account
                2 -> Deposit
                3 -> Withdraw
                4 -> Transfer
                5 -> Check Balance
                6 -> Print Accounts
                7 -> exit
                """);
        print("Select preferred option");
        String userInput = input();
        switch(userInput){
            case "1" -> createAccount();
            case "2" -> mainDeposit();
            case "3" -> mainWithdrawal();
            case "4" -> mainTransfer();
            case "5" -> mainCheckBalance();
            case "6" -> printAccounts();
            case "7" -> exitApplication();
        }
    }
}
