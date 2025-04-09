// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The merchandise thumbnails customizations.
*/
public class CheckoutBrandingMerchandiseThumbnail extends AbstractResponse<CheckoutBrandingMerchandiseThumbnail> {
    public CheckoutBrandingMerchandiseThumbnail() {
    }

    public CheckoutBrandingMerchandiseThumbnail(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "badge": {
                    CheckoutBrandingMerchandiseThumbnailBadge optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBrandingMerchandiseThumbnailBadge(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "border": {
                    CheckoutBrandingSimpleBorder optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = CheckoutBrandingSimpleBorder.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "cornerRadius": {
                    CheckoutBrandingCornerRadius optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = CheckoutBrandingCornerRadius.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "fit": {
                    CheckoutBrandingObjectFit optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = CheckoutBrandingObjectFit.fromGraphQl(jsonAsString(field.getValue(), key));
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
        return "CheckoutBrandingMerchandiseThumbnail";
    }

    /**
    * The settings for the merchandise thumbnail badge.
    */

    public CheckoutBrandingMerchandiseThumbnailBadge getBadge() {
        return (CheckoutBrandingMerchandiseThumbnailBadge) get("badge");
    }

    public CheckoutBrandingMerchandiseThumbnail setBadge(CheckoutBrandingMerchandiseThumbnailBadge arg) {
        optimisticData.put(getKey("badge"), arg);
        return this;
    }

    /**
    * The border used for merchandise thumbnails.
    */

    public CheckoutBrandingSimpleBorder getBorder() {
        return (CheckoutBrandingSimpleBorder) get("border");
    }

    public CheckoutBrandingMerchandiseThumbnail setBorder(CheckoutBrandingSimpleBorder arg) {
        optimisticData.put(getKey("border"), arg);
        return this;
    }

    /**
    * The corner radius used for merchandise thumbnails.
    */

    public CheckoutBrandingCornerRadius getCornerRadius() {
        return (CheckoutBrandingCornerRadius) get("cornerRadius");
    }

    public CheckoutBrandingMerchandiseThumbnail setCornerRadius(CheckoutBrandingCornerRadius arg) {
        optimisticData.put(getKey("cornerRadius"), arg);
        return this;
    }

    /**
    * The property used to customize how the product image fits within merchandise thumbnails.
    */

    public CheckoutBrandingObjectFit getFit() {
        return (CheckoutBrandingObjectFit) get("fit");
    }

    public CheckoutBrandingMerchandiseThumbnail setFit(CheckoutBrandingObjectFit arg) {
        optimisticData.put(getKey("fit"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "badge": return true;

            case "border": return false;

            case "cornerRadius": return false;

            case "fit": return false;

            default: return false;
        }
    }
}

