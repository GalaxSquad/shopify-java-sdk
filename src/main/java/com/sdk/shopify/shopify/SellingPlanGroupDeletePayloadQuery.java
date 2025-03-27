// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `sellingPlanGroupDelete` mutation.
*/
public class SellingPlanGroupDeletePayloadQuery extends Query<SellingPlanGroupDeletePayloadQuery> {
    SellingPlanGroupDeletePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The ID of the deleted selling plan group object.
    */
    public SellingPlanGroupDeletePayloadQuery deletedSellingPlanGroupId() {
        startField("deletedSellingPlanGroupId");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public SellingPlanGroupDeletePayloadQuery userErrors(SellingPlanGroupUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new SellingPlanGroupUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
