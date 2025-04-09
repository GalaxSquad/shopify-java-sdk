// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `taxAppConfigure` mutation.
*/
public class TaxAppConfigurePayloadQuery extends Query<TaxAppConfigurePayloadQuery> {
    TaxAppConfigurePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The updated tax app configuration.
    */
    public TaxAppConfigurePayloadQuery taxAppConfiguration(TaxAppConfigurationQueryDefinition queryDef) {
        startField("taxAppConfiguration");

        _queryBuilder.append('{');
        queryDef.define(new TaxAppConfigurationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public TaxAppConfigurePayloadQuery userErrors(TaxAppConfigureUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new TaxAppConfigureUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
