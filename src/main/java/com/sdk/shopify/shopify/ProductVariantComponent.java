// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A product variant component that is included within a bundle.
* These are the individual product variants that make up a bundle product,
* where each component has a specific required quantity.
*/
public class ProductVariantComponent extends AbstractResponse<ProductVariantComponent> implements Node {
    public ProductVariantComponent() {
    }

    public ProductVariantComponent(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "productVariant": {
                    responseData.put(key, new ProductVariant(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "quantity": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

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

    public ProductVariantComponent(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "ProductVariantComponent";
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The product variant associated with the component.
    */

    public ProductVariant getProductVariant() {
        return (ProductVariant) get("productVariant");
    }

    public ProductVariantComponent setProductVariant(ProductVariant arg) {
        optimisticData.put(getKey("productVariant"), arg);
        return this;
    }

    /**
    * The required quantity of the component.
    */

    public Integer getQuantity() {
        return (Integer) get("quantity");
    }

    public ProductVariantComponent setQuantity(Integer arg) {
        optimisticData.put(getKey("quantity"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "productVariant": return true;

            case "quantity": return false;

            default: return false;
        }
    }
}

