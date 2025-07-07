// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;
import java.util.List;

public class InventoryShipmentCreateInput implements Serializable {
    private ID movementId;

    private List<InventoryShipmentLineItemInput> lineItems;

    private Input<InventoryShipmentTrackingInput> trackingInput = Input.undefined();

    public InventoryShipmentCreateInput(ID movementId, List<InventoryShipmentLineItemInput> lineItems) {
        this.movementId = movementId;

        this.lineItems = lineItems;
    }

    public ID getMovementId() {
        return movementId;
    }

    public InventoryShipmentCreateInput setMovementId(ID movementId) {
        this.movementId = movementId;
        return this;
    }

    public List<InventoryShipmentLineItemInput> getLineItems() {
        return lineItems;
    }

    public InventoryShipmentCreateInput setLineItems(List<InventoryShipmentLineItemInput> lineItems) {
        this.lineItems = lineItems;
        return this;
    }

    public InventoryShipmentTrackingInput getTrackingInput() {
        return trackingInput.getValue();
    }

    public Input<InventoryShipmentTrackingInput> getTrackingInputInput() {
        return trackingInput;
    }

    public InventoryShipmentCreateInput setTrackingInput(InventoryShipmentTrackingInput trackingInput) {
        this.trackingInput = Input.optional(trackingInput);
        return this;
    }

    public InventoryShipmentCreateInput setTrackingInputInput(Input<InventoryShipmentTrackingInput> trackingInput) {
        if (trackingInput == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.trackingInput = trackingInput;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("movementId:");
        Query.appendQuotedString(_queryBuilder, movementId.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("lineItems:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (InventoryShipmentLineItemInput item1 : lineItems) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        if (this.trackingInput.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("trackingInput:");
            if (trackingInput.getValue() != null) {
                trackingInput.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
