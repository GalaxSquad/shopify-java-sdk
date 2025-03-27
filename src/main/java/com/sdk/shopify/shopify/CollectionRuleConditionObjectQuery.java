// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Specifies object for the condition of the rule.
*/
public class CollectionRuleConditionObjectQuery extends Query<CollectionRuleConditionObjectQuery> {
    CollectionRuleConditionObjectQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public CollectionRuleConditionObjectQuery onCollectionRuleCategoryCondition(CollectionRuleCategoryConditionQueryDefinition queryDef) {
        startInlineFragment("CollectionRuleCategoryCondition");
        queryDef.define(new CollectionRuleCategoryConditionQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public CollectionRuleConditionObjectQuery onCollectionRuleMetafieldCondition(CollectionRuleMetafieldConditionQueryDefinition queryDef) {
        startInlineFragment("CollectionRuleMetafieldCondition");
        queryDef.define(new CollectionRuleMetafieldConditionQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public CollectionRuleConditionObjectQuery onCollectionRuleProductCategoryCondition(CollectionRuleProductCategoryConditionQueryDefinition queryDef) {
        startInlineFragment("CollectionRuleProductCategoryCondition");
        queryDef.define(new CollectionRuleProductCategoryConditionQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public CollectionRuleConditionObjectQuery onCollectionRuleTextCondition(CollectionRuleTextConditionQueryDefinition queryDef) {
        startInlineFragment("CollectionRuleTextCondition");
        queryDef.define(new CollectionRuleTextConditionQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
