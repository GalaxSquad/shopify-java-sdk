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
* The shipping lines to which the price rule applies to.
*/
public class PriceRuleShippingLineEntitlements extends AbstractResponse<PriceRuleShippingLineEntitlements> {
    public PriceRuleShippingLineEntitlements() {
    }

    public PriceRuleShippingLineEntitlements(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "countryCodes": {
                    List<CountryCode> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(CountryCode.fromGraphQl(jsonAsString(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "includeRestOfWorld": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "targetAllShippingLines": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

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
        return "PriceRuleShippingLineEntitlements";
    }

    /**
    * The codes for the countries to which the price rule applies to.
    */

    public List<CountryCode> getCountryCodes() {
        return (List<CountryCode>) get("countryCodes");
    }

    public PriceRuleShippingLineEntitlements setCountryCodes(List<CountryCode> arg) {
        optimisticData.put(getKey("countryCodes"), arg);
        return this;
    }

    /**
    * Whether the price rule is applicable to countries that haven't been defined in the shop's shipping
    * zones.
    */

    public Boolean getIncludeRestOfWorld() {
        return (Boolean) get("includeRestOfWorld");
    }

    public PriceRuleShippingLineEntitlements setIncludeRestOfWorld(Boolean arg) {
        optimisticData.put(getKey("includeRestOfWorld"), arg);
        return this;
    }

    /**
    * Whether the price rule applies to all shipping lines.
    */

    public Boolean getTargetAllShippingLines() {
        return (Boolean) get("targetAllShippingLines");
    }

    public PriceRuleShippingLineEntitlements setTargetAllShippingLines(Boolean arg) {
        optimisticData.put(getKey("targetAllShippingLines"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "countryCodes": return false;

            case "includeRestOfWorld": return false;

            case "targetAllShippingLines": return false;

            default: return false;
        }
    }
}

