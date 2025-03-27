// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Represents a customer's visiting activities on a shop's online store.
*/
public class CustomerJourney extends AbstractResponse<CustomerJourney> {
    public CustomerJourney() {
    }

    public CustomerJourney(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "customerOrderIndex": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "daysToConversion": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "firstVisit": {
                    responseData.put(key, new CustomerVisit(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "lastVisit": {
                    CustomerVisit optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerVisit(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "moments": {
                    List<CustomerMoment> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(UnknownCustomerMoment.create(jsonAsObject(element1, key)));
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
        return "CustomerJourney";
    }

    /**
    * The position of the current order within the customer's order history.
    */

    public Integer getCustomerOrderIndex() {
        return (Integer) get("customerOrderIndex");
    }

    public CustomerJourney setCustomerOrderIndex(Integer arg) {
        optimisticData.put(getKey("customerOrderIndex"), arg);
        return this;
    }

    /**
    * The amount of days between first session and order creation date. First session represents first
    * session since the last order, or first session within the 30 day attribution window, if more than 30
    * days has passed since the last order.
    */

    public Integer getDaysToConversion() {
        return (Integer) get("daysToConversion");
    }

    public CustomerJourney setDaysToConversion(Integer arg) {
        optimisticData.put(getKey("daysToConversion"), arg);
        return this;
    }

    /**
    * The customer's first session going into the shop.
    */

    public CustomerVisit getFirstVisit() {
        return (CustomerVisit) get("firstVisit");
    }

    public CustomerJourney setFirstVisit(CustomerVisit arg) {
        optimisticData.put(getKey("firstVisit"), arg);
        return this;
    }

    /**
    * The last session before an order is made.
    */

    public CustomerVisit getLastVisit() {
        return (CustomerVisit) get("lastVisit");
    }

    public CustomerJourney setLastVisit(CustomerVisit arg) {
        optimisticData.put(getKey("lastVisit"), arg);
        return this;
    }

    /**
    * Events preceding a customer order, such as shop sessions.
    */

    public List<CustomerMoment> getMoments() {
        return (List<CustomerMoment>) get("moments");
    }

    public CustomerJourney setMoments(List<CustomerMoment> arg) {
        optimisticData.put(getKey("moments"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "customerOrderIndex": return false;

            case "daysToConversion": return false;

            case "firstVisit": return true;

            case "lastVisit": return true;

            case "moments": return false;

            default: return false;
        }
    }
}

