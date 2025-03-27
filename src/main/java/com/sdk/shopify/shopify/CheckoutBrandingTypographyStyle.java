// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.util.Map;

/**
* The typography customizations.
*/
public class CheckoutBrandingTypographyStyle extends AbstractResponse<CheckoutBrandingTypographyStyle> {
    public CheckoutBrandingTypographyStyle() {
    }

    public CheckoutBrandingTypographyStyle(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "font": {
                    CheckoutBrandingTypographyFont optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = CheckoutBrandingTypographyFont.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

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

                case "size": {
                    CheckoutBrandingTypographySize optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = CheckoutBrandingTypographySize.fromGraphQl(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "weight": {
                    CheckoutBrandingTypographyWeight optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = CheckoutBrandingTypographyWeight.fromGraphQl(jsonAsString(field.getValue(), key));
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
        return "CheckoutBrandingTypographyStyle";
    }

    /**
    * The font.
    */

    public CheckoutBrandingTypographyFont getFont() {
        return (CheckoutBrandingTypographyFont) get("font");
    }

    public CheckoutBrandingTypographyStyle setFont(CheckoutBrandingTypographyFont arg) {
        optimisticData.put(getKey("font"), arg);
        return this;
    }

    /**
    * The kerning.
    */

    public CheckoutBrandingTypographyKerning getKerning() {
        return (CheckoutBrandingTypographyKerning) get("kerning");
    }

    public CheckoutBrandingTypographyStyle setKerning(CheckoutBrandingTypographyKerning arg) {
        optimisticData.put(getKey("kerning"), arg);
        return this;
    }

    /**
    * The letter case.
    */

    public CheckoutBrandingTypographyLetterCase getLetterCase() {
        return (CheckoutBrandingTypographyLetterCase) get("letterCase");
    }

    public CheckoutBrandingTypographyStyle setLetterCase(CheckoutBrandingTypographyLetterCase arg) {
        optimisticData.put(getKey("letterCase"), arg);
        return this;
    }

    /**
    * The font size.
    */

    public CheckoutBrandingTypographySize getSize() {
        return (CheckoutBrandingTypographySize) get("size");
    }

    public CheckoutBrandingTypographyStyle setSize(CheckoutBrandingTypographySize arg) {
        optimisticData.put(getKey("size"), arg);
        return this;
    }

    /**
    * The font weight.
    */

    public CheckoutBrandingTypographyWeight getWeight() {
        return (CheckoutBrandingTypographyWeight) get("weight");
    }

    public CheckoutBrandingTypographyStyle setWeight(CheckoutBrandingTypographyWeight arg) {
        optimisticData.put(getKey("weight"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "font": return false;

            case "kerning": return false;

            case "letterCase": return false;

            case "size": return false;

            case "weight": return false;

            default: return false;
        }
    }
}

