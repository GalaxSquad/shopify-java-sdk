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
* A selection of customers for whom the price rule applies.
*/
public class PriceRuleCustomerSelection extends AbstractResponse<PriceRuleCustomerSelection> {
    public PriceRuleCustomerSelection() {
    }

    public PriceRuleCustomerSelection(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "customers": {
                    responseData.put(key, new CustomerConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "forAllCustomers": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "segments": {
                    List<Segment> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new Segment(jsonAsObject(element1, key)));
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
        return "PriceRuleCustomerSelection";
    }

    /**
    * List of customers to whom the price rule applies.
    */

    public CustomerConnection getCustomers() {
        return (CustomerConnection) get("customers");
    }

    public PriceRuleCustomerSelection setCustomers(CustomerConnection arg) {
        optimisticData.put(getKey("customers"), arg);
        return this;
    }

    /**
    * Whether the price rule applies to all customers.
    */

    public Boolean getForAllCustomers() {
        return (Boolean) get("forAllCustomers");
    }

    public PriceRuleCustomerSelection setForAllCustomers(Boolean arg) {
        optimisticData.put(getKey("forAllCustomers"), arg);
        return this;
    }

    /**
    * A list of customer segments that contain the customers who can use the price rule.
    */

    public List<Segment> getSegments() {
        return (List<Segment>) get("segments");
    }

    public PriceRuleCustomerSelection setSegments(List<Segment> arg) {
        optimisticData.put(getKey("segments"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "customers": return true;

            case "forAllCustomers": return false;

            case "segments": return true;

            default: return false;
        }
    }
}

