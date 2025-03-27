// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The customizations for the breadcrumbs that represent a buyer's journey to the checkout.
*/
public class CheckoutBrandingBuyerJourney extends AbstractResponse<CheckoutBrandingBuyerJourney> {
    public CheckoutBrandingBuyerJourney() {
    }

    public CheckoutBrandingBuyerJourney(JsonObject fields) throws SchemaViolationError {
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
        return "CheckoutBrandingBuyerJourney";
    }

    /**
    * An option to display or hide the breadcrumbs that represent the buyer's journey on 3-page checkout.
    */

    public CheckoutBrandingVisibility getVisibility() {
        return (CheckoutBrandingVisibility) get("visibility");
    }

    public CheckoutBrandingBuyerJourney setVisibility(CheckoutBrandingVisibility arg) {
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

