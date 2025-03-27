// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Provides the capabilities of a metaobject.
*/
public class MetaobjectCapabilityData extends AbstractResponse<MetaobjectCapabilityData> {
    public MetaobjectCapabilityData() {
    }

    public MetaobjectCapabilityData(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "onlineStore": {
                    MetaobjectCapabilityDataOnlineStore optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MetaobjectCapabilityDataOnlineStore(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "publishable": {
                    MetaobjectCapabilityDataPublishable optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MetaobjectCapabilityDataPublishable(jsonAsObject(field.getValue(), key));
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
        return "MetaobjectCapabilityData";
    }

    /**
    * The Online Store capability for this metaobject.
    */

    public MetaobjectCapabilityDataOnlineStore getOnlineStore() {
        return (MetaobjectCapabilityDataOnlineStore) get("onlineStore");
    }

    public MetaobjectCapabilityData setOnlineStore(MetaobjectCapabilityDataOnlineStore arg) {
        optimisticData.put(getKey("onlineStore"), arg);
        return this;
    }

    /**
    * The publishable capability for this metaobject.
    */

    public MetaobjectCapabilityDataPublishable getPublishable() {
        return (MetaobjectCapabilityDataPublishable) get("publishable");
    }

    public MetaobjectCapabilityData setPublishable(MetaobjectCapabilityDataPublishable arg) {
        optimisticData.put(getKey("publishable"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "onlineStore": return true;

            case "publishable": return true;

            default: return false;
        }
    }
}

