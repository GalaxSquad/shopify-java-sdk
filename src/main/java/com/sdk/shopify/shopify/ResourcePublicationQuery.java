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
* A resource publication represents information about the publication of a resource.
* An instance of `ResourcePublication`, unlike `ResourcePublicationV2`, can be neither published or
* scheduled to be published.
* See [ResourcePublicationV2](/api/admin-graphql/latest/objects/ResourcePublicationV2) for more
* context.
*/
public class ResourcePublicationQuery extends Query<ResourcePublicationQuery> {
    ResourcePublicationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Whether the resource publication is published. Also returns true if the resource publication is
    * scheduled to be published.
    * If false, then the resource publication is neither published nor scheduled to be published.
    */
    public ResourcePublicationQuery isPublished() {
        startField("isPublished");

        return this;
    }

    /**
    * The publication the resource publication is published to.
    */
    public ResourcePublicationQuery publication(PublicationQueryDefinition queryDef) {
        startField("publication");

        _queryBuilder.append('{');
        queryDef.define(new PublicationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date that the resource publication was or is going to be published to the publication.
    * If the product isn't published, then this field returns an epoch timestamp.
    */
    public ResourcePublicationQuery publishDate() {
        startField("publishDate");

        return this;
    }

    /**
    * The resource published to the publication.
    */
    public ResourcePublicationQuery publishable(PublishableQueryDefinition queryDef) {
        startField("publishable");

        _queryBuilder.append('{');
        queryDef.define(new PublishableQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
