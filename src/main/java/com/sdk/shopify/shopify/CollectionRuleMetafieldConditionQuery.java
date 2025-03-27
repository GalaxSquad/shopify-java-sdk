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

/**
* Identifies a metafield definition used as a rule for the smart collection.
*/
public class CollectionRuleMetafieldConditionQuery extends Query<CollectionRuleMetafieldConditionQuery> {
    CollectionRuleMetafieldConditionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The metafield definition associated with the condition.
    */
    public CollectionRuleMetafieldConditionQuery metafieldDefinition(MetafieldDefinitionQueryDefinition queryDef) {
        startField("metafieldDefinition");

        _queryBuilder.append('{');
        queryDef.define(new MetafieldDefinitionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
