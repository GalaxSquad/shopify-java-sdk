// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class PreparedFulfillmentOrderLineItemsInput implements Serializable {
    private ID fulfillmentOrderId;

    public PreparedFulfillmentOrderLineItemsInput(ID fulfillmentOrderId) {
        this.fulfillmentOrderId = fulfillmentOrderId;
    }

    public ID getFulfillmentOrderId() {
        return fulfillmentOrderId;
    }

    public PreparedFulfillmentOrderLineItemsInput setFulfillmentOrderId(ID fulfillmentOrderId) {
        this.fulfillmentOrderId = fulfillmentOrderId;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("fulfillmentOrderId:");
        Query.appendQuotedString(_queryBuilder, fulfillmentOrderId.toString());

        _queryBuilder.append('}');
    }
}
