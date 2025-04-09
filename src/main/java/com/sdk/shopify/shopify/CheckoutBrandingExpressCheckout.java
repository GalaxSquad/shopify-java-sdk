// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The Express Checkout customizations.
*/
public class CheckoutBrandingExpressCheckout extends AbstractResponse<CheckoutBrandingExpressCheckout> {
    public CheckoutBrandingExpressCheckout() {
    }

    public CheckoutBrandingExpressCheckout(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "button": {
                    CheckoutBrandingExpressCheckoutButton optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBrandingExpressCheckoutButton(jsonAsObject(field.getValue(), key));
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
        return "CheckoutBrandingExpressCheckout";
    }

    /**
    * The Express Checkout buttons customizations.
    */

    public CheckoutBrandingExpressCheckoutButton getButton() {
        return (CheckoutBrandingExpressCheckoutButton) get("button");
    }

    public CheckoutBrandingExpressCheckout setButton(CheckoutBrandingExpressCheckoutButton arg) {
        optimisticData.put(getKey("button"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "button": return true;

            default: return false;
        }
    }
}

