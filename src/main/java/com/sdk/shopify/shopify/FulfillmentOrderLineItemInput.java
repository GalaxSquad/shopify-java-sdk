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

public class FulfillmentOrderLineItemInput implements Serializable {
    private ID id;

    private int quantity;

    public FulfillmentOrderLineItemInput(ID id, int quantity) {
        this.id = id;

        this.quantity = quantity;
    }

    public ID getId() {
        return id;
    }

    public FulfillmentOrderLineItemInput setId(ID id) {
        this.id = id;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public FulfillmentOrderLineItemInput setQuantity(int quantity) {
        this.quantity = quantity;
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
        _queryBuilder.append("quantity:");
        _queryBuilder.append(quantity);

        _queryBuilder.append('}');
    }
}
