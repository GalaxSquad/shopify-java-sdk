// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A constraint subtype value that the metafield definition applies to.
*/
public class MetafieldDefinitionConstraintValueQuery extends Query<MetafieldDefinitionConstraintValueQuery> {
    MetafieldDefinitionConstraintValueQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The subtype value of the constraint.
    */
    public MetafieldDefinitionConstraintValueQuery value() {
        startField("value");

        return this;
    }
}
