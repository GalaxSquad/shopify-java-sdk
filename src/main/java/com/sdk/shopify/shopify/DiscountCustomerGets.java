// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The items in the order that qualify for the discount, their quantities, and the total value of the
* discount.
*/
public class DiscountCustomerGets extends AbstractResponse<DiscountCustomerGets> {
    public DiscountCustomerGets() {
    }

    public DiscountCustomerGets(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "appliesOnOneTimePurchase": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "appliesOnSubscription": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "items": {
                    responseData.put(key, UnknownDiscountItems.create(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "value": {
                    responseData.put(key, UnknownDiscountCustomerGetsValue.create(jsonAsObject(field.getValue(), key)));

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
        return "DiscountCustomerGets";
    }

    /**
    * Whether the discount applies on regular one-time-purchase items.
    */

    public Boolean getAppliesOnOneTimePurchase() {
        return (Boolean) get("appliesOnOneTimePurchase");
    }

    public DiscountCustomerGets setAppliesOnOneTimePurchase(Boolean arg) {
        optimisticData.put(getKey("appliesOnOneTimePurchase"), arg);
        return this;
    }

    /**
    * Whether the discount applies on subscription items.
    * [Subscriptions](https://shopify.dev/docs/apps/launch/billing/subscription-billing/offer-subscription
    * -discounts)
    * enable customers to purchase products
    * on a recurring basis.
    */

    public Boolean getAppliesOnSubscription() {
        return (Boolean) get("appliesOnSubscription");
    }

    public DiscountCustomerGets setAppliesOnSubscription(Boolean arg) {
        optimisticData.put(getKey("appliesOnSubscription"), arg);
        return this;
    }

    /**
    * The items to which the discount applies.
    */

    public DiscountItems getItems() {
        return (DiscountItems) get("items");
    }

    public DiscountCustomerGets setItems(DiscountItems arg) {
        optimisticData.put(getKey("items"), arg);
        return this;
    }

    /**
    * Entitled quantity and the discount value.
    */

    public DiscountCustomerGetsValue getValue() {
        return (DiscountCustomerGetsValue) get("value");
    }

    public DiscountCustomerGets setValue(DiscountCustomerGetsValue arg) {
        optimisticData.put(getKey("value"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "appliesOnOneTimePurchase": return false;

            case "appliesOnSubscription": return false;

            case "items": return false;

            case "value": return false;

            default: return false;
        }
    }
}

