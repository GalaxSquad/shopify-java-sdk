// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;


import com.shopify.graphql.support.ID;

/**
* An object with an ID field to support global identification, in accordance with the
* [Relay specification](https://relay.dev/graphql/objectidentification.htm#sec-Node-Interface).
* This interface is used by the [node](https://shopify.dev/api/admin-graphql/unstable/queries/node)
* and [nodes](https://shopify.dev/api/admin-graphql/unstable/queries/nodes) queries.
*/

public interface Node extends com.shopify.graphql.support.Node {
    String getGraphQlTypeName();

    ID getId();
}

