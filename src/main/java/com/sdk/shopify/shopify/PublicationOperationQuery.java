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
* The possible types of publication operations.
*/
public class PublicationOperationQuery extends Query<PublicationOperationQuery> {
    PublicationOperationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public PublicationOperationQuery onAddAllProductsOperation(AddAllProductsOperationQueryDefinition queryDef) {
        startInlineFragment("AddAllProductsOperation");
        queryDef.define(new AddAllProductsOperationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public PublicationOperationQuery onCatalogCsvOperation(CatalogCsvOperationQueryDefinition queryDef) {
        startInlineFragment("CatalogCsvOperation");
        queryDef.define(new CatalogCsvOperationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public PublicationOperationQuery onPublicationResourceOperation(PublicationResourceOperationQueryDefinition queryDef) {
        startInlineFragment("PublicationResourceOperation");
        queryDef.define(new PublicationResourceOperationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
