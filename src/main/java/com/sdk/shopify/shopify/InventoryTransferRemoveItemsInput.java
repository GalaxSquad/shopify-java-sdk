// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class InventoryTransferRemoveItemsInput implements Serializable {
    private ID id;

    private Input<List<ID>> transferLineItemIds = Input.undefined();

    public InventoryTransferRemoveItemsInput(ID id) {
        this.id = id;
    }

    public ID getId() {
        return id;
    }

    public InventoryTransferRemoveItemsInput setId(ID id) {
        this.id = id;
        return this;
    }

    public List<ID> getTransferLineItemIds() {
        return transferLineItemIds.getValue();
    }

    public Input<List<ID>> getTransferLineItemIdsInput() {
        return transferLineItemIds;
    }

    public InventoryTransferRemoveItemsInput setTransferLineItemIds(List<ID> transferLineItemIds) {
        this.transferLineItemIds = Input.optional(transferLineItemIds);
        return this;
    }

    public InventoryTransferRemoveItemsInput setTransferLineItemIdsInput(Input<List<ID>> transferLineItemIds) {
        if (transferLineItemIds == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.transferLineItemIds = transferLineItemIds;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        if (this.transferLineItemIds.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("transferLineItemIds:");
            if (transferLineItemIds.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : transferLineItemIds.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
