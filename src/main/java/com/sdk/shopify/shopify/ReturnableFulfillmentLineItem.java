// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A returnable fulfillment line item.
*/
public class ReturnableFulfillmentLineItem extends AbstractResponse<ReturnableFulfillmentLineItem> {
    public ReturnableFulfillmentLineItem() {
    }

    public ReturnableFulfillmentLineItem(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "fulfillmentLineItem": {
                    responseData.put(key, new FulfillmentLineItem(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "quantity": {
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

    public String getGraphQlTypeName() {
        return "ReturnableFulfillmentLineItem";
    }

    /**
    * The fulfillment line item that can be returned.
    */

    public FulfillmentLineItem getFulfillmentLineItem() {
        return (FulfillmentLineItem) get("fulfillmentLineItem");
    }

    public ReturnableFulfillmentLineItem setFulfillmentLineItem(FulfillmentLineItem arg) {
        optimisticData.put(getKey("fulfillmentLineItem"), arg);
        return this;
    }

    /**
    * The quantity available to be returned.
    */

    public Integer getQuantity() {
        return (Integer) get("quantity");
    }

    public ReturnableFulfillmentLineItem setQuantity(Integer arg) {
        optimisticData.put(getKey("quantity"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "fulfillmentLineItem": return true;

            case "quantity": return false;

            default: return false;
        }
    }
}

