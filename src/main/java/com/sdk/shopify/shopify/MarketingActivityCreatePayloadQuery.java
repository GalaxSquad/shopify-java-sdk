// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `marketingActivityCreate` mutation.
*/
public class MarketingActivityCreatePayloadQuery extends Query<MarketingActivityCreatePayloadQuery> {
    MarketingActivityCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The created marketing activity.
    */
    public MarketingActivityCreatePayloadQuery marketingActivity(MarketingActivityQueryDefinition queryDef) {
        startField("marketingActivity");

        _queryBuilder.append('{');
        queryDef.define(new MarketingActivityQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The path to return back to shopify admin from embedded editor.
    */
    public MarketingActivityCreatePayloadQuery redirectPath() {
        startField("redirectPath");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public MarketingActivityCreatePayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
