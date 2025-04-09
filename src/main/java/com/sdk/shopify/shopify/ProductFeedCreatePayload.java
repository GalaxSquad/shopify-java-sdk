// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Return type for `productFeedCreate` mutation.
*/
public class ProductFeedCreatePayload extends AbstractResponse<ProductFeedCreatePayload> {
    public ProductFeedCreatePayload() {
    }

    public ProductFeedCreatePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "productFeed": {
                    ProductFeed optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ProductFeed(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<ProductFeedCreateUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new ProductFeedCreateUserError(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

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
        return "ProductFeedCreatePayload";
    }

    /**
    * The newly created product feed.
    */

    public ProductFeed getProductFeed() {
        return (ProductFeed) get("productFeed");
    }

    public ProductFeedCreatePayload setProductFeed(ProductFeed arg) {
        optimisticData.put(getKey("productFeed"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<ProductFeedCreateUserError> getUserErrors() {
        return (List<ProductFeedCreateUserError>) get("userErrors");
    }

    public ProductFeedCreatePayload setUserErrors(List<ProductFeedCreateUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "productFeed": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

