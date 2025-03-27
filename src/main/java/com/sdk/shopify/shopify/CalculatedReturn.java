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
* A calculated return.
*/
public class CalculatedReturn extends AbstractResponse<CalculatedReturn> {
    public CalculatedReturn() {
    }

    public CalculatedReturn(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "exchangeLineItems": {
                    List<CalculatedExchangeLineItem> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new CalculatedExchangeLineItem(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "returnLineItems": {
                    List<CalculatedReturnLineItem> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new CalculatedReturnLineItem(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "returnShippingFee": {
                    CalculatedReturnShippingFee optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CalculatedReturnShippingFee(jsonAsObject(field.getValue(), key));
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
        return "CalculatedReturn";
    }

    /**
    * A list of calculated exchange line items.
    */

    public List<CalculatedExchangeLineItem> getExchangeLineItems() {
        return (List<CalculatedExchangeLineItem>) get("exchangeLineItems");
    }

    public CalculatedReturn setExchangeLineItems(List<CalculatedExchangeLineItem> arg) {
        optimisticData.put(getKey("exchangeLineItems"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    public CalculatedReturn setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
    * A list of calculated return line items.
    */

    public List<CalculatedReturnLineItem> getReturnLineItems() {
        return (List<CalculatedReturnLineItem>) get("returnLineItems");
    }

    public CalculatedReturn setReturnLineItems(List<CalculatedReturnLineItem> arg) {
        optimisticData.put(getKey("returnLineItems"), arg);
        return this;
    }

    /**
    * The calulated return shipping fee.
    */

    public CalculatedReturnShippingFee getReturnShippingFee() {
        return (CalculatedReturnShippingFee) get("returnShippingFee");
    }

    public CalculatedReturn setReturnShippingFee(CalculatedReturnShippingFee arg) {
        optimisticData.put(getKey("returnShippingFee"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "exchangeLineItems": return true;

            case "id": return false;

            case "returnLineItems": return true;

            case "returnShippingFee": return true;

            default: return false;
        }
    }
}

