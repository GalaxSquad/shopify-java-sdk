// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A shipping rate is an additional cost added to the cost of the products that were ordered.
*/
public class ShippingRate extends AbstractResponse<ShippingRate> {
    public ShippingRate() {
    }

    public ShippingRate(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "handle": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "price": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "title": {
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
        return "ShippingRate";
    }

    /**
    * Human-readable unique identifier for this shipping rate.
    */

    public String getHandle() {
        return (String) get("handle");
    }

    public ShippingRate setHandle(String arg) {
        optimisticData.put(getKey("handle"), arg);
        return this;
    }

    /**
    * The cost associated with the shipping rate.
    */

    public MoneyV2 getPrice() {
        return (MoneyV2) get("price");
    }

    public ShippingRate setPrice(MoneyV2 arg) {
        optimisticData.put(getKey("price"), arg);
        return this;
    }

    /**
    * The name of the shipping rate.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public ShippingRate setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "handle": return false;

            case "price": return true;

            case "title": return false;

            default: return false;
        }
    }
}

