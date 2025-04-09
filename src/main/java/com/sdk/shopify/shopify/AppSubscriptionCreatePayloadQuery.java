// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `appSubscriptionCreate` mutation.
*/
public class AppSubscriptionCreatePayloadQuery extends Query<AppSubscriptionCreatePayloadQuery> {
    AppSubscriptionCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The newly-created app subscription.
    */
    public AppSubscriptionCreatePayloadQuery appSubscription(AppSubscriptionQueryDefinition queryDef) {
        startField("appSubscription");

        _queryBuilder.append('{');
        queryDef.define(new AppSubscriptionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The URL pointing to the page where the merchant approves or declines the charges for an app
    * subscription.
    */
    public AppSubscriptionCreatePayloadQuery confirmationUrl() {
        startField("confirmationUrl");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public AppSubscriptionCreatePayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
