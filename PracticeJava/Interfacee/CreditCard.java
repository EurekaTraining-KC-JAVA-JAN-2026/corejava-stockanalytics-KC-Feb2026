package PracticeJava.Interfacee;

public class CreditCard implements Payment{
    @Override
    public double pay(double amount) {
        return amount;
    }
}
