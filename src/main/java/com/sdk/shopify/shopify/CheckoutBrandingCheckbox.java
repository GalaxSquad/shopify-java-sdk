// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The checkboxes customizations.
*/
public class CheckoutBrandingCheckbox extends AbstractResponse<CheckoutBrandingCheckbox> {
    public CheckoutBrandingCheckbox() {
    }

    public CheckoutBrandingCheckbox(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "cornerRadius": {
                    CheckoutBrandingCornerRadius optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = CheckoutBrandingCornerRadius.fromGraphQl(jsonAsString(field.getValue(), key));
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
        return "CheckoutBrandingCheckbox";
    }

    /**
    * The corner radius used for checkboxes.
    */

    public CheckoutBrandingCornerRadius getCornerRadius() {
        return (CheckoutBrandingCornerRadius) get("cornerRadius");
    }

    public CheckoutBrandingCheckbox setCornerRadius(CheckoutBrandingCornerRadius arg) {
        optimisticData.put(getKey("cornerRadius"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "cornerRadius": return false;

            default: return false;
        }
    }
}

