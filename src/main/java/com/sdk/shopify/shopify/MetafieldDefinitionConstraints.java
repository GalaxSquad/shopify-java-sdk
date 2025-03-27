// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.util.Map;

/**
* The
* [constraints](https://shopify.dev/apps/build/custom-data/metafields/conditional-metafield-definition
* s)
* that determine what subtypes of resources a metafield definition applies to.
*/
public class MetafieldDefinitionConstraints extends AbstractResponse<MetafieldDefinitionConstraints> {
    public MetafieldDefinitionConstraints() {
    }

    public MetafieldDefinitionConstraints(JsonObject fields) throws SchemaViolationError {
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

                case "values": {
                    responseData.put(key, new MetafieldDefinitionConstraintValueConnection(jsonAsObject(field.getValue(), key)));

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
        return "MetafieldDefinitionConstraints";
    }

    /**
    * The category of resource subtypes that the definition applies to.
    */

    public String getKey() {
        return (String) get("key");
    }

    public MetafieldDefinitionConstraints setKey(String arg) {
        optimisticData.put(getKey("key"), arg);
        return this;
    }

    /**
    * The specific constraint subtype values that the definition applies to.
    */

    public MetafieldDefinitionConstraintValueConnection getValues() {
        return (MetafieldDefinitionConstraintValueConnection) get("values");
    }

    public MetafieldDefinitionConstraints setValues(MetafieldDefinitionConstraintValueConnection arg) {
        optimisticData.put(getKey("values"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "key": return false;

            case "values": return true;

            default: return false;
        }
    }
}

