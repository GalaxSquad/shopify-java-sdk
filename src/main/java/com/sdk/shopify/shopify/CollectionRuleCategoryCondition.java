// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Specifies the taxonomy category to used for the condition.
*/
public class CollectionRuleCategoryCondition extends AbstractResponse<CollectionRuleCategoryCondition> implements CollectionRuleConditionObject {
    public CollectionRuleCategoryCondition() {
    }

    public CollectionRuleCategoryCondition(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "value": {
                    responseData.put(key, new TaxonomyCategory(jsonAsObject(field.getValue(), key)));

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
        return "CollectionRuleCategoryCondition";
    }

    /**
    * The taxonomy category used as condition.
    */

    public TaxonomyCategory getValue() {
        return (TaxonomyCategory) get("value");
    }

    public CollectionRuleCategoryCondition setValue(TaxonomyCategory arg) {
        optimisticData.put(getKey("value"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "value": return true;

            default: return false;
        }
    }
}

