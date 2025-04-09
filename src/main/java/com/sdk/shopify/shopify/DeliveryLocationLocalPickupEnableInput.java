// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class DeliveryLocationLocalPickupEnableInput implements Serializable {
    private ID locationId;

    private DeliveryLocalPickupTime pickupTime;

    private Input<String> instructions = Input.undefined();

    public DeliveryLocationLocalPickupEnableInput(ID locationId, DeliveryLocalPickupTime pickupTime) {
        this.locationId = locationId;

        this.pickupTime = pickupTime;
    }

    public ID getLocationId() {
        return locationId;
    }

    public DeliveryLocationLocalPickupEnableInput setLocationId(ID locationId) {
        this.locationId = locationId;
        return this;
    }

    public DeliveryLocalPickupTime getPickupTime() {
        return pickupTime;
    }

    public DeliveryLocationLocalPickupEnableInput setPickupTime(DeliveryLocalPickupTime pickupTime) {
        this.pickupTime = pickupTime;
        return this;
    }

    public String getInstructions() {
        return instructions.getValue();
    }

    public Input<String> getInstructionsInput() {
        return instructions;
    }

    public DeliveryLocationLocalPickupEnableInput setInstructions(String instructions) {
        this.instructions = Input.optional(instructions);
        return this;
    }

    public DeliveryLocationLocalPickupEnableInput setInstructionsInput(Input<String> instructions) {
        if (instructions == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.instructions = instructions;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("locationId:");
        Query.appendQuotedString(_queryBuilder, locationId.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("pickupTime:");
        _queryBuilder.append(pickupTime.toString());

        if (this.instructions.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("instructions:");
            if (instructions.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, instructions.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
