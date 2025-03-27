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

public class FulfillmentEventInput implements Serializable {
    private ID fulfillmentId;

    private FulfillmentEventStatus status;

    private Input<String> address1 = Input.undefined();

    private Input<String> city = Input.undefined();

    private Input<String> country = Input.undefined();

    private Input<String> estimatedDeliveryAt = Input.undefined();

    private Input<String> happenedAt = Input.undefined();

    private Input<Double> latitude = Input.undefined();

    private Input<Double> longitude = Input.undefined();

    private Input<String> message = Input.undefined();

    private Input<String> province = Input.undefined();

    private Input<String> zip = Input.undefined();

    public FulfillmentEventInput(ID fulfillmentId, FulfillmentEventStatus status) {
        this.fulfillmentId = fulfillmentId;

        this.status = status;
    }

    public ID getFulfillmentId() {
        return fulfillmentId;
    }

    public FulfillmentEventInput setFulfillmentId(ID fulfillmentId) {
        this.fulfillmentId = fulfillmentId;
        return this;
    }

    public FulfillmentEventStatus getStatus() {
        return status;
    }

    public FulfillmentEventInput setStatus(FulfillmentEventStatus status) {
        this.status = status;
        return this;
    }

    public String getAddress1() {
        return address1.getValue();
    }

    public Input<String> getAddress1Input() {
        return address1;
    }

    public FulfillmentEventInput setAddress1(String address1) {
        this.address1 = Input.optional(address1);
        return this;
    }

    public FulfillmentEventInput setAddress1Input(Input<String> address1) {
        if (address1 == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.address1 = address1;
        return this;
    }

    public String getCity() {
        return city.getValue();
    }

    public Input<String> getCityInput() {
        return city;
    }

    public FulfillmentEventInput setCity(String city) {
        this.city = Input.optional(city);
        return this;
    }

    public FulfillmentEventInput setCityInput(Input<String> city) {
        if (city == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.city = city;
        return this;
    }

    public String getCountry() {
        return country.getValue();
    }

    public Input<String> getCountryInput() {
        return country;
    }

    public FulfillmentEventInput setCountry(String country) {
        this.country = Input.optional(country);
        return this;
    }

    public FulfillmentEventInput setCountryInput(Input<String> country) {
        if (country == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.country = country;
        return this;
    }

    public String getEstimatedDeliveryAt() {
        return estimatedDeliveryAt.getValue();
    }

    public Input<String> getEstimatedDeliveryAtInput() {
        return estimatedDeliveryAt;
    }

    public FulfillmentEventInput setEstimatedDeliveryAt(String estimatedDeliveryAt) {
        this.estimatedDeliveryAt = Input.optional(estimatedDeliveryAt);
        return this;
    }

    public FulfillmentEventInput setEstimatedDeliveryAtInput(Input<String> estimatedDeliveryAt) {
        if (estimatedDeliveryAt == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.estimatedDeliveryAt = estimatedDeliveryAt;
        return this;
    }

    public String getHappenedAt() {
        return happenedAt.getValue();
    }

    public Input<String> getHappenedAtInput() {
        return happenedAt;
    }

    public FulfillmentEventInput setHappenedAt(String happenedAt) {
        this.happenedAt = Input.optional(happenedAt);
        return this;
    }

    public FulfillmentEventInput setHappenedAtInput(Input<String> happenedAt) {
        if (happenedAt == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.happenedAt = happenedAt;
        return this;
    }

    public Double getLatitude() {
        return latitude.getValue();
    }

    public Input<Double> getLatitudeInput() {
        return latitude;
    }

    public FulfillmentEventInput setLatitude(Double latitude) {
        this.latitude = Input.optional(latitude);
        return this;
    }

    public FulfillmentEventInput setLatitudeInput(Input<Double> latitude) {
        if (latitude == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.latitude = latitude;
        return this;
    }

    public Double getLongitude() {
        return longitude.getValue();
    }

    public Input<Double> getLongitudeInput() {
        return longitude;
    }

    public FulfillmentEventInput setLongitude(Double longitude) {
        this.longitude = Input.optional(longitude);
        return this;
    }

    public FulfillmentEventInput setLongitudeInput(Input<Double> longitude) {
        if (longitude == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.longitude = longitude;
        return this;
    }

    public String getMessage() {
        return message.getValue();
    }

    public Input<String> getMessageInput() {
        return message;
    }

    public FulfillmentEventInput setMessage(String message) {
        this.message = Input.optional(message);
        return this;
    }

    public FulfillmentEventInput setMessageInput(Input<String> message) {
        if (message == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.message = message;
        return this;
    }

    public String getProvince() {
        return province.getValue();
    }

    public Input<String> getProvinceInput() {
        return province;
    }

    public FulfillmentEventInput setProvince(String province) {
        this.province = Input.optional(province);
        return this;
    }

    public FulfillmentEventInput setProvinceInput(Input<String> province) {
        if (province == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.province = province;
        return this;
    }

    public String getZip() {
        return zip.getValue();
    }

    public Input<String> getZipInput() {
        return zip;
    }

    public FulfillmentEventInput setZip(String zip) {
        this.zip = Input.optional(zip);
        return this;
    }

    public FulfillmentEventInput setZipInput(Input<String> zip) {
        if (zip == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.zip = zip;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("fulfillmentId:");
        Query.appendQuotedString(_queryBuilder, fulfillmentId.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("status:");
        _queryBuilder.append(status.toString());

        if (this.address1.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("address1:");
            if (address1.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, address1.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.city.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("city:");
            if (city.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, city.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.country.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("country:");
            if (country.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, country.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.estimatedDeliveryAt.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("estimatedDeliveryAt:");
            if (estimatedDeliveryAt.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, estimatedDeliveryAt.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.happenedAt.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("happenedAt:");
            if (happenedAt.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, happenedAt.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.latitude.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("latitude:");
            if (latitude.getValue() != null) {
                _queryBuilder.append(latitude.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.longitude.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("longitude:");
            if (longitude.getValue() != null) {
                _queryBuilder.append(longitude.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.message.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("message:");
            if (message.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, message.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.province.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("province:");
            if (province.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, province.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.zip.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("zip:");
            if (zip.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, zip.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
