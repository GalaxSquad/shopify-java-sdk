// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* Return type for `productOptionsDelete` mutation.
*/
public class ProductOptionsDeletePayload extends AbstractResponse<ProductOptionsDeletePayload> {
    public ProductOptionsDeletePayload() {
    }

    public ProductOptionsDeletePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "deletedOptionsIds": {
                    List<ID> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<ID> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            list1.add(new ID(jsonAsString(element1, key)));
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "product": {
                    Product optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Product(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "userErrors": {
                    List<ProductOptionsDeleteUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new ProductOptionsDeleteUserError(jsonAsObject(element1, key)));
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
        return "ProductOptionsDeletePayload";
    }

    /**
    * IDs of the options deleted.
    */

    public List<ID> getDeletedOptionsIds() {
        return (List<ID>) get("deletedOptionsIds");
    }

    public ProductOptionsDeletePayload setDeletedOptionsIds(List<ID> arg) {
        optimisticData.put(getKey("deletedOptionsIds"), arg);
        return this;
    }

    /**
    * The updated product object.
    */

    public Product getProduct() {
        return (Product) get("product");
    }

    public ProductOptionsDeletePayload setProduct(Product arg) {
        optimisticData.put(getKey("product"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<ProductOptionsDeleteUserError> getUserErrors() {
        return (List<ProductOptionsDeleteUserError>) get("userErrors");
    }

    public ProductOptionsDeletePayload setUserErrors(List<ProductOptionsDeleteUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "deletedOptionsIds": return false;

            case "product": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

