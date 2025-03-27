// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A calculated return fee.
*/
public class UnknownCalculatedReturnFee extends AbstractResponse<UnknownCalculatedReturnFee> implements CalculatedReturnFee {
    public UnknownCalculatedReturnFee() {
    }

    public UnknownCalculatedReturnFee(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "amountSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

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

    public static CalculatedReturnFee create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "CalculatedRestockingFee": {
                return new CalculatedRestockingFee(fields);
            }

            case "CalculatedReturnShippingFee": {
                return new CalculatedReturnShippingFee(fields);
            }

            default: {
                return new UnknownCalculatedReturnFee(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    /**
    * The calculated amount of the return fee, in shop and presentment currencies.
    */

    public MoneyBag getAmountSet() {
        return (MoneyBag) get("amountSet");
    }

    public UnknownCalculatedReturnFee setAmountSet(MoneyBag arg) {
        optimisticData.put(getKey("amountSet"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    public UnknownCalculatedReturnFee setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "amountSet": return true;

            case "id": return false;

            default: return false;
        }
    }
}

