// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* The details about a reverse fulfillment order line item.
*/
public class ReverseFulfillmentOrderLineItem extends AbstractResponse<ReverseFulfillmentOrderLineItem> implements Node {
    public ReverseFulfillmentOrderLineItem() {
    }

    public ReverseFulfillmentOrderLineItem(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "dispositions": {
                    List<ReverseFulfillmentOrderDisposition> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new ReverseFulfillmentOrderDisposition(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "fulfillmentLineItem": {
                    FulfillmentLineItem optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new FulfillmentLineItem(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "totalQuantity": {
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

    public ReverseFulfillmentOrderLineItem(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "ReverseFulfillmentOrderLineItem";
    }

    /**
    * The dispositions of the item.
    */

    public List<ReverseFulfillmentOrderDisposition> getDispositions() {
        return (List<ReverseFulfillmentOrderDisposition>) get("dispositions");
    }

    public ReverseFulfillmentOrderLineItem setDispositions(List<ReverseFulfillmentOrderDisposition> arg) {
        optimisticData.put(getKey("dispositions"), arg);
        return this;
    }

    /**
    * The corresponding fulfillment line item for a reverse fulfillment order line item.
    */

    public FulfillmentLineItem getFulfillmentLineItem() {
        return (FulfillmentLineItem) get("fulfillmentLineItem");
    }

    public ReverseFulfillmentOrderLineItem setFulfillmentLineItem(FulfillmentLineItem arg) {
        optimisticData.put(getKey("fulfillmentLineItem"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The total number of units to be processed.
    */

    public Integer getTotalQuantity() {
        return (Integer) get("totalQuantity");
    }

    public ReverseFulfillmentOrderLineItem setTotalQuantity(Integer arg) {
        optimisticData.put(getKey("totalQuantity"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "dispositions": return true;

            case "fulfillmentLineItem": return true;

            case "id": return false;

            case "totalQuantity": return false;

            default: return false;
        }
    }
}

