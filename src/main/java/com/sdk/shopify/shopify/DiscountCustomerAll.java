// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The `DiscountCustomerAll` object lets you target all customers for discount eligibility.
*/
public class DiscountCustomerAll extends AbstractResponse<DiscountCustomerAll> implements DiscountCustomerSelection {
    public DiscountCustomerAll() {
    }

    public DiscountCustomerAll(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "allCustomers": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

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
        return "DiscountCustomerAll";
    }

    /**
    * Whether the discount can be applied by all customers. This value is always `true`.
    */

    public Boolean getAllCustomers() {
        return (Boolean) get("allCustomers");
    }

    public DiscountCustomerAll setAllCustomers(Boolean arg) {
        optimisticData.put(getKey("allCustomers"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "allCustomers": return false;

            default: return false;
        }
    }
}

