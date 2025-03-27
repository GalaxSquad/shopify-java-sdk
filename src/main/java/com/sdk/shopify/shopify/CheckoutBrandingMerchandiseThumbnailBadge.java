// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The merchandise thumbnail badges customizations.
*/
public class CheckoutBrandingMerchandiseThumbnailBadge extends AbstractResponse<CheckoutBrandingMerchandiseThumbnailBadge> {
    public CheckoutBrandingMerchandiseThumbnailBadge() {
    }

    public CheckoutBrandingMerchandiseThumbnailBadge(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "background": {
                    CheckoutBrandingMerchandiseThumbnailBadgeBackground optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = CheckoutBrandingMerchandiseThumbnailBadgeBackground.fromGraphQl(jsonAsString(field.getValue(), key));
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
        return "CheckoutBrandingMerchandiseThumbnailBadge";
    }

    /**
    * The background used for merchandise thumbnail badges.
    */

    public CheckoutBrandingMerchandiseThumbnailBadgeBackground getBackground() {
        return (CheckoutBrandingMerchandiseThumbnailBadgeBackground) get("background");
    }

    public CheckoutBrandingMerchandiseThumbnailBadge setBackground(CheckoutBrandingMerchandiseThumbnailBadgeBackground arg) {
        optimisticData.put(getKey("background"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "background": return false;

            default: return false;
        }
    }
}

