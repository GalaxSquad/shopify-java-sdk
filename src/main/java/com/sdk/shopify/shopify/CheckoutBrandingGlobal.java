// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The global customizations.
*/
public class CheckoutBrandingGlobal extends AbstractResponse<CheckoutBrandingGlobal> {
    public CheckoutBrandingGlobal() {
    }

    public CheckoutBrandingGlobal(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "cornerRadius": {
                    CheckoutBrandingGlobalCornerRadius optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = CheckoutBrandingGlobalCornerRadius.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "typography": {
                    CheckoutBrandingTypographyStyleGlobal optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CheckoutBrandingTypographyStyleGlobal(jsonAsObject(field.getValue(), key));
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
        return "CheckoutBrandingGlobal";
    }

    /**
    * The global corner radius setting that overrides all other [corner
    * radius](https://shopify.dev/docs/api/admin-graphql/latest/enums/CheckoutBrandingCornerRadius)
    * customizations.
    */

    public CheckoutBrandingGlobalCornerRadius getCornerRadius() {
        return (CheckoutBrandingGlobalCornerRadius) get("cornerRadius");
    }

    public CheckoutBrandingGlobal setCornerRadius(CheckoutBrandingGlobalCornerRadius arg) {
        optimisticData.put(getKey("cornerRadius"), arg);
        return this;
    }

    /**
    * The global typography customizations.
    */

    public CheckoutBrandingTypographyStyleGlobal getTypography() {
        return (CheckoutBrandingTypographyStyleGlobal) get("typography");
    }

    public CheckoutBrandingGlobal setTypography(CheckoutBrandingTypographyStyleGlobal arg) {
        optimisticData.put(getKey("typography"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "cornerRadius": return false;

            case "typography": return true;

            default: return false;
        }
    }
}

