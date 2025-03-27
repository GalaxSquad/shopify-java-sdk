// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `orderEditAddVariant` mutation.
*/
public class OrderEditAddVariantPayloadQuery extends Query<OrderEditAddVariantPayloadQuery> {
    OrderEditAddVariantPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The [calculated line item](https://shopify.dev/api/admin-graphql/latest/objects/calculatedlineitem)
    * that's added during this order edit.
    */
    public OrderEditAddVariantPayloadQuery calculatedLineItem(CalculatedLineItemQueryDefinition queryDef) {
        startField("calculatedLineItem");

        _queryBuilder.append('{');
        queryDef.define(new CalculatedLineItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The [calculated order](https://shopify.dev/api/admin-graphql/latest/objects/calculatedorder)
    * with the edits applied but not saved.
    */
    public OrderEditAddVariantPayloadQuery calculatedOrder(CalculatedOrderQueryDefinition queryDef) {
        startField("calculatedOrder");

        _queryBuilder.append('{');
        queryDef.define(new CalculatedOrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public OrderEditAddVariantPayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
