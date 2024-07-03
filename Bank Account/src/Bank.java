import java.util.ArrayList;

public class Bank {
    private ArrayList<Account>accounts = new ArrayList<>();
    private int numberOfCustomers;

    public int getNoOfCustomers(){
        return numberOfCustomers;
    }

    public void addAccount(String name, String pin){
        Account newAccount = new Account(name, pin, generateAcct());
        accounts.add(newAccount);
        numberOfCustomers++;
    }

    public void bankDeposit(int acctNo, int amount) {
        Account depositToUserAccount = findAcct(acctNo);
        depositToUserAccount.deposit(amount);
    }

    public void bankWithdraw(int acctNo, int amount, String pin) {
        Account withdrawFromUserAccount = findAcct(acctNo);
        withdrawFromUserAccount.withdraw(amount, pin);
    }

    public void bankTransfer(int senderAcctNo, int receiverAcctNo, int amount, String pin) {
        Account findSenderAcct = findAcct(senderAcctNo);
        findSenderAcct.withdraw(amount, pin);
        Account findReceiverAcct = findAcct(receiverAcctNo);
        findReceiverAcct.deposit(amount);
    }

    private int generateAcct() {
        return getNoOfCustomers() + 1;
    }

    public int checkBalance(int acctNo){
        Account getAccountBalance = findAcct(acctNo);
        return getAccountBalance.getBalance();
    }

    private Account findAcct(int acctNo) {
        for (Account account : accounts) {
            boolean accountIsFound = acctNo == account.getAccountNo();
            if (accountIsFound){return account;}
        }
        return null;
    }

    public void showAccounts(){
        for(Account account : accounts){
            System.out.println(account);
        }
    }

}
