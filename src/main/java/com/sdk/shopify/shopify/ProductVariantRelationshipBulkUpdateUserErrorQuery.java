// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* An error that occurs during the execution of `ProductVariantRelationshipBulkUpdate`.
*/
public class ProductVariantRelationshipBulkUpdateUserErrorQuery extends Query<ProductVariantRelationshipBulkUpdateUserErrorQuery> {
    ProductVariantRelationshipBulkUpdateUserErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The error code.
    */
    public ProductVariantRelationshipBulkUpdateUserErrorQuery code() {
        startField("code");

        return this;
    }

    /**
    * The path to the input field that caused the error.
    */
    public ProductVariantRelationshipBulkUpdateUserErrorQuery field() {
        startField("field");

        return this;
    }

    /**
    * The error message.
    */
    public ProductVariantRelationshipBulkUpdateUserErrorQuery message() {
        startField("message");

        return this;
    }
}
