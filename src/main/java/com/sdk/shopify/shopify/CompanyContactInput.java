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

public class CompanyContactInput implements Serializable {
    private Input<String> firstName = Input.undefined();

    private Input<String> lastName = Input.undefined();

    private Input<String> email = Input.undefined();

    private Input<String> title = Input.undefined();

    private Input<String> locale = Input.undefined();

    private Input<String> phone = Input.undefined();

    public String getFirstName() {
        return firstName.getValue();
    }

    public Input<String> getFirstNameInput() {
        return firstName;
    }

    public CompanyContactInput setFirstName(String firstName) {
        this.firstName = Input.optional(firstName);
        return this;
    }

    public CompanyContactInput setFirstNameInput(Input<String> firstName) {
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

    public CompanyContactInput setLastName(String lastName) {
        this.lastName = Input.optional(lastName);
        return this;
    }

    public CompanyContactInput setLastNameInput(Input<String> lastName) {
        if (lastName == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.lastName = lastName;
        return this;
    }

    public String getEmail() {
        return email.getValue();
    }

    public Input<String> getEmailInput() {
        return email;
    }

    public CompanyContactInput setEmail(String email) {
        this.email = Input.optional(email);
        return this;
    }

    public CompanyContactInput setEmailInput(Input<String> email) {
        if (email == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.email = email;
        return this;
    }

    public String getTitle() {
        return title.getValue();
    }

    public Input<String> getTitleInput() {
        return title;
    }

    public CompanyContactInput setTitle(String title) {
        this.title = Input.optional(title);
        return this;
    }

    public CompanyContactInput setTitleInput(Input<String> title) {
        if (title == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.title = title;
        return this;
    }

    public String getLocale() {
        return locale.getValue();
    }

    public Input<String> getLocaleInput() {
        return locale;
    }

    public CompanyContactInput setLocale(String locale) {
        this.locale = Input.optional(locale);
        return this;
    }

    public CompanyContactInput setLocaleInput(Input<String> locale) {
        if (locale == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.locale = locale;
        return this;
    }

    public String getPhone() {
        return phone.getValue();
    }

    public Input<String> getPhoneInput() {
        return phone;
    }

    public CompanyContactInput setPhone(String phone) {
        this.phone = Input.optional(phone);
        return this;
    }

    public CompanyContactInput setPhoneInput(Input<String> phone) {
        if (phone == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.phone = phone;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

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

        if (this.email.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("email:");
            if (email.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, email.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.title.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("title:");
            if (title.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, title.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.locale.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("locale:");
            if (locale.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, locale.getValue().toString());
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

        _queryBuilder.append('}');
    }
}
