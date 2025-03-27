// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

/**
* Return type for `productVariantsBulkUpdate` mutation.
*/
public class ProductVariantsBulkUpdatePayloadQuery extends Query<ProductVariantsBulkUpdatePayloadQuery> {
    ProductVariantsBulkUpdatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The updated product object.
    */
    public ProductVariantsBulkUpdatePayloadQuery product(ProductQueryDefinition queryDef) {
        startField("product");

        _queryBuilder.append('{');
        queryDef.define(new ProductQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The updated variants.
    */
    public ProductVariantsBulkUpdatePayloadQuery productVariants(ProductVariantQueryDefinition queryDef) {
        startField("productVariants");

        _queryBuilder.append('{');
        queryDef.define(new ProductVariantQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public ProductVariantsBulkUpdatePayloadQuery userErrors(ProductVariantsBulkUpdateUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new ProductVariantsBulkUpdateUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
