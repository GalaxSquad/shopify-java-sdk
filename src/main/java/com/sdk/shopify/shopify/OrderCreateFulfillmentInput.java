// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class OrderCreateFulfillmentInput implements Serializable {
    private ID locationId;

    private Input<FulfillmentOriginAddressInput> originAddress = Input.undefined();

    private Input<Boolean> notifyCustomer = Input.undefined();

    private Input<FulfillmentEventStatus> shipmentStatus = Input.undefined();

    private Input<String> trackingNumber = Input.undefined();

    private Input<String> trackingCompany = Input.undefined();

    public OrderCreateFulfillmentInput(ID locationId) {
        this.locationId = locationId;
    }

    public ID getLocationId() {
        return locationId;
    }

    public OrderCreateFulfillmentInput setLocationId(ID locationId) {
        this.locationId = locationId;
        return this;
    }

    public FulfillmentOriginAddressInput getOriginAddress() {
        return originAddress.getValue();
    }

    public Input<FulfillmentOriginAddressInput> getOriginAddressInput() {
        return originAddress;
    }

    public OrderCreateFulfillmentInput setOriginAddress(FulfillmentOriginAddressInput originAddress) {
        this.originAddress = Input.optional(originAddress);
        return this;
    }

    public OrderCreateFulfillmentInput setOriginAddressInput(Input<FulfillmentOriginAddressInput> originAddress) {
        if (originAddress == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.originAddress = originAddress;
        return this;
    }

    public Boolean getNotifyCustomer() {
        return notifyCustomer.getValue();
    }

    public Input<Boolean> getNotifyCustomerInput() {
        return notifyCustomer;
    }

    public OrderCreateFulfillmentInput setNotifyCustomer(Boolean notifyCustomer) {
        this.notifyCustomer = Input.optional(notifyCustomer);
        return this;
    }

    public OrderCreateFulfillmentInput setNotifyCustomerInput(Input<Boolean> notifyCustomer) {
        if (notifyCustomer == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.notifyCustomer = notifyCustomer;
        return this;
    }

    public FulfillmentEventStatus getShipmentStatus() {
        return shipmentStatus.getValue();
    }

    public Input<FulfillmentEventStatus> getShipmentStatusInput() {
        return shipmentStatus;
    }

    public OrderCreateFulfillmentInput setShipmentStatus(FulfillmentEventStatus shipmentStatus) {
        this.shipmentStatus = Input.optional(shipmentStatus);
        return this;
    }

    public OrderCreateFulfillmentInput setShipmentStatusInput(Input<FulfillmentEventStatus> shipmentStatus) {
        if (shipmentStatus == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.shipmentStatus = shipmentStatus;
        return this;
    }

    public String getTrackingNumber() {
        return trackingNumber.getValue();
    }

    public Input<String> getTrackingNumberInput() {
        return trackingNumber;
    }

    public OrderCreateFulfillmentInput setTrackingNumber(String trackingNumber) {
        this.trackingNumber = Input.optional(trackingNumber);
        return this;
    }

    public OrderCreateFulfillmentInput setTrackingNumberInput(Input<String> trackingNumber) {
        if (trackingNumber == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.trackingNumber = trackingNumber;
        return this;
    }

    public String getTrackingCompany() {
        return trackingCompany.getValue();
    }

    public Input<String> getTrackingCompanyInput() {
        return trackingCompany;
    }

    public OrderCreateFulfillmentInput setTrackingCompany(String trackingCompany) {
        this.trackingCompany = Input.optional(trackingCompany);
        return this;
    }

    public OrderCreateFulfillmentInput setTrackingCompanyInput(Input<String> trackingCompany) {
        if (trackingCompany == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.trackingCompany = trackingCompany;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("locationId:");
        Query.appendQuotedString(_queryBuilder, locationId.toString());

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

        if (this.shipmentStatus.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("shipmentStatus:");
            if (shipmentStatus.getValue() != null) {
                _queryBuilder.append(shipmentStatus.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.trackingNumber.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("trackingNumber:");
            if (trackingNumber.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, trackingNumber.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.trackingCompany.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("trackingCompany:");
            if (trackingCompany.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, trackingCompany.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
