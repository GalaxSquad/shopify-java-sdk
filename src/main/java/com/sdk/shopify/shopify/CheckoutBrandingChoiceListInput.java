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

public class CheckoutBrandingChoiceListInput implements Serializable {
    private Input<CheckoutBrandingChoiceListGroupInput> group = Input.undefined();

    public CheckoutBrandingChoiceListGroupInput getGroup() {
        return group.getValue();
    }

    public Input<CheckoutBrandingChoiceListGroupInput> getGroupInput() {
        return group;
    }

    public CheckoutBrandingChoiceListInput setGroup(CheckoutBrandingChoiceListGroupInput group) {
        this.group = Input.optional(group);
        return this;
    }

    public CheckoutBrandingChoiceListInput setGroupInput(Input<CheckoutBrandingChoiceListGroupInput> group) {
        if (group == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.group = group;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.group.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("group:");
            if (group.getValue() != null) {
                group.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
