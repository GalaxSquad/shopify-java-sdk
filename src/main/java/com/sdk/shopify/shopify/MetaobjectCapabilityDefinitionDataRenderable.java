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
* The renderable capability data for the metaobject definition.
*/
public class MetaobjectCapabilityDefinitionDataRenderable extends AbstractResponse<MetaobjectCapabilityDefinitionDataRenderable> {
    public MetaobjectCapabilityDefinitionDataRenderable() {
    }

    public MetaobjectCapabilityDefinitionDataRenderable(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "metaDescriptionKey": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "metaTitleKey": {
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
        return "MetaobjectCapabilityDefinitionDataRenderable";
    }

    /**
    * The metaobject field used as an alias for the SEO page description.
    */

    public String getMetaDescriptionKey() {
        return (String) get("metaDescriptionKey");
    }

    public MetaobjectCapabilityDefinitionDataRenderable setMetaDescriptionKey(String arg) {
        optimisticData.put(getKey("metaDescriptionKey"), arg);
        return this;
    }

    /**
    * The metaobject field used as an alias for the SEO page title.
    */

    public String getMetaTitleKey() {
        return (String) get("metaTitleKey");
    }

    public MetaobjectCapabilityDefinitionDataRenderable setMetaTitleKey(String arg) {
        optimisticData.put(getKey("metaTitleKey"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "metaDescriptionKey": return false;

            case "metaTitleKey": return false;

            default: return false;
        }
    }
}

