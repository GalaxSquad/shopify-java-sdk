// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An auto-generated type which holds one MailingAddress and a cursor during pagination.
*/
public class MailingAddressEdgeQuery extends Query<MailingAddressEdgeQuery> {
    MailingAddressEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The position of each node in an array, used in
    * [pagination](https://shopify.dev/api/usage/pagination-graphql).
    */
    public MailingAddressEdgeQuery cursor() {
        startField("cursor");

        return this;
    }

    /**
    * The item at the end of MailingAddressEdge.
    */
    public MailingAddressEdgeQuery node(MailingAddressQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new MailingAddressQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
