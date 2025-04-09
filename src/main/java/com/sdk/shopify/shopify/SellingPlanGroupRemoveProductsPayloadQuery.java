// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `sellingPlanGroupRemoveProducts` mutation.
*/
public class SellingPlanGroupRemoveProductsPayloadQuery extends Query<SellingPlanGroupRemoveProductsPayloadQuery> {
    SellingPlanGroupRemoveProductsPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The removed product ids.
    */
    public SellingPlanGroupRemoveProductsPayloadQuery removedProductIds() {
        startField("removedProductIds");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public SellingPlanGroupRemoveProductsPayloadQuery userErrors(SellingPlanGroupUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new SellingPlanGroupUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
