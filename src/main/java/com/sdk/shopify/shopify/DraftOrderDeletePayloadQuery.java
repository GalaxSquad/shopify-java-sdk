// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `draftOrderDelete` mutation.
*/
public class DraftOrderDeletePayloadQuery extends Query<DraftOrderDeletePayloadQuery> {
    DraftOrderDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ID of the deleted draft order.
    */
    public DraftOrderDeletePayloadQuery deletedId() {
        startField("deletedId");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public DraftOrderDeletePayloadQuery userErrors(UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
