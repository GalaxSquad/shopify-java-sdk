// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Additional information about why a merchant declined the customer's return request.
*/
public class ReturnDeclineQuery extends Query<ReturnDeclineQuery> {
    ReturnDeclineQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The notification message sent to the customer about their declined return request.
    * Maximum length: 500 characters.
    */
    public ReturnDeclineQuery note() {
        startField("note");

        return this;
    }

    /**
    * The reason the customer's return request was declined.
    */
    public ReturnDeclineQuery reason() {
        startField("reason");

        return this;
    }
}
