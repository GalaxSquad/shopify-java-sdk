// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A custom property. Attributes are used to store additional information about a Shopify resource,
* such as
* products, customers, or orders. Attributes are stored as key-value pairs.
* For example, a list of attributes might include whether a customer is a first-time buyer
* (`"customer_first_order": "true"`),
* whether an order is gift-wrapped (`"gift_wrapped": "true"`), a preferred delivery date
* (`"preferred_delivery_date": "2025-10-01"`), the discount applied (`"loyalty_discount_applied":
* "10%"`), and any
* notes provided by the customer (`"customer_notes": "Please leave at the front door"`).
*/
public class Attribute extends AbstractResponse<Attribute> {
    public Attribute() {
    }

    public Attribute(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "key": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "value": {
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
        return "Attribute";
    }

    /**
    * The key or name of the attribute. For example, `"customer_first_order"`.
    */

    public String getKey() {
        return (String) get("key");
    }

    public Attribute setKey(String arg) {
        optimisticData.put(getKey("key"), arg);
        return this;
    }

    /**
    * The value of the attribute. For example, `"true"`.
    */

    public String getValue() {
        return (String) get("value");
    }

    public Attribute setValue(String arg) {
        optimisticData.put(getKey("value"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "key": return false;

            case "value": return false;

            default: return false;
        }
    }
}

