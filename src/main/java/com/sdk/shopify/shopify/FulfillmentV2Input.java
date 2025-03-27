// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.io.Serializable;
import java.util.List;

public class FulfillmentV2Input implements Serializable {
    private List<FulfillmentOrderLineItemsInput> lineItemsByFulfillmentOrder;

    private Input<FulfillmentTrackingInput> trackingInfo = Input.undefined();

    private Input<Boolean> notifyCustomer = Input.undefined();

    private Input<FulfillmentOriginAddressInput> originAddress = Input.undefined();

    public FulfillmentV2Input(List<FulfillmentOrderLineItemsInput> lineItemsByFulfillmentOrder) {
        this.lineItemsByFulfillmentOrder = lineItemsByFulfillmentOrder;
    }

    public List<FulfillmentOrderLineItemsInput> getLineItemsByFulfillmentOrder() {
        return lineItemsByFulfillmentOrder;
    }

    public FulfillmentV2Input setLineItemsByFulfillmentOrder(List<FulfillmentOrderLineItemsInput> lineItemsByFulfillmentOrder) {
        this.lineItemsByFulfillmentOrder = lineItemsByFulfillmentOrder;
        return this;
    }

    public FulfillmentTrackingInput getTrackingInfo() {
        return trackingInfo.getValue();
    }

    public Input<FulfillmentTrackingInput> getTrackingInfoInput() {
        return trackingInfo;
    }

    public FulfillmentV2Input setTrackingInfo(FulfillmentTrackingInput trackingInfo) {
        this.trackingInfo = Input.optional(trackingInfo);
        return this;
    }

    public FulfillmentV2Input setTrackingInfoInput(Input<FulfillmentTrackingInput> trackingInfo) {
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

    public FulfillmentV2Input setNotifyCustomer(Boolean notifyCustomer) {
        this.notifyCustomer = Input.optional(notifyCustomer);
        return this;
    }

    public FulfillmentV2Input setNotifyCustomerInput(Input<Boolean> notifyCustomer) {
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

    public FulfillmentV2Input setOriginAddress(FulfillmentOriginAddressInput originAddress) {
        this.originAddress = Input.optional(originAddress);
        return this;
    }

    public FulfillmentV2Input setOriginAddressInput(Input<FulfillmentOriginAddressInput> originAddress) {
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
