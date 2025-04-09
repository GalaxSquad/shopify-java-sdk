// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents at rule that's used to assign products to a collection.
*/
public class CollectionRule extends AbstractResponse<CollectionRule> {
    public CollectionRule() {
    }

    public CollectionRule(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "column": {
                    responseData.put(key, CollectionRuleColumn.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "condition": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "conditionObject": {
                    CollectionRuleConditionObject optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownCollectionRuleConditionObject.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "relation": {
                    responseData.put(key, CollectionRuleRelation.fromGraphQl(jsonAsString(field.getValue(), key)));

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
        return "CollectionRule";
    }

    /**
    * The attribute that the rule focuses on. For example, `title` or `product_type`.
    */

    public CollectionRuleColumn getColumn() {
        return (CollectionRuleColumn) get("column");
    }

    public CollectionRule setColumn(CollectionRuleColumn arg) {
        optimisticData.put(getKey("column"), arg);
        return this;
    }

    /**
    * The value that the operator is applied to. For example, `Hats`.
    */

    public String getCondition() {
        return (String) get("condition");
    }

    public CollectionRule setCondition(String arg) {
        optimisticData.put(getKey("condition"), arg);
        return this;
    }

    /**
    * The value that the operator is applied to.
    */

    public CollectionRuleConditionObject getConditionObject() {
        return (CollectionRuleConditionObject) get("conditionObject");
    }

    public CollectionRule setConditionObject(CollectionRuleConditionObject arg) {
        optimisticData.put(getKey("conditionObject"), arg);
        return this;
    }

    /**
    * The type of operator that the rule is based on. For example, `equals`, `contains`, or `not_equals`.
    */

    public CollectionRuleRelation getRelation() {
        return (CollectionRuleRelation) get("relation");
    }

    public CollectionRule setRelation(CollectionRuleRelation arg) {
        optimisticData.put(getKey("relation"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "column": return false;

            case "condition": return false;

            case "conditionObject": return false;

            case "relation": return false;

            default: return false;
        }
    }
}

