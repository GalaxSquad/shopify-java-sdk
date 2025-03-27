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
* This object defines all columns and allowed relations that can be used in rules for smart
* collections to automatically include the matching products.
*/
public class CollectionRuleConditionsQuery extends Query<CollectionRuleConditionsQuery> {
    CollectionRuleConditionsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Allowed relations of the rule.
    */
    public CollectionRuleConditionsQuery allowedRelations() {
        startField("allowedRelations");

        return this;
    }

    /**
    * Most commonly used relation for this rule.
    */
    public CollectionRuleConditionsQuery defaultRelation() {
        startField("defaultRelation");

        return this;
    }

    /**
    * Additional attributes defining the rule.
    */
    public CollectionRuleConditionsQuery ruleObject(CollectionRuleConditionsRuleObjectQueryDefinition queryDef) {
        startField("ruleObject");

        _queryBuilder.append('{');
        queryDef.define(new CollectionRuleConditionsRuleObjectQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Type of the rule.
    */
    public CollectionRuleConditionsQuery ruleType() {
        startField("ruleType");

        return this;
    }
}
