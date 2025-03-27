// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `productCreateMedia` mutation.
*/
public class ProductCreateMediaPayloadQuery extends Query<ProductCreateMediaPayloadQuery> {
    ProductCreateMediaPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The newly created media.
    */
    public ProductCreateMediaPayloadQuery media(MediaQueryDefinition queryDef) {
        startField("media");

        _queryBuilder.append('{');
        queryDef.define(new MediaQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public ProductCreateMediaPayloadQuery mediaUserErrors(MediaUserErrorQueryDefinition queryDef) {
        startField("mediaUserErrors");

        _queryBuilder.append('{');
        queryDef.define(new MediaUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The product associated with the media.
    */
    public ProductCreateMediaPayloadQuery product(ProductQueryDefinition queryDef) {
        startField("product");

        _queryBuilder.append('{');
        queryDef.define(new ProductQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
