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
* Return type for `productVariantAppendMedia` mutation.
*/
public class ProductVariantAppendMediaPayload extends AbstractResponse<ProductVariantAppendMediaPayload> {
    public ProductVariantAppendMediaPayload() {
    }

    public ProductVariantAppendMediaPayload(JsonObject fields) throws SchemaViolationError {
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
                    List<MediaUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new MediaUserError(jsonAsObject(element1, key)));
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
        return "ProductVariantAppendMediaPayload";
    }

    /**
    * The product associated with the variants and media.
    */

    public Product getProduct() {
        return (Product) get("product");
    }

    public ProductVariantAppendMediaPayload setProduct(Product arg) {
        optimisticData.put(getKey("product"), arg);
        return this;
    }

    /**
    * The product variants that were updated.
    */

    public List<ProductVariant> getProductVariants() {
        return (List<ProductVariant>) get("productVariants");
    }

    public ProductVariantAppendMediaPayload setProductVariants(List<ProductVariant> arg) {
        optimisticData.put(getKey("productVariants"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<MediaUserError> getUserErrors() {
        return (List<MediaUserError>) get("userErrors");
    }

    public ProductVariantAppendMediaPayload setUserErrors(List<MediaUserError> arg) {
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

