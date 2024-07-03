public class Account {

    private String accountName;
    private String pin;
    private int accountNo;
    private int balance;

    public Account(String name, String pin, int accountNo) {
        this.accountName = name;
        this.pin = pin;
        this.accountNo = accountNo;
        this.balance = 0;
    }

    public String getAccountName(){
        return accountName;
    }

    public String getPin(){
        return pin;
    }

    public int getBalance(){
        return balance;
    }

    public int getAccountNo(){
        return accountNo;
    }

    public void deposit(int amount){
        if(amount > 0){ balance += amount;}
    }

    public void withdraw(int amount, String pin){
        if(pin.equals(getPin())) {
            if (amount > 0 && amount <= balance) {balance -= amount;}
        }
    }

    public int checkBalance(){
        return balance;
    }

    @Override
    public String toString(){
        return "Acoount{" + accountName + "  " + pin + "  " + accountNo + "  " + balance + "}";
    }
}
