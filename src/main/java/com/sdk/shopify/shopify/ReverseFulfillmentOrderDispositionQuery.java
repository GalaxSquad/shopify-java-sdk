// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The details of the arrangement of an item.
*/
public class ReverseFulfillmentOrderDispositionQuery extends Query<ReverseFulfillmentOrderDispositionQuery> {
    ReverseFulfillmentOrderDispositionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The location where the disposition occurred.
    */
    public ReverseFulfillmentOrderDispositionQuery location(LocationQueryDefinition queryDef) {
        startField("location");

        _queryBuilder.append('{');
        queryDef.define(new LocationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The number of disposed units.
    */
    public ReverseFulfillmentOrderDispositionQuery quantity() {
        startField("quantity");

        return this;
    }

    /**
    * The final arrangement of an item.
    */
    public ReverseFulfillmentOrderDispositionQuery type() {
        startField("type");

        return this;
    }
}
