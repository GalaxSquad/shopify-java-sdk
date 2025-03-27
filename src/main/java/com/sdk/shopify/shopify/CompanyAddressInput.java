// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class CompanyAddressInput implements Serializable {
    private Input<String> address1 = Input.undefined();

    private Input<String> address2 = Input.undefined();

    private Input<String> city = Input.undefined();

    private Input<String> zip = Input.undefined();

    private Input<String> recipient = Input.undefined();

    private Input<String> firstName = Input.undefined();

    private Input<String> lastName = Input.undefined();

    private Input<String> phone = Input.undefined();

    private Input<String> zoneCode = Input.undefined();

    private Input<CountryCode> countryCode = Input.undefined();

    public String getAddress1() {
        return address1.getValue();
    }

    public Input<String> getAddress1Input() {
        return address1;
    }

    public CompanyAddressInput setAddress1(String address1) {
        this.address1 = Input.optional(address1);
        return this;
    }

    public CompanyAddressInput setAddress1Input(Input<String> address1) {
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

    public CompanyAddressInput setAddress2(String address2) {
        this.address2 = Input.optional(address2);
        return this;
    }

    public CompanyAddressInput setAddress2Input(Input<String> address2) {
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

    public CompanyAddressInput setCity(String city) {
        this.city = Input.optional(city);
        return this;
    }

    public CompanyAddressInput setCityInput(Input<String> city) {
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

    public CompanyAddressInput setZip(String zip) {
        this.zip = Input.optional(zip);
        return this;
    }

    public CompanyAddressInput setZipInput(Input<String> zip) {
        if (zip == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.zip = zip;
        return this;
    }

    public String getRecipient() {
        return recipient.getValue();
    }

    public Input<String> getRecipientInput() {
        return recipient;
    }

    public CompanyAddressInput setRecipient(String recipient) {
        this.recipient = Input.optional(recipient);
        return this;
    }

    public CompanyAddressInput setRecipientInput(Input<String> recipient) {
        if (recipient == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.recipient = recipient;
        return this;
    }

    public String getFirstName() {
        return firstName.getValue();
    }

    public Input<String> getFirstNameInput() {
        return firstName;
    }

    public CompanyAddressInput setFirstName(String firstName) {
        this.firstName = Input.optional(firstName);
        return this;
    }

    public CompanyAddressInput setFirstNameInput(Input<String> firstName) {
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

    public CompanyAddressInput setLastName(String lastName) {
        this.lastName = Input.optional(lastName);
        return this;
    }

    public CompanyAddressInput setLastNameInput(Input<String> lastName) {
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

    public CompanyAddressInput setPhone(String phone) {
        this.phone = Input.optional(phone);
        return this;
    }

    public CompanyAddressInput setPhoneInput(Input<String> phone) {
        if (phone == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.phone = phone;
        return this;
    }

    public String getZoneCode() {
        return zoneCode.getValue();
    }

    public Input<String> getZoneCodeInput() {
        return zoneCode;
    }

    public CompanyAddressInput setZoneCode(String zoneCode) {
        this.zoneCode = Input.optional(zoneCode);
        return this;
    }

    public CompanyAddressInput setZoneCodeInput(Input<String> zoneCode) {
        if (zoneCode == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.zoneCode = zoneCode;
        return this;
    }

    public CountryCode getCountryCode() {
        return countryCode.getValue();
    }

    public Input<CountryCode> getCountryCodeInput() {
        return countryCode;
    }

    public CompanyAddressInput setCountryCode(CountryCode countryCode) {
        this.countryCode = Input.optional(countryCode);
        return this;
    }

    public CompanyAddressInput setCountryCodeInput(Input<CountryCode> countryCode) {
        if (countryCode == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.countryCode = countryCode;
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

        if (this.recipient.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("recipient:");
            if (recipient.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, recipient.getValue().toString());
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

        if (this.zoneCode.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("zoneCode:");
            if (zoneCode.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, zoneCode.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.countryCode.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("countryCode:");
            if (countryCode.getValue() != null) {
                _queryBuilder.append(countryCode.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
