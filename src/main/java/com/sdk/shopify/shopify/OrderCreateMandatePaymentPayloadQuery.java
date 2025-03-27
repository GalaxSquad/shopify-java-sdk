// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `orderCreateMandatePayment` mutation.
*/
public class OrderCreateMandatePaymentPayloadQuery extends Query<OrderCreateMandatePaymentPayloadQuery> {
    OrderCreateMandatePaymentPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The async job used for charging the payment.
    */
    public OrderCreateMandatePaymentPayloadQuery job(JobQueryDefinition queryDef) {
        startField("job");

        _queryBuilder.append('{');
        queryDef.define(new JobQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The Unique ID for the created payment.
    */
    public OrderCreateMandatePaymentPayloadQuery paymentReferenceId() {
        startField("paymentReferenceId");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public OrderCreateMandatePaymentPayloadQuery userErrors(OrderCreateMandatePaymentUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new OrderCreateMandatePaymentUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
