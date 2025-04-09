// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Specifies the condition for a text field.
*/
public class CollectionRuleTextConditionQuery extends Query<CollectionRuleTextConditionQuery> {
    CollectionRuleTextConditionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The value of the condition.
    */
    public CollectionRuleTextConditionQuery value() {
        startField("value");

        return this;
    }
}
