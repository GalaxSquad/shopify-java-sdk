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
* A custom font.
*/
public class CheckoutBrandingCustomFont extends AbstractResponse<CheckoutBrandingCustomFont> implements CheckoutBrandingFont {
    public CheckoutBrandingCustomFont() {
    }

    public CheckoutBrandingCustomFont(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "genericFileId": {
                    ID optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ID(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "sources": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "weight": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

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
        return "CheckoutBrandingCustomFont";
    }

    /**
    * Globally unique ID reference to the custom font file.
    */

    public ID getGenericFileId() {
        return (ID) get("genericFileId");
    }

    public CheckoutBrandingCustomFont setGenericFileId(ID arg) {
        optimisticData.put(getKey("genericFileId"), arg);
        return this;
    }

    /**
    * The font sources.
    */

    public String getSources() {
        return (String) get("sources");
    }

    public CheckoutBrandingCustomFont setSources(String arg) {
        optimisticData.put(getKey("sources"), arg);
        return this;
    }

    /**
    * The font weight.
    */

    public Integer getWeight() {
        return (Integer) get("weight");
    }

    public CheckoutBrandingCustomFont setWeight(Integer arg) {
        optimisticData.put(getKey("weight"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "genericFileId": return false;

            case "sources": return false;

            case "weight": return false;

            default: return false;
        }
    }
}

