// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The content container customizations.
*/
public class CheckoutBrandingContent extends AbstractResponse<CheckoutBrandingContent> {
    public CheckoutBrandingContent() {
    }

    public CheckoutBrandingContent(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "divider": {
                    CheckoutBrandingContainerDivider optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBrandingContainerDivider(jsonAsObject(field.getValue(), key));
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
        return "CheckoutBrandingContent";
    }

    /**
    * The content container's divider style and visibility.
    */

    public CheckoutBrandingContainerDivider getDivider() {
        return (CheckoutBrandingContainerDivider) get("divider");
    }

    public CheckoutBrandingContent setDivider(CheckoutBrandingContainerDivider arg) {
        optimisticData.put(getKey("divider"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "divider": return true;

            default: return false;
        }
    }
}

