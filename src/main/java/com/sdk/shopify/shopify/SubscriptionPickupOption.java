// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A pickup option to deliver a subscription contract.
*/
public class SubscriptionPickupOption extends AbstractResponse<SubscriptionPickupOption> implements SubscriptionDeliveryOption {
    public SubscriptionPickupOption() {
    }

    public SubscriptionPickupOption(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "code": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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

                case "phoneRequired": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "pickupTime": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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

                case "price": {
                    MoneyV2 optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MoneyV2(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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
        return "SubscriptionPickupOption";
    }

    /**
    * The code of the pickup option.
    */

    public String getCode() {
        return (String) get("code");
    }

    public SubscriptionPickupOption setCode(String arg) {
        optimisticData.put(getKey("code"), arg);
        return this;
    }

    /**
    * The description of the pickup option.
    */

    public String getDescription() {
        return (String) get("description");
    }

    public SubscriptionPickupOption setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    /**
    * The pickup location.
    */

    public Location getLocation() {
        return (Location) get("location");
    }

    public SubscriptionPickupOption setLocation(Location arg) {
        optimisticData.put(getKey("location"), arg);
        return this;
    }

    /**
    * Whether a phone number is required for the pickup option.
    */

    public Boolean getPhoneRequired() {
        return (Boolean) get("phoneRequired");
    }

    public SubscriptionPickupOption setPhoneRequired(Boolean arg) {
        optimisticData.put(getKey("phoneRequired"), arg);
        return this;
    }

    /**
    * The estimated amount of time it takes for the pickup to be ready. For example, "Usually ready in 24
    * hours".).
    */

    public String getPickupTime() {
        return (String) get("pickupTime");
    }

    public SubscriptionPickupOption setPickupTime(String arg) {
        optimisticData.put(getKey("pickupTime"), arg);
        return this;
    }

    /**
    * The presentment title of the pickup option.
    */

    public String getPresentmentTitle() {
        return (String) get("presentmentTitle");
    }

    public SubscriptionPickupOption setPresentmentTitle(String arg) {
        optimisticData.put(getKey("presentmentTitle"), arg);
        return this;
    }

    /**
    * The price of the pickup option.
    */

    public MoneyV2 getPrice() {
        return (MoneyV2) get("price");
    }

    public SubscriptionPickupOption setPrice(MoneyV2 arg) {
        optimisticData.put(getKey("price"), arg);
        return this;
    }

    /**
    * The title of the pickup option.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public SubscriptionPickupOption setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "code": return false;

            case "description": return false;

            case "location": return true;

            case "phoneRequired": return false;

            case "pickupTime": return false;

            case "presentmentTitle": return false;

            case "price": return true;

            case "title": return false;

            default: return false;
        }
    }
}

