package Eurekaaccounts.stocks.Exceptions;

public class Stockexception extends RuntimeException {


    public Stockexception() {
    }

    public Stockexception(String message) {
        super(message);
    }

    public Stockexception(String message, Throwable cause) {
        super(message, cause);
    }
}
