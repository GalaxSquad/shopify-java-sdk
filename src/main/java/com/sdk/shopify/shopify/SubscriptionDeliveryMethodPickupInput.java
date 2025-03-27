// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class SubscriptionDeliveryMethodPickupInput implements Serializable {
    private Input<SubscriptionDeliveryMethodPickupOptionInput> pickupOption = Input.undefined();

    public SubscriptionDeliveryMethodPickupOptionInput getPickupOption() {
        return pickupOption.getValue();
    }

    public Input<SubscriptionDeliveryMethodPickupOptionInput> getPickupOptionInput() {
        return pickupOption;
    }

    public SubscriptionDeliveryMethodPickupInput setPickupOption(SubscriptionDeliveryMethodPickupOptionInput pickupOption) {
        this.pickupOption = Input.optional(pickupOption);
        return this;
    }

    public SubscriptionDeliveryMethodPickupInput setPickupOptionInput(Input<SubscriptionDeliveryMethodPickupOptionInput> pickupOption) {
        if (pickupOption == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.pickupOption = pickupOption;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.pickupOption.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("pickupOption:");
            if (pickupOption.getValue() != null) {
                pickupOption.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
