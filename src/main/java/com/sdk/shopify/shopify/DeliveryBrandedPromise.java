// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents a branded promise presented to buyers.
*/
public class DeliveryBrandedPromise extends AbstractResponse<DeliveryBrandedPromise> {
    public DeliveryBrandedPromise() {
    }

    public DeliveryBrandedPromise(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "handle": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "name": {
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
        return "DeliveryBrandedPromise";
    }

    /**
    * The handle of the branded promise.  For example: `shop_promise`.
    */

    public String getHandle() {
        return (String) get("handle");
    }

    public DeliveryBrandedPromise setHandle(String arg) {
        optimisticData.put(getKey("handle"), arg);
        return this;
    }

    /**
    * The name of the branded promise.  For example: `Shop Promise`.
    */

    public String getName() {
        return (String) get("name");
    }

    public DeliveryBrandedPromise setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "handle": return false;

            case "name": return false;

            default: return false;
        }
    }
}

