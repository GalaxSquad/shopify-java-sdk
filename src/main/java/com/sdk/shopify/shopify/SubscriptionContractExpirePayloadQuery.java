// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `subscriptionContractExpire` mutation.
*/
public class SubscriptionContractExpirePayloadQuery extends Query<SubscriptionContractExpirePayloadQuery> {
    SubscriptionContractExpirePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The new Subscription Contract object.
    */
    public SubscriptionContractExpirePayloadQuery contract(SubscriptionContractQueryDefinition queryDef) {
        startField("contract");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionContractQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public SubscriptionContractExpirePayloadQuery userErrors(SubscriptionContractStatusUpdateUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionContractStatusUpdateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
