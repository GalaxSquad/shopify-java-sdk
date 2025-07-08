// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A shop's privacy settings.
*/
public class PrivacySettings extends AbstractResponse<PrivacySettings> {
    public PrivacySettings() {
    }

    public PrivacySettings(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "banner": {
                    CookieBanner optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CookieBanner(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "dataSaleOptOutPage": {
                    DataSaleOptOutPage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DataSaleOptOutPage(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "privacyPolicy": {
                    PrivacyPolicy optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PrivacyPolicy(jsonAsObject(field.getValue(), key));
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
        return "PrivacySettings";
    }

    /**
    * Banner customizations for the 'cookie banner'.
    */

    public CookieBanner getBanner() {
        return (CookieBanner) get("banner");
    }

    public PrivacySettings setBanner(CookieBanner arg) {
        optimisticData.put(getKey("banner"), arg);
        return this;
    }

    /**
    * A shop's data sale opt out page (e.g. CCPA).
    */

    public DataSaleOptOutPage getDataSaleOptOutPage() {
        return (DataSaleOptOutPage) get("dataSaleOptOutPage");
    }

    public PrivacySettings setDataSaleOptOutPage(DataSaleOptOutPage arg) {
        optimisticData.put(getKey("dataSaleOptOutPage"), arg);
        return this;
    }

    /**
    * A shop's privacy policy settings.
    */

    public PrivacyPolicy getPrivacyPolicy() {
        return (PrivacyPolicy) get("privacyPolicy");
    }

    public PrivacySettings setPrivacyPolicy(PrivacyPolicy arg) {
        optimisticData.put(getKey("privacyPolicy"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "banner": return true;

            case "dataSaleOptOutPage": return true;

            case "privacyPolicy": return true;

            default: return false;
        }
    }
}

