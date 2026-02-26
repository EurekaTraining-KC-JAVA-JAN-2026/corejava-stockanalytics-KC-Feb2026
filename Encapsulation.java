public class Encapsulation {
    private String accountNum;
    private long accBalance;

    public Encapsulation() {
    }

    public Encapsulation(String accountNum, long accBalance) {
        setAccountNum(accountNum);
        setAccBalance(accBalance);
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public long getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(long accBalance) {
        if(accBalance>100000){
            this.accBalance = accBalance;
        }

    }
}
