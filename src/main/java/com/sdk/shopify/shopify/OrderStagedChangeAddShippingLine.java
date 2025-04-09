// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A new [shipping line](https://shopify.dev/api/admin-graphql/latest/objects/shippingline)
* added as part of an order edit.
*/
public class OrderStagedChangeAddShippingLine extends AbstractResponse<OrderStagedChangeAddShippingLine> implements OrderStagedChange {
    public OrderStagedChangeAddShippingLine() {
    }

    public OrderStagedChangeAddShippingLine(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "phone": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

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
                    responseData.put(key, new MoneyV2(jsonAsObject(field.getValue(), key)));

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
        return "OrderStagedChangeAddShippingLine";
    }

    /**
    * The phone number at the shipping address.
    */

    public String getPhone() {
        return (String) get("phone");
    }

    public OrderStagedChangeAddShippingLine setPhone(String arg) {
        optimisticData.put(getKey("phone"), arg);
        return this;
    }

    /**
    * The shipping line's title that's shown to the buyer.
    */

    public String getPresentmentTitle() {
        return (String) get("presentmentTitle");
    }

    public OrderStagedChangeAddShippingLine setPresentmentTitle(String arg) {
        optimisticData.put(getKey("presentmentTitle"), arg);
        return this;
    }

    /**
    * The price that applies to the shipping line.
    */

    public MoneyV2 getPrice() {
        return (MoneyV2) get("price");
    }

    public OrderStagedChangeAddShippingLine setPrice(MoneyV2 arg) {
        optimisticData.put(getKey("price"), arg);
        return this;
    }

    /**
    * The title of the shipping line.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public OrderStagedChangeAddShippingLine setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "phone": return false;

            case "presentmentTitle": return false;

            case "price": return true;

            case "title": return false;

            default: return false;
        }
    }
}

