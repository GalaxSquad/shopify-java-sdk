// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents a customer's visiting activities on a shop's online store.
*/
public class CustomerJourneySummary extends AbstractResponse<CustomerJourneySummary> {
    public CustomerJourneySummary() {
    }

    public CustomerJourneySummary(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "customerOrderIndex": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "daysToConversion": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "firstVisit": {
                    CustomerVisit optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerVisit(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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
                    CustomerMomentConnection optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CustomerMomentConnection(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "momentsCount": {
                    Count optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Count(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "ready": {
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
        return "CustomerJourneySummary";
    }

    /**
    * The position of the current order within the customer's order history. Test orders aren't included.
    */

    public Integer getCustomerOrderIndex() {
        return (Integer) get("customerOrderIndex");
    }

    public CustomerJourneySummary setCustomerOrderIndex(Integer arg) {
        optimisticData.put(getKey("customerOrderIndex"), arg);
        return this;
    }

    /**
    * The number of days between the first session and the order creation date. The first session
    * represents the first session since the last order, or the first session within the 30 day
    * attribution window, if more than 30 days have passed since the last order.
    */

    public Integer getDaysToConversion() {
        return (Integer) get("daysToConversion");
    }

    public CustomerJourneySummary setDaysToConversion(Integer arg) {
        optimisticData.put(getKey("daysToConversion"), arg);
        return this;
    }

    /**
    * The customer's first session going into the shop.
    */

    public CustomerVisit getFirstVisit() {
        return (CustomerVisit) get("firstVisit");
    }

    public CustomerJourneySummary setFirstVisit(CustomerVisit arg) {
        optimisticData.put(getKey("firstVisit"), arg);
        return this;
    }

    /**
    * The last session before an order is made.
    */

    public CustomerVisit getLastVisit() {
        return (CustomerVisit) get("lastVisit");
    }

    public CustomerJourneySummary setLastVisit(CustomerVisit arg) {
        optimisticData.put(getKey("lastVisit"), arg);
        return this;
    }

    /**
    * The events preceding a customer's order, such as shop sessions.
    */

    public CustomerMomentConnection getMoments() {
        return (CustomerMomentConnection) get("moments");
    }

    public CustomerJourneySummary setMoments(CustomerMomentConnection arg) {
        optimisticData.put(getKey("moments"), arg);
        return this;
    }

    /**
    * The total number of customer moments associated with this order. Returns null if the order is still
    * in the process of being attributed.
    */

    public Count getMomentsCount() {
        return (Count) get("momentsCount");
    }

    public CustomerJourneySummary setMomentsCount(Count arg) {
        optimisticData.put(getKey("momentsCount"), arg);
        return this;
    }

    /**
    * Whether the attributed sessions for the order have been created yet.
    */

    public Boolean getReady() {
        return (Boolean) get("ready");
    }

    public CustomerJourneySummary setReady(Boolean arg) {
        optimisticData.put(getKey("ready"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "customerOrderIndex": return false;

            case "daysToConversion": return false;

            case "firstVisit": return true;

            case "lastVisit": return true;

            case "moments": return true;

            case "momentsCount": return true;

            case "ready": return false;

            default: return false;
        }
    }
}

