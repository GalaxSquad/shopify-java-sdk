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
* The details of a specific product category within the [Shopify product
* taxonomy](https://shopify.github.io/product-taxonomy/releases/unstable/?categoryId=sg-4-17-2-17).
*/
public class ProductCategoryQuery extends Query<ProductCategoryQuery> {
    ProductCategoryQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The product taxonomy node associated with the product category.
    */
    public ProductCategoryQuery productTaxonomyNode(ProductTaxonomyNodeQueryDefinition queryDef) {
        startField("productTaxonomyNode");

        _queryBuilder.append('{');
        queryDef.define(new ProductTaxonomyNodeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
