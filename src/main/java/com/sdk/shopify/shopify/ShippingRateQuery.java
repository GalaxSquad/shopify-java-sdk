// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A shipping rate is an additional cost added to the cost of the products that were ordered.
*/
public class ShippingRateQuery extends Query<ShippingRateQuery> {
    ShippingRateQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Human-readable unique identifier for this shipping rate.
    */
    public ShippingRateQuery handle() {
        startField("handle");

        return this;
    }

    /**
    * The cost associated with the shipping rate.
    */
    public ShippingRateQuery price(MoneyV2QueryDefinition queryDef) {
        startField("price");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The name of the shipping rate.
    */
    public ShippingRateQuery title() {
        startField("title");

        return this;
    }
}
