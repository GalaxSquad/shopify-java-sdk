// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The form controls customizations.
*/
public class CheckoutBrandingControl extends AbstractResponse<CheckoutBrandingControl> {
    public CheckoutBrandingControl() {
    }

    public CheckoutBrandingControl(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "border": {
                    CheckoutBrandingSimpleBorder optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = CheckoutBrandingSimpleBorder.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "color": {
                    CheckoutBrandingColorSelection optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = CheckoutBrandingColorSelection.fromGraphQl(jsonAsString(field.getValue(), key));
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

                case "labelPosition": {
                    CheckoutBrandingLabelPosition optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = CheckoutBrandingLabelPosition.fromGraphQl(jsonAsString(field.getValue(), key));
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
        return "CheckoutBrandingControl";
    }

    /**
    * The border used for form controls.
    */

    public CheckoutBrandingSimpleBorder getBorder() {
        return (CheckoutBrandingSimpleBorder) get("border");
    }

    public CheckoutBrandingControl setBorder(CheckoutBrandingSimpleBorder arg) {
        optimisticData.put(getKey("border"), arg);
        return this;
    }

    /**
    * Set to TRANSPARENT to define transparent form controls. If null, form controls inherit colors from
    * their scheme settings (for example, the main section inherits from
    * `design_system.colors.schemes.scheme1.control` by default). Note that usage of the
    * `customizations.control.color` setting to customize the form control color is deprecated.
    */

    public CheckoutBrandingColorSelection getColor() {
        return (CheckoutBrandingColorSelection) get("color");
    }

    public CheckoutBrandingControl setColor(CheckoutBrandingColorSelection arg) {
        optimisticData.put(getKey("color"), arg);
        return this;
    }

    /**
    * The corner radius used for form controls.
    */

    public CheckoutBrandingCornerRadius getCornerRadius() {
        return (CheckoutBrandingCornerRadius) get("cornerRadius");
    }

    public CheckoutBrandingControl setCornerRadius(CheckoutBrandingCornerRadius arg) {
        optimisticData.put(getKey("cornerRadius"), arg);
        return this;
    }

    /**
    * The label position used for form controls.
    */

    public CheckoutBrandingLabelPosition getLabelPosition() {
        return (CheckoutBrandingLabelPosition) get("labelPosition");
    }

    public CheckoutBrandingControl setLabelPosition(CheckoutBrandingLabelPosition arg) {
        optimisticData.put(getKey("labelPosition"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "border": return false;

            case "color": return false;

            case "cornerRadius": return false;

            case "labelPosition": return false;

            default: return false;
        }
    }
}

