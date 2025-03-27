// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A product and the subset of associated variants that are part of this delivery profile.
*/
public class DeliveryProfileItem extends AbstractResponse<DeliveryProfileItem> implements Node {
    public DeliveryProfileItem() {
    }

    public DeliveryProfileItem(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "product": {
                    responseData.put(key, new Product(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "variants": {
                    responseData.put(key, new ProductVariantConnection(jsonAsObject(field.getValue(), key)));

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

    public DeliveryProfileItem(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "DeliveryProfileItem";
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * A product associated with this profile.
    */

    public Product getProduct() {
        return (Product) get("product");
    }

    public DeliveryProfileItem setProduct(Product arg) {
        optimisticData.put(getKey("product"), arg);
        return this;
    }

    /**
    * The product variants associated with this delivery profile.
    */

    public ProductVariantConnection getVariants() {
        return (ProductVariantConnection) get("variants");
    }

    public DeliveryProfileItem setVariants(ProductVariantConnection arg) {
        optimisticData.put(getKey("variants"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "product": return true;

            case "variants": return true;

            default: return false;
        }
    }
}

