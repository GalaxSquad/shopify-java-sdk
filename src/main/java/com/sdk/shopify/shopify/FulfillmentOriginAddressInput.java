// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class FulfillmentOriginAddressInput implements Serializable {
    private String countryCode;

    private Input<String> address1 = Input.undefined();

    private Input<String> address2 = Input.undefined();

    private Input<String> city = Input.undefined();

    private Input<String> zip = Input.undefined();

    private Input<String> provinceCode = Input.undefined();

    public FulfillmentOriginAddressInput(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public FulfillmentOriginAddressInput setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    public String getAddress1() {
        return address1.getValue();
    }

    public Input<String> getAddress1Input() {
        return address1;
    }

    public FulfillmentOriginAddressInput setAddress1(String address1) {
        this.address1 = Input.optional(address1);
        return this;
    }

    public FulfillmentOriginAddressInput setAddress1Input(Input<String> address1) {
        if (address1 == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.address1 = address1;
        return this;
    }

    public String getAddress2() {
        return address2.getValue();
    }

    public Input<String> getAddress2Input() {
        return address2;
    }

    public FulfillmentOriginAddressInput setAddress2(String address2) {
        this.address2 = Input.optional(address2);
        return this;
    }

    public FulfillmentOriginAddressInput setAddress2Input(Input<String> address2) {
        if (address2 == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.address2 = address2;
        return this;
    }

    public String getCity() {
        return city.getValue();
    }

    public Input<String> getCityInput() {
        return city;
    }

    public FulfillmentOriginAddressInput setCity(String city) {
        this.city = Input.optional(city);
        return this;
    }

    public FulfillmentOriginAddressInput setCityInput(Input<String> city) {
        if (city == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.city = city;
        return this;
    }

    public String getZip() {
        return zip.getValue();
    }

    public Input<String> getZipInput() {
        return zip;
    }

    public FulfillmentOriginAddressInput setZip(String zip) {
        this.zip = Input.optional(zip);
        return this;
    }

    public FulfillmentOriginAddressInput setZipInput(Input<String> zip) {
        if (zip == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.zip = zip;
        return this;
    }

    public String getProvinceCode() {
        return provinceCode.getValue();
    }

    public Input<String> getProvinceCodeInput() {
        return provinceCode;
    }

    public FulfillmentOriginAddressInput setProvinceCode(String provinceCode) {
        this.provinceCode = Input.optional(provinceCode);
        return this;
    }

    public FulfillmentOriginAddressInput setProvinceCodeInput(Input<String> provinceCode) {
        if (provinceCode == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.provinceCode = provinceCode;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("countryCode:");
        Query.appendQuotedString(_queryBuilder, countryCode.toString());

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

        if (this.address2.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("address2:");
            if (address2.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, address2.getValue().toString());
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

        if (this.provinceCode.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("provinceCode:");
            if (provinceCode.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, provinceCode.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
