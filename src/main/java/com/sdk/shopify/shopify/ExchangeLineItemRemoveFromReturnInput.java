// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class ExchangeLineItemRemoveFromReturnInput implements Serializable {
    private ID exchangeLineItemId;

    private int quantity;

    public ExchangeLineItemRemoveFromReturnInput(ID exchangeLineItemId, int quantity) {
        this.exchangeLineItemId = exchangeLineItemId;

        this.quantity = quantity;
    }

    public ID getExchangeLineItemId() {
        return exchangeLineItemId;
    }

    public ExchangeLineItemRemoveFromReturnInput setExchangeLineItemId(ID exchangeLineItemId) {
        this.exchangeLineItemId = exchangeLineItemId;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public ExchangeLineItemRemoveFromReturnInput setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("exchangeLineItemId:");
        Query.appendQuotedString(_queryBuilder, exchangeLineItemId.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("quantity:");
        _queryBuilder.append(quantity);

        _queryBuilder.append('}');
    }
}
