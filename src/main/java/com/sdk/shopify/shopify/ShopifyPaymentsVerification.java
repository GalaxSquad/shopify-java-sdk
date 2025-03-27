// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Each subject (individual) of an account has a verification object giving
* information about the verification state.
*/
public class ShopifyPaymentsVerification extends AbstractResponse<ShopifyPaymentsVerification> implements Node {
    public ShopifyPaymentsVerification() {
    }

    public ShopifyPaymentsVerification(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "status": {
                    responseData.put(key, ShopifyPaymentsVerificationStatus.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "subject": {
                    responseData.put(key, new ShopifyPaymentsVerificationSubject(jsonAsObject(field.getValue(), key)));

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

    public ShopifyPaymentsVerification(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "ShopifyPaymentsVerification";
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The status of the verification.
    */

    public ShopifyPaymentsVerificationStatus getStatus() {
        return (ShopifyPaymentsVerificationStatus) get("status");
    }

    public ShopifyPaymentsVerification setStatus(ShopifyPaymentsVerificationStatus arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    /**
    * The subject/individual who has to be verified.
    */

    public ShopifyPaymentsVerificationSubject getSubject() {
        return (ShopifyPaymentsVerificationSubject) get("subject");
    }

    public ShopifyPaymentsVerification setSubject(ShopifyPaymentsVerificationSubject arg) {
        optimisticData.put(getKey("subject"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "status": return false;

            case "subject": return true;

            default: return false;
        }
    }
}

