// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Tax app configuration of a merchant.
*/
public class TaxAppConfigurationQuery extends Query<TaxAppConfigurationQuery> {
    TaxAppConfigurationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * State of the tax app configuration.
    */
    public TaxAppConfigurationQuery state() {
        startField("state");

        return this;
    }
}
