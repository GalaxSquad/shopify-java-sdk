// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The details about a reverse delivery line item.
*/
public class ReverseDeliveryLineItemQuery extends Query<ReverseDeliveryLineItemQuery> {
    ReverseDeliveryLineItemQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The dispositions of the item.
    */
    public ReverseDeliveryLineItemQuery dispositions(ReverseFulfillmentOrderDispositionQueryDefinition queryDef) {
        startField("dispositions");

        _queryBuilder.append('{');
        queryDef.define(new ReverseFulfillmentOrderDispositionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The expected number of units.
    */
    public ReverseDeliveryLineItemQuery quantity() {
        startField("quantity");

        return this;
    }

    /**
    * The corresponding reverse fulfillment order line item.
    */
    public ReverseDeliveryLineItemQuery reverseFulfillmentOrderLineItem(ReverseFulfillmentOrderLineItemQueryDefinition queryDef) {
        startField("reverseFulfillmentOrderLineItem");

        _queryBuilder.append('{');
        queryDef.define(new ReverseFulfillmentOrderLineItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
