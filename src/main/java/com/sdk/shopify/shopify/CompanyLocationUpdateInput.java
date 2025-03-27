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

public class CompanyLocationUpdateInput implements Serializable {
    private Input<String> name = Input.undefined();

    private Input<String> phone = Input.undefined();

    private Input<String> locale = Input.undefined();

    private Input<String> externalId = Input.undefined();

    private Input<String> note = Input.undefined();

    private Input<BuyerExperienceConfigurationInput> buyerExperienceConfiguration = Input.undefined();

    public String getName() {
        return name.getValue();
    }

    public Input<String> getNameInput() {
        return name;
    }

    public CompanyLocationUpdateInput setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public CompanyLocationUpdateInput setNameInput(Input<String> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    public String getPhone() {
        return phone.getValue();
    }

    public Input<String> getPhoneInput() {
        return phone;
    }

    public CompanyLocationUpdateInput setPhone(String phone) {
        this.phone = Input.optional(phone);
        return this;
    }

    public CompanyLocationUpdateInput setPhoneInput(Input<String> phone) {
        if (phone == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.phone = phone;
        return this;
    }

    public String getLocale() {
        return locale.getValue();
    }

    public Input<String> getLocaleInput() {
        return locale;
    }

    public CompanyLocationUpdateInput setLocale(String locale) {
        this.locale = Input.optional(locale);
        return this;
    }

    public CompanyLocationUpdateInput setLocaleInput(Input<String> locale) {
        if (locale == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.locale = locale;
        return this;
    }

    public String getExternalId() {
        return externalId.getValue();
    }

    public Input<String> getExternalIdInput() {
        return externalId;
    }

    public CompanyLocationUpdateInput setExternalId(String externalId) {
        this.externalId = Input.optional(externalId);
        return this;
    }

    public CompanyLocationUpdateInput setExternalIdInput(Input<String> externalId) {
        if (externalId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.externalId = externalId;
        return this;
    }

    public String getNote() {
        return note.getValue();
    }

    public Input<String> getNoteInput() {
        return note;
    }

    public CompanyLocationUpdateInput setNote(String note) {
        this.note = Input.optional(note);
        return this;
    }

    public CompanyLocationUpdateInput setNoteInput(Input<String> note) {
        if (note == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.note = note;
        return this;
    }

    public BuyerExperienceConfigurationInput getBuyerExperienceConfiguration() {
        return buyerExperienceConfiguration.getValue();
    }

    public Input<BuyerExperienceConfigurationInput> getBuyerExperienceConfigurationInput() {
        return buyerExperienceConfiguration;
    }

    public CompanyLocationUpdateInput setBuyerExperienceConfiguration(BuyerExperienceConfigurationInput buyerExperienceConfiguration) {
        this.buyerExperienceConfiguration = Input.optional(buyerExperienceConfiguration);
        return this;
    }

    public CompanyLocationUpdateInput setBuyerExperienceConfigurationInput(Input<BuyerExperienceConfigurationInput> buyerExperienceConfiguration) {
        if (buyerExperienceConfiguration == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.buyerExperienceConfiguration = buyerExperienceConfiguration;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.name.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("name:");
            if (name.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, name.getValue().toString());
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

        if (this.externalId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("externalId:");
            if (externalId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, externalId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.note.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("note:");
            if (note.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, note.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.buyerExperienceConfiguration.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("buyerExperienceConfiguration:");
            if (buyerExperienceConfiguration.getValue() != null) {
                buyerExperienceConfiguration.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
