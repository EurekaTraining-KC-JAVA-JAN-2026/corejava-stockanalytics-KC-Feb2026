package com.eurekaAccounts.MarketCap;

public class StateLookUpVO {
    private String stateSymbol;
    private String stateName;
    private int totalStates;

    public StateLookUpVO() {
    }

    public String getStateSymbol() {
        return stateSymbol;
    }

    public int getTotalStates() {
        return totalStates;
    }

    public void setTotalStates(int totalStates) {
        this.totalStates = totalStates;
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

    @Override
    public String toString() {
        return "Total States = " + totalStates;
    }
}
