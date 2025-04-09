// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `sellingPlanGroupRemoveProductVariants` mutation.
*/
public class SellingPlanGroupRemoveProductVariantsPayloadQuery extends Query<SellingPlanGroupRemoveProductVariantsPayloadQuery> {
    SellingPlanGroupRemoveProductVariantsPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The removed product variant ids.
    */
    public SellingPlanGroupRemoveProductVariantsPayloadQuery removedProductVariantIds() {
        startField("removedProductVariantIds");

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public SellingPlanGroupRemoveProductVariantsPayloadQuery userErrors(SellingPlanGroupUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new SellingPlanGroupUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
