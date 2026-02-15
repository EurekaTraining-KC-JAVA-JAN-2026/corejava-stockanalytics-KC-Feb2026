package com.EurekaAccounts;
import java.math.BigDecimal;
public abstract class Accounts {



    /**
     * Bank account
     * checking and savings to understand the inheritance
     */
    public String accNumber;
    public BigDecimal accBalance;


// we can add a constructor here by generate by right click.....
public Accounts(String accNumber, BigDecimal accBalance) {
    this.accNumber = accNumber;
    this.accBalance = accBalance;
}
// above is parameterized and below is default

    //-------------------------------------------------------------------------------------------
    public Accounts(){

    }
    //----------------------------------------------------------------------------------
// here we are crearting getters and setters with the string and accBalance
    // we can create it by right click
                            // generate
                            // getter and setters
                            // select two and enter
    // it will create for string accNum and also for BigDecimal accBalance


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



//----------------------------------------------------------------------------------------------------------------
    // here we can create a depositamount so we can create a function deposit  with a bigdecimal


    // method to depositAmount
    public BigDecimal depositAmount(BigDecimal deposit){
        setAccBalance(accBalance.add(deposit));
        return getAccBalance();
    }


    //method to  withDrawAmount
    public BigDecimal withdrawAmount(BigDecimal deposit){
        setAccBalance((accBalance.subtract(deposit)));
        return getAccBalance();
    }
//--------------------------------------------------------------------------------------------------


    public BigDecimal something() {
    // java will create space in memory//metaspace// and also register method signature
    return new BigDecimal(10);
    }
    // method to see accountDetails

    // abstract methods doesnot have body

    // here, java won't create any memory here
    //it is just registers with method signature
   public abstract void printAccountDetails();
}




// a simple method have a body , where as abstract method doesn't have any body
