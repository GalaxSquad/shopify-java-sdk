// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `appUninstall` mutation.
*/
public class AppUninstallPayloadQuery extends Query<AppUninstallPayloadQuery> {
    AppUninstallPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The uninstalled app.
    */
    public AppUninstallPayloadQuery app(AppQueryDefinition queryDef) {
        startField("app");

        _queryBuilder.append('{');
        queryDef.define(new AppQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public AppUninstallPayloadQuery userErrors(AppUninstallAppUninstallErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new AppUninstallAppUninstallErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
