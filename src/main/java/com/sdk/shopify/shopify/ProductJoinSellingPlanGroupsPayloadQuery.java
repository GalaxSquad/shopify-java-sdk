// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `productJoinSellingPlanGroups` mutation.
*/
public class ProductJoinSellingPlanGroupsPayloadQuery extends Query<ProductJoinSellingPlanGroupsPayloadQuery> {
    ProductJoinSellingPlanGroupsPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The product object.
    */
    public ProductJoinSellingPlanGroupsPayloadQuery product(ProductQueryDefinition queryDef) {
        startField("product");

        _queryBuilder.append('{');
        queryDef.define(new ProductQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public ProductJoinSellingPlanGroupsPayloadQuery userErrors(SellingPlanGroupUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new SellingPlanGroupUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
