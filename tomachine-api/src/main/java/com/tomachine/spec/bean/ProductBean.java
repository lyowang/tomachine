package com.tomachine.spec.bean;

import com.tomachine.spec.ProductSpec;
import com.tomachine.util.TradingPair;

/**
 * Created by twang on 4/15/16.
 */
public class ProductBean implements ProductSpec {
    private TradingPair tradingPair;
    private Long id;

    public TradingPair getTradingPair() {
        return null;
    }

    public Long getId() {
        return null;
    }

    public void setTradingPair(TradingPair tradingPair) {
        this.tradingPair = tradingPair;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
