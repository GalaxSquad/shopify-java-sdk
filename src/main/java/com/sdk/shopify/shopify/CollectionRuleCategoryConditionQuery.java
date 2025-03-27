// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Specifies the taxonomy category to used for the condition.
*/
public class CollectionRuleCategoryConditionQuery extends Query<CollectionRuleCategoryConditionQuery> {
    CollectionRuleCategoryConditionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The taxonomy category used as condition.
    */
    public CollectionRuleCategoryConditionQuery value(TaxonomyCategoryQueryDefinition queryDef) {
        startField("value");

        _queryBuilder.append('{');
        queryDef.define(new TaxonomyCategoryQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
