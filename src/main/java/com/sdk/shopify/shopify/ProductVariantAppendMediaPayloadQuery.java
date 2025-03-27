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
* Return type for `productVariantAppendMedia` mutation.
*/
public class ProductVariantAppendMediaPayloadQuery extends Query<ProductVariantAppendMediaPayloadQuery> {
    ProductVariantAppendMediaPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The product associated with the variants and media.
    */
    public ProductVariantAppendMediaPayloadQuery product(ProductQueryDefinition queryDef) {
        startField("product");

        _queryBuilder.append('{');
        queryDef.define(new ProductQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The product variants that were updated.
    */
    public ProductVariantAppendMediaPayloadQuery productVariants(ProductVariantQueryDefinition queryDef) {
        startField("productVariants");

        _queryBuilder.append('{');
        queryDef.define(new ProductVariantQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of errors that occurred from executing the mutation.
    */
    public ProductVariantAppendMediaPayloadQuery userErrors(MediaUserErrorQueryDefinition queryDef) {
        startField("userErrors");

        _queryBuilder.append('{');
        queryDef.define(new MediaUserErrorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
