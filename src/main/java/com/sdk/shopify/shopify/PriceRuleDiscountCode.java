// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A discount code of a price rule.
*/
public class PriceRuleDiscountCode extends AbstractResponse<PriceRuleDiscountCode> implements Node {
    public PriceRuleDiscountCode() {
    }

    public PriceRuleDiscountCode(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "app": {
                    App optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new App(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "code": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "usageCount": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

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

    public PriceRuleDiscountCode(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "PriceRuleDiscountCode";
    }

    /**
    * The application that created the discount code.
    */

    public App getApp() {
        return (App) get("app");
    }

    public PriceRuleDiscountCode setApp(App arg) {
        optimisticData.put(getKey("app"), arg);
        return this;
    }

    /**
    * The code to apply the discount.
    */

    public String getCode() {
        return (String) get("code");
    }

    public PriceRuleDiscountCode setCode(String arg) {
        optimisticData.put(getKey("code"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The number of times that the price rule has been used. This value is updated asynchronously and can
    * be different than the actual usage count.
    */

    public Integer getUsageCount() {
        return (Integer) get("usageCount");
    }

    public PriceRuleDiscountCode setUsageCount(Integer arg) {
        optimisticData.put(getKey("usageCount"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "app": return true;

            case "code": return false;

            case "id": return false;

            case "usageCount": return false;

            default: return false;
        }
    }
}

