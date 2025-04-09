// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `appSubscriptionLineItemUpdate` mutation.
*/
public class AppSubscriptionLineItemUpdatePayloadQuery extends Query<AppSubscriptionLineItemUpdatePayloadQuery> {
    AppSubscriptionLineItemUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The updated app subscription.
    */
    public AppSubscriptionLineItemUpdatePayloadQuery appSubscription(AppSubscriptionQueryDefinition queryDef) {
        startField("appSubscription");

        _queryBuilder.append('{');
        queryDef.define(new AppSubscriptionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The URL where the merchant approves or declines the updated app subscription line item.
    */
    public AppSubscriptionLineItemUpdatePayloadQuery confirmationUrl() {
        startField("confirmationUrl");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public AppSubscriptionLineItemUpdatePayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
