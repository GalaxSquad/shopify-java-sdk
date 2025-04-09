// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A code that a customer can use at checkout to receive a discount. For example, a customer can use
* the redeem code 'SUMMER20' at checkout to receive a 20% discount on their entire order.
*/
public class DiscountRedeemCode extends AbstractResponse<DiscountRedeemCode> {
    public DiscountRedeemCode() {
    }

    public DiscountRedeemCode(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "asyncUsageCount": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "code": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "createdBy": {
                    App optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new App(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

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
        return "DiscountRedeemCode";
    }

    /**
    * The number of times that the discount redeem code has been used. This value is updated
    * asynchronously and can be different than the actual usage count.
    */

    public Integer getAsyncUsageCount() {
        return (Integer) get("asyncUsageCount");
    }

    public DiscountRedeemCode setAsyncUsageCount(Integer arg) {
        optimisticData.put(getKey("asyncUsageCount"), arg);
        return this;
    }

    /**
    * The code that a customer can use at checkout to receive a discount.
    */

    public String getCode() {
        return (String) get("code");
    }

    public DiscountRedeemCode setCode(String arg) {
        optimisticData.put(getKey("code"), arg);
        return this;
    }

    /**
    * The application that created the discount redeem code.
    */

    public App getCreatedBy() {
        return (App) get("createdBy");
    }

    public DiscountRedeemCode setCreatedBy(App arg) {
        optimisticData.put(getKey("createdBy"), arg);
        return this;
    }

    /**
    * A globally-unique ID of the discount redeem code.
    */

    public ID getId() {
        return (ID) get("id");
    }

    public DiscountRedeemCode setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "asyncUsageCount": return false;

            case "code": return false;

            case "createdBy": return true;

            case "id": return false;

            default: return false;
        }
    }
}

