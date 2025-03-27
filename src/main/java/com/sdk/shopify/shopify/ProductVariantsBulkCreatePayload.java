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
* Return type for `productVariantsBulkCreate` mutation.
*/
public class ProductVariantsBulkCreatePayload extends AbstractResponse<ProductVariantsBulkCreatePayload> {
    public ProductVariantsBulkCreatePayload() {
    }

    public ProductVariantsBulkCreatePayload(JsonObject fields) throws SchemaViolationError {
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

                case "productVariants": {
                    List<ProductVariant> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<ProductVariant> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            list1.add(new ProductVariant(jsonAsObject(element1, key)));
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<ProductVariantsBulkCreateUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new ProductVariantsBulkCreateUserError(jsonAsObject(element1, key)));
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
        return "ProductVariantsBulkCreatePayload";
    }

    /**
    * The updated product object.
    */

    public Product getProduct() {
        return (Product) get("product");
    }

    public ProductVariantsBulkCreatePayload setProduct(Product arg) {
        optimisticData.put(getKey("product"), arg);
        return this;
    }

    /**
    * The newly created variants.
    */

    public List<ProductVariant> getProductVariants() {
        return (List<ProductVariant>) get("productVariants");
    }

    public ProductVariantsBulkCreatePayload setProductVariants(List<ProductVariant> arg) {
        optimisticData.put(getKey("productVariants"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<ProductVariantsBulkCreateUserError> getUserErrors() {
        return (List<ProductVariantsBulkCreateUserError>) get("userErrors");
    }

    public ProductVariantsBulkCreatePayload setUserErrors(List<ProductVariantsBulkCreateUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "product": return true;

            case "productVariants": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

