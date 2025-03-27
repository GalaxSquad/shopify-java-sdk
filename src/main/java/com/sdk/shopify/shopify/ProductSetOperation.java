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
* [ProductSet](https://shopify.dev/api/admin-graphql/current/mutations/productSet) mutation.
* By querying this entity with the
* [productOperation](https://shopify.dev/api/admin-graphql/current/queries/productOperation) query
* using the ID that was returned
* [when the product was created or
* updated](https://shopify.dev/api/admin/migrate/new-product-model/sync-data#create-a-product-with-var
* iants-and-options-asynchronously),
* this can be used to check the status of an operation.
* The `status` field indicates whether the operation is `CREATED`, `ACTIVE`, or `COMPLETE`.
* The `product` field provides the details of the created or updated product.
* The `userErrors` field provides mutation errors that occurred during the operation.
*/
public class ProductSetOperation extends AbstractResponse<ProductSetOperation> implements Node, ProductOperation {
    public ProductSetOperation() {
    }

    public ProductSetOperation(JsonObject fields) throws SchemaViolationError {
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
                    List<ProductSetUserError> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new ProductSetUserError(jsonAsObject(element1, key)));
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

    public ProductSetOperation(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "ProductSetOperation";
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

    public ProductSetOperation setProduct(Product arg) {
        optimisticData.put(getKey("product"), arg);
        return this;
    }

    /**
    * The status of this operation.
    */

    public ProductOperationStatus getStatus() {
        return (ProductOperationStatus) get("status");
    }

    public ProductSetOperation setStatus(ProductOperationStatus arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    /**
    * Returns mutation errors occurred during background mutation processing.
    */

    public List<ProductSetUserError> getUserErrors() {
        return (List<ProductSetUserError>) get("userErrors");
    }

    public ProductSetOperation setUserErrors(List<ProductSetUserError> arg) {
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

