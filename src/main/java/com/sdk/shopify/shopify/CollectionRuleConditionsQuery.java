// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

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
