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

public class Checkout extends AbstractResponse<Checkout> implements Node {
    public Checkout() {
    }

    public Checkout(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "shippingAddress": {
                    MailingAddress optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MailingAddress(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "discountApplication": {
                    responseData.put(key, UnknownDiscountApplication.create(jsonAsObject(field.getValue(), key)));

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

    public Checkout(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "Checkout";
    }

    @Override
    public ID getId() {
        return (ID) get("id");
    }

    public MailingAddress getShippingAddress() {
        return (MailingAddress) get("shippingAddress");
    }

    public Checkout setShippingAddress(MailingAddress arg) {
        optimisticData.put(getKey("shippingAddress"), arg);
        return this;
    }

    public DiscountApplication getDiscountApplication() {
        return (DiscountApplication) get("discountApplication");
    }

    public Checkout setDiscountApplication(DiscountApplication arg) {
        optimisticData.put(getKey("discountApplication"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "shippingAddress": return true;

            case "discountApplication": return false;

            default: return false;
        }
    }
}

