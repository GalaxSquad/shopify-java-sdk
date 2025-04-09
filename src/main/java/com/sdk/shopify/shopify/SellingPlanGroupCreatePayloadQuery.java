// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `sellingPlanGroupCreate` mutation.
*/
public class SellingPlanGroupCreatePayloadQuery extends Query<SellingPlanGroupCreatePayloadQuery> {
    SellingPlanGroupCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The created selling plan group object.
    */
    public SellingPlanGroupCreatePayloadQuery sellingPlanGroup(SellingPlanGroupQueryDefinition queryDef) {
        startField("sellingPlanGroup");

        _queryBuilder.append('{');
        queryDef.define(new SellingPlanGroupQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public SellingPlanGroupCreatePayloadQuery userErrors(SellingPlanGroupUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new SellingPlanGroupUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
