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
* An entity that represents details of an asynchronous
* [ProductDuplicate](https://shopify.dev/api/admin-graphql/current/mutations/productDuplicate)
* mutation.
* By querying this entity with the
* [productOperation](https://shopify.dev/api/admin-graphql/current/queries/productOperation) query
* using the ID that was returned
* [when the product was
* duplicated](https://shopify.dev/api/admin/migrate/new-product-model/sync-data#create-a-product-with-
* variants-and-options-asynchronously),
* this can be used to check the status of an operation.
* The `status` field indicates whether the operation is `CREATED`, `ACTIVE`, or `COMPLETE`.
* The `product` field provides the details of the original product.
* The `newProduct` field provides the details of the new duplicate of the product.
* The `userErrors` field provides mutation errors that occurred during the operation.
*/
public class ProductDuplicateOperation extends AbstractResponse<ProductDuplicateOperation> implements Node, ProductOperation {
    public ProductDuplicateOperation() {
    }

    public ProductDuplicateOperation(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

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

                case "product": {
                    Product optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Product(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "status": {
                    responseData.put(key, ProductOperationStatus.fromGraphQl(jsonAsString(field.getValue(), key)));

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

    public ProductDuplicateOperation(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "ProductDuplicateOperation";
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The newly created duplicate of the original product.
    */

    public Product getNewProduct() {
        return (Product) get("newProduct");
    }

    public ProductDuplicateOperation setNewProduct(Product arg) {
        optimisticData.put(getKey("newProduct"), arg);
        return this;
    }

    /**
    * The product on which the operation is being performed.
    */

    public Product getProduct() {
        return (Product) get("product");
    }

    public ProductDuplicateOperation setProduct(Product arg) {
        optimisticData.put(getKey("product"), arg);
        return this;
    }

    /**
    * The status of this operation.
    */

    public ProductOperationStatus getStatus() {
        return (ProductOperationStatus) get("status");
    }

    public ProductDuplicateOperation setStatus(ProductOperationStatus arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    /**
    * Returns mutation errors occurred during background mutation processing.
    */

    public List<UserError> getUserErrors() {
        return (List<UserError>) get("userErrors");
    }

    public ProductDuplicateOperation setUserErrors(List<UserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "newProduct": return true;

            case "product": return true;

            case "status": return false;

            case "userErrors": return true;

            default: return false;
        }
    }
}

