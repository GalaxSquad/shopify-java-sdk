// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* Represents a resource that can be published to a channel.
* A publishable resource can be either a Product or Collection.
*/
public class UnknownPublishable extends AbstractResponse<UnknownPublishable> implements Publishable {
    public UnknownPublishable() {
    }

    public UnknownPublishable(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "availablePublicationsCount": {
                    Count optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Count(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "publishedOnCurrentPublication": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "publishedOnPublication": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "resourcePublications": {
                    responseData.put(key, new ResourcePublicationConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "resourcePublicationsCount": {
                    Count optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Count(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "resourcePublicationsV2": {
                    responseData.put(key, new ResourcePublicationV2Connection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "unpublishedPublications": {
                    responseData.put(key, new PublicationConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "__typename": {
                    responseData.put(key, jsonAsString(field.getValue(), key));
                    break;
                }
                default: {
                    throw new SchemaViolationError(this, key, field.getValue());
                }
            }
        }
    }

    public static Publishable create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "Collection": {
                return new Collection(fields);
            }

            case "Product": {
                return new Product(fields);
            }

            default: {
                return new UnknownPublishable(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    /**
    * The number of
    * [publications](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication)
    * that a resource is published to, without
    * [feedback errors](https://shopify.dev/docs/api/admin-graphql/latest/objects/ResourceFeedback).
    */

    public Count getAvailablePublicationsCount() {
        return (Count) get("availablePublicationsCount");
    }

    public UnknownPublishable setAvailablePublicationsCount(Count arg) {
        optimisticData.put(getKey("availablePublicationsCount"), arg);
        return this;
    }

    /**
    * Whether the resource is published to the app's
    * [publication](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication).
    * For example, the resource might be published to the app's online store channel.
    */

    public Boolean getPublishedOnCurrentPublication() {
        return (Boolean) get("publishedOnCurrentPublication");
    }

    public UnknownPublishable setPublishedOnCurrentPublication(Boolean arg) {
        optimisticData.put(getKey("publishedOnCurrentPublication"), arg);
        return this;
    }

    /**
    * Whether the resource is published to a specified
    * [publication](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication).
    */

    public Boolean getPublishedOnPublication() {
        return (Boolean) get("publishedOnPublication");
    }

    public UnknownPublishable setPublishedOnPublication(Boolean arg) {
        optimisticData.put(getKey("publishedOnPublication"), arg);
        return this;
    }

    /**
    * The list of resources that are published to a
    * [publication](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication).
    */

    public ResourcePublicationConnection getResourcePublications() {
        return (ResourcePublicationConnection) get("resourcePublications");
    }

    public UnknownPublishable setResourcePublications(ResourcePublicationConnection arg) {
        optimisticData.put(getKey("resourcePublications"), arg);
        return this;
    }

    /**
    * The number of
    * [publications](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication)
    * that a resource is published to, without
    * [feedback errors](https://shopify.dev/docs/api/admin-graphql/latest/objects/ResourceFeedback).
    */

    public Count getResourcePublicationsCount() {
        return (Count) get("resourcePublicationsCount");
    }

    public UnknownPublishable setResourcePublicationsCount(Count arg) {
        optimisticData.put(getKey("resourcePublicationsCount"), arg);
        return this;
    }

    /**
    * The list of resources that are either published or staged to be published to a
    * [publication](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication).
    */

    public ResourcePublicationV2Connection getResourcePublicationsV2() {
        return (ResourcePublicationV2Connection) get("resourcePublicationsV2");
    }

    public UnknownPublishable setResourcePublicationsV2(ResourcePublicationV2Connection arg) {
        optimisticData.put(getKey("resourcePublicationsV2"), arg);
        return this;
    }

    /**
    * The list of [publications](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication)
    * that the resource isn't published to.
    */

    public PublicationConnection getUnpublishedPublications() {
        return (PublicationConnection) get("unpublishedPublications");
    }

    public UnknownPublishable setUnpublishedPublications(PublicationConnection arg) {
        optimisticData.put(getKey("unpublishedPublications"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "availablePublicationsCount": return true;

            case "publishedOnCurrentPublication": return false;

            case "publishedOnPublication": return false;

            case "resourcePublications": return true;

            case "resourcePublicationsCount": return true;

            case "resourcePublicationsV2": return true;

            case "unpublishedPublications": return true;

            default: return false;
        }
    }
}

