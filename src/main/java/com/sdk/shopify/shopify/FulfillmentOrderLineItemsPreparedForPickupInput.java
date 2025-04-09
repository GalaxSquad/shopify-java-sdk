// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import java.io.Serializable;
import java.util.List;

public class FulfillmentOrderLineItemsPreparedForPickupInput implements Serializable {
    private List<PreparedFulfillmentOrderLineItemsInput> lineItemsByFulfillmentOrder;

    public FulfillmentOrderLineItemsPreparedForPickupInput(List<PreparedFulfillmentOrderLineItemsInput> lineItemsByFulfillmentOrder) {
        this.lineItemsByFulfillmentOrder = lineItemsByFulfillmentOrder;
    }

    public List<PreparedFulfillmentOrderLineItemsInput> getLineItemsByFulfillmentOrder() {
        return lineItemsByFulfillmentOrder;
    }

    public FulfillmentOrderLineItemsPreparedForPickupInput setLineItemsByFulfillmentOrder(List<PreparedFulfillmentOrderLineItemsInput> lineItemsByFulfillmentOrder) {
        this.lineItemsByFulfillmentOrder = lineItemsByFulfillmentOrder;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("lineItemsByFulfillmentOrder:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (PreparedFulfillmentOrderLineItemsInput item1 : lineItemsByFulfillmentOrder) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append('}');
    }
}
