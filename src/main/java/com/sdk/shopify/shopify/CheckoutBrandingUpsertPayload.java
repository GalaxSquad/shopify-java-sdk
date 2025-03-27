// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Return type for `checkoutBrandingUpsert` mutation.
*/
public class CheckoutBrandingUpsertPayload extends AbstractResponse<CheckoutBrandingUpsertPayload> {
    public CheckoutBrandingUpsertPayload() {
    }

    public CheckoutBrandingUpsertPayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "checkoutBranding": {
                    CheckoutBranding optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBranding(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<CheckoutBrandingUpsertUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new CheckoutBrandingUpsertUserError(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

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
        return "CheckoutBrandingUpsertPayload";
    }

    /**
    * Returns the new checkout branding settings.
    */

    public CheckoutBranding getCheckoutBranding() {
        return (CheckoutBranding) get("checkoutBranding");
    }

    public CheckoutBrandingUpsertPayload setCheckoutBranding(CheckoutBranding arg) {
        optimisticData.put(getKey("checkoutBranding"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<CheckoutBrandingUpsertUserError> getUserErrors() {
        return (List<CheckoutBrandingUpsertUserError>) get("userErrors");
    }

    public CheckoutBrandingUpsertPayload setUserErrors(List<CheckoutBrandingUpsertUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "checkoutBranding": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

