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
* [ProductBundleCreate](https://shopify.dev/api/admin-graphql/current/mutations/productBundleCreate)
* or
* [ProductBundleUpdate](https://shopify.dev/api/admin-graphql/current/mutations/productBundleUpdate)
* mutation.
* By querying this entity with the
* [productOperation](https://shopify.dev/api/admin-graphql/current/queries/productOperation) query
* using the ID that was returned when the bundle was created or updated, this can be used to check the
* status of an operation.
* The `status` field indicates whether the operation is `CREATED`, `ACTIVE`, or `COMPLETE`.
* The `product` field provides the details of the created or updated product.
* The `userErrors` field provides mutation errors that occurred during the operation.
*/
public class ProductBundleOperation extends AbstractResponse<ProductBundleOperation> implements Node, ProductOperation {
    public ProductBundleOperation() {
    }

    public ProductBundleOperation(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

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
                    List<ProductBundleMutationUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new ProductBundleMutationUserError(jsonAsObject(element1, key)));
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

    public ProductBundleOperation(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "ProductBundleOperation";
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The product on which the operation is being performed.
    */

    public Product getProduct() {
        return (Product) get("product");
    }

    public ProductBundleOperation setProduct(Product arg) {
        optimisticData.put(getKey("product"), arg);
        return this;
    }

    /**
    * The status of this operation.
    */

    public ProductOperationStatus getStatus() {
        return (ProductOperationStatus) get("status");
    }

    public ProductBundleOperation setStatus(ProductOperationStatus arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    /**
    * Returns mutation errors occurred during background mutation processing.
    */

    public List<ProductBundleMutationUserError> getUserErrors() {
        return (List<ProductBundleMutationUserError>) get("userErrors");
    }

    public ProductBundleOperation setUserErrors(List<ProductBundleMutationUserError> arg) {
        optimisticData.put(getKey("userErrors"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "product": return true;

            case "status": return false;

            case "userErrors": return true;

            default: return false;
        }
    }
}

