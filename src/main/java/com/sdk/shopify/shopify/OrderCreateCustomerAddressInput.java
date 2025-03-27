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

public class OrderCreateCustomerAddressInput implements Serializable {
    private Input<String> address1 = Input.undefined();

    private Input<String> address2 = Input.undefined();

    private Input<String> city = Input.undefined();

    private Input<String> company = Input.undefined();

    private Input<String> country = Input.undefined();

    private Input<String> firstName = Input.undefined();

    private Input<String> lastName = Input.undefined();

    private Input<String> phone = Input.undefined();

    private Input<String> province = Input.undefined();

    private Input<String> zip = Input.undefined();

    public String getAddress1() {
        return address1.getValue();
    }

    public Input<String> getAddress1Input() {
        return address1;
    }

    public OrderCreateCustomerAddressInput setAddress1(String address1) {
        this.address1 = Input.optional(address1);
        return this;
    }

    public OrderCreateCustomerAddressInput setAddress1Input(Input<String> address1) {
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

    public OrderCreateCustomerAddressInput setAddress2(String address2) {
        this.address2 = Input.optional(address2);
        return this;
    }

    public OrderCreateCustomerAddressInput setAddress2Input(Input<String> address2) {
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

    public OrderCreateCustomerAddressInput setCity(String city) {
        this.city = Input.optional(city);
        return this;
    }

    public OrderCreateCustomerAddressInput setCityInput(Input<String> city) {
        if (city == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.city = city;
        return this;
    }

    public String getCompany() {
        return company.getValue();
    }

    public Input<String> getCompanyInput() {
        return company;
    }

    public OrderCreateCustomerAddressInput setCompany(String company) {
        this.company = Input.optional(company);
        return this;
    }

    public OrderCreateCustomerAddressInput setCompanyInput(Input<String> company) {
        if (company == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.company = company;
        return this;
    }

    public String getCountry() {
        return country.getValue();
    }

    public Input<String> getCountryInput() {
        return country;
    }

    public OrderCreateCustomerAddressInput setCountry(String country) {
        this.country = Input.optional(country);
        return this;
    }

    public OrderCreateCustomerAddressInput setCountryInput(Input<String> country) {
        if (country == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.country = country;
        return this;
    }

    public String getFirstName() {
        return firstName.getValue();
    }

    public Input<String> getFirstNameInput() {
        return firstName;
    }

    public OrderCreateCustomerAddressInput setFirstName(String firstName) {
        this.firstName = Input.optional(firstName);
        return this;
    }

    public OrderCreateCustomerAddressInput setFirstNameInput(Input<String> firstName) {
        if (firstName == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName.getValue();
    }

    public Input<String> getLastNameInput() {
        return lastName;
    }

    public OrderCreateCustomerAddressInput setLastName(String lastName) {
        this.lastName = Input.optional(lastName);
        return this;
    }

    public OrderCreateCustomerAddressInput setLastNameInput(Input<String> lastName) {
        if (lastName == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.lastName = lastName;
        return this;
    }

    public String getPhone() {
        return phone.getValue();
    }

    public Input<String> getPhoneInput() {
        return phone;
    }

    public OrderCreateCustomerAddressInput setPhone(String phone) {
        this.phone = Input.optional(phone);
        return this;
    }

    public OrderCreateCustomerAddressInput setPhoneInput(Input<String> phone) {
        if (phone == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.phone = phone;
        return this;
    }

    public String getProvince() {
        return province.getValue();
    }

    public Input<String> getProvinceInput() {
        return province;
    }

    public OrderCreateCustomerAddressInput setProvince(String province) {
        this.province = Input.optional(province);
        return this;
    }

    public OrderCreateCustomerAddressInput setProvinceInput(Input<String> province) {
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

    public OrderCreateCustomerAddressInput setZip(String zip) {
        this.zip = Input.optional(zip);
        return this;
    }

    public OrderCreateCustomerAddressInput setZipInput(Input<String> zip) {
        if (zip == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.zip = zip;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

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

        if (this.firstName.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("firstName:");
            if (firstName.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, firstName.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.lastName.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("lastName:");
            if (lastName.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, lastName.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.phone.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("phone:");
            if (phone.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, phone.getValue().toString());
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
