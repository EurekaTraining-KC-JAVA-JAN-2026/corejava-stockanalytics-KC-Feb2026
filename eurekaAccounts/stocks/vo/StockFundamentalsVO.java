package eurekaAccounts.stocks.vo;

public class StockFundamentalsVO implements Comparable<StockFundamentalsVO> {
    public String ticker_symbol;
    public int sector_id;
    public int subsector_id;
    public double market_cap;
    public float current_ratio;
    public float price_to_book_ratio;
    public int peg;
    public float epsqq;
    public float eps_nxtyear;




    public float getCurrent_ratio() {
        return current_ratio;
    }

    public void setCurrent_ratio(float current_ratio) {
        this.current_ratio = current_ratio;
    }

    public float getDebt_equity_ratio() {
        return debt_equity_ratio;
    }

    public void setDebt_equity_ratio(float debt_equity_ratio) {
        this.debt_equity_ratio = debt_equity_ratio;
    }

    public float getEpd_ttm() {
        return eps_ttm;
    }

    public void setEpd_ttm(float epd_ttm) {
        this.eps_ttm = epd_ttm;
    }

    public float getEps_nxtyear() {
        return eps_nxtyear;
    }

    public void setEps_nxtyear(float eps_nxtyear) {
        this.eps_nxtyear = eps_nxtyear;
    }

    public float getEpsqq() {
        return epsqq;
    }

    public void setEpsqq(float epsqq) {
        this.epsqq = epsqq;
    }

    public float getForward_pe() {
        return forward_pe;
    }

    public void setForward_pe(float forward_pe) {
        this.forward_pe = forward_pe;
    }

    public float getInsider_ownership() {
        return insider_ownership;
    }

    public void setInsider_ownership(float insider_ownership) {
        this.insider_ownership = insider_ownership;
    }

    public double getMarket_cap() {
        return market_cap;
    }

    public void setMarket_cap(double market_cap) {
        this.market_cap = market_cap;
    }

    public int getPeg() {
        return peg;
    }

    public void setPeg(int peg) {
        this.peg = peg;
    }

    public float getPrice_to_book_ratio() {
        return price_to_book_ratio;
    }

    public void setPrice_to_book_ratio(float price_to_book_ratio) {
        this.price_to_book_ratio = price_to_book_ratio;
    }

    public float getRoe() {
        return roe;
    }

    public void setRoe(float roe) {
        this.roe = roe;
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

    public String getTicker_symbol() {
        return ticker_symbol;
    }

    public void setTicker_symbol(String ticker_symbol) {
        this.ticker_symbol = ticker_symbol;
    }

    public float getTrailing_pe() {
        return trailing_pe;
    }

    public void setTrailing_pe(float trailing_pe) {
        this.trailing_pe = trailing_pe;
    }

    public float eps_ttm;
    public float roe;
    public float insider_ownership;
    public float debt_equity_ratio;
    public float trailing_pe;
    public float forward_pe;

    public StockFundamentalsVO(float current_ratio, float debt_equity_ratio, float epd_ttm, float eps_nxtyear, float epsqq, float forward_pe, float insider_ownership, double market_cap, int peg, float price_to_book_ratio, float roe, int sector_id, int subsector_id, String ticker_symbol, float trailing_pe) {
        this.current_ratio = current_ratio;
        this.debt_equity_ratio = debt_equity_ratio;
        this.eps_ttm = epd_ttm;
        this.eps_nxtyear = eps_nxtyear;
        this.epsqq = epsqq;
        this.forward_pe = forward_pe;
        this.insider_ownership = insider_ownership;
        this.market_cap = market_cap;
        this.peg = peg;
        this.price_to_book_ratio = price_to_book_ratio;
        this.roe = roe;
        this.sector_id = sector_id;
        this.subsector_id = subsector_id;
        this.ticker_symbol = ticker_symbol;
        this.trailing_pe = trailing_pe;
    }

    public StockFundamentalsVO() {
    }

    @Override
    public String toString() {
        return "StockFundamentalsVO{" +
                "current_ratio=" + current_ratio +
                ", ticker_symbol='" + ticker_symbol + '\'' +
                ", sector_id=" + sector_id +
                ", subsector_id=" + subsector_id +
                ", market_cap=" + market_cap +
                ", price_to_book_ratio=" + price_to_book_ratio +
                ", peg=" + peg +
                ", epsqq=" + epsqq +
                ", eps_nxtyear=" + eps_nxtyear +
                ", eps_ttm=" + eps_ttm +
                ", roe=" + roe +
                ", insider_ownership=" + insider_ownership +
                ", debt_equity_ratio=" + debt_equity_ratio +
                ", trailing_pe=" + trailing_pe +
                ", forward_pe=" + forward_pe +
                '}'+'\n';
    }

    @Override
    public int compareTo(StockFundamentalsVO o) {
        return Double.compare(o.market_cap, this.market_cap);


    }
}
