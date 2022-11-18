import java.util.Map;

public class BankService {
    Map<String,Account> accounts;
    public void transfer(String accID,String accID2,long amount){
        Account acc1=accounts.get(accID);
        Account acc2=accounts.get(accID2);
        acc1.balance-=amount;
        acc2.balance+=amount;
    }
    public void updateAccount(Account account){
        Account acc=accounts.get(account);
        acc=account;
    }
    public void addAccount(Account acc){
        accounts.put(acc.accountID,acc);
    }

}
