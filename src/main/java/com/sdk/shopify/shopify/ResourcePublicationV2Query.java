// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* A resource publication represents information about the publication of a resource.
* Unlike `ResourcePublication`, an instance of `ResourcePublicationV2` can't be unpublished. It must
* either be published or scheduled to be published.
* See [ResourcePublication](/api/admin-graphql/latest/objects/ResourcePublication) for more context.
*/
public class ResourcePublicationV2Query extends Query<ResourcePublicationV2Query> {
    ResourcePublicationV2Query(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Whether the resource publication is published. If true, then the resource publication is published
    * to the publication.
    * If false, then the resource publication is staged to be published to the publication.
    */
    public ResourcePublicationV2Query isPublished() {
        startField("isPublished");

        return this;
    }

    /**
    * The publication the resource publication is published to.
    */
    public ResourcePublicationV2Query publication(PublicationQueryDefinition queryDef) {
        startField("publication");

        _queryBuilder.append('{');
        queryDef.define(new PublicationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date that the resource publication was or is going to be published to the publication.
    */
    public ResourcePublicationV2Query publishDate() {
        startField("publishDate");

        return this;
    }

    /**
    * The resource published to the publication.
    */
    public ResourcePublicationV2Query publishable(PublishableQueryDefinition queryDef) {
        startField("publishable");

        _queryBuilder.append('{');
        queryDef.define(new PublishableQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
