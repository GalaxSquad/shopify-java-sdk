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

public class ReturnDeclineRequestInput implements Serializable {
    private ID id;

    private ReturnDeclineReason declineReason;

    private Input<Boolean> notifyCustomer = Input.undefined();

    private Input<String> declineNote = Input.undefined();

    public ReturnDeclineRequestInput(ID id, ReturnDeclineReason declineReason) {
        this.id = id;

        this.declineReason = declineReason;
    }

    public ID getId() {
        return id;
    }

    public ReturnDeclineRequestInput setId(ID id) {
        this.id = id;
        return this;
    }

    public ReturnDeclineReason getDeclineReason() {
        return declineReason;
    }

    public ReturnDeclineRequestInput setDeclineReason(ReturnDeclineReason declineReason) {
        this.declineReason = declineReason;
        return this;
    }

    public Boolean getNotifyCustomer() {
        return notifyCustomer.getValue();
    }

    public Input<Boolean> getNotifyCustomerInput() {
        return notifyCustomer;
    }

    public ReturnDeclineRequestInput setNotifyCustomer(Boolean notifyCustomer) {
        this.notifyCustomer = Input.optional(notifyCustomer);
        return this;
    }

    public ReturnDeclineRequestInput setNotifyCustomerInput(Input<Boolean> notifyCustomer) {
        if (notifyCustomer == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.notifyCustomer = notifyCustomer;
        return this;
    }

    public String getDeclineNote() {
        return declineNote.getValue();
    }

    public Input<String> getDeclineNoteInput() {
        return declineNote;
    }

    public ReturnDeclineRequestInput setDeclineNote(String declineNote) {
        this.declineNote = Input.optional(declineNote);
        return this;
    }

    public ReturnDeclineRequestInput setDeclineNoteInput(Input<String> declineNote) {
        if (declineNote == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.declineNote = declineNote;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("declineReason:");
        _queryBuilder.append(declineReason.toString());

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

        if (this.declineNote.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("declineNote:");
            if (declineNote.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, declineNote.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
