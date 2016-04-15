package com.tomachine.spec;

import com.tomachine.util.TradingPair;

/**
 * Created by twang on 4/15/16.
 */
public interface ProductSpec {
    TradingPair getTradingPair();

    Long getId();
}
