// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Tax app configuration of a merchant.
*/
public class TaxAppConfiguration extends AbstractResponse<TaxAppConfiguration> {
    public TaxAppConfiguration() {
    }

    public TaxAppConfiguration(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "state": {
                    responseData.put(key, TaxPartnerState.fromGraphQl(jsonAsString(field.getValue(), key)));

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
        return "TaxAppConfiguration";
    }

    /**
    * State of the tax app configuration.
    */

    public TaxPartnerState getState() {
        return (TaxPartnerState) get("state");
    }

    public TaxAppConfiguration setState(TaxPartnerState arg) {
        optimisticData.put(getKey("state"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "state": return false;

            default: return false;
        }
    }
}

