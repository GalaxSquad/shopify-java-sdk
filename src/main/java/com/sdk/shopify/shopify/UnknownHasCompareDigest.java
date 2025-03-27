// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents a summary of the current version of data in a resource.
* The `compare_digest` field can be used as input for mutations that implement a compare-and-swap
* mechanism.
*/
public class UnknownHasCompareDigest extends AbstractResponse<UnknownHasCompareDigest> implements HasCompareDigest {
    public UnknownHasCompareDigest() {
    }

    public UnknownHasCompareDigest(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "compareDigest": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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

    public static HasCompareDigest create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "Metafield": {
                return new Metafield(fields);
            }

            default: {
                return new UnknownHasCompareDigest(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    /**
    * The data stored in the resource, represented as a digest.
    */

    public String getCompareDigest() {
        return (String) get("compareDigest");
    }

    public UnknownHasCompareDigest setCompareDigest(String arg) {
        optimisticData.put(getKey("compareDigest"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "compareDigest": return false;

            default: return false;
        }
    }
}

