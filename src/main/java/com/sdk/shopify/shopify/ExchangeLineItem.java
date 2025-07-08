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
* An item for exchange.
*/
public class ExchangeLineItem extends AbstractResponse<ExchangeLineItem> implements Node {
    public ExchangeLineItem() {
    }

    public ExchangeLineItem(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "lineItems": {
                    List<LineItem> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<LineItem> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            list1.add(new LineItem(jsonAsObject(element1, key)));
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "processableQuantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "processedQuantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "quantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "unprocessedQuantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "variantId": {
                    ID optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ID(jsonAsString(field.getValue(), key));
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

    public ExchangeLineItem(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "ExchangeLineItem";
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The order line items for the exchange.
    */

    public List<LineItem> getLineItems() {
        return (List<LineItem>) get("lineItems");
    }

    public ExchangeLineItem setLineItems(List<LineItem> arg) {
        optimisticData.put(getKey("lineItems"), arg);
        return this;
    }

    /**
    * The quantity of the exchange item that can be processed.
    */

    public Integer getProcessableQuantity() {
        return (Integer) get("processableQuantity");
    }

    public ExchangeLineItem setProcessableQuantity(Integer arg) {
        optimisticData.put(getKey("processableQuantity"), arg);
        return this;
    }

    /**
    * The quantity of the exchange item that have been processed.
    */

    public Integer getProcessedQuantity() {
        return (Integer) get("processedQuantity");
    }

    public ExchangeLineItem setProcessedQuantity(Integer arg) {
        optimisticData.put(getKey("processedQuantity"), arg);
        return this;
    }

    /**
    * The number of units ordered, including refunded and removed units.
    */

    public Integer getQuantity() {
        return (Integer) get("quantity");
    }

    public ExchangeLineItem setQuantity(Integer arg) {
        optimisticData.put(getKey("quantity"), arg);
        return this;
    }

    /**
    * The quantity of the exchange item that haven't been processed.
    */

    public Integer getUnprocessedQuantity() {
        return (Integer) get("unprocessedQuantity");
    }

    public ExchangeLineItem setUnprocessedQuantity(Integer arg) {
        optimisticData.put(getKey("unprocessedQuantity"), arg);
        return this;
    }

    /**
    * The ID of the variant at time of return creation.
    */

    public ID getVariantId() {
        return (ID) get("variantId");
    }

    public ExchangeLineItem setVariantId(ID arg) {
        optimisticData.put(getKey("variantId"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "lineItems": return true;

            case "processableQuantity": return false;

            case "processedQuantity": return false;

            case "quantity": return false;

            case "unprocessedQuantity": return false;

            case "variantId": return false;

            default: return false;
        }
    }
}

