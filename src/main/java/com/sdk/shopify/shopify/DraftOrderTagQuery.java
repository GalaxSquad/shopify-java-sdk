// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents a draft order tag.
*/
public class DraftOrderTagQuery extends Query<DraftOrderTagQuery> {
    DraftOrderTagQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * Handle of draft order tag.
    */
    public DraftOrderTagQuery handle() {
        startField("handle");

        return this;
    }

    /**
    * Title of draft order tag.
    */
    public DraftOrderTagQuery title() {
        startField("title");

        return this;
    }
}
