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
* The country and language settings assigned to a domain.
*/
public class DomainLocalization extends AbstractResponse<DomainLocalization> {
    public DomainLocalization() {
    }

    public DomainLocalization(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "alternateLocales": {
                    List<String> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(jsonAsString(element1, key));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "country": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "defaultLocale": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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
        return "DomainLocalization";
    }

    /**
    * The ISO codes for the domain’s alternate locales. For example, `["en"]`.
    */

    public List<String> getAlternateLocales() {
        return (List<String>) get("alternateLocales");
    }

    public DomainLocalization setAlternateLocales(List<String> arg) {
        optimisticData.put(getKey("alternateLocales"), arg);
        return this;
    }

    /**
    * The ISO code for the country assigned to the domain. For example, `"CA"` or "*" for a domain set to
    * "Rest of world".
    */

    public String getCountry() {
        return (String) get("country");
    }

    public DomainLocalization setCountry(String arg) {
        optimisticData.put(getKey("country"), arg);
        return this;
    }

    /**
    * The ISO code for the domain’s default locale. For example, `"en"`.
    */

    public String getDefaultLocale() {
        return (String) get("defaultLocale");
    }

    public DomainLocalization setDefaultLocale(String arg) {
        optimisticData.put(getKey("defaultLocale"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "alternateLocales": return false;

            case "country": return false;

            case "defaultLocale": return false;

            default: return false;
        }
    }
}

