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
* Represents a [Shopify product
* taxonomy](https://shopify.github.io/product-taxonomy/releases/unstable/?categoryId=sg-4-17-2-17)
* node.
*/
public class ProductTaxonomyNodeQuery extends Query<ProductTaxonomyNodeQuery> {
    ProductTaxonomyNodeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The full name of the product taxonomy node. For example,  Animals & Pet Supplies > Pet Supplies >
    * Dog Supplies > Dog Beds.
    */
    public ProductTaxonomyNodeQuery fullName() {
        startField("fullName");

        return this;
    }

    /**
    * Whether the node is a leaf node.
    */
    public ProductTaxonomyNodeQuery isLeaf() {
        startField("isLeaf");

        return this;
    }

    /**
    * Whether the node is a root node.
    */
    public ProductTaxonomyNodeQuery isRoot() {
        startField("isRoot");

        return this;
    }

    /**
    * The name of the product taxonomy node. For example, Dog Beds.
    */
    public ProductTaxonomyNodeQuery name() {
        startField("name");

        return this;
    }
}
