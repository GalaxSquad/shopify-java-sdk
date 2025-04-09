// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `productVariantLeaveSellingPlanGroups` mutation.
*/
public class ProductVariantLeaveSellingPlanGroupsPayloadQuery extends Query<ProductVariantLeaveSellingPlanGroupsPayloadQuery> {
    ProductVariantLeaveSellingPlanGroupsPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The product variant object.
    */
    public ProductVariantLeaveSellingPlanGroupsPayloadQuery productVariant(ProductVariantQueryDefinition queryDef) {
        startField("productVariant");

        _queryBuilder.append('{');
        queryDef.define(new ProductVariantQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public ProductVariantLeaveSellingPlanGroupsPayloadQuery userErrors(SellingPlanGroupUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new SellingPlanGroupUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
