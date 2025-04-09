// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Access permissions for the definition's metafields.
*/
public class MetafieldAccessQuery extends Query<MetafieldAccessQuery> {
    MetafieldAccessQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The access permitted on the Admin API.
    */
    public MetafieldAccessQuery admin() {
        startField("admin");

        return this;
    }

    /**
    * The access permitted on the Customer Account API.
    */
    public MetafieldAccessQuery customerAccount() {
        startField("customerAccount");

        return this;
    }

    /**
    * The access permitted on the Storefront API.
    */
    public MetafieldAccessQuery storefront() {
        startField("storefront");

        return this;
    }
}
