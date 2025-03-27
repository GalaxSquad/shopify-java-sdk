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

import java.util.Map;

/**
* Represents the selected pickup option on a subscription contract.
*/
public class SubscriptionDeliveryMethodPickupOption extends AbstractResponse<SubscriptionDeliveryMethodPickupOption> {
    public SubscriptionDeliveryMethodPickupOption() {
    }

    public SubscriptionDeliveryMethodPickupOption(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "code": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "description": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "location": {
                    responseData.put(key, new Location(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "presentmentTitle": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "title": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

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
        return "SubscriptionDeliveryMethodPickupOption";
    }

    /**
    * A custom reference to the delivery method for use with automations.
    */

    public String getCode() {
        return (String) get("code");
    }

    public SubscriptionDeliveryMethodPickupOption setCode(String arg) {
        optimisticData.put(getKey("code"), arg);
        return this;
    }

    /**
    * The details displayed to the customer to describe the pickup option.
    */

    public String getDescription() {
        return (String) get("description");
    }

    public SubscriptionDeliveryMethodPickupOption setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    /**
    * The location where the customer will pick up the merchandise.
    */

    public Location getLocation() {
        return (Location) get("location");
    }

    public SubscriptionDeliveryMethodPickupOption setLocation(Location arg) {
        optimisticData.put(getKey("location"), arg);
        return this;
    }

    /**
    * The presentment title of the pickup option.
    */

    public String getPresentmentTitle() {
        return (String) get("presentmentTitle");
    }

    public SubscriptionDeliveryMethodPickupOption setPresentmentTitle(String arg) {
        optimisticData.put(getKey("presentmentTitle"), arg);
        return this;
    }

    /**
    * The title of the pickup option.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public SubscriptionDeliveryMethodPickupOption setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "code": return false;

            case "description": return false;

            case "location": return true;

            case "presentmentTitle": return false;

            case "title": return false;

            default: return false;
        }
    }
}

