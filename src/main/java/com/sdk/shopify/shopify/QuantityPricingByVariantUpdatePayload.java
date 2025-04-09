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
* Return type for `quantityPricingByVariantUpdate` mutation.
*/
public class QuantityPricingByVariantUpdatePayload extends AbstractResponse<QuantityPricingByVariantUpdatePayload> {
    public QuantityPricingByVariantUpdatePayload() {
    }

    public QuantityPricingByVariantUpdatePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
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
                    List<QuantityPricingByVariantUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new QuantityPricingByVariantUserError(jsonAsObject(element1, key)));
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
        return "QuantityPricingByVariantUpdatePayload";
    }

    /**
    * The variants for which quantity pricing was created successfully in the price list.
    */

    public List<ProductVariant> getProductVariants() {
        return (List<ProductVariant>) get("productVariants");
    }

    public QuantityPricingByVariantUpdatePayload setProductVariants(List<ProductVariant> arg) {
        optimisticData.put(getKey("productVariants"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<QuantityPricingByVariantUserError> getUserErrors() {
        return (List<QuantityPricingByVariantUserError>) get("userErrors");
    }

    public QuantityPricingByVariantUpdatePayload setUserErrors(List<QuantityPricingByVariantUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "productVariants": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

