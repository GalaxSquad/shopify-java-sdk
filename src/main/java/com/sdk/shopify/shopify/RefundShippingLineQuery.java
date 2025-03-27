// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A shipping line item that's included in a refund.
*/
public class RefundShippingLineQuery extends Query<RefundShippingLineQuery> {
    RefundShippingLineQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The `ShippingLine` resource associated to the refunded shipping line item.
    */
    public RefundShippingLineQuery shippingLine(ShippingLineQueryDefinition queryDef) {
        startField("shippingLine");

        _queryBuilder.append('{');
        queryDef.define(new ShippingLineQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The subtotal amount of the refund shipping line in shop and presentment currencies.
    */
    public RefundShippingLineQuery subtotalAmountSet(MoneyBagQueryDefinition queryDef) {
        startField("subtotalAmountSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The tax amount of the refund shipping line in shop and presentment currencies.
    */
    public RefundShippingLineQuery taxAmountSet(MoneyBagQueryDefinition queryDef) {
        startField("taxAmountSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
