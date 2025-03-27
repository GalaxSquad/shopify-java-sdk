// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `productFeedCreate` mutation.
*/
public class ProductFeedCreatePayloadQuery extends Query<ProductFeedCreatePayloadQuery> {
    ProductFeedCreatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The newly created product feed.
    */
    public ProductFeedCreatePayloadQuery productFeed(ProductFeedQueryDefinition queryDef) {
        startField("productFeed");

        _queryBuilder.append('{');
        queryDef.define(new ProductFeedQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public ProductFeedCreatePayloadQuery userErrors(ProductFeedCreateUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new ProductFeedCreateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
