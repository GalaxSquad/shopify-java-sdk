// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The resource referenced by the metafield value.
*/
public class UnknownMetafieldReference extends AbstractResponse<UnknownMetafieldReference> implements MetafieldReference {
    public UnknownMetafieldReference() {
    }

    public UnknownMetafieldReference(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
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

    public static MetafieldReference create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "Collection": {
                return new Collection(fields);
            }

            case "Company": {
                return new Company(fields);
            }

            case "Customer": {
                return new Customer(fields);
            }

            case "GenericFile": {
                return new GenericFile(fields);
            }

            case "MediaImage": {
                return new MediaImage(fields);
            }

            case "Metaobject": {
                return new Metaobject(fields);
            }

            case "Model3d": {
                return new Model3d(fields);
            }

            case "Order": {
                return new Order(fields);
            }

            case "Page": {
                return new Page(fields);
            }

            case "Product": {
                return new Product(fields);
            }

            case "ProductVariant": {
                return new ProductVariant(fields);
            }

            case "TaxonomyValue": {
                return new TaxonomyValue(fields);
            }

            case "Video": {
                return new Video(fields);
            }

            default: {
                return new UnknownMetafieldReference(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            default: return false;
        }
    }
}

