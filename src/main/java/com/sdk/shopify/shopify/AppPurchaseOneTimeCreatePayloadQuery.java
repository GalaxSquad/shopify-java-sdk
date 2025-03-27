// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `appPurchaseOneTimeCreate` mutation.
*/
public class AppPurchaseOneTimeCreatePayloadQuery extends Query<AppPurchaseOneTimeCreatePayloadQuery> {
    AppPurchaseOneTimeCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The newly created app one-time purchase.
    */
    public AppPurchaseOneTimeCreatePayloadQuery appPurchaseOneTime(AppPurchaseOneTimeQueryDefinition queryDef) {
        startField("appPurchaseOneTime");

        _queryBuilder.append('{');
        queryDef.define(new AppPurchaseOneTimeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The URL that the merchant can access to approve or decline the newly created app one-time purchase.
    * If the merchant declines, then the merchant is redirected to the app and receives a notification
    * message stating that the charge was declined.
    * If the merchant approves and they're successfully invoiced, then the state of the charge changes
    * from `pending` to `active`.
    * You get paid after the charge is activated.
    */
    public AppPurchaseOneTimeCreatePayloadQuery confirmationUrl() {
        startField("confirmationUrl");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public AppPurchaseOneTimeCreatePayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
