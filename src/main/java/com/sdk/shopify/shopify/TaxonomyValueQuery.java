// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents a Shopify product taxonomy value.
*/
public class TaxonomyValueQuery extends Query<TaxonomyValueQuery> {
    TaxonomyValueQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The name of the product taxonomy value. For example, Red.
    */
    public TaxonomyValueQuery name() {
        startField("name");

        return this;
    }
}
