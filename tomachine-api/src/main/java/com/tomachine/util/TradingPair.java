package com.tomachine.util;

/**
 * Created by twang on 4/15/16.
 */
public enum TradingPair {
    EURUSD("EURUSD", "EURUSD");

    private String name;
    private String displayName;

    TradingPair(String name, String displayName) {
        this.name = name;
        this.displayName = displayName;
    }

    public String getName() {
        return name;
    }

    public String getDisplayName() {
        return displayName;
    }
}
