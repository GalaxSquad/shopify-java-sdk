// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents a set of UTM parameters.
*/
public class UTMParametersQuery extends Query<UTMParametersQuery> {
    UTMParametersQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The name of a marketing campaign.
    */
    public UTMParametersQuery campaign() {
        startField("campaign");

        return this;
    }

    /**
    * Identifies specific content in a marketing campaign. Used to differentiate between similar content
    * or links in a marketing campaign to determine which is the most effective.
    */
    public UTMParametersQuery content() {
        startField("content");

        return this;
    }

    /**
    * The medium of a marketing campaign, such as a banner or email newsletter.
    */
    public UTMParametersQuery medium() {
        startField("medium");

        return this;
    }

    /**
    * The source of traffic to the merchant's store, such as Google or an email newsletter.
    */
    public UTMParametersQuery source() {
        startField("source");

        return this;
    }

    /**
    * Paid search terms used by a marketing campaign.
    */
    public UTMParametersQuery term() {
        startField("term");

        return this;
    }
}
