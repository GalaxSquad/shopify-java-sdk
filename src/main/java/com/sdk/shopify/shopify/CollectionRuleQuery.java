// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents at rule that's used to assign products to a collection.
*/
public class CollectionRuleQuery extends Query<CollectionRuleQuery> {
    CollectionRuleQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The attribute that the rule focuses on. For example, `title` or `product_type`.
    */
    public CollectionRuleQuery column() {
        startField("column");

        return this;
    }

    /**
    * The value that the operator is applied to. For example, `Hats`.
    */
    public CollectionRuleQuery condition() {
        startField("condition");

        return this;
    }

    /**
    * The value that the operator is applied to.
    */
    public CollectionRuleQuery conditionObject(CollectionRuleConditionObjectQueryDefinition queryDef) {
        startField("conditionObject");

        _queryBuilder.append('{');
        queryDef.define(new CollectionRuleConditionObjectQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The type of operator that the rule is based on. For example, `equals`, `contains`, or `not_equals`.
    */
    public CollectionRuleQuery relation() {
        startField("relation");

        return this;
    }
}
