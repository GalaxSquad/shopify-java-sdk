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
* Return type for `productVariantsBulkDelete` mutation.
*/
public class ProductVariantsBulkDeletePayload extends AbstractResponse<ProductVariantsBulkDeletePayload> {
    public ProductVariantsBulkDeletePayload() {
    }

    public ProductVariantsBulkDeletePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "product": {
                    Product optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Product(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<ProductVariantsBulkDeleteUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new ProductVariantsBulkDeleteUserError(jsonAsObject(element1, key)));
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
        return "ProductVariantsBulkDeletePayload";
    }

    /**
    * The updated product object.
    */

    public Product getProduct() {
        return (Product) get("product");
    }

    public ProductVariantsBulkDeletePayload setProduct(Product arg) {
        optimisticData.put(getKey("product"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<ProductVariantsBulkDeleteUserError> getUserErrors() {
        return (List<ProductVariantsBulkDeleteUserError>) get("userErrors");
    }

    public ProductVariantsBulkDeletePayload setUserErrors(List<ProductVariantsBulkDeleteUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "product": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

