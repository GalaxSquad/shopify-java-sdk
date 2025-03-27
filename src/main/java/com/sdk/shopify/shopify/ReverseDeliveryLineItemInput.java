// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class ReverseDeliveryLineItemInput implements Serializable {
    private ID reverseFulfillmentOrderLineItemId;

    private int quantity;

    public ReverseDeliveryLineItemInput(ID reverseFulfillmentOrderLineItemId, int quantity) {
        this.reverseFulfillmentOrderLineItemId = reverseFulfillmentOrderLineItemId;

        this.quantity = quantity;
    }

    public ID getReverseFulfillmentOrderLineItemId() {
        return reverseFulfillmentOrderLineItemId;
    }

    public ReverseDeliveryLineItemInput setReverseFulfillmentOrderLineItemId(ID reverseFulfillmentOrderLineItemId) {
        this.reverseFulfillmentOrderLineItemId = reverseFulfillmentOrderLineItemId;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public ReverseDeliveryLineItemInput setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("reverseFulfillmentOrderLineItemId:");
        Query.appendQuotedString(_queryBuilder, reverseFulfillmentOrderLineItemId.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("quantity:");
        _queryBuilder.append(quantity);

        _queryBuilder.append('}');
    }
}
