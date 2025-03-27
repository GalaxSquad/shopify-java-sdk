// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.math.BigDecimal;

public class OrderCreateTaxLineInput implements Serializable {
    private BigDecimal rate;

    private String title;

    private Input<Boolean> channelLiable = Input.undefined();

    private Input<MoneyBagInput> priceSet = Input.undefined();

    public OrderCreateTaxLineInput(BigDecimal rate, String title) {
        this.rate = rate;

        this.title = title;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public OrderCreateTaxLineInput setRate(BigDecimal rate) {
        this.rate = rate;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public OrderCreateTaxLineInput setTitle(String title) {
        this.title = title;
        return this;
    }

    public Boolean getChannelLiable() {
        return channelLiable.getValue();
    }

    public Input<Boolean> getChannelLiableInput() {
        return channelLiable;
    }

    public OrderCreateTaxLineInput setChannelLiable(Boolean channelLiable) {
        this.channelLiable = Input.optional(channelLiable);
        return this;
    }

    public OrderCreateTaxLineInput setChannelLiableInput(Input<Boolean> channelLiable) {
        if (channelLiable == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.channelLiable = channelLiable;
        return this;
    }

    public MoneyBagInput getPriceSet() {
        return priceSet.getValue();
    }

    public Input<MoneyBagInput> getPriceSetInput() {
        return priceSet;
    }

    public OrderCreateTaxLineInput setPriceSet(MoneyBagInput priceSet) {
        this.priceSet = Input.optional(priceSet);
        return this;
    }

    public OrderCreateTaxLineInput setPriceSetInput(Input<MoneyBagInput> priceSet) {
        if (priceSet == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.priceSet = priceSet;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("rate:");
        Query.appendQuotedString(_queryBuilder, rate.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("title:");
        Query.appendQuotedString(_queryBuilder, title.toString());

        if (this.channelLiable.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("channelLiable:");
            if (channelLiable.getValue() != null) {
                _queryBuilder.append(channelLiable.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.priceSet.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("priceSet:");
            if (priceSet.getValue() != null) {
                priceSet.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
