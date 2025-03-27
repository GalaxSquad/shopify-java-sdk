// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `mobilePlatformApplicationCreate` mutation.
*/
public class MobilePlatformApplicationCreatePayloadQuery extends Query<MobilePlatformApplicationCreatePayloadQuery> {
    MobilePlatformApplicationCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Created mobile platform application.
    */
    public MobilePlatformApplicationCreatePayloadQuery mobilePlatformApplication(MobilePlatformApplicationQueryDefinition queryDef) {
        startField("mobilePlatformApplication");

        _queryBuilder.append('{');
        queryDef.define(new MobilePlatformApplicationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public MobilePlatformApplicationCreatePayloadQuery userErrors(MobilePlatformApplicationUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new MobilePlatformApplicationUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
