// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `marketingActivityUpdateExternal` mutation.
*/
public class MarketingActivityUpdateExternalPayloadQuery extends Query<MarketingActivityUpdateExternalPayloadQuery> {
    MarketingActivityUpdateExternalPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The updated marketing activity.
    */
    public MarketingActivityUpdateExternalPayloadQuery marketingActivity(MarketingActivityQueryDefinition queryDef) {
        startField("marketingActivity");

        _queryBuilder.append('{');
        queryDef.define(new MarketingActivityQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public MarketingActivityUpdateExternalPayloadQuery userErrors(MarketingActivityUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new MarketingActivityUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
