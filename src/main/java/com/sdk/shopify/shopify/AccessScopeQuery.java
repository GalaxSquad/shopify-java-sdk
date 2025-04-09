// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The permission required to access a Shopify Admin API or Storefront API resource for a shop.
* Merchants grant access scopes that are requested by applications.
*/
public class AccessScopeQuery extends Query<AccessScopeQuery> {
    AccessScopeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * A description of the actions that the access scope allows an app to perform.
    */
    public AccessScopeQuery description() {
        startField("description");

        return this;
    }

    /**
    * A readable string that represents the access scope. The string usually follows the format
    * `{action}_{resource}`. `{action}` is `read` or `write`, and `{resource}` is the resource that the
    * action can be performed on. `{action}` and `{resource}` are separated by an underscore. For example,
    * `read_orders` or `write_products`.
    */
    public AccessScopeQuery handle() {
        startField("handle");

        return this;
    }
}
