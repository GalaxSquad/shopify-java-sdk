// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A resource publication represents information about the publication of a resource.
* An instance of `ResourcePublication`, unlike `ResourcePublicationV2`, can be neither published or
* scheduled to be published.
* See [ResourcePublicationV2](/api/admin-graphql/latest/objects/ResourcePublicationV2) for more
* context.
*/
public class ResourcePublication extends AbstractResponse<ResourcePublication> {
    public ResourcePublication() {
    }

    public ResourcePublication(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "isPublished": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "publication": {
                    responseData.put(key, new Publication(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "publishDate": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "publishable": {
                    responseData.put(key, UnknownPublishable.create(jsonAsObject(field.getValue(), key)));

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

    public String getGraphQlTypeName() {
        return "ResourcePublication";
    }

    /**
    * Whether the resource publication is published. Also returns true if the resource publication is
    * scheduled to be published.
    * If false, then the resource publication is neither published nor scheduled to be published.
    */

    public Boolean getIsPublished() {
        return (Boolean) get("isPublished");
    }

    public ResourcePublication setIsPublished(Boolean arg) {
        optimisticData.put(getKey("isPublished"), arg);
        return this;
    }

    /**
    * The publication the resource publication is published to.
    */

    public Publication getPublication() {
        return (Publication) get("publication");
    }

    public ResourcePublication setPublication(Publication arg) {
        optimisticData.put(getKey("publication"), arg);
        return this;
    }

    /**
    * The date that the resource publication was or is going to be published to the publication.
    * If the product isn't published, then this field returns an epoch timestamp.
    */

    public String getPublishDate() {
        return (String) get("publishDate");
    }

    public ResourcePublication setPublishDate(String arg) {
        optimisticData.put(getKey("publishDate"), arg);
        return this;
    }

    /**
    * The resource published to the publication.
    */

    public Publishable getPublishable() {
        return (Publishable) get("publishable");
    }

    public ResourcePublication setPublishable(Publishable arg) {
        optimisticData.put(getKey("publishable"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "isPublished": return false;

            case "publication": return true;

            case "publishDate": return false;

            case "publishable": return false;

            default: return false;
        }
    }
}

