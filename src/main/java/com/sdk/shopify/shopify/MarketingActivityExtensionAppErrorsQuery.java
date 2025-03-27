// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents errors returned from apps when using the marketing activity extension.
*/
public class MarketingActivityExtensionAppErrorsQuery extends Query<MarketingActivityExtensionAppErrorsQuery> {
    MarketingActivityExtensionAppErrorsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The app error type.
    */
    public MarketingActivityExtensionAppErrorsQuery code() {
        startField("code");

        return this;
    }

    /**
    * The list of errors returned by the app.
    */
    public MarketingActivityExtensionAppErrorsQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
