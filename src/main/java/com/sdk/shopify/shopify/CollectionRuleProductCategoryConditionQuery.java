// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Specifies the condition for a Product Category field.
*/
public class CollectionRuleProductCategoryConditionQuery extends Query<CollectionRuleProductCategoryConditionQuery> {
    CollectionRuleProductCategoryConditionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The value of the condition.
    */
    public CollectionRuleProductCategoryConditionQuery value(ProductTaxonomyNodeQueryDefinition queryDef) {
        startField("value");

        _queryBuilder.append('{');
        queryDef.define(new ProductTaxonomyNodeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
