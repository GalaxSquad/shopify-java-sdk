// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A typed identifier that represents an individual within a tax jurisdiction.
*/
public class ShopifyPaymentsTaxIdentification extends AbstractResponse<ShopifyPaymentsTaxIdentification> {
    public ShopifyPaymentsTaxIdentification() {
    }

    public ShopifyPaymentsTaxIdentification(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "taxIdentificationType": {
                    responseData.put(key, ShopifyPaymentsTaxIdentificationType.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "value": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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
        return "ShopifyPaymentsTaxIdentification";
    }

    /**
    * The type of the identification.
    */

    public ShopifyPaymentsTaxIdentificationType getTaxIdentificationType() {
        return (ShopifyPaymentsTaxIdentificationType) get("taxIdentificationType");
    }

    public ShopifyPaymentsTaxIdentification setTaxIdentificationType(ShopifyPaymentsTaxIdentificationType arg) {
        optimisticData.put(getKey("taxIdentificationType"), arg);
        return this;
    }

    /**
    * The value of the identification.
    */

    public String getValue() {
        return (String) get("value");
    }

    public ShopifyPaymentsTaxIdentification setValue(String arg) {
        optimisticData.put(getKey("value"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "taxIdentificationType": return false;

            case "value": return false;

            default: return false;
        }
    }
}

