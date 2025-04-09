// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Identifies a metafield definition used as a rule for the smart collection.
*/
public class CollectionRuleMetafieldCondition extends AbstractResponse<CollectionRuleMetafieldCondition> implements CollectionRuleConditionObject, CollectionRuleConditionsRuleObject {
    public CollectionRuleMetafieldCondition() {
    }

    public CollectionRuleMetafieldCondition(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "metafieldDefinition": {
                    responseData.put(key, new MetafieldDefinition(jsonAsObject(field.getValue(), key)));

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
        return "CollectionRuleMetafieldCondition";
    }

    /**
    * The metafield definition associated with the condition.
    */

    public MetafieldDefinition getMetafieldDefinition() {
        return (MetafieldDefinition) get("metafieldDefinition");
    }

    public CollectionRuleMetafieldCondition setMetafieldDefinition(MetafieldDefinition arg) {
        optimisticData.put(getKey("metafieldDefinition"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "metafieldDefinition": return true;

            default: return false;
        }
    }
}

