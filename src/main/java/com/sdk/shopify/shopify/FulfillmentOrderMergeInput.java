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
import java.util.List;

public class FulfillmentOrderMergeInput implements Serializable {
    private List<FulfillmentOrderMergeInputMergeIntent> mergeIntents;

    public FulfillmentOrderMergeInput(List<FulfillmentOrderMergeInputMergeIntent> mergeIntents) {
        this.mergeIntents = mergeIntents;
    }

    public List<FulfillmentOrderMergeInputMergeIntent> getMergeIntents() {
        return mergeIntents;
    }

    public FulfillmentOrderMergeInput setMergeIntents(List<FulfillmentOrderMergeInputMergeIntent> mergeIntents) {
        this.mergeIntents = mergeIntents;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("mergeIntents:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (FulfillmentOrderMergeInputMergeIntent item1 : mergeIntents) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                item1.appendTo(_queryBuilder);
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append('}');
    }
}
