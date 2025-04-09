// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;

public class SubscriptionDeliveryMethodLocalDeliveryInput implements Serializable {
    private Input<MailingAddressInput> address = Input.undefined();

    private Input<SubscriptionDeliveryMethodLocalDeliveryOptionInput> localDeliveryOption = Input.undefined();

    public MailingAddressInput getAddress() {
        return address.getValue();
    }

    public Input<MailingAddressInput> getAddressInput() {
        return address;
    }

    public SubscriptionDeliveryMethodLocalDeliveryInput setAddress(MailingAddressInput address) {
        this.address = Input.optional(address);
        return this;
    }

    public SubscriptionDeliveryMethodLocalDeliveryInput setAddressInput(Input<MailingAddressInput> address) {
        if (address == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.address = address;
        return this;
    }

    public SubscriptionDeliveryMethodLocalDeliveryOptionInput getLocalDeliveryOption() {
        return localDeliveryOption.getValue();
    }

    public Input<SubscriptionDeliveryMethodLocalDeliveryOptionInput> getLocalDeliveryOptionInput() {
        return localDeliveryOption;
    }

    public SubscriptionDeliveryMethodLocalDeliveryInput setLocalDeliveryOption(SubscriptionDeliveryMethodLocalDeliveryOptionInput localDeliveryOption) {
        this.localDeliveryOption = Input.optional(localDeliveryOption);
        return this;
    }

    public SubscriptionDeliveryMethodLocalDeliveryInput setLocalDeliveryOptionInput(Input<SubscriptionDeliveryMethodLocalDeliveryOptionInput> localDeliveryOption) {
        if (localDeliveryOption == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.localDeliveryOption = localDeliveryOption;
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

        if (this.localDeliveryOption.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("localDeliveryOption:");
            if (localDeliveryOption.getValue() != null) {
                localDeliveryOption.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
