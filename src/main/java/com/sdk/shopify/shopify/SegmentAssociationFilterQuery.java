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
* A filter that takes a value that's associated with an object. For example, the `tags` field is
* associated with the [`Customer`](/api/admin-graphql/latest/objects/Customer) object.
*/
public class SegmentAssociationFilterQuery extends Query<SegmentAssociationFilterQuery> {
    SegmentAssociationFilterQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The localized name of the filter.
    */
    public SegmentAssociationFilterQuery localizedName() {
        startField("localizedName");

        return this;
    }

    /**
    * Whether a file can have multiple values for a single customer.
    */
    public SegmentAssociationFilterQuery multiValue() {
        startField("multiValue");

        return this;
    }

    /**
    * The query name of the filter.
    */
    public SegmentAssociationFilterQuery queryName() {
        startField("queryName");

        return this;
    }
}
