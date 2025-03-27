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
* Specifies the condition for a Product Category field.
*/
public class CollectionRuleProductCategoryCondition extends AbstractResponse<CollectionRuleProductCategoryCondition> implements CollectionRuleConditionObject {
    public CollectionRuleProductCategoryCondition() {
    }

    public CollectionRuleProductCategoryCondition(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "value": {
                    responseData.put(key, new ProductTaxonomyNode(jsonAsObject(field.getValue(), key)));

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
        return "CollectionRuleProductCategoryCondition";
    }

    /**
    * The value of the condition.
    */

    public ProductTaxonomyNode getValue() {
        return (ProductTaxonomyNode) get("value");
    }

    public CollectionRuleProductCategoryCondition setValue(ProductTaxonomyNode arg) {
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

