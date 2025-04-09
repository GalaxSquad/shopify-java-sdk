// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The set of rules that are used to determine which products are included in the collection.
*/
public class CollectionRuleSetQuery extends Query<CollectionRuleSetQuery> {
    CollectionRuleSetQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Whether products must match any or all of the rules to be included in the collection.
    * If true, then products must match at least one of the rules to be included in the collection.
    * If false, then products must match all of the rules to be included in the collection.
    */
    public CollectionRuleSetQuery appliedDisjunctively() {
        startField("appliedDisjunctively");

        return this;
    }

    /**
    * The rules used to assign products to the collection.
    */
    public CollectionRuleSetQuery rules(CollectionRuleQueryDefinition queryDef) {
        startField("rules");

        _queryBuilder.append('{');
        queryDef.define(new CollectionRuleQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
