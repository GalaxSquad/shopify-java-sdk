// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Represents a shipping line for a Shop Pay payment request.
*/
public class ShopPayPaymentRequestShippingLineQuery extends Query<ShopPayPaymentRequestShippingLineQuery> {
    ShopPayPaymentRequestShippingLineQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The amount for the shipping line.
    */
    public ShopPayPaymentRequestShippingLineQuery amount(MoneyV2QueryDefinition queryDef) {
        startField("amount");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The code of the shipping line.
    */
    public ShopPayPaymentRequestShippingLineQuery code() {
        startField("code");

        return this;
    }

    /**
    * The label of the shipping line.
    */
    public ShopPayPaymentRequestShippingLineQuery label() {
        startField("label");

        return this;
    }
}
