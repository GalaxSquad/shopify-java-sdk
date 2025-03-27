// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class SubscriptionDeliveryMethodShippingInput implements Serializable {
    private Input<MailingAddressInput> address = Input.undefined();

    private Input<SubscriptionDeliveryMethodShippingOptionInput> shippingOption = Input.undefined();

    public MailingAddressInput getAddress() {
        return address.getValue();
    }

    public Input<MailingAddressInput> getAddressInput() {
        return address;
    }

    public SubscriptionDeliveryMethodShippingInput setAddress(MailingAddressInput address) {
        this.address = Input.optional(address);
        return this;
    }

    public SubscriptionDeliveryMethodShippingInput setAddressInput(Input<MailingAddressInput> address) {
        if (address == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.address = address;
        return this;
    }

    public SubscriptionDeliveryMethodShippingOptionInput getShippingOption() {
        return shippingOption.getValue();
    }

    public Input<SubscriptionDeliveryMethodShippingOptionInput> getShippingOptionInput() {
        return shippingOption;
    }

    public SubscriptionDeliveryMethodShippingInput setShippingOption(SubscriptionDeliveryMethodShippingOptionInput shippingOption) {
        this.shippingOption = Input.optional(shippingOption);
        return this;
    }

    public SubscriptionDeliveryMethodShippingInput setShippingOptionInput(Input<SubscriptionDeliveryMethodShippingOptionInput> shippingOption) {
        if (shippingOption == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.shippingOption = shippingOption;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.address.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("address:");
            if (address.getValue() != null) {
                address.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.shippingOption.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("shippingOption:");
            if (shippingOption.getValue() != null) {
                shippingOption.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
