// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* All possible instruments for CustomerPaymentMethods.
*/
public class CustomerPaymentInstrumentQuery extends Query<CustomerPaymentInstrumentQuery> {
    CustomerPaymentInstrumentQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public CustomerPaymentInstrumentQuery onCustomerCreditCard(CustomerCreditCardQueryDefinition queryDef) {
        startInlineFragment("CustomerCreditCard");
        queryDef.define(new CustomerCreditCardQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public CustomerPaymentInstrumentQuery onCustomerPaypalBillingAgreement(CustomerPaypalBillingAgreementQueryDefinition queryDef) {
        startInlineFragment("CustomerPaypalBillingAgreement");
        queryDef.define(new CustomerPaypalBillingAgreementQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public CustomerPaymentInstrumentQuery onCustomerShopPayAgreement(CustomerShopPayAgreementQueryDefinition queryDef) {
        startInlineFragment("CustomerShopPayAgreement");
        queryDef.define(new CustomerShopPayAgreementQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
