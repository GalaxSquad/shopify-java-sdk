// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

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
