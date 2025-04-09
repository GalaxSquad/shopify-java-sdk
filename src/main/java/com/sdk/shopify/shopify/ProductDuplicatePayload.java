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
* Return type for `productDuplicate` mutation.
*/
public class ProductDuplicatePayload extends AbstractResponse<ProductDuplicatePayload> {
    public ProductDuplicatePayload() {
    }

    public ProductDuplicatePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "imageJob": {
                    Job optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Job(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "newProduct": {
                    Product optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Product(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "productDuplicateOperation": {
                    ProductDuplicateOperation optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ProductDuplicateOperation(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "shop": {
                    responseData.put(key, new Shop(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "userErrors": {
                    List<UserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new UserError(jsonAsObject(element1, key)));
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
        return "ProductDuplicatePayload";
    }

    /**
    * The asynchronous job that duplicates the product images.
    */

    public Job getImageJob() {
        return (Job) get("imageJob");
    }

    public ProductDuplicatePayload setImageJob(Job arg) {
        optimisticData.put(getKey("imageJob"), arg);
        return this;
    }

    /**
    * The duplicated product.
    */

    public Product getNewProduct() {
        return (Product) get("newProduct");
    }

    public ProductDuplicatePayload setNewProduct(Product arg) {
        optimisticData.put(getKey("newProduct"), arg);
        return this;
    }

    /**
    * The product duplicate operation, returned when run in asynchronous mode.
    */

    public ProductDuplicateOperation getProductDuplicateOperation() {
        return (ProductDuplicateOperation) get("productDuplicateOperation");
    }

    public ProductDuplicatePayload setProductDuplicateOperation(ProductDuplicateOperation arg) {
        optimisticData.put(getKey("productDuplicateOperation"), arg);
        return this;
    }

    /**
    * The user's shop.
    */

    public Shop getShop() {
        return (Shop) get("shop");
    }

    public ProductDuplicatePayload setShop(Shop arg) {
        optimisticData.put(getKey("shop"), arg);
        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */

    public List<UserError> getUserErrors() {
        return (List<UserError>) get("userErrors");
    }

    public ProductDuplicatePayload setUserErrors(List<UserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "imageJob": return true;

            case "newProduct": return true;

            case "productDuplicateOperation": return true;

            case "shop": return true;

            case "userErrors": return true;

            default: return false;
        }
    }
}

