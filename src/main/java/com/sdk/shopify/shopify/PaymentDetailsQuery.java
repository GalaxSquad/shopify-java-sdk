// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Payment details related to a transaction.
*/
public class PaymentDetailsQuery extends Query<PaymentDetailsQuery> {
    PaymentDetailsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public PaymentDetailsQuery onCardPaymentDetails(CardPaymentDetailsQueryDefinition queryDef) {
        startInlineFragment("CardPaymentDetails");
        queryDef.define(new CardPaymentDetailsQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public PaymentDetailsQuery onLocalPaymentMethodsPaymentDetails(LocalPaymentMethodsPaymentDetailsQueryDefinition queryDef) {
        startInlineFragment("LocalPaymentMethodsPaymentDetails");
        queryDef.define(new LocalPaymentMethodsPaymentDetailsQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public PaymentDetailsQuery onShopPayInstallmentsPaymentDetails(ShopPayInstallmentsPaymentDetailsQueryDefinition queryDef) {
        startInlineFragment("ShopPayInstallmentsPaymentDetails");
        queryDef.define(new ShopPayInstallmentsPaymentDetailsQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
