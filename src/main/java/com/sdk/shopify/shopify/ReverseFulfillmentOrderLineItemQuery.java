// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The details about a reverse fulfillment order line item.
*/
public class ReverseFulfillmentOrderLineItemQuery extends Query<ReverseFulfillmentOrderLineItemQuery> {
    ReverseFulfillmentOrderLineItemQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The dispositions of the item.
    */
    public ReverseFulfillmentOrderLineItemQuery dispositions(ReverseFulfillmentOrderDispositionQueryDefinition queryDef) {
        startField("dispositions");

        _queryBuilder.append('{');
        queryDef.define(new ReverseFulfillmentOrderDispositionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The corresponding fulfillment line item for a reverse fulfillment order line item.
    */
    public ReverseFulfillmentOrderLineItemQuery fulfillmentLineItem(FulfillmentLineItemQueryDefinition queryDef) {
        startField("fulfillmentLineItem");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentLineItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total number of units to be processed.
    */
    public ReverseFulfillmentOrderLineItemQuery totalQuantity() {
        startField("totalQuantity");

        return this;
    }
}
