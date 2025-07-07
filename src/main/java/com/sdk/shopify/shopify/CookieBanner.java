// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* A shop's banner settings.
*/
public class CookieBanner extends AbstractResponse<CookieBanner> implements HasPublishedTranslations {
    public CookieBanner() {
    }

    public CookieBanner(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "autoManaged": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "enabled": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "translations": {
                    List<Translation> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new Translation(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

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
        return "CookieBanner";
    }

    /**
    * Indicates if the banner is auto managed.
    */

    public Boolean getAutoManaged() {
        return (Boolean) get("autoManaged");
    }

    public CookieBanner setAutoManaged(Boolean arg) {
        optimisticData.put(getKey("autoManaged"), arg);
        return this;
    }

    /**
    * Indicates if the banner is enabled.
    */

    public Boolean getEnabled() {
        return (Boolean) get("enabled");
    }

    public CookieBanner setEnabled(Boolean arg) {
        optimisticData.put(getKey("enabled"), arg);
        return this;
    }

    /**
    * The published translations associated with the resource.
    */

    public List<Translation> getTranslations() {
        return (List<Translation>) get("translations");
    }

    public CookieBanner setTranslations(List<Translation> arg) {
        optimisticData.put(getKey("translations"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "autoManaged": return false;

            case "enabled": return false;

            case "translations": return true;

            default: return false;
        }
    }
}

