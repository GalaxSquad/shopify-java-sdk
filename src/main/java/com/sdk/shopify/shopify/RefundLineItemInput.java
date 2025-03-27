// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class RefundLineItemInput implements Serializable {
    private ID lineItemId;

    private int quantity;

    private Input<RefundLineItemRestockType> restockType = Input.undefined();

    private Input<ID> locationId = Input.undefined();

    public RefundLineItemInput(ID lineItemId, int quantity) {
        this.lineItemId = lineItemId;

        this.quantity = quantity;
    }

    public ID getLineItemId() {
        return lineItemId;
    }

    public RefundLineItemInput setLineItemId(ID lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public RefundLineItemInput setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public RefundLineItemRestockType getRestockType() {
        return restockType.getValue();
    }

    public Input<RefundLineItemRestockType> getRestockTypeInput() {
        return restockType;
    }

    public RefundLineItemInput setRestockType(RefundLineItemRestockType restockType) {
        this.restockType = Input.optional(restockType);
        return this;
    }

    public RefundLineItemInput setRestockTypeInput(Input<RefundLineItemRestockType> restockType) {
        if (restockType == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.restockType = restockType;
        return this;
    }

    public ID getLocationId() {
        return locationId.getValue();
    }

    public Input<ID> getLocationIdInput() {
        return locationId;
    }

    public RefundLineItemInput setLocationId(ID locationId) {
        this.locationId = Input.optional(locationId);
        return this;
    }

    public RefundLineItemInput setLocationIdInput(Input<ID> locationId) {
        if (locationId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.locationId = locationId;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("lineItemId:");
        Query.appendQuotedString(_queryBuilder, lineItemId.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("quantity:");
        _queryBuilder.append(quantity);

        if (this.restockType.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("restockType:");
            if (restockType.getValue() != null) {
                _queryBuilder.append(restockType.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.locationId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("locationId:");
            if (locationId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, locationId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
