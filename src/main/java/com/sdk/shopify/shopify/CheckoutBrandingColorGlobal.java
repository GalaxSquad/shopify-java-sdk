// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A set of colors for customizing the overall look and feel of the checkout.
*/
public class CheckoutBrandingColorGlobal extends AbstractResponse<CheckoutBrandingColorGlobal> {
    public CheckoutBrandingColorGlobal() {
    }

    public CheckoutBrandingColorGlobal(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "accent": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "brand": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "critical": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "decorative": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "info": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "success": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "warning": {
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
        return "CheckoutBrandingColorGlobal";
    }

    /**
    * A color used for interaction, like links and focus states.
    */

    public String getAccent() {
        return (String) get("accent");
    }

    public CheckoutBrandingColorGlobal setAccent(String arg) {
        optimisticData.put(getKey("accent"), arg);
        return this;
    }

    /**
    * A color that's strongly associated with the merchant. Currently used for
    * primary buttons, for example **Pay now**, and secondary buttons, for example **Buy again**.
    */

    public String getBrand() {
        return (String) get("brand");
    }

    public CheckoutBrandingColorGlobal setBrand(String arg) {
        optimisticData.put(getKey("brand"), arg);
        return this;
    }

    /**
    * A semantic color used for components that communicate critical content. For example, a blocking
    * error such as the requirement to enter a valid credit card number.
    */

    public String getCritical() {
        return (String) get("critical");
    }

    public CheckoutBrandingColorGlobal setCritical(String arg) {
        optimisticData.put(getKey("critical"), arg);
        return this;
    }

    /**
    * A color used to highlight certain areas of the user interface. For example, the
    * [`Text`](https://shopify.dev/docs/api/checkout-ui-extensions/latest/components/titles-and-text/text#
    * textprops-propertydetail-appearance) component.
    */

    public String getDecorative() {
        return (String) get("decorative");
    }

    public CheckoutBrandingColorGlobal setDecorative(String arg) {
        optimisticData.put(getKey("decorative"), arg);
        return this;
    }

    /**
    * A semantic color used for components that communicate general, informative content.
    */

    public String getInfo() {
        return (String) get("info");
    }

    public CheckoutBrandingColorGlobal setInfo(String arg) {
        optimisticData.put(getKey("info"), arg);
        return this;
    }

    /**
    * A semantic color used for components that communicate successful actions or a positive state.
    */

    public String getSuccess() {
        return (String) get("success");
    }

    public CheckoutBrandingColorGlobal setSuccess(String arg) {
        optimisticData.put(getKey("success"), arg);
        return this;
    }

    /**
    * A semantic color used for components that display content that requires attention. For example,
    * something that might be wrong, but not blocking.
    */

    public String getWarning() {
        return (String) get("warning");
    }

    public CheckoutBrandingColorGlobal setWarning(String arg) {
        optimisticData.put(getKey("warning"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "accent": return false;

            case "brand": return false;

            case "critical": return false;

            case "decorative": return false;

            case "info": return false;

            case "success": return false;

            case "warning": return false;

            default: return false;
        }
    }
}

