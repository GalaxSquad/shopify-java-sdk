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
* Return type for `productDeleteMedia` mutation.
*/
public class ProductDeleteMediaPayload extends AbstractResponse<ProductDeleteMediaPayload> {
    public ProductDeleteMediaPayload() {
    }

    public ProductDeleteMediaPayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "deletedMediaIds": {
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

                case "deletedProductImageIds": {
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

                case "mediaUserErrors": {
                    List<MediaUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new MediaUserError(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

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
        return "ProductDeleteMediaPayload";
    }

    /**
    * List of media IDs which were deleted.
    */

    public List<ID> getDeletedMediaIds() {
        return (List<ID>) get("deletedMediaIds");
    }

    public ProductDeleteMediaPayload setDeletedMediaIds(List<ID> arg) {
        optimisticData.put(getKey("deletedMediaIds"), arg);
        return this;
    }

    /**
    * List of product image IDs which were deleted.
    */

    public List<ID> getDeletedProductImageIds() {
        return (List<ID>) get("deletedProductImageIds");
    }

    public ProductDeleteMediaPayload setDeletedProductImageIds(List<ID> arg) {
        optimisticData.put(getKey("deletedProductImageIds"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<MediaUserError> getMediaUserErrors() {
        return (List<MediaUserError>) get("mediaUserErrors");
    }

    public ProductDeleteMediaPayload setMediaUserErrors(List<MediaUserError> arg) {
        optimisticData.put(getKey("mediaUserErrors"), arg);
        return this;
    }

    /**
    * The product associated with the deleted media.
    */

    public Product getProduct() {
        return (Product) get("product");
    }

    public ProductDeleteMediaPayload setProduct(Product arg) {
        optimisticData.put(getKey("product"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "deletedMediaIds": return false;

            case "deletedProductImageIds": return false;

            case "mediaUserErrors": return true;

            case "product": return true;

            default: return false;
        }
    }
}

