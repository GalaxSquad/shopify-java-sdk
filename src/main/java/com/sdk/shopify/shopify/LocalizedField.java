// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents the value captured by a localized field. Localized fields are additional fields required
* by certain countries on international orders. For example, some countries require additional fields
* for customs information or tax identification numbers.
*/
public class LocalizedField extends AbstractResponse<LocalizedField> {
    public LocalizedField() {
    }

    public LocalizedField(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "countryCode": {
                    responseData.put(key, CountryCode.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "key": {
                    responseData.put(key, LocalizedFieldKey.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "purpose": {
                    responseData.put(key, LocalizedFieldPurpose.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "title": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "value": {
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
        return "LocalizedField";
    }

    /**
    * Country ISO 3166-1 alpha-2 code.
    */

    public CountryCode getCountryCode() {
        return (CountryCode) get("countryCode");
    }

    public LocalizedField setCountryCode(CountryCode arg) {
        optimisticData.put(getKey("countryCode"), arg);
        return this;
    }

    /**
    * The localized field keys that are allowed.
    */

    public LocalizedFieldKey getKey() {
        return (LocalizedFieldKey) get("key");
    }

    public LocalizedField setKey(LocalizedFieldKey arg) {
        optimisticData.put(getKey("key"), arg);
        return this;
    }

    /**
    * The purpose of this localized field.
    */

    public LocalizedFieldPurpose getPurpose() {
        return (LocalizedFieldPurpose) get("purpose");
    }

    public LocalizedField setPurpose(LocalizedFieldPurpose arg) {
        optimisticData.put(getKey("purpose"), arg);
        return this;
    }

    /**
    * The localized field title.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public LocalizedField setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    /**
    * The value of the field.
    */

    public String getValue() {
        return (String) get("value");
    }

    public LocalizedField setValue(String arg) {
        optimisticData.put(getKey("value"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "countryCode": return false;

            case "key": return false;

            case "purpose": return false;

            case "title": return false;

            case "value": return false;

            default: return false;
        }
    }
}

