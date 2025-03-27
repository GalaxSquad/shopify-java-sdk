// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class ReverseFulfillmentOrderDisposeInput implements Serializable {
    private ID reverseFulfillmentOrderLineItemId;

    private int quantity;

    private ReverseFulfillmentOrderDispositionType dispositionType;

    private Input<ID> locationId = Input.undefined();

    public ReverseFulfillmentOrderDisposeInput(ID reverseFulfillmentOrderLineItemId, int quantity, ReverseFulfillmentOrderDispositionType dispositionType) {
        this.reverseFulfillmentOrderLineItemId = reverseFulfillmentOrderLineItemId;

        this.quantity = quantity;

        this.dispositionType = dispositionType;
    }

    public ID getReverseFulfillmentOrderLineItemId() {
        return reverseFulfillmentOrderLineItemId;
    }

    public ReverseFulfillmentOrderDisposeInput setReverseFulfillmentOrderLineItemId(ID reverseFulfillmentOrderLineItemId) {
        this.reverseFulfillmentOrderLineItemId = reverseFulfillmentOrderLineItemId;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public ReverseFulfillmentOrderDisposeInput setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public ReverseFulfillmentOrderDispositionType getDispositionType() {
        return dispositionType;
    }

    public ReverseFulfillmentOrderDisposeInput setDispositionType(ReverseFulfillmentOrderDispositionType dispositionType) {
        this.dispositionType = dispositionType;
        return this;
    }

    public ID getLocationId() {
        return locationId.getValue();
    }

    public Input<ID> getLocationIdInput() {
        return locationId;
    }

    public ReverseFulfillmentOrderDisposeInput setLocationId(ID locationId) {
        this.locationId = Input.optional(locationId);
        return this;
    }

    public ReverseFulfillmentOrderDisposeInput setLocationIdInput(Input<ID> locationId) {
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
        _queryBuilder.append("reverseFulfillmentOrderLineItemId:");
        Query.appendQuotedString(_queryBuilder, reverseFulfillmentOrderLineItemId.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("quantity:");
        _queryBuilder.append(quantity);

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("dispositionType:");
        _queryBuilder.append(dispositionType.toString());

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
