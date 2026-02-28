public class Bank {

    // static variable -> belongs to class, shared by all objects
    static int currentBalance = 1000;

    // static method -> can be called without creating object
    public static void greetCustomer() {
        System.out.println("Welcome! How are you?");
    }

    // instance method -> requires object to call
    public void deposit(int amount) {
        // adding amount to current balance
        currentBalance = currentBalance + amount;

        System.out.println("Amount deposited successfully");
    }

    // withdraw method creating a method
    public void withdrawal(int amount) {

        // check if sufficient balance is available
        if (amount <= currentBalance) {
            currentBalance = currentBalance - amount;
            System.out.println("Amount withdrawn successfully");
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // method to return current balance
    public int getCurrentBalance() {
        return currentBalance;
    }

    // main method - program execution starts here
    public static void main(String[] args) {

        // calling static method directly
        greetCustomer();

        // creating object of Bank class
        Bank bank = new Bank();

        // depositing 500
        bank.deposit(500);

        // withdrawing 300
        bank.withdrawal(300);

        // printing final balance
        System.out.println("Current Balance: " + bank.getCurrentBalance());
    }
}