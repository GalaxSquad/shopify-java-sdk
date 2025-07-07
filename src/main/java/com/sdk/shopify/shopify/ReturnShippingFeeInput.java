// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;




import java.io.Serializable;

public class ReturnShippingFeeInput implements Serializable {
    private MoneyInput amount;

    public ReturnShippingFeeInput(MoneyInput amount) {
        this.amount = amount;
    }

    public MoneyInput getAmount() {
        return amount;
    }

    public ReturnShippingFeeInput setAmount(MoneyInput amount) {
        this.amount = amount;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("amount:");
        amount.appendTo(_queryBuilder);

        _queryBuilder.append('}');
    }
}
