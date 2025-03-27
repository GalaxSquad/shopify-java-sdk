// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The Online Store capability for the parent metaobject.
*/
public class MetaobjectCapabilityDataOnlineStore extends AbstractResponse<MetaobjectCapabilityDataOnlineStore> {
    public MetaobjectCapabilityDataOnlineStore() {
    }

    public MetaobjectCapabilityDataOnlineStore(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "templateSuffix": {
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
        return "MetaobjectCapabilityDataOnlineStore";
    }

    /**
    * The theme template used when viewing the metaobject in a store.
    */

    public String getTemplateSuffix() {
        return (String) get("templateSuffix");
    }

    public MetaobjectCapabilityDataOnlineStore setTemplateSuffix(String arg) {
        optimisticData.put(getKey("templateSuffix"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "templateSuffix": return false;

            default: return false;
        }
    }
}

