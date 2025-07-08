// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A country or region code.
*/
public class ConsentPolicyRegion extends AbstractResponse<ConsentPolicyRegion> {
    public ConsentPolicyRegion() {
    }

    public ConsentPolicyRegion(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "countryCode": {
                    PrivacyCountryCode optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = PrivacyCountryCode.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "regionCode": {
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
        return "ConsentPolicyRegion";
    }

    /**
    * The `ISO 3166` country code for which the policy applies.
    */

    public PrivacyCountryCode getCountryCode() {
        return (PrivacyCountryCode) get("countryCode");
    }

    public ConsentPolicyRegion setCountryCode(PrivacyCountryCode arg) {
        optimisticData.put(getKey("countryCode"), arg);
        return this;
    }

    /**
    * The `ISO 3166` region code for which the policy applies.
    */

    public String getRegionCode() {
        return (String) get("regionCode");
    }

    public ConsentPolicyRegion setRegionCode(String arg) {
        optimisticData.put(getKey("regionCode"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "countryCode": return false;

            case "regionCode": return false;

            default: return false;
        }
    }
}

