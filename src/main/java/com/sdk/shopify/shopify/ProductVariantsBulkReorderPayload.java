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
* Return type for `productVariantsBulkReorder` mutation.
*/
public class ProductVariantsBulkReorderPayload extends AbstractResponse<ProductVariantsBulkReorderPayload> {
    public ProductVariantsBulkReorderPayload() {
    }

    public ProductVariantsBulkReorderPayload(JsonObject fields) throws SchemaViolationError {
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
                    List<ProductVariantsBulkReorderUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new ProductVariantsBulkReorderUserError(jsonAsObject(element1, key)));
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
        return "ProductVariantsBulkReorderPayload";
    }

    /**
    * The updated product.
    */

    public Product getProduct() {
        return (Product) get("product");
    }

    public ProductVariantsBulkReorderPayload setProduct(Product arg) {
        optimisticData.put(getKey("product"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<ProductVariantsBulkReorderUserError> getUserErrors() {
        return (List<ProductVariantsBulkReorderUserError>) get("userErrors");
    }

    public ProductVariantsBulkReorderPayload setUserErrors(List<ProductVariantsBulkReorderUserError> arg) {
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

