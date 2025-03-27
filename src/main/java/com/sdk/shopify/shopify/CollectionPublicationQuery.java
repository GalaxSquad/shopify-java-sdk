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
* Represents the publications where a collection is published.
*/
public class CollectionPublicationQuery extends Query<CollectionPublicationQuery> {
    CollectionPublicationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The collection to be published on the publication.
    */
    public CollectionPublicationQuery collection(CollectionQueryDefinition queryDef) {
        startField("collection");

        _queryBuilder.append('{');
        queryDef.define(new CollectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the publication is published or not.
    */
    public CollectionPublicationQuery isPublished() {
        startField("isPublished");

        return this;
    }

    /**
    * The publication where the collection will be published.
    */
    public CollectionPublicationQuery publication(PublicationQueryDefinition queryDef) {
        startField("publication");

        _queryBuilder.append('{');
        queryDef.define(new PublicationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date that the publication was or is going to be published.
    */
    public CollectionPublicationQuery publishDate() {
        startField("publishDate");

        return this;
    }
}
