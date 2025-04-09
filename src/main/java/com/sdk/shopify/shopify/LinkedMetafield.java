// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The identifier for the metafield linked to this option.
* This API is currently in early access. See [Metafield-linked product
* options](https://shopify.dev/docs/api/admin/migrate/new-product-model/metafield-linked) for more
* details.
*/
public class LinkedMetafield extends AbstractResponse<LinkedMetafield> {
    public LinkedMetafield() {
    }

    public LinkedMetafield(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "key": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "namespace": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
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
        return "LinkedMetafield";
    }

    /**
    * Key of the metafield the option is linked to.
    */

    public String getKey() {
        return (String) get("key");
    }

    public LinkedMetafield setKey(String arg) {
        optimisticData.put(getKey("key"), arg);
        return this;
    }

    /**
    * Namespace of the metafield the option is linked to.
    */

    public String getNamespace() {
        return (String) get("namespace");
    }

    public LinkedMetafield setNamespace(String arg) {
        optimisticData.put(getKey("namespace"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "key": return false;

            case "namespace": return false;

            default: return false;
        }
    }
}

