// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A new [shipping line](https://shopify.dev/api/admin-graphql/latest/objects/shippingline)
* added as part of an order edit.
*/
public class OrderStagedChangeAddShippingLineQuery extends Query<OrderStagedChangeAddShippingLineQuery> {
    OrderStagedChangeAddShippingLineQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The phone number at the shipping address.
    */
    public OrderStagedChangeAddShippingLineQuery phone() {
        startField("phone");

        return this;
    }

    /**
    * The shipping line's title that's shown to the buyer.
    */
    public OrderStagedChangeAddShippingLineQuery presentmentTitle() {
        startField("presentmentTitle");

        return this;
    }

    /**
    * The price that applies to the shipping line.
    */
    public OrderStagedChangeAddShippingLineQuery price(MoneyV2QueryDefinition queryDef) {
        startField("price");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The title of the shipping line.
    */
    public OrderStagedChangeAddShippingLineQuery title() {
        startField("title");

        return this;
    }
}
