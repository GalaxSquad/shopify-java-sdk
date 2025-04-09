// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The Online Store capability data for the metaobject definition.
*/
public class MetaobjectCapabilityDefinitionDataOnlineStore extends AbstractResponse<MetaobjectCapabilityDefinitionDataOnlineStore> {
    public MetaobjectCapabilityDefinitionDataOnlineStore() {
    }

    public MetaobjectCapabilityDefinitionDataOnlineStore(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "canCreateRedirects": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "urlHandle": {
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

    public String getGraphQlTypeName() {
        return "MetaobjectCapabilityDefinitionDataOnlineStore";
    }

    /**
    * Flag indicating if a sufficient number of redirects are available to redirect all published entries.
    */

    public Boolean getCanCreateRedirects() {
        return (Boolean) get("canCreateRedirects");
    }

    public MetaobjectCapabilityDefinitionDataOnlineStore setCanCreateRedirects(Boolean arg) {
        optimisticData.put(getKey("canCreateRedirects"), arg);
        return this;
    }

    /**
    * The URL handle for accessing pages of this metaobject type in the Online Store.
    */

    public String getUrlHandle() {
        return (String) get("urlHandle");
    }

    public MetaobjectCapabilityDefinitionDataOnlineStore setUrlHandle(String arg) {
        optimisticData.put(getKey("urlHandle"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "canCreateRedirects": return false;

            case "urlHandle": return false;

            default: return false;
        }
    }
}

