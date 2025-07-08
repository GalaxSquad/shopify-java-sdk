// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class SuggestedOutcomeReturnLineItemInput implements Serializable {
    private ID id;

    private int quantity;

    public SuggestedOutcomeReturnLineItemInput(ID id, int quantity) {
        this.id = id;

        this.quantity = quantity;
    }

    public ID getId() {
        return id;
    }

    public SuggestedOutcomeReturnLineItemInput setId(ID id) {
        this.id = id;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public SuggestedOutcomeReturnLineItemInput setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("quantity:");
        _queryBuilder.append(quantity);

        _queryBuilder.append('}');
    }
}
