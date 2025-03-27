// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The verification subject represents an individual that has to be verified.
*/
public class ShopifyPaymentsVerificationSubject extends AbstractResponse<ShopifyPaymentsVerificationSubject> {
    public ShopifyPaymentsVerificationSubject() {
    }

    public ShopifyPaymentsVerificationSubject(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "familyName": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "givenName": {
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
        return "ShopifyPaymentsVerificationSubject";
    }

    /**
    * The family name of the individual to verify.
    */

    public String getFamilyName() {
        return (String) get("familyName");
    }

    public ShopifyPaymentsVerificationSubject setFamilyName(String arg) {
        optimisticData.put(getKey("familyName"), arg);
        return this;
    }

    /**
    * The given name of the individual to verify.
    */

    public String getGivenName() {
        return (String) get("givenName");
    }

    public ShopifyPaymentsVerificationSubject setGivenName(String arg) {
        optimisticData.put(getKey("givenName"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "familyName": return false;

            case "givenName": return false;

            default: return false;
        }
    }
}

