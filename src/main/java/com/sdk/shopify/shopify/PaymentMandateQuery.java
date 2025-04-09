// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A payment instrument and the permission
* the owner of the instrument gives to the merchant to debit it.
*/
public class PaymentMandateQuery extends Query<PaymentMandateQuery> {
    PaymentMandateQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The outputs details of the payment instrument.
    */
    public PaymentMandateQuery paymentInstrument(PaymentInstrumentQueryDefinition queryDef) {
        startField("paymentInstrument");

        _queryBuilder.append('{');
        queryDef.define(new PaymentInstrumentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
