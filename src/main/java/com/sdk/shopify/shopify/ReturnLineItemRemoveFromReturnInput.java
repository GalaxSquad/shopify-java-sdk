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

public class ReturnLineItemRemoveFromReturnInput implements Serializable {
    private ID returnLineItemId;

    private int quantity;

    public ReturnLineItemRemoveFromReturnInput(ID returnLineItemId, int quantity) {
        this.returnLineItemId = returnLineItemId;

        this.quantity = quantity;
    }

    public ID getReturnLineItemId() {
        return returnLineItemId;
    }

    public ReturnLineItemRemoveFromReturnInput setReturnLineItemId(ID returnLineItemId) {
        this.returnLineItemId = returnLineItemId;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public ReturnLineItemRemoveFromReturnInput setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("returnLineItemId:");
        Query.appendQuotedString(_queryBuilder, returnLineItemId.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("quantity:");
        _queryBuilder.append(quantity);

        _queryBuilder.append('}');
    }
}
