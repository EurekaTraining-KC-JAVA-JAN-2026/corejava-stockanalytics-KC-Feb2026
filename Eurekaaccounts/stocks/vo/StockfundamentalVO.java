package Eurekaaccounts.stocks.vo;

import java.math.BigDecimal;

public class StockfundamentalVO implements Comparable<StockfundamentalVO> {
    public String ticker_symbol;
    public int sector_id;
    public int subsector_id;
    public BigDecimal market_cap;
    public double current_ratio;
    public double price_to_book_ratio;
    public float peg;
    public double epsqq;
    public double eps_nxtyear;
    private double eps_ttm;
    private double roe;
    private double insider_ownership;
    private double debt_equity_ratio;
    private double trailing_Pe;
    private double forward_pe;


    public StockfundamentalVO() {
    }

    public StockfundamentalVO(String ticker_symbol, int sector_id, int subsector_id, BigDecimal market_cap, double current_ratio, double price_to_book_ratio, float peg, double epsqq, double eps_nxtyear, double eps_ttm, double roe, double insider_ownership, double debt_equity_ratio, double trailing_Pe, double forward_pe) {
        this.ticker_symbol = ticker_symbol;
        this.sector_id = sector_id;
        this.subsector_id = subsector_id;
        this.market_cap = market_cap;
        this.current_ratio = current_ratio;
        this.price_to_book_ratio = price_to_book_ratio;
        this.peg = peg;
        this.epsqq = epsqq;
        this.eps_nxtyear = eps_nxtyear;
        this.eps_ttm = eps_ttm;
        this.roe = roe;
        this.insider_ownership = insider_ownership;
        this.debt_equity_ratio = debt_equity_ratio;
        this.trailing_Pe = trailing_Pe;
        this.forward_pe = forward_pe;
    }

    public String getTicker_symbol() {
        return ticker_symbol;
    }

    public void setTicker_symbol(String ticker_symbol) {
        this.ticker_symbol = ticker_symbol;
    }

    public int getSector_id() {
        return sector_id;
    }

    public void setSector_id(int sector_id) {
        this.sector_id = sector_id;
    }

    public int getSubsector_id() {
        return subsector_id;
    }

    public void setSubsector_id(int subsector_id) {
        this.subsector_id = subsector_id;
    }

    public BigDecimal getMarket_cap() {
        return market_cap;
    }

    public void setMarket_cap(BigDecimal market_cap) {
        this.market_cap = market_cap;
    }

    public double getCurrent_ratio() {
        return current_ratio;
    }

    public void setCurrent_ratio(double current_ratio) {
        this.current_ratio = current_ratio;
    }

    public double getPrice_to_book_ratio() {
        return price_to_book_ratio;
    }

    public void setPrice_to_book_ratio(double price_to_book_ratio) {
        this.price_to_book_ratio = price_to_book_ratio;
    }

    public float getPeg() {
        return peg;
    }

    public void setPeg(float peg) {
        this.peg = peg;
    }

    public double getEpsqq() {
        return epsqq;
    }

    public void setEpsqq(double epsqq) {
        this.epsqq = epsqq;
    }

    public double getEps_nxtyear() {
        return eps_nxtyear;
    }

    public void setEps_nxtyear(double eps_nxtyear) {
        this.eps_nxtyear = eps_nxtyear;
    }

    public double getEps_ttm() {
        return eps_ttm;
    }

    public void setEps_ttm(double eps_ttm) {
        this.eps_ttm = eps_ttm;
    }

    public double getRoe() {
        return roe;
    }

    public void setRoe(double roe) {
        this.roe = roe;
    }

    public double getInsider_ownership() {
        return insider_ownership;
    }

    public void setInsider_ownership(double insider_ownership) {
        this.insider_ownership = insider_ownership;
    }

    public double getDebt_equity_ratio() {
        return debt_equity_ratio;
    }

    public void setDebt_equity_ratio(double debt_equity_ratio) {
        this.debt_equity_ratio = debt_equity_ratio;
    }

    public double getTrailing_Pe() {
        return trailing_Pe;
    }

    public void setTrailing_Pe(double trailing_Pe) {
        this.trailing_Pe = trailing_Pe;
    }

    public double getForward_pe() {
        return forward_pe;
    }

    public void setForward_pe(double forward_pe) {
        this.forward_pe = forward_pe;
    }

    @Override
    public String toString() {
        return "specificstockfundamental{" +
                "ticker_symbol='" + ticker_symbol + '\'' +
                ", sector_id=" + sector_id +
                ", subsector_id=" + subsector_id +
                ", market_cap=" + market_cap +
                ", current_ratio=" + current_ratio +
                ", price_to_book_ratio=" + price_to_book_ratio +
                ", peg=" + peg +
                ", epsqq=" + epsqq +
                ", eps_nxtyear=" + eps_nxtyear +
                ", eps_ttm=" + eps_ttm +
                ", roe=" + roe +
                ", insider_ownership=" + insider_ownership +
                ", debt_equity_ratio=" + debt_equity_ratio +
                ", trailing_Pe=" + trailing_Pe +
                ", forward_pe=" + forward_pe +
                '}' + "\n";
    }

    @Override
    public int compareTo(StockfundamentalVO o) {
   return o.market_cap.compareTo(this.market_cap);
//        return Integer.compare(this.market_cap, o.market_cap);

//    @Override
//    public int compareTo(stockfundamentalVO o) {
//
//        return this.ticker_symbol .compareTo(o.ticker_symbol);
//    }
    }
}
