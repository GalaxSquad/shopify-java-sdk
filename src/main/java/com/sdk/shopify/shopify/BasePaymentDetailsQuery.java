// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Generic payment details that are related to a transaction.
*/
public class BasePaymentDetailsQuery extends Query<BasePaymentDetailsQuery> {
    BasePaymentDetailsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    /**
    * The name of payment method used by the buyer.
    */
    public BasePaymentDetailsQuery paymentMethodName() {
        startField("paymentMethodName");

        return this;
    }

    public BasePaymentDetailsQuery onCardPaymentDetails(CardPaymentDetailsQueryDefinition queryDef) {
        startInlineFragment("CardPaymentDetails");
        queryDef.define(new CardPaymentDetailsQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public BasePaymentDetailsQuery onLocalPaymentMethodsPaymentDetails(LocalPaymentMethodsPaymentDetailsQueryDefinition queryDef) {
        startInlineFragment("LocalPaymentMethodsPaymentDetails");
        queryDef.define(new LocalPaymentMethodsPaymentDetailsQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public BasePaymentDetailsQuery onPaypalWalletPaymentDetails(PaypalWalletPaymentDetailsQueryDefinition queryDef) {
        startInlineFragment("PaypalWalletPaymentDetails");
        queryDef.define(new PaypalWalletPaymentDetailsQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public BasePaymentDetailsQuery onShopPayInstallmentsPaymentDetails(ShopPayInstallmentsPaymentDetailsQueryDefinition queryDef) {
        startInlineFragment("ShopPayInstallmentsPaymentDetails");
        queryDef.define(new ShopPayInstallmentsPaymentDetailsQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
