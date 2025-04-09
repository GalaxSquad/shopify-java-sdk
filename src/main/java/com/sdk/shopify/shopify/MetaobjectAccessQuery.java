// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Access permissions for the definition's metaobjects.
*/
public class MetaobjectAccessQuery extends Query<MetaobjectAccessQuery> {
    MetaobjectAccessQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The access permitted on the Admin API.
    */
    public MetaobjectAccessQuery admin() {
        startField("admin");

        return this;
    }

    /**
    * The access permitted on the Storefront API.
    */
    public MetaobjectAccessQuery storefront() {
        startField("storefront");

        return this;
    }
}
