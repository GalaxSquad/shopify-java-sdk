// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Access permissions for the definition's metaobjects.
*/
public class MetaobjectAccess extends AbstractResponse<MetaobjectAccess> {
    public MetaobjectAccess() {
    }

    public MetaobjectAccess(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "admin": {
                    responseData.put(key, MetaobjectAdminAccess.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "storefront": {
                    responseData.put(key, MetaobjectStorefrontAccess.fromGraphQl(jsonAsString(field.getValue(), key)));

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
        return "MetaobjectAccess";
    }

    /**
    * The access permitted on the Admin API.
    */

    public MetaobjectAdminAccess getAdmin() {
        return (MetaobjectAdminAccess) get("admin");
    }

    public MetaobjectAccess setAdmin(MetaobjectAdminAccess arg) {
        optimisticData.put(getKey("admin"), arg);
        return this;
    }

    /**
    * The access permitted on the Storefront API.
    */

    public MetaobjectStorefrontAccess getStorefront() {
        return (MetaobjectStorefrontAccess) get("storefront");
    }

    public MetaobjectAccess setStorefront(MetaobjectStorefrontAccess arg) {
        optimisticData.put(getKey("storefront"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "admin": return false;

            case "storefront": return false;

            default: return false;
        }
    }
}

