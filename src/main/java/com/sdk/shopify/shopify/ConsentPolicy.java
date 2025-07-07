// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A consent policy describes the level of consent that the merchant requires from the user before
* actually
* collecting and processing the data.
*/
public class ConsentPolicy extends AbstractResponse<ConsentPolicy> implements Node {
    public ConsentPolicy() {
    }

    public ConsentPolicy(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "consentRequired": {
                    Boolean optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsBoolean(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "countryCode": {
                    PrivacyCountryCode optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = PrivacyCountryCode.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "dataSaleOptOutRequired": {
                    Boolean optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsBoolean(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

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

                case "shopId": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

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

    public ConsentPolicy(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "ConsentPolicy";
    }

    /**
    * Whether consent is required for the region.
    */

    public Boolean getConsentRequired() {
        return (Boolean) get("consentRequired");
    }

    public ConsentPolicy setConsentRequired(Boolean arg) {
        optimisticData.put(getKey("consentRequired"), arg);
        return this;
    }

    /**
    * The `ISO 3166` country code for which the policy applies.
    */

    public PrivacyCountryCode getCountryCode() {
        return (PrivacyCountryCode) get("countryCode");
    }

    public ConsentPolicy setCountryCode(PrivacyCountryCode arg) {
        optimisticData.put(getKey("countryCode"), arg);
        return this;
    }

    /**
    * Whether data sale opt-out is required for the region.
    */

    public Boolean getDataSaleOptOutRequired() {
        return (Boolean) get("dataSaleOptOutRequired");
    }

    public ConsentPolicy setDataSaleOptOutRequired(Boolean arg) {
        optimisticData.put(getKey("dataSaleOptOutRequired"), arg);
        return this;
    }

    /**
    * The global ID of the consent policy. IDs prefixed with `SD-` are system default policies.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The `ISO 3166` region code for which the policy applies.
    */

    public String getRegionCode() {
        return (String) get("regionCode");
    }

    public ConsentPolicy setRegionCode(String arg) {
        optimisticData.put(getKey("regionCode"), arg);
        return this;
    }

    /**
    * The global ID of the shop that owns the policy.
    */

    public ID getShopId() {
        return (ID) get("shopId");
    }

    public ConsentPolicy setShopId(ID arg) {
        optimisticData.put(getKey("shopId"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "consentRequired": return false;

            case "countryCode": return false;

            case "dataSaleOptOutRequired": return false;

            case "id": return false;

            case "regionCode": return false;

            case "shopId": return false;

            default: return false;
        }
    }
}

