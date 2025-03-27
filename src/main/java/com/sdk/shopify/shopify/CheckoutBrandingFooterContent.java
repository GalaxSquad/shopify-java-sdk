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
* The footer content customizations.
*/
public class CheckoutBrandingFooterContent extends AbstractResponse<CheckoutBrandingFooterContent> {
    public CheckoutBrandingFooterContent() {
    }

    public CheckoutBrandingFooterContent(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "visibility": {
                    CheckoutBrandingVisibility optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = CheckoutBrandingVisibility.fromGraphQl(jsonAsString(field.getValue(), key));
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
        return "CheckoutBrandingFooterContent";
    }

    /**
    * The visibility settings for footer content.
    */

    public CheckoutBrandingVisibility getVisibility() {
        return (CheckoutBrandingVisibility) get("visibility");
    }

    public CheckoutBrandingFooterContent setVisibility(CheckoutBrandingVisibility arg) {
        optimisticData.put(getKey("visibility"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "visibility": return false;

            default: return false;
        }
    }
}

