package com.tomachine.model;

import com.tomachine.spec.ProductSpec;
import com.tomachine.util.TradingPair;
import org.hibernate.annotations.NamedQueries;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by twang on 4/15/16.
 */
@Entity
@Table(name = "v2_itinerary")
@NamedQueries({})
public class Product implements ProductSpec {
    private TradingPair tradingPair;
    private Long id;

    @Column
    public TradingPair getTradingPair() {
        return tradingPair;
    }

    public void setTradingPair(TradingPair tradingPair) {
        this.tradingPair = tradingPair;
    }

    @Column
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
