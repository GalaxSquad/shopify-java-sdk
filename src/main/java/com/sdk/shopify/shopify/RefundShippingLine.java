// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.util.Map;

/**
* A shipping line item that's included in a refund.
*/
public class RefundShippingLine extends AbstractResponse<RefundShippingLine> implements Node {
    public RefundShippingLine() {
    }

    public RefundShippingLine(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "shippingLine": {
                    responseData.put(key, new ShippingLine(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "subtotalAmountSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "taxAmountSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

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

    public RefundShippingLine(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "RefundShippingLine";
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The `ShippingLine` resource associated to the refunded shipping line item.
    */

    public ShippingLine getShippingLine() {
        return (ShippingLine) get("shippingLine");
    }

    public RefundShippingLine setShippingLine(ShippingLine arg) {
        optimisticData.put(getKey("shippingLine"), arg);
        return this;
    }

    /**
    * The subtotal amount of the refund shipping line in shop and presentment currencies.
    */

    public MoneyBag getSubtotalAmountSet() {
        return (MoneyBag) get("subtotalAmountSet");
    }

    public RefundShippingLine setSubtotalAmountSet(MoneyBag arg) {
        optimisticData.put(getKey("subtotalAmountSet"), arg);
        return this;
    }

    /**
    * The tax amount of the refund shipping line in shop and presentment currencies.
    */

    public MoneyBag getTaxAmountSet() {
        return (MoneyBag) get("taxAmountSet");
    }

    public RefundShippingLine setTaxAmountSet(MoneyBag arg) {
        optimisticData.put(getKey("taxAmountSet"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "shippingLine": return true;

            case "subtotalAmountSet": return true;

            case "taxAmountSet": return true;

            default: return false;
        }
    }
}

