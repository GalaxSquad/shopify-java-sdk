// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `sellingPlanGroupUpdate` mutation.
*/
public class SellingPlanGroupUpdatePayloadQuery extends Query<SellingPlanGroupUpdatePayloadQuery> {
    SellingPlanGroupUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The IDs of the deleted Subscription Plans.
    */
    public SellingPlanGroupUpdatePayloadQuery deletedSellingPlanIds() {
        startField("deletedSellingPlanIds");

        return this;
    }

    /**
    * The updated Selling Plan Group.
    */
    public SellingPlanGroupUpdatePayloadQuery sellingPlanGroup(SellingPlanGroupQueryDefinition queryDef) {
        startField("sellingPlanGroup");

        _queryBuilder.append('{');
        queryDef.define(new SellingPlanGroupQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public SellingPlanGroupUpdatePayloadQuery userErrors(SellingPlanGroupUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new SellingPlanGroupUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
