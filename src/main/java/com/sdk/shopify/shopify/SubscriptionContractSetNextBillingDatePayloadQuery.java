// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `subscriptionContractSetNextBillingDate` mutation.
*/
public class SubscriptionContractSetNextBillingDatePayloadQuery extends Query<SubscriptionContractSetNextBillingDatePayloadQuery> {
    SubscriptionContractSetNextBillingDatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The updated Subscription Contract object.
    */
    public SubscriptionContractSetNextBillingDatePayloadQuery contract(SubscriptionContractQueryDefinition queryDef) {
        startField("contract");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionContractQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public SubscriptionContractSetNextBillingDatePayloadQuery userErrors(SubscriptionContractUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionContractUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
