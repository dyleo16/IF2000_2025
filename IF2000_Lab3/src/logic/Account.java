package logic;

/**
 *
 * @author dylan
 */
public abstract class Account {
    //Atributes
    private String accountNumber;
    private double balance;
    private Client client;
    private String bank;

    public Account() {
    }

    public Account(String accountNumber
                   , double balance
                   , Client client, String bank) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.client = client;
        this.bank = bank;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    
    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }
    //-------------------------
    //Methods for polimorfism
    //-------------------------
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract void interestCalculation();

    @Override
    public String toString() {
    
        return """
               ACCOUNT INFORMATION:
               --------------------------------
               Account Number: """+this.getAccountNumber()
                +"\nBalance: "+this.getBalance()
                +"\nAccount Owner:\n "+this.getClient().toString()
                +"\nBank: " + this.getBank()
                +"\n";
    }//endToString
       
}//endClass

