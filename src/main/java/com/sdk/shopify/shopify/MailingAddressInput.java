// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Query;
import java.io.Serializable;

public class MailingAddressInput implements Serializable {
    private Input<String> address1 = Input.undefined();

    private Input<String> address2 = Input.undefined();

    private Input<String> city = Input.undefined();

    private Input<String> company = Input.undefined();

    private Input<CountryCode> countryCode = Input.undefined();

    private Input<String> firstName = Input.undefined();

    private Input<String> lastName = Input.undefined();

    private Input<String> phone = Input.undefined();

    private Input<String> provinceCode = Input.undefined();

    private Input<String> zip = Input.undefined();

    public String getAddress1() {
        return address1.getValue();
    }

    public Input<String> getAddress1Input() {
        return address1;
    }

    public MailingAddressInput setAddress1(String address1) {
        this.address1 = Input.optional(address1);
        return this;
    }

    public MailingAddressInput setAddress1Input(Input<String> address1) {
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

    public MailingAddressInput setAddress2(String address2) {
        this.address2 = Input.optional(address2);
        return this;
    }

    public MailingAddressInput setAddress2Input(Input<String> address2) {
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

    public MailingAddressInput setCity(String city) {
        this.city = Input.optional(city);
        return this;
    }

    public MailingAddressInput setCityInput(Input<String> city) {
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

    public MailingAddressInput setCompany(String company) {
        this.company = Input.optional(company);
        return this;
    }

    public MailingAddressInput setCompanyInput(Input<String> company) {
        if (company == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.company = company;
        return this;
    }

    public CountryCode getCountryCode() {
        return countryCode.getValue();
    }

    public Input<CountryCode> getCountryCodeInput() {
        return countryCode;
    }

    public MailingAddressInput setCountryCode(CountryCode countryCode) {
        this.countryCode = Input.optional(countryCode);
        return this;
    }

    public MailingAddressInput setCountryCodeInput(Input<CountryCode> countryCode) {
        if (countryCode == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.countryCode = countryCode;
        return this;
    }

    public String getFirstName() {
        return firstName.getValue();
    }

    public Input<String> getFirstNameInput() {
        return firstName;
    }

    public MailingAddressInput setFirstName(String firstName) {
        this.firstName = Input.optional(firstName);
        return this;
    }

    public MailingAddressInput setFirstNameInput(Input<String> firstName) {
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

    public MailingAddressInput setLastName(String lastName) {
        this.lastName = Input.optional(lastName);
        return this;
    }

    public MailingAddressInput setLastNameInput(Input<String> lastName) {
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

    public MailingAddressInput setPhone(String phone) {
        this.phone = Input.optional(phone);
        return this;
    }

    public MailingAddressInput setPhoneInput(Input<String> phone) {
        if (phone == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.phone = phone;
        return this;
    }

    public String getProvinceCode() {
        return provinceCode.getValue();
    }

    public Input<String> getProvinceCodeInput() {
        return provinceCode;
    }

    public MailingAddressInput setProvinceCode(String provinceCode) {
        this.provinceCode = Input.optional(provinceCode);
        return this;
    }

    public MailingAddressInput setProvinceCodeInput(Input<String> provinceCode) {
        if (provinceCode == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.provinceCode = provinceCode;
        return this;
    }

    public String getZip() {
        return zip.getValue();
    }

    public Input<String> getZipInput() {
        return zip;
    }

    public MailingAddressInput setZip(String zip) {
        this.zip = Input.optional(zip);
        return this;
    }

    public MailingAddressInput setZipInput(Input<String> zip) {
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
