// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Specifies the condition for a text field.
*/
public class CollectionRuleTextCondition extends AbstractResponse<CollectionRuleTextCondition> implements CollectionRuleConditionObject {
    public CollectionRuleTextCondition() {
    }

    public CollectionRuleTextCondition(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
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
        return "CollectionRuleTextCondition";
    }

    /**
    * The value of the condition.
    */

    public String getValue() {
        return (String) get("value");
    }

    public CollectionRuleTextCondition setValue(String arg) {
        optimisticData.put(getKey("value"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "value": return false;

            default: return false;
        }
    }
}

