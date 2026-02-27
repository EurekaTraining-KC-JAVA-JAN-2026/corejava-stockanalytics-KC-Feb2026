package PracticeJava.Interfacee;

public class InterfacePlayGround {
    public static void main(String[] args) {
        Payment p = new CreditCard();
        System.out.println(p.pay(1000));
        p = new UPIPayment();
        System.out.println(p.pay(500));
    }
}
