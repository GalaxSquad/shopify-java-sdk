// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class SubscriptionDeliveryMethodInput implements Serializable {
    private Input<SubscriptionDeliveryMethodShippingInput> shipping = Input.undefined();

    private Input<SubscriptionDeliveryMethodLocalDeliveryInput> localDelivery = Input.undefined();

    private Input<SubscriptionDeliveryMethodPickupInput> pickup = Input.undefined();

    public SubscriptionDeliveryMethodShippingInput getShipping() {
        return shipping.getValue();
    }

    public Input<SubscriptionDeliveryMethodShippingInput> getShippingInput() {
        return shipping;
    }

    public SubscriptionDeliveryMethodInput setShipping(SubscriptionDeliveryMethodShippingInput shipping) {
        this.shipping = Input.optional(shipping);
        return this;
    }

    public SubscriptionDeliveryMethodInput setShippingInput(Input<SubscriptionDeliveryMethodShippingInput> shipping) {
        if (shipping == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.shipping = shipping;
        return this;
    }

    public SubscriptionDeliveryMethodLocalDeliveryInput getLocalDelivery() {
        return localDelivery.getValue();
    }

    public Input<SubscriptionDeliveryMethodLocalDeliveryInput> getLocalDeliveryInput() {
        return localDelivery;
    }

    public SubscriptionDeliveryMethodInput setLocalDelivery(SubscriptionDeliveryMethodLocalDeliveryInput localDelivery) {
        this.localDelivery = Input.optional(localDelivery);
        return this;
    }

    public SubscriptionDeliveryMethodInput setLocalDeliveryInput(Input<SubscriptionDeliveryMethodLocalDeliveryInput> localDelivery) {
        if (localDelivery == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.localDelivery = localDelivery;
        return this;
    }

    public SubscriptionDeliveryMethodPickupInput getPickup() {
        return pickup.getValue();
    }

    public Input<SubscriptionDeliveryMethodPickupInput> getPickupInput() {
        return pickup;
    }

    public SubscriptionDeliveryMethodInput setPickup(SubscriptionDeliveryMethodPickupInput pickup) {
        this.pickup = Input.optional(pickup);
        return this;
    }

    public SubscriptionDeliveryMethodInput setPickupInput(Input<SubscriptionDeliveryMethodPickupInput> pickup) {
        if (pickup == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.pickup = pickup;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.shipping.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("shipping:");
            if (shipping.getValue() != null) {
                shipping.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.localDelivery.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("localDelivery:");
            if (localDelivery.getValue() != null) {
                localDelivery.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.pickup.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("pickup:");
            if (pickup.getValue() != null) {
                pickup.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
