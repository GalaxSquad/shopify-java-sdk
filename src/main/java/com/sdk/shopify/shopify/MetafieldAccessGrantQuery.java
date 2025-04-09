// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An explicit access grant for the metafields under this definition.
* Explicit grants are
* [deprecated](https://shopify.dev/changelog/deprecating-explicit-access-grants-for-app-owned-metafiel
* ds).
*/
public class MetafieldAccessGrantQuery extends Query<MetafieldAccessGrantQuery> {
    MetafieldAccessGrantQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The level of access the grantee has.
    */
    public MetafieldAccessGrantQuery access() {
        startField("access");

        return this;
    }

    /**
    * The grantee being granted access.
    */
    public MetafieldAccessGrantQuery grantee() {
        startField("grantee");

        return this;
    }
}
