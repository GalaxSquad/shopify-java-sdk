// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `sellingPlanGroupAddProducts` mutation.
*/
public class SellingPlanGroupAddProductsPayloadQuery extends Query<SellingPlanGroupAddProductsPayloadQuery> {
    SellingPlanGroupAddProductsPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The updated selling plan group.
    */
    public SellingPlanGroupAddProductsPayloadQuery sellingPlanGroup(SellingPlanGroupQueryDefinition queryDef) {
        startField("sellingPlanGroup");

        _queryBuilder.append('{');
        queryDef.define(new SellingPlanGroupQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public SellingPlanGroupAddProductsPayloadQuery userErrors(SellingPlanGroupUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new SellingPlanGroupUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
