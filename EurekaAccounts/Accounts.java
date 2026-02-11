package EurekaAccounts;
import java.math.BigDecimal;
public class Accounts {
    public Accounts(String accNumber, BigDecimal accBalance) {
        this.accNumber = accNumber;
        this.accBalance = accBalance;
    }

    /**
     * Bank account
     * checking and savings to understand the inheritance
     */
    public String accNumber;
    public BigDecimal accBalance;

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public BigDecimal getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(BigDecimal accBalance) {
        this.accBalance = accBalance;
    }
    public Accounts(){

    }


    public BigDecimal depositAmount(BigDecimal deposit){
        setAccBalance(accBalance.add(deposit));
        return getAccBalance();
    }
    public BigDecimal withdrwalAmount(BigDecimal deposit){
        setAccBalance((accBalance.subtract(deposit)));
        return getAccBalance();
    }

    // method to see accountDetails
   // public abstract void printAccountDetails(){

    //}
}
