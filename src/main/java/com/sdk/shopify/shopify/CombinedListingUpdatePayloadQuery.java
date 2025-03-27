// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `combinedListingUpdate` mutation.
*/
public class CombinedListingUpdatePayloadQuery extends Query<CombinedListingUpdatePayloadQuery> {
    CombinedListingUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The parent product.
    */
    public CombinedListingUpdatePayloadQuery product(ProductQueryDefinition queryDef) {
        startField("product");

        _queryBuilder.append('{');
        queryDef.define(new ProductQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public CombinedListingUpdatePayloadQuery userErrors(CombinedListingUpdateUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new CombinedListingUpdateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
