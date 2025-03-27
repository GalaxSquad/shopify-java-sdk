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
* The set of rules that are used to determine which products are included in the collection.
*/
public class CollectionRuleSet extends AbstractResponse<CollectionRuleSet> {
    public CollectionRuleSet() {
    }

    public CollectionRuleSet(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "appliedDisjunctively": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "rules": {
                    List<CollectionRule> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new CollectionRule(jsonAsObject(element1, key)));
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
        return "CollectionRuleSet";
    }

    /**
    * Whether products must match any or all of the rules to be included in the collection.
    * If true, then products must match at least one of the rules to be included in the collection.
    * If false, then products must match all of the rules to be included in the collection.
    */

    public Boolean getAppliedDisjunctively() {
        return (Boolean) get("appliedDisjunctively");
    }

    public CollectionRuleSet setAppliedDisjunctively(Boolean arg) {
        optimisticData.put(getKey("appliedDisjunctively"), arg);
        return this;
    }

    /**
    * The rules used to assign products to the collection.
    */

    public List<CollectionRule> getRules() {
        return (List<CollectionRule>) get("rules");
    }

    public CollectionRuleSet setRules(List<CollectionRule> arg) {
        optimisticData.put(getKey("rules"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "appliedDisjunctively": return false;

            case "rules": return true;

            default: return false;
        }
    }
}

