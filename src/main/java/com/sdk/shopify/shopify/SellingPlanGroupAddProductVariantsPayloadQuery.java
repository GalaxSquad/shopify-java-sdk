// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `sellingPlanGroupAddProductVariants` mutation.
*/
public class SellingPlanGroupAddProductVariantsPayloadQuery extends Query<SellingPlanGroupAddProductVariantsPayloadQuery> {
    SellingPlanGroupAddProductVariantsPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The updated selling plan group.
    */
    public SellingPlanGroupAddProductVariantsPayloadQuery sellingPlanGroup(SellingPlanGroupQueryDefinition queryDef) {
        startField("sellingPlanGroup");

        _queryBuilder.append('{');
        queryDef.define(new SellingPlanGroupQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public SellingPlanGroupAddProductVariantsPayloadQuery userErrors(SellingPlanGroupUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new SellingPlanGroupUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
