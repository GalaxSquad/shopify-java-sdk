// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class ReturnRefundOrderTransactionInput implements Serializable {
    private MoneyInput transactionAmount;

    private ID parentId;

    public ReturnRefundOrderTransactionInput(MoneyInput transactionAmount, ID parentId) {
        this.transactionAmount = transactionAmount;

        this.parentId = parentId;
    }

    public MoneyInput getTransactionAmount() {
        return transactionAmount;
    }

    public ReturnRefundOrderTransactionInput setTransactionAmount(MoneyInput transactionAmount) {
        this.transactionAmount = transactionAmount;
        return this;
    }

    public ID getParentId() {
        return parentId;
    }

    public ReturnRefundOrderTransactionInput setParentId(ID parentId) {
        this.parentId = parentId;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("transactionAmount:");
        transactionAmount.appendTo(_queryBuilder);

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("parentId:");
        Query.appendQuotedString(_queryBuilder, parentId.toString());

        _queryBuilder.append('}');
    }
}
