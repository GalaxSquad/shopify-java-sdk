// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `draftOrderCalculate` mutation.
*/
public class DraftOrderCalculatePayloadQuery extends Query<DraftOrderCalculatePayloadQuery> {
    DraftOrderCalculatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The calculated properties for a draft order.
    */
    public DraftOrderCalculatePayloadQuery calculatedDraftOrder(CalculatedDraftOrderQueryDefinition queryDef) {
        startField("calculatedDraftOrder");

        _queryBuilder.append('{');
        queryDef.define(new CalculatedDraftOrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public DraftOrderCalculatePayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
