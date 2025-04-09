// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `appRevokeAccessScopes` mutation.
*/
public class AppRevokeAccessScopesPayloadQuery extends Query<AppRevokeAccessScopesPayloadQuery> {
    AppRevokeAccessScopesPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The list of scope handles that have been revoked.
    */
    public AppRevokeAccessScopesPayloadQuery revoked(AccessScopeQueryDefinition queryDef) {
        startField("revoked");

        _queryBuilder.append('{');
        queryDef.define(new AccessScopeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public AppRevokeAccessScopesPayloadQuery userErrors(AppRevokeAccessScopesAppRevokeScopeErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new AppRevokeAccessScopesAppRevokeScopeErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
