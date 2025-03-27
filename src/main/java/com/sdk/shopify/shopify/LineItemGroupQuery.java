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
* A line item group (bundle) to which a line item belongs to.
*/
public class LineItemGroupQuery extends Query<LineItemGroupQuery> {
    LineItemGroupQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * A list of attributes that represent custom features or special requests.
    */
    public LineItemGroupQuery customAttributes(AttributeQueryDefinition queryDef) {
        startField("customAttributes");

        _queryBuilder.append('{');
        queryDef.define(new AttributeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Quantity of the line item group on the order.
    */
    public LineItemGroupQuery quantity() {
        startField("quantity");

        return this;
    }

    /**
    * Title of the line item group.
    */
    public LineItemGroupQuery title() {
        startField("title");

        return this;
    }

    /**
    * ID of the variant of the line item group.
    */
    public LineItemGroupQuery variantId() {
        startField("variantId");

        return this;
    }

    /**
    * SKU of the variant of the line item group.
    */
    public LineItemGroupQuery variantSku() {
        startField("variantSku");

        return this;
    }
}
