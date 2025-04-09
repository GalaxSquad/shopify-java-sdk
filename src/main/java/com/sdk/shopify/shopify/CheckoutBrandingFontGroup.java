// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A font group. To learn more about updating fonts, refer to the
* [checkoutBrandingUpsert](https://shopify.dev/api/admin-graphql/unstable/mutations/checkoutBrandingUp
* sert)
* mutation and the checkout branding [tutorial](https://shopify.dev/docs/apps/checkout/styling).
*/
public class CheckoutBrandingFontGroup extends AbstractResponse<CheckoutBrandingFontGroup> {
    public CheckoutBrandingFontGroup() {
    }

    public CheckoutBrandingFontGroup(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "base": {
                    CheckoutBrandingFont optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownCheckoutBrandingFont.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "bold": {
                    CheckoutBrandingFont optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownCheckoutBrandingFont.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "loadingStrategy": {
                    CheckoutBrandingFontLoadingStrategy optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = CheckoutBrandingFontLoadingStrategy.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "name": {
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
        return "CheckoutBrandingFontGroup";
    }

    /**
    * The base font.
    */

    public CheckoutBrandingFont getBase() {
        return (CheckoutBrandingFont) get("base");
    }

    public CheckoutBrandingFontGroup setBase(CheckoutBrandingFont arg) {
        optimisticData.put(getKey("base"), arg);
        return this;
    }

    /**
    * The bold font.
    */

    public CheckoutBrandingFont getBold() {
        return (CheckoutBrandingFont) get("bold");
    }

    public CheckoutBrandingFontGroup setBold(CheckoutBrandingFont arg) {
        optimisticData.put(getKey("bold"), arg);
        return this;
    }

    /**
    * The font loading strategy.
    */

    public CheckoutBrandingFontLoadingStrategy getLoadingStrategy() {
        return (CheckoutBrandingFontLoadingStrategy) get("loadingStrategy");
    }

    public CheckoutBrandingFontGroup setLoadingStrategy(CheckoutBrandingFontLoadingStrategy arg) {
        optimisticData.put(getKey("loadingStrategy"), arg);
        return this;
    }

    /**
    * The font group name.
    */

    public String getName() {
        return (String) get("name");
    }

    public CheckoutBrandingFontGroup setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "base": return false;

            case "bold": return false;

            case "loadingStrategy": return false;

            case "name": return false;

            default: return false;
        }
    }
}

