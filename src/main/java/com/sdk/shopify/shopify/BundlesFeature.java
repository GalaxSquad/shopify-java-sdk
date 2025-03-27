// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents the Bundles feature configuration for the shop.
*/
public class BundlesFeature extends AbstractResponse<BundlesFeature> {
    public BundlesFeature() {
    }

    public BundlesFeature(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "eligibleForBundles": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "ineligibilityReason": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "sellsBundles": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

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
        return "BundlesFeature";
    }

    /**
    * Whether a shop is configured properly to sell bundles.
    */

    public Boolean getEligibleForBundles() {
        return (Boolean) get("eligibleForBundles");
    }

    public BundlesFeature setEligibleForBundles(Boolean arg) {
        optimisticData.put(getKey("eligibleForBundles"), arg);
        return this;
    }

    /**
    * The reason why a shop is not eligible for bundles.
    */

    public String getIneligibilityReason() {
        return (String) get("ineligibilityReason");
    }

    public BundlesFeature setIneligibilityReason(String arg) {
        optimisticData.put(getKey("ineligibilityReason"), arg);
        return this;
    }

    /**
    * Whether a shop has any fixed bundle products or has a cartTransform function installed.
    */

    public Boolean getSellsBundles() {
        return (Boolean) get("sellsBundles");
    }

    public BundlesFeature setSellsBundles(Boolean arg) {
        optimisticData.put(getKey("sellsBundles"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "eligibleForBundles": return false;

            case "ineligibilityReason": return false;

            case "sellsBundles": return false;

            default: return false;
        }
    }
}

