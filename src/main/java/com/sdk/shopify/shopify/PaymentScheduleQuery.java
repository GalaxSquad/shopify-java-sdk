// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents the payment schedule for a single payment defined in the payment terms.
*/
public class PaymentScheduleQuery extends Query<PaymentScheduleQuery> {
    PaymentScheduleQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * Date and time when the payment schedule is paid or fulfilled.
    */
    public PaymentScheduleQuery completedAt() {
        startField("completedAt");

        return this;
    }

    /**
    * Date and time when the payment schedule is due.
    */
    public PaymentScheduleQuery dueAt() {
        startField("dueAt");

        return this;
    }

    /**
    * Date and time when the invoice is sent.
    */
    public PaymentScheduleQuery issuedAt() {
        startField("issuedAt");

        return this;
    }

    /**
    * The payment terms the payment schedule belongs to.
    */
    public PaymentScheduleQuery paymentTerms(PaymentTermsQueryDefinition queryDef) {
        startField("paymentTerms");

        _queryBuilder.append('{');
        queryDef.define(new PaymentTermsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
