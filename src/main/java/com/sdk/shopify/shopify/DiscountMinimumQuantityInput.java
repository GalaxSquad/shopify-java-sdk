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

public class DiscountMinimumQuantityInput implements Serializable {
    private Input<String> greaterThanOrEqualToQuantity = Input.undefined();

    public String getGreaterThanOrEqualToQuantity() {
        return greaterThanOrEqualToQuantity.getValue();
    }

    public Input<String> getGreaterThanOrEqualToQuantityInput() {
        return greaterThanOrEqualToQuantity;
    }

    public DiscountMinimumQuantityInput setGreaterThanOrEqualToQuantity(String greaterThanOrEqualToQuantity) {
        this.greaterThanOrEqualToQuantity = Input.optional(greaterThanOrEqualToQuantity);
        return this;
    }

    public DiscountMinimumQuantityInput setGreaterThanOrEqualToQuantityInput(Input<String> greaterThanOrEqualToQuantity) {
        if (greaterThanOrEqualToQuantity == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.greaterThanOrEqualToQuantity = greaterThanOrEqualToQuantity;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.greaterThanOrEqualToQuantity.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("greaterThanOrEqualToQuantity:");
            if (greaterThanOrEqualToQuantity.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, greaterThanOrEqualToQuantity.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
