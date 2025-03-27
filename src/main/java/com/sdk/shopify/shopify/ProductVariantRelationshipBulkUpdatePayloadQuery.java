// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Return type for `productVariantRelationshipBulkUpdate` mutation.
*/
public class ProductVariantRelationshipBulkUpdatePayloadQuery extends Query<ProductVariantRelationshipBulkUpdatePayloadQuery> {
    ProductVariantRelationshipBulkUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The product variants with successfully updated product variant relationships.
    */
    public ProductVariantRelationshipBulkUpdatePayloadQuery parentProductVariants(ProductVariantQueryDefinition queryDef) {
        startField("parentProductVariants");

        _queryBuilder.append('{');
        queryDef.define(new ProductVariantQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public ProductVariantRelationshipBulkUpdatePayloadQuery userErrors(ProductVariantRelationshipBulkUpdateUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new ProductVariantRelationshipBulkUpdateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
