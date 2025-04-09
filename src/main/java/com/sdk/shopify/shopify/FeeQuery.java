// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A additional cost, charged by the merchant, on an order. Examples include return shipping fees and
* restocking fees.
*/
public class FeeQuery extends Query<FeeQuery> {
    FeeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    /**
    * The unique ID for the Fee.
    */
    public FeeQuery id() {
        startField("id");

        return this;
    }

    public FeeQuery onRestockingFee(RestockingFeeQueryDefinition queryDef) {
        startInlineFragment("RestockingFee");
        queryDef.define(new RestockingFeeQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public FeeQuery onReturnShippingFee(ReturnShippingFeeQueryDefinition queryDef) {
        startInlineFragment("ReturnShippingFee");
        queryDef.define(new ReturnShippingFeeQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
