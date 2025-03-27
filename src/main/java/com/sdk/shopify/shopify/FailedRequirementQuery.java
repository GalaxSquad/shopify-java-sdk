// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Requirements that must be met before an app can be installed.
*/
public class FailedRequirementQuery extends Query<FailedRequirementQuery> {
    FailedRequirementQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Action to be taken to resolve a failed requirement, including URL link.
    */
    public FailedRequirementQuery action(NavigationItemQueryDefinition queryDef) {
        startField("action");

        _queryBuilder.append('{');
        queryDef.define(new NavigationItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A concise set of copy strings to be displayed to merchants, to guide them in resolving problems your
    * app
    * encounters when trying to make use of their Shop and its resources.
    */
    public FailedRequirementQuery message() {
        startField("message");

        return this;
    }
}
