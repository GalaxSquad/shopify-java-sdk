// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The fulfillment associated with dispute evidence.
*/
public class ShopifyPaymentsDisputeFulfillment extends AbstractResponse<ShopifyPaymentsDisputeFulfillment> implements Node {
    public ShopifyPaymentsDisputeFulfillment() {
    }

    public ShopifyPaymentsDisputeFulfillment(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "shippingCarrier": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "shippingDate": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "shippingTrackingNumber": {
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

    public ShopifyPaymentsDisputeFulfillment(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "ShopifyPaymentsDisputeFulfillment";
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The shipping carrier for this fulfillment.
    */

    public String getShippingCarrier() {
        return (String) get("shippingCarrier");
    }

    public ShopifyPaymentsDisputeFulfillment setShippingCarrier(String arg) {
        optimisticData.put(getKey("shippingCarrier"), arg);
        return this;
    }

    /**
    * The shipping date for this fulfillment.
    */

    public String getShippingDate() {
        return (String) get("shippingDate");
    }

    public ShopifyPaymentsDisputeFulfillment setShippingDate(String arg) {
        optimisticData.put(getKey("shippingDate"), arg);
        return this;
    }

    /**
    * The shipping tracking number for this fulfillment.
    */

    public String getShippingTrackingNumber() {
        return (String) get("shippingTrackingNumber");
    }

    public ShopifyPaymentsDisputeFulfillment setShippingTrackingNumber(String arg) {
        optimisticData.put(getKey("shippingTrackingNumber"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "shippingCarrier": return false;

            case "shippingDate": return false;

            case "shippingTrackingNumber": return false;

            default: return false;
        }
    }
}

