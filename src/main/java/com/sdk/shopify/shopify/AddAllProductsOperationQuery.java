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
* Represents an operation publishing all products to a publication.
*/
public class AddAllProductsOperationQuery extends Query<AddAllProductsOperationQuery> {
    AddAllProductsOperationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The count of processed rows, summing imported, failed, and skipped rows.
    */
    public AddAllProductsOperationQuery processedRowCount() {
        startField("processedRowCount");

        return this;
    }

    /**
    * Represents a rows objects within this background operation.
    */
    public AddAllProductsOperationQuery rowCount(RowCountQueryDefinition queryDef) {
        startField("rowCount");

        _queryBuilder.append('{');
        queryDef.define(new RowCountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The status of this operation.
    */
    public AddAllProductsOperationQuery status() {
        startField("status");

        return this;
    }
}
