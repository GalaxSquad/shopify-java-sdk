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
* A relationship between a component option and a parent option.
*/
public class ProductBundleComponentOptionSelectionQuery extends Query<ProductBundleComponentOptionSelectionQuery> {
    ProductBundleComponentOptionSelectionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The option that existed on the component product prior to the fixed bundle creation.
    */
    public ProductBundleComponentOptionSelectionQuery componentOption(ProductOptionQueryDefinition queryDef) {
        startField("componentOption");

        _queryBuilder.append('{');
        queryDef.define(new ProductOptionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The option that was created on the parent product.
    */
    public ProductBundleComponentOptionSelectionQuery parentOption(ProductOptionQueryDefinition queryDef) {
        startField("parentOption");

        _queryBuilder.append('{');
        queryDef.define(new ProductOptionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The component option values that are actively selected for this relationship.
    */
    public ProductBundleComponentOptionSelectionQuery values(ProductBundleComponentOptionSelectionValueQueryDefinition queryDef) {
        startField("values");

        _queryBuilder.append('{');
        queryDef.define(new ProductBundleComponentOptionSelectionValueQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
