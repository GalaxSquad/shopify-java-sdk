// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;





/**
* Represents a resource that can be published to a channel.
* A publishable resource can be either a Product or Collection.
*/

public interface Publishable {
    String getGraphQlTypeName();

    Count getAvailablePublicationsCount();

    Boolean getPublishedOnCurrentPublication();

    Boolean getPublishedOnPublication();

    ResourcePublicationConnection getResourcePublications();

    Count getResourcePublicationsCount();

    ResourcePublicationV2Connection getResourcePublicationsV2();

    PublicationConnection getUnpublishedPublications();
}

