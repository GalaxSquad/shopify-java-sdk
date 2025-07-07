// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class InventoryShipmentTrackingInput implements Serializable {
    private Input<String> trackingNumber = Input.undefined();

    private Input<String> company = Input.undefined();

    private Input<String> trackingUrl = Input.undefined();

    private Input<String> arrivesAt = Input.undefined();

    public String getTrackingNumber() {
        return trackingNumber.getValue();
    }

    public Input<String> getTrackingNumberInput() {
        return trackingNumber;
    }

    public InventoryShipmentTrackingInput setTrackingNumber(String trackingNumber) {
        this.trackingNumber = Input.optional(trackingNumber);
        return this;
    }

    public InventoryShipmentTrackingInput setTrackingNumberInput(Input<String> trackingNumber) {
        if (trackingNumber == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.trackingNumber = trackingNumber;
        return this;
    }

    public String getCompany() {
        return company.getValue();
    }

    public Input<String> getCompanyInput() {
        return company;
    }

    public InventoryShipmentTrackingInput setCompany(String company) {
        this.company = Input.optional(company);
        return this;
    }

    public InventoryShipmentTrackingInput setCompanyInput(Input<String> company) {
        if (company == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.company = company;
        return this;
    }

    public String getTrackingUrl() {
        return trackingUrl.getValue();
    }

    public Input<String> getTrackingUrlInput() {
        return trackingUrl;
    }

    public InventoryShipmentTrackingInput setTrackingUrl(String trackingUrl) {
        this.trackingUrl = Input.optional(trackingUrl);
        return this;
    }

    public InventoryShipmentTrackingInput setTrackingUrlInput(Input<String> trackingUrl) {
        if (trackingUrl == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.trackingUrl = trackingUrl;
        return this;
    }

    public String getArrivesAt() {
        return arrivesAt.getValue();
    }

    public Input<String> getArrivesAtInput() {
        return arrivesAt;
    }

    public InventoryShipmentTrackingInput setArrivesAt(String arrivesAt) {
        this.arrivesAt = Input.optional(arrivesAt);
        return this;
    }

    public InventoryShipmentTrackingInput setArrivesAtInput(Input<String> arrivesAt) {
        if (arrivesAt == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.arrivesAt = arrivesAt;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

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

        if (this.company.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("company:");
            if (company.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, company.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.trackingUrl.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("trackingUrl:");
            if (trackingUrl.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, trackingUrl.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.arrivesAt.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("arrivesAt:");
            if (arrivesAt.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, arrivesAt.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
