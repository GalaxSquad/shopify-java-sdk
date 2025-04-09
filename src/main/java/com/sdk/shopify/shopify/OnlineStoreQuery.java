// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The shop's online store channel.
*/
public class OnlineStoreQuery extends Query<OnlineStoreQuery> {
    OnlineStoreQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Storefront password information.
    */
    public OnlineStoreQuery passwordProtection(OnlineStorePasswordProtectionQueryDefinition queryDef) {
        startField("passwordProtection");

        _queryBuilder.append('{');
        queryDef.define(new OnlineStorePasswordProtectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
