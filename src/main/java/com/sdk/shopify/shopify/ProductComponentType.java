// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The product component information.
*/
public class ProductComponentType extends AbstractResponse<ProductComponentType> {
    public ProductComponentType() {
    }

    public ProductComponentType(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "componentVariants": {
                    responseData.put(key, new ProductVariantConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "componentVariantsCount": {
                    Count optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Count(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "nonComponentVariants": {
                    responseData.put(key, new ProductVariantConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "nonComponentVariantsCount": {
                    Count optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Count(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "product": {
                    responseData.put(key, new Product(jsonAsObject(field.getValue(), key)));

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
        return "ProductComponentType";
    }

    /**
    * The list of products' variants that are components.
    */

    public ProductVariantConnection getComponentVariants() {
        return (ProductVariantConnection) get("componentVariants");
    }

    public ProductComponentType setComponentVariants(ProductVariantConnection arg) {
        optimisticData.put(getKey("componentVariants"), arg);
        return this;
    }

    /**
    * The number of component variants for the product component.
    */

    public Count getComponentVariantsCount() {
        return (Count) get("componentVariantsCount");
    }

    public ProductComponentType setComponentVariantsCount(Count arg) {
        optimisticData.put(getKey("componentVariantsCount"), arg);
        return this;
    }

    /**
    * The list of products' variants that are not components.
    */

    public ProductVariantConnection getNonComponentVariants() {
        return (ProductVariantConnection) get("nonComponentVariants");
    }

    public ProductComponentType setNonComponentVariants(ProductVariantConnection arg) {
        optimisticData.put(getKey("nonComponentVariants"), arg);
        return this;
    }

    /**
    * The number of non_components variants for the product component.
    */

    public Count getNonComponentVariantsCount() {
        return (Count) get("nonComponentVariantsCount");
    }

    public ProductComponentType setNonComponentVariantsCount(Count arg) {
        optimisticData.put(getKey("nonComponentVariantsCount"), arg);
        return this;
    }

    /**
    * The product that's a component.
    */

    public Product getProduct() {
        return (Product) get("product");
    }

    public ProductComponentType setProduct(Product arg) {
        optimisticData.put(getKey("product"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "componentVariants": return true;

            case "componentVariantsCount": return true;

            case "nonComponentVariants": return true;

            case "nonComponentVariantsCount": return true;

            case "product": return true;

            default: return false;
        }
    }
}

