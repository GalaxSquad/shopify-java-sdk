// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class InventoryTransferSetItemsInput implements Serializable {
    private ID id;

    private List<InventoryTransferLineItemInput> lineItems;

    public InventoryTransferSetItemsInput(ID id, List<InventoryTransferLineItemInput> lineItems) {
        this.id = id;

        this.lineItems = lineItems;
    }

    public ID getId() {
        return id;
    }

    public InventoryTransferSetItemsInput setId(ID id) {
        this.id = id;
        return this;
    }

    public List<InventoryTransferLineItemInput> getLineItems() {
        return lineItems;
    }

    public InventoryTransferSetItemsInput setLineItems(List<InventoryTransferLineItemInput> lineItems) {
        this.lineItems = lineItems;
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
        _queryBuilder.append("lineItems:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (InventoryTransferLineItemInput item1 : lineItems) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append('}');
    }
}
