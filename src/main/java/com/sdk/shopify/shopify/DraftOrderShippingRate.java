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
public class DraftOrderShippingRate extends AbstractResponse<DraftOrderShippingRate> {
    public DraftOrderShippingRate() {
    }

    public DraftOrderShippingRate(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "code": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "handle": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "price": {
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "source": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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
        return "DraftOrderShippingRate";
    }

    /**
    * The code of the shipping rate.
    */

    public String getCode() {
        return (String) get("code");
    }

    public DraftOrderShippingRate setCode(String arg) {
        optimisticData.put(getKey("code"), arg);
        return this;
    }

    /**
    * Unique identifier for this shipping rate.
    */

    public String getHandle() {
        return (String) get("handle");
    }

    public DraftOrderShippingRate setHandle(String arg) {
        optimisticData.put(getKey("handle"), arg);
        return this;
    }

    /**
    * The cost associated with the shipping rate.
    */

    public MoneyV2 getPrice() {
        return (MoneyV2) get("price");
    }

    public DraftOrderShippingRate setPrice(MoneyV2 arg) {
        optimisticData.put(getKey("price"), arg);
        return this;
    }

    /**
    * The source of the shipping rate.
    */

    public String getSource() {
        return (String) get("source");
    }

    public DraftOrderShippingRate setSource(String arg) {
        optimisticData.put(getKey("source"), arg);
        return this;
    }

    /**
    * The name of the shipping rate.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public DraftOrderShippingRate setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "code": return false;

            case "handle": return false;

            case "price": return true;

            case "source": return false;

            case "title": return false;

            default: return false;
        }
    }
}

