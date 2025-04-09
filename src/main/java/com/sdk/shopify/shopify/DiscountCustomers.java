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
* A list of individual customers eligible for the discount.
*/
public class DiscountCustomers extends AbstractResponse<DiscountCustomers> implements DiscountCustomerSelection {
    public DiscountCustomers() {
    }

    public DiscountCustomers(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "customers": {
                    List<Customer> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new Customer(jsonAsObject(element1, key)));
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
        return "DiscountCustomers";
    }

    /**
    * The list of individual customers eligible for the discount.
    */

    public List<Customer> getCustomers() {
        return (List<Customer>) get("customers");
    }

    public DiscountCustomers setCustomers(List<Customer> arg) {
        optimisticData.put(getKey("customers"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "customers": return true;

            default: return false;
        }
    }
}

