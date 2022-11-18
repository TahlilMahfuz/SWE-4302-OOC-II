import java.util.Map;

public class Account {
    String accountID;
    long balance;

    public Account(String accountID,long balance){
        this.accountID=accountID;
        this.balance=balance;
    }

    public void debit(long debit){
        this.balance-=debit;
    }
    public void credit(long credit){
        this.balance+=credit;
    }
    public long getBalance(){
        return balance;
    }

}
