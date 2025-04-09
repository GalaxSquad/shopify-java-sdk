// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import java.io.Serializable;
import java.util.List;

public class FulfillmentInput implements Serializable {
    private List<FulfillmentOrderLineItemsInput> lineItemsByFulfillmentOrder;

    private Input<FulfillmentTrackingInput> trackingInfo = Input.undefined();

    private Input<Boolean> notifyCustomer = Input.undefined();

    private Input<FulfillmentOriginAddressInput> originAddress = Input.undefined();

    public FulfillmentInput(List<FulfillmentOrderLineItemsInput> lineItemsByFulfillmentOrder) {
        this.lineItemsByFulfillmentOrder = lineItemsByFulfillmentOrder;
    }

    public List<FulfillmentOrderLineItemsInput> getLineItemsByFulfillmentOrder() {
        return lineItemsByFulfillmentOrder;
    }

    public FulfillmentInput setLineItemsByFulfillmentOrder(List<FulfillmentOrderLineItemsInput> lineItemsByFulfillmentOrder) {
        this.lineItemsByFulfillmentOrder = lineItemsByFulfillmentOrder;
        return this;
    }

    public FulfillmentTrackingInput getTrackingInfo() {
        return trackingInfo.getValue();
    }

    public Input<FulfillmentTrackingInput> getTrackingInfoInput() {
        return trackingInfo;
    }

    public FulfillmentInput setTrackingInfo(FulfillmentTrackingInput trackingInfo) {
        this.trackingInfo = Input.optional(trackingInfo);
        return this;
    }

    public FulfillmentInput setTrackingInfoInput(Input<FulfillmentTrackingInput> trackingInfo) {
        if (trackingInfo == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.trackingInfo = trackingInfo;
        return this;
    }

    public Boolean getNotifyCustomer() {
        return notifyCustomer.getValue();
    }

    public Input<Boolean> getNotifyCustomerInput() {
        return notifyCustomer;
    }

    public FulfillmentInput setNotifyCustomer(Boolean notifyCustomer) {
        this.notifyCustomer = Input.optional(notifyCustomer);
        return this;
    }

    public FulfillmentInput setNotifyCustomerInput(Input<Boolean> notifyCustomer) {
        if (notifyCustomer == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.notifyCustomer = notifyCustomer;
        return this;
    }

    public FulfillmentOriginAddressInput getOriginAddress() {
        return originAddress.getValue();
    }

    public Input<FulfillmentOriginAddressInput> getOriginAddressInput() {
        return originAddress;
    }

    public FulfillmentInput setOriginAddress(FulfillmentOriginAddressInput originAddress) {
        this.originAddress = Input.optional(originAddress);
        return this;
    }

    public FulfillmentInput setOriginAddressInput(Input<FulfillmentOriginAddressInput> originAddress) {
        if (originAddress == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.originAddress = originAddress;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("lineItemsByFulfillmentOrder:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (FulfillmentOrderLineItemsInput item1 : lineItemsByFulfillmentOrder) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        if (this.trackingInfo.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("trackingInfo:");
            if (trackingInfo.getValue() != null) {
                trackingInfo.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.notifyCustomer.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("notifyCustomer:");
            if (notifyCustomer.getValue() != null) {
                _queryBuilder.append(notifyCustomer.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.originAddress.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("originAddress:");
            if (originAddress.getValue() != null) {
                originAddress.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
