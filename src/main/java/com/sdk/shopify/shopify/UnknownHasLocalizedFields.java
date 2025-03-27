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
* Localized fields associated with the specified resource.
*/
public class UnknownHasLocalizedFields extends AbstractResponse<UnknownHasLocalizedFields> implements HasLocalizedFields {
    public UnknownHasLocalizedFields() {
    }

    public UnknownHasLocalizedFields(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "localizedFields": {
                    responseData.put(key, new LocalizedFieldConnection(jsonAsObject(field.getValue(), key)));

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

    public static HasLocalizedFields create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "DraftOrder": {
                return new DraftOrder(fields);
            }

            case "Order": {
                return new Order(fields);
            }

            default: {
                return new UnknownHasLocalizedFields(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    /**
    * List of localized fields for the resource.
    */

    public LocalizedFieldConnection getLocalizedFields() {
        return (LocalizedFieldConnection) get("localizedFields");
    }

    public UnknownHasLocalizedFields setLocalizedFields(LocalizedFieldConnection arg) {
        optimisticData.put(getKey("localizedFields"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "localizedFields": return true;

            default: return false;
        }
    }
}

