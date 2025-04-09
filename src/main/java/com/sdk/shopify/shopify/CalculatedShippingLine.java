// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A shipping line item involved in order editing that may be newly added or have new changes applied.
*/
public class CalculatedShippingLine extends AbstractResponse<CalculatedShippingLine> {
    public CalculatedShippingLine() {
    }

    public CalculatedShippingLine(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    ID optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ID(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "price": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "stagedStatus": {
                    responseData.put(key, CalculatedShippingLineStagedStatus.fromGraphQl(jsonAsString(field.getValue(), key)));

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
        return "CalculatedShippingLine";
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    public CalculatedShippingLine setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    /**
    * The price of the shipping line when sold and before applying discounts. This field includes taxes if
    * `Order.taxesIncluded` is true. Otherwise, this field doesn't include taxes for the shipping line.
    */

    public MoneyBag getPrice() {
        return (MoneyBag) get("price");
    }

    public CalculatedShippingLine setPrice(MoneyBag arg) {
        optimisticData.put(getKey("price"), arg);
        return this;
    }

    /**
    * The staged status of the shipping line.
    */

    public CalculatedShippingLineStagedStatus getStagedStatus() {
        return (CalculatedShippingLineStagedStatus) get("stagedStatus");
    }

    public CalculatedShippingLine setStagedStatus(CalculatedShippingLineStagedStatus arg) {
        optimisticData.put(getKey("stagedStatus"), arg);
        return this;
    }

    /**
    * The title of the shipping line.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public CalculatedShippingLine setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "price": return true;

            case "stagedStatus": return false;

            case "title": return false;

            default: return false;
        }
    }
}

