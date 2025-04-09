// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The publishable capability for the parent metaobject.
*/
public class MetaobjectCapabilityDataPublishable extends AbstractResponse<MetaobjectCapabilityDataPublishable> {
    public MetaobjectCapabilityDataPublishable() {
    }

    public MetaobjectCapabilityDataPublishable(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "status": {
                    responseData.put(key, MetaobjectStatus.fromGraphQl(jsonAsString(field.getValue(), key)));

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
        return "MetaobjectCapabilityDataPublishable";
    }

    /**
    * The visibility status of this metaobject across all channels.
    */

    public MetaobjectStatus getStatus() {
        return (MetaobjectStatus) get("status");
    }

    public MetaobjectCapabilityDataPublishable setStatus(MetaobjectStatus arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "status": return false;

            default: return false;
        }
    }
}

