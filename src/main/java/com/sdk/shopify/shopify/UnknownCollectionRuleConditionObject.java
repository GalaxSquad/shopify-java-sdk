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
* Specifies object for the condition of the rule.
*/
public class UnknownCollectionRuleConditionObject extends AbstractResponse<UnknownCollectionRuleConditionObject> implements CollectionRuleConditionObject {
    public UnknownCollectionRuleConditionObject() {
    }

    public UnknownCollectionRuleConditionObject(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
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

    public static CollectionRuleConditionObject create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "CollectionRuleCategoryCondition": {
                return new CollectionRuleCategoryCondition(fields);
            }

            case "CollectionRuleMetafieldCondition": {
                return new CollectionRuleMetafieldCondition(fields);
            }

            case "CollectionRuleProductCategoryCondition": {
                return new CollectionRuleProductCategoryCondition(fields);
            }

            case "CollectionRuleTextCondition": {
                return new CollectionRuleTextCondition(fields);
            }

            default: {
                return new UnknownCollectionRuleConditionObject(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            default: return false;
        }
    }
}

