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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Return type for `productVariantRelationshipBulkUpdate` mutation.
*/
public class ProductVariantRelationshipBulkUpdatePayload extends AbstractResponse<ProductVariantRelationshipBulkUpdatePayload> {
    public ProductVariantRelationshipBulkUpdatePayload() {
    }

    public ProductVariantRelationshipBulkUpdatePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "parentProductVariants": {
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
                    List<ProductVariantRelationshipBulkUpdateUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new ProductVariantRelationshipBulkUpdateUserError(jsonAsObject(element1, key)));
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
        return "ProductVariantRelationshipBulkUpdatePayload";
    }

    /**
    * The product variants with successfully updated product variant relationships.
    */

    public List<ProductVariant> getParentProductVariants() {
        return (List<ProductVariant>) get("parentProductVariants");
    }

    public ProductVariantRelationshipBulkUpdatePayload setParentProductVariants(List<ProductVariant> arg) {
        optimisticData.put(getKey("parentProductVariants"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<ProductVariantRelationshipBulkUpdateUserError> getUserErrors() {
        return (List<ProductVariantRelationshipBulkUpdateUserError>) get("userErrors");
    }

    public ProductVariantRelationshipBulkUpdatePayload setUserErrors(List<ProductVariantRelationshipBulkUpdateUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "parentProductVariants": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

