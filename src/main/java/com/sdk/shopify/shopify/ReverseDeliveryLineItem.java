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
* The details about a reverse delivery line item.
*/
public class ReverseDeliveryLineItem extends AbstractResponse<ReverseDeliveryLineItem> implements Node {
    public ReverseDeliveryLineItem() {
    }

    public ReverseDeliveryLineItem(JsonObject fields) throws SchemaViolationError {
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

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "quantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "reverseFulfillmentOrderLineItem": {
                    responseData.put(key, new ReverseFulfillmentOrderLineItem(jsonAsObject(field.getValue(), key)));

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

    public ReverseDeliveryLineItem(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "ReverseDeliveryLineItem";
    }

    /**
    * The dispositions of the item.
    */

    public List<ReverseFulfillmentOrderDisposition> getDispositions() {
        return (List<ReverseFulfillmentOrderDisposition>) get("dispositions");
    }

    public ReverseDeliveryLineItem setDispositions(List<ReverseFulfillmentOrderDisposition> arg) {
        optimisticData.put(getKey("dispositions"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The expected number of units.
    */

    public Integer getQuantity() {
        return (Integer) get("quantity");
    }

    public ReverseDeliveryLineItem setQuantity(Integer arg) {
        optimisticData.put(getKey("quantity"), arg);
        return this;
    }

    /**
    * The corresponding reverse fulfillment order line item.
    */

    public ReverseFulfillmentOrderLineItem getReverseFulfillmentOrderLineItem() {
        return (ReverseFulfillmentOrderLineItem) get("reverseFulfillmentOrderLineItem");
    }

    public ReverseDeliveryLineItem setReverseFulfillmentOrderLineItem(ReverseFulfillmentOrderLineItem arg) {
        optimisticData.put(getKey("reverseFulfillmentOrderLineItem"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "dispositions": return true;

            case "id": return false;

            case "quantity": return false;

            case "reverseFulfillmentOrderLineItem": return true;

            default: return false;
        }
    }
}

