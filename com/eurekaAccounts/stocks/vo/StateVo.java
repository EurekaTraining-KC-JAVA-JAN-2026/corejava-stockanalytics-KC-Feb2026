package com.eurekaAccounts.stocks.vo;

public class StateVo {
    public String stateSymbol;
    public String stateName;

    public StateVo(String stateSymbol, String stateName) {
        this.stateSymbol = stateSymbol;
        this.stateName = stateName;
    }

    public StateVo() {
    }

    public String getStateSymbol() {
        return stateSymbol;
    }

    public void setStateSymbol(String stateSymbol) {
        this.stateSymbol = stateSymbol;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
}
