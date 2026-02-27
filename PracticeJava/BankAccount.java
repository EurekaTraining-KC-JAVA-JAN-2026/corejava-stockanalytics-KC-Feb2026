package PracticeJava;

import PracticeJava.Exceptionss.InsufficientBalanceException;

class UserAccess {

    private double balance;

    public UserAccess() {
    }

    public void deposit(double i) {

        if(i>0){
            balance = balance+i;
        }
    }

    public void withdraw(double j) throws InsufficientBalanceException {
        if(j>balance){
            throw new InsufficientBalanceException("Insufficient Balance");
        }
            balance = balance - j;
    }

    public double getBalance() {
        return balance;
    }
}

public class BankAccount {

    public static void main(String[] args) {

        UserAccess userAccess = new UserAccess();

        userAccess.deposit(500);
        try {
            userAccess.withdraw(750);
        }catch(InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
        System.out.println(userAccess.getBalance());


    }
}
