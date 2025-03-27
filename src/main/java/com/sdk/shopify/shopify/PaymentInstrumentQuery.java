// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* All possible instrument outputs for Payment Mandates.
*/
public class PaymentInstrumentQuery extends Query<PaymentInstrumentQuery> {
    PaymentInstrumentQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public PaymentInstrumentQuery onVaultCreditCard(VaultCreditCardQueryDefinition queryDef) {
        startInlineFragment("VaultCreditCard");
        queryDef.define(new VaultCreditCardQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public PaymentInstrumentQuery onVaultPaypalBillingAgreement(VaultPaypalBillingAgreementQueryDefinition queryDef) {
        startInlineFragment("VaultPaypalBillingAgreement");
        queryDef.define(new VaultPaypalBillingAgreementQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
