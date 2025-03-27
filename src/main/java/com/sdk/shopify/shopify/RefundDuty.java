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
* Represents a refunded duty.
*/
public class RefundDuty extends AbstractResponse<RefundDuty> {
    public RefundDuty() {
    }

    public RefundDuty(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "amountSet": {
                    responseData.put(key, new MoneyBag(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "originalDuty": {
                    Duty optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Duty(jsonAsObject(field.getValue(), key));
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
        return "RefundDuty";
    }

    /**
    * The amount of a refunded duty in shop and presentment currencies.
    */

    public MoneyBag getAmountSet() {
        return (MoneyBag) get("amountSet");
    }

    public RefundDuty setAmountSet(MoneyBag arg) {
        optimisticData.put(getKey("amountSet"), arg);
        return this;
    }

    /**
    * The duty associated with this refunded duty.
    */

    public Duty getOriginalDuty() {
        return (Duty) get("originalDuty");
    }

    public RefundDuty setOriginalDuty(Duty arg) {
        optimisticData.put(getKey("originalDuty"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "amountSet": return true;

            case "originalDuty": return true;

            default: return false;
        }
    }
}

