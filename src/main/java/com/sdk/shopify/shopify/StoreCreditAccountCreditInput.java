// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class StoreCreditAccountCreditInput implements Serializable {
    private MoneyInput creditAmount;

    private Input<String> expiresAt = Input.undefined();

    public StoreCreditAccountCreditInput(MoneyInput creditAmount) {
        this.creditAmount = creditAmount;
    }

    public MoneyInput getCreditAmount() {
        return creditAmount;
    }

    public StoreCreditAccountCreditInput setCreditAmount(MoneyInput creditAmount) {
        this.creditAmount = creditAmount;
        return this;
    }

    public String getExpiresAt() {
        return expiresAt.getValue();
    }

    public Input<String> getExpiresAtInput() {
        return expiresAt;
    }

    public StoreCreditAccountCreditInput setExpiresAt(String expiresAt) {
        this.expiresAt = Input.optional(expiresAt);
        return this;
    }

    public StoreCreditAccountCreditInput setExpiresAtInput(Input<String> expiresAt) {
        if (expiresAt == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.expiresAt = expiresAt;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("creditAmount:");
        creditAmount.appendTo(_queryBuilder);

        if (this.expiresAt.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("expiresAt:");
            if (expiresAt.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, expiresAt.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
