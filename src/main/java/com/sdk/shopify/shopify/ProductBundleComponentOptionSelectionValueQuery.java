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
* A component option value related to a bundle line.
*/
public class ProductBundleComponentOptionSelectionValueQuery extends Query<ProductBundleComponentOptionSelectionValueQuery> {
    ProductBundleComponentOptionSelectionValueQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Selection status of the option.
    */
    public ProductBundleComponentOptionSelectionValueQuery selectionStatus() {
        startField("selectionStatus");

        return this;
    }

    /**
    * The value of the option.
    */
    public ProductBundleComponentOptionSelectionValueQuery value() {
        startField("value");

        return this;
    }
}
