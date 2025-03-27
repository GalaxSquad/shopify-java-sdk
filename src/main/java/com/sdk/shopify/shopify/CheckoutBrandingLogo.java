// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The store logo customizations.
*/
public class CheckoutBrandingLogo extends AbstractResponse<CheckoutBrandingLogo> {
    public CheckoutBrandingLogo() {
    }

    public CheckoutBrandingLogo(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "image": {
                    Image optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Image(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "maxWidth": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "visibility": {
                    CheckoutBrandingVisibility optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = CheckoutBrandingVisibility.fromGraphQl(jsonAsString(field.getValue(), key));
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
        return "CheckoutBrandingLogo";
    }

    /**
    * The logo image.
    */

    public Image getImage() {
        return (Image) get("image");
    }

    public CheckoutBrandingLogo setImage(Image arg) {
        optimisticData.put(getKey("image"), arg);
        return this;
    }

    /**
    * The maximum width of the logo.
    */

    public Integer getMaxWidth() {
        return (Integer) get("maxWidth");
    }

    public CheckoutBrandingLogo setMaxWidth(Integer arg) {
        optimisticData.put(getKey("maxWidth"), arg);
        return this;
    }

    /**
    * The visibility of the logo.
    */

    public CheckoutBrandingVisibility getVisibility() {
        return (CheckoutBrandingVisibility) get("visibility");
    }

    public CheckoutBrandingLogo setVisibility(CheckoutBrandingVisibility arg) {
        optimisticData.put(getKey("visibility"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "image": return true;

            case "maxWidth": return false;

            case "visibility": return false;

            default: return false;
        }
    }
}

