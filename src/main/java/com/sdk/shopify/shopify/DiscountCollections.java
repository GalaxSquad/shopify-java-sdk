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

import java.util.Map;

/**
* A list of collections that the discount can have as a prerequisite or a list of collections to which
* the discount can be applied.
*/
public class DiscountCollections extends AbstractResponse<DiscountCollections> implements DiscountItems {
    public DiscountCollections() {
    }

    public DiscountCollections(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "collections": {
                    responseData.put(key, new CollectionConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "__typename": {
                    responseData.put(key, jsonAsString(field.getValue(), key));
                    break;
                }
                default: {
                    throw new SchemaViolationError(this, key, field.getValue());
                }
            }
        }
    }

    public String getGraphQlTypeName() {
        return "DiscountCollections";
    }

    /**
    * The list of collections that the discount can have as a prerequisite or the list of collections to
    * which the discount can be applied.
    */

    public CollectionConnection getCollections() {
        return (CollectionConnection) get("collections");
    }

    public DiscountCollections setCollections(CollectionConnection arg) {
        optimisticData.put(getKey("collections"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "collections": return true;

            default: return false;
        }
    }
}

