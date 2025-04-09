// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class ReturnRefundLineItemInput implements Serializable {
    private ID returnLineItemId;

    private int quantity;

    public ReturnRefundLineItemInput(ID returnLineItemId, int quantity) {
        this.returnLineItemId = returnLineItemId;

        this.quantity = quantity;
    }

    public ID getReturnLineItemId() {
        return returnLineItemId;
    }

    public ReturnRefundLineItemInput setReturnLineItemId(ID returnLineItemId) {
        this.returnLineItemId = returnLineItemId;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public ReturnRefundLineItemInput setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("returnLineItemId:");
        Query.appendQuotedString(_queryBuilder, returnLineItemId.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("quantity:");
        _queryBuilder.append(quantity);

        _queryBuilder.append('}');
    }
}
