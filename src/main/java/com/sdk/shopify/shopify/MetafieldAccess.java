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
* Access permissions for the definition's metafields.
*/
public class MetafieldAccess extends AbstractResponse<MetafieldAccess> {
    public MetafieldAccess() {
    }

    public MetafieldAccess(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "admin": {
                    MetafieldAdminAccess optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = MetafieldAdminAccess.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "customerAccount": {
                    responseData.put(key, MetafieldCustomerAccountAccess.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "storefront": {
                    MetafieldStorefrontAccess optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = MetafieldStorefrontAccess.fromGraphQl(jsonAsString(field.getValue(), key));
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
        return "MetafieldAccess";
    }

    /**
    * The access permitted on the Admin API.
    */

    public MetafieldAdminAccess getAdmin() {
        return (MetafieldAdminAccess) get("admin");
    }

    public MetafieldAccess setAdmin(MetafieldAdminAccess arg) {
        optimisticData.put(getKey("admin"), arg);
        return this;
    }

    /**
    * The access permitted on the Customer Account API.
    */

    public MetafieldCustomerAccountAccess getCustomerAccount() {
        return (MetafieldCustomerAccountAccess) get("customerAccount");
    }

    public MetafieldAccess setCustomerAccount(MetafieldCustomerAccountAccess arg) {
        optimisticData.put(getKey("customerAccount"), arg);
        return this;
    }

    /**
    * The access permitted on the Storefront API.
    */

    public MetafieldStorefrontAccess getStorefront() {
        return (MetafieldStorefrontAccess) get("storefront");
    }

    public MetafieldAccess setStorefront(MetafieldStorefrontAccess arg) {
        optimisticData.put(getKey("storefront"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "admin": return false;

            case "customerAccount": return false;

            case "storefront": return false;

            default: return false;
        }
    }
}

