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
* Represents a merchandising background operation interface.
*/
public class ResourceOperationQuery extends Query<ResourceOperationQuery> {
    ResourceOperationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    /**
    * A globally-unique ID.
    */
    public ResourceOperationQuery id() {
        startField("id");

        return this;
    }

    /**
    * The count of processed rows, summing imported, failed, and skipped rows.
    */
    public ResourceOperationQuery processedRowCount() {
        startField("processedRowCount");

        return this;
    }

    /**
    * Represents a rows objects within this background operation.
    */
    public ResourceOperationQuery rowCount(RowCountQueryDefinition queryDef) {
        startField("rowCount");

        _queryBuilder.append('{');
        queryDef.define(new RowCountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The status of this operation.
    */
    public ResourceOperationQuery status() {
        startField("status");

        return this;
    }

    public ResourceOperationQuery onAddAllProductsOperation(AddAllProductsOperationQueryDefinition queryDef) {
        startInlineFragment("AddAllProductsOperation");
        queryDef.define(new AddAllProductsOperationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ResourceOperationQuery onCatalogCsvOperation(CatalogCsvOperationQueryDefinition queryDef) {
        startInlineFragment("CatalogCsvOperation");
        queryDef.define(new CatalogCsvOperationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ResourceOperationQuery onPublicationResourceOperation(PublicationResourceOperationQueryDefinition queryDef) {
        startInlineFragment("PublicationResourceOperation");
        queryDef.define(new PublicationResourceOperationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
