// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The header cart link customizations.
*/
public class CheckoutBrandingHeaderCartLink extends AbstractResponse<CheckoutBrandingHeaderCartLink> {
    public CheckoutBrandingHeaderCartLink() {
    }

    public CheckoutBrandingHeaderCartLink(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "contentType": {
                    CheckoutBrandingCartLinkContentType optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = CheckoutBrandingCartLinkContentType.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "image": {
                    Image optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Image(jsonAsObject(field.getValue(), key));
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
        return "CheckoutBrandingHeaderCartLink";
    }

    /**
    * The content type for the header back to cart link in 1-page checkout. Setting this to image will
    * render the custom image provided using the image field on the header cart_link object. If no image
    * is provided, the default cart icon will be used.
    */

    public CheckoutBrandingCartLinkContentType getContentType() {
        return (CheckoutBrandingCartLinkContentType) get("contentType");
    }

    public CheckoutBrandingHeaderCartLink setContentType(CheckoutBrandingCartLinkContentType arg) {
        optimisticData.put(getKey("contentType"), arg);
        return this;
    }

    /**
    * The image that's used for the header back to cart link in 1-page checkout when the content type is
    * set to image.
    */

    public Image getImage() {
        return (Image) get("image");
    }

    public CheckoutBrandingHeaderCartLink setImage(Image arg) {
        optimisticData.put(getKey("image"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "contentType": return false;

            case "image": return true;

            default: return false;
        }
    }
}

