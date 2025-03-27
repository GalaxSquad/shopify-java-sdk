// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The settings that apply to the 'group' variant of ChoiceList.
*/
public class CheckoutBrandingChoiceListGroup extends AbstractResponse<CheckoutBrandingChoiceListGroup> {
    public CheckoutBrandingChoiceListGroup() {
    }

    public CheckoutBrandingChoiceListGroup(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "spacing": {
                    CheckoutBrandingSpacingKeyword optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = CheckoutBrandingSpacingKeyword.fromGraphQl(jsonAsString(field.getValue(), key));
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
        return "CheckoutBrandingChoiceListGroup";
    }

    /**
    * The spacing between UI elements in the list.
    */

    public CheckoutBrandingSpacingKeyword getSpacing() {
        return (CheckoutBrandingSpacingKeyword) get("spacing");
    }

    public CheckoutBrandingChoiceListGroup setSpacing(CheckoutBrandingSpacingKeyword arg) {
        optimisticData.put(getKey("spacing"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "spacing": return false;

            default: return false;
        }
    }
}

