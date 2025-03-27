// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `collectionAddProductsV2` mutation.
*/
public class CollectionAddProductsV2PayloadQuery extends Query<CollectionAddProductsV2PayloadQuery> {
    CollectionAddProductsV2PayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The asynchronous job adding the products.
    */
    public CollectionAddProductsV2PayloadQuery job(JobQueryDefinition queryDef) {
        startField("job");

        _queryBuilder.append('{');
        queryDef.define(new JobQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CollectionAddProductsV2PayloadQuery userErrors(CollectionAddProductsV2UserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new CollectionAddProductsV2UserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
