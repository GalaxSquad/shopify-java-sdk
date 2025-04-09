// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `paymentReminderSend` mutation.
*/
public class PaymentReminderSendPayloadQuery extends Query<PaymentReminderSendPayloadQuery> {
    PaymentReminderSendPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Whether the payment reminder email was successfully sent.
    */
    public PaymentReminderSendPayloadQuery success() {
        startField("success");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public PaymentReminderSendPayloadQuery userErrors(PaymentReminderSendUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new PaymentReminderSendUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
