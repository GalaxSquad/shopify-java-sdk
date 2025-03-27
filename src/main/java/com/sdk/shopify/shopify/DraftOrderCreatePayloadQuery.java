// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `draftOrderCreate` mutation.
*/
public class DraftOrderCreatePayloadQuery extends Query<DraftOrderCreatePayloadQuery> {
    DraftOrderCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The created draft order.
    */
    public DraftOrderCreatePayloadQuery draftOrder(DraftOrderQueryDefinition queryDef) {
        startField("draftOrder");

        _queryBuilder.append('{');
        queryDef.define(new DraftOrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public DraftOrderCreatePayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
