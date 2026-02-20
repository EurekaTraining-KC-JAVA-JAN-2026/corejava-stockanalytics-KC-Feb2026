package eurekaAccounts.stocks.exception;

public class StocksException extends  RuntimeException{
    public StocksException(String message) {
        super(message);
    }

    public StocksException(String message, Throwable cause) {
        super(message, cause);
    }
}
