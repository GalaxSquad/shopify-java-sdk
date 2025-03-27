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
* The type used to target the items required for discount eligibility, or the items to which the
* application of a discount might apply. For example, for a customer to be eligible for a discount,
* they're required to add an item from a specified collection to their order. Alternatively, a
* customer might be required to add a specific product or product variant. When using this type to
* target which items the discount will apply to, the discount might apply to all items on the order,
* or to specific products and product variants, or items in a given collection.
*/
public class UnknownDiscountItems extends AbstractResponse<UnknownDiscountItems> implements DiscountItems {
    public UnknownDiscountItems() {
    }

    public UnknownDiscountItems(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
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

    public static DiscountItems create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "AllDiscountItems": {
                return new AllDiscountItems(fields);
            }

            case "DiscountCollections": {
                return new DiscountCollections(fields);
            }

            case "DiscountProducts": {
                return new DiscountProducts(fields);
            }

            default: {
                return new UnknownDiscountItems(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            default: return false;
        }
    }
}

