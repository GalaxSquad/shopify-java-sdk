// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `productReorderMedia` mutation.
*/
public class ProductReorderMediaPayloadQuery extends Query<ProductReorderMediaPayloadQuery> {
    ProductReorderMediaPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The asynchronous job which reorders the media.
    */
    public ProductReorderMediaPayloadQuery job(JobQueryDefinition queryDef) {
        startField("job");

        _queryBuilder.append('{');
        queryDef.define(new JobQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public ProductReorderMediaPayloadQuery mediaUserErrors(MediaUserErrorQueryDefinition queryDef) {
        startField("mediaUserErrors");

        _queryBuilder.append('{');
        queryDef.define(new MediaUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
