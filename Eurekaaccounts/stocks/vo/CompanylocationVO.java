package Eurekaaccounts.stocks.vo;

public class CompanylocationVO {
    public String ticker_symbol;
    public String address;

    public CompanylocationVO() {
    }

    public CompanylocationVO(String ticker_symbol, String address) {
        this.ticker_symbol = ticker_symbol;
        this.address = address;
    }

    public String getTicker_symbol() {
        return ticker_symbol;
    }

    public void setTicker_symbol(String ticker_symbol) {
        this.ticker_symbol = ticker_symbol;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "CompanylocationVO{" +
                "ticker_symbol='" + ticker_symbol + '\'' +
                ", address='" + address + '\'' +
                '}' + "\n";
    }
}
