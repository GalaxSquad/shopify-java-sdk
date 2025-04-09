// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* An entity that represents details of an asynchronous operation on a product.
*/
public class UnknownProductOperation extends AbstractResponse<UnknownProductOperation> implements ProductOperation {
    public UnknownProductOperation() {
    }

    public UnknownProductOperation(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
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

    public static ProductOperation create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "ProductBundleOperation": {
                return new ProductBundleOperation(fields);
            }

            case "ProductDeleteOperation": {
                return new ProductDeleteOperation(fields);
            }

            case "ProductDuplicateOperation": {
                return new ProductDuplicateOperation(fields);
            }

            case "ProductSetOperation": {
                return new ProductSetOperation(fields);
            }

            default: {
                return new UnknownProductOperation(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    /**
    * The product on which the operation is being performed.
    */

    public Product getProduct() {
        return (Product) get("product");
    }

    public UnknownProductOperation setProduct(Product arg) {
        optimisticData.put(getKey("product"), arg);
        return this;
    }

    /**
    * The status of this operation.
    */

    public ProductOperationStatus getStatus() {
        return (ProductOperationStatus) get("status");
    }

    public UnknownProductOperation setStatus(ProductOperationStatus arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "product": return true;

            case "status": return false;

            default: return false;
        }
    }
}

