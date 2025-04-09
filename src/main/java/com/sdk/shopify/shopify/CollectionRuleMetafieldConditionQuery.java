// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

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
