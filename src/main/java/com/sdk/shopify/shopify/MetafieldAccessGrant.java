// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* An explicit access grant for the metafields under this definition.
* Explicit grants are
* [deprecated](https://shopify.dev/changelog/deprecating-explicit-access-grants-for-app-owned-metafiel
* ds).
*/
public class MetafieldAccessGrant extends AbstractResponse<MetafieldAccessGrant> {
    public MetafieldAccessGrant() {
    }

    public MetafieldAccessGrant(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "access": {
                    responseData.put(key, MetafieldGrantAccessLevel.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "grantee": {
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
        return "MetafieldAccessGrant";
    }

    /**
    * The level of access the grantee has.
    */

    public MetafieldGrantAccessLevel getAccess() {
        return (MetafieldGrantAccessLevel) get("access");
    }

    public MetafieldAccessGrant setAccess(MetafieldGrantAccessLevel arg) {
        optimisticData.put(getKey("access"), arg);
        return this;
    }

    /**
    * The grantee being granted access.
    */

    public String getGrantee() {
        return (String) get("grantee");
    }

    public MetafieldAccessGrant setGrantee(String arg) {
        optimisticData.put(getKey("grantee"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "access": return false;

            case "grantee": return false;

            default: return false;
        }
    }
}

