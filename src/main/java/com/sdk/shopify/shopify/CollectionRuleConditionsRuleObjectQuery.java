// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Specifies object with additional rule attributes.
*/
public class CollectionRuleConditionsRuleObjectQuery extends Query<CollectionRuleConditionsRuleObjectQuery> {
    CollectionRuleConditionsRuleObjectQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public CollectionRuleConditionsRuleObjectQuery onCollectionRuleMetafieldCondition(CollectionRuleMetafieldConditionQueryDefinition queryDef) {
        startInlineFragment("CollectionRuleMetafieldCondition");
        queryDef.define(new CollectionRuleMetafieldConditionQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
