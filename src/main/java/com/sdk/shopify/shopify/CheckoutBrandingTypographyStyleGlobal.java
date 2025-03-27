// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* The global typography customizations.
*/
public class CheckoutBrandingTypographyStyleGlobal extends AbstractResponse<CheckoutBrandingTypographyStyleGlobal> {
    public CheckoutBrandingTypographyStyleGlobal() {
    }

    public CheckoutBrandingTypographyStyleGlobal(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "kerning": {
                    CheckoutBrandingTypographyKerning optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = CheckoutBrandingTypographyKerning.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "letterCase": {
                    CheckoutBrandingTypographyLetterCase optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = CheckoutBrandingTypographyLetterCase.fromGraphQl(jsonAsString(field.getValue(), key));
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
        return "CheckoutBrandingTypographyStyleGlobal";
    }

    /**
    * The kerning.
    */

    public CheckoutBrandingTypographyKerning getKerning() {
        return (CheckoutBrandingTypographyKerning) get("kerning");
    }

    public CheckoutBrandingTypographyStyleGlobal setKerning(CheckoutBrandingTypographyKerning arg) {
        optimisticData.put(getKey("kerning"), arg);
        return this;
    }

    /**
    * The letter case.
    */

    public CheckoutBrandingTypographyLetterCase getLetterCase() {
        return (CheckoutBrandingTypographyLetterCase) get("letterCase");
    }

    public CheckoutBrandingTypographyStyleGlobal setLetterCase(CheckoutBrandingTypographyLetterCase arg) {
        optimisticData.put(getKey("letterCase"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "kerning": return false;

            case "letterCase": return false;

            default: return false;
        }
    }
}

