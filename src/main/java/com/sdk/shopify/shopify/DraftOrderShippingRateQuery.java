// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A shipping rate is an additional cost added to the cost of the products that were ordered.
*/
public class DraftOrderShippingRateQuery extends Query<DraftOrderShippingRateQuery> {
    DraftOrderShippingRateQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The code of the shipping rate.
    */
    public DraftOrderShippingRateQuery code() {
        startField("code");

        return this;
    }

    /**
    * Unique identifier for this shipping rate.
    */
    public DraftOrderShippingRateQuery handle() {
        startField("handle");

        return this;
    }

    /**
    * The cost associated with the shipping rate.
    */
    public DraftOrderShippingRateQuery price(MoneyV2QueryDefinition queryDef) {
        startField("price");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The source of the shipping rate.
    */
    public DraftOrderShippingRateQuery source() {
        startField("source");

        return this;
    }

    /**
    * The name of the shipping rate.
    */
    public DraftOrderShippingRateQuery title() {
        startField("title");

        return this;
    }
}
