// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A returnable fulfillment line item.
*/
public class ReturnableFulfillmentLineItemQuery extends Query<ReturnableFulfillmentLineItemQuery> {
    ReturnableFulfillmentLineItemQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The fulfillment line item that can be returned.
    */
    public ReturnableFulfillmentLineItemQuery fulfillmentLineItem(FulfillmentLineItemQueryDefinition queryDef) {
        startField("fulfillmentLineItem");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentLineItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The quantity available to be returned.
    */
    public ReturnableFulfillmentLineItemQuery quantity() {
        startField("quantity");

        return this;
    }
}
