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
* This object defines all columns and allowed relations that can be used in rules for smart
* collections to automatically include the matching products.
*/
public class CollectionRuleConditions extends AbstractResponse<CollectionRuleConditions> {
    public CollectionRuleConditions() {
    }

    public CollectionRuleConditions(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "allowedRelations": {
                    List<CollectionRuleRelation> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(CollectionRuleRelation.fromGraphQl(jsonAsString(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "defaultRelation": {
                    responseData.put(key, CollectionRuleRelation.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "ruleObject": {
                    CollectionRuleConditionsRuleObject optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownCollectionRuleConditionsRuleObject.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "ruleType": {
                    responseData.put(key, CollectionRuleColumn.fromGraphQl(jsonAsString(field.getValue(), key)));

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
        return "CollectionRuleConditions";
    }

    /**
    * Allowed relations of the rule.
    */

    public List<CollectionRuleRelation> getAllowedRelations() {
        return (List<CollectionRuleRelation>) get("allowedRelations");
    }

    public CollectionRuleConditions setAllowedRelations(List<CollectionRuleRelation> arg) {
        optimisticData.put(getKey("allowedRelations"), arg);
        return this;
    }

    /**
    * Most commonly used relation for this rule.
    */

    public CollectionRuleRelation getDefaultRelation() {
        return (CollectionRuleRelation) get("defaultRelation");
    }

    public CollectionRuleConditions setDefaultRelation(CollectionRuleRelation arg) {
        optimisticData.put(getKey("defaultRelation"), arg);
        return this;
    }

    /**
    * Additional attributes defining the rule.
    */

    public CollectionRuleConditionsRuleObject getRuleObject() {
        return (CollectionRuleConditionsRuleObject) get("ruleObject");
    }

    public CollectionRuleConditions setRuleObject(CollectionRuleConditionsRuleObject arg) {
        optimisticData.put(getKey("ruleObject"), arg);
        return this;
    }

    /**
    * Type of the rule.
    */

    public CollectionRuleColumn getRuleType() {
        return (CollectionRuleColumn) get("ruleType");
    }

    public CollectionRuleConditions setRuleType(CollectionRuleColumn arg) {
        optimisticData.put(getKey("ruleType"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "allowedRelations": return false;

            case "defaultRelation": return false;

            case "ruleObject": return false;

            case "ruleType": return false;

            default: return false;
        }
    }
}

