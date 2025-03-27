// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class FulfillmentOrderSplitInput implements Serializable {
    private List<FulfillmentOrderLineItemInput> fulfillmentOrderLineItems;

    private ID fulfillmentOrderId;

    public FulfillmentOrderSplitInput(List<FulfillmentOrderLineItemInput> fulfillmentOrderLineItems, ID fulfillmentOrderId) {
        this.fulfillmentOrderLineItems = fulfillmentOrderLineItems;

        this.fulfillmentOrderId = fulfillmentOrderId;
    }

    public List<FulfillmentOrderLineItemInput> getFulfillmentOrderLineItems() {
        return fulfillmentOrderLineItems;
    }

    public FulfillmentOrderSplitInput setFulfillmentOrderLineItems(List<FulfillmentOrderLineItemInput> fulfillmentOrderLineItems) {
        this.fulfillmentOrderLineItems = fulfillmentOrderLineItems;
        return this;
    }

    public ID getFulfillmentOrderId() {
        return fulfillmentOrderId;
    }

    public FulfillmentOrderSplitInput setFulfillmentOrderId(ID fulfillmentOrderId) {
        this.fulfillmentOrderId = fulfillmentOrderId;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("fulfillmentOrderLineItems:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (FulfillmentOrderLineItemInput item1 : fulfillmentOrderLineItems) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("fulfillmentOrderId:");
        Query.appendQuotedString(_queryBuilder, fulfillmentOrderId.toString());

        _queryBuilder.append('}');
    }
}
