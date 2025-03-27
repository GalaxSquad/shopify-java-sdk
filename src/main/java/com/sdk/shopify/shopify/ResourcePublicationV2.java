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

import java.util.Map;

/**
* A resource publication represents information about the publication of a resource.
* Unlike `ResourcePublication`, an instance of `ResourcePublicationV2` can't be unpublished. It must
* either be published or scheduled to be published.
* See [ResourcePublication](/api/admin-graphql/latest/objects/ResourcePublication) for more context.
*/
public class ResourcePublicationV2 extends AbstractResponse<ResourcePublicationV2> {
    public ResourcePublicationV2() {
    }

    public ResourcePublicationV2(JsonObject fields) throws SchemaViolationError {
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
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

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
        return "ResourcePublicationV2";
    }

    /**
    * Whether the resource publication is published. If true, then the resource publication is published
    * to the publication.
    * If false, then the resource publication is staged to be published to the publication.
    */

    public Boolean getIsPublished() {
        return (Boolean) get("isPublished");
    }

    public ResourcePublicationV2 setIsPublished(Boolean arg) {
        optimisticData.put(getKey("isPublished"), arg);
        return this;
    }

    /**
    * The publication the resource publication is published to.
    */

    public Publication getPublication() {
        return (Publication) get("publication");
    }

    public ResourcePublicationV2 setPublication(Publication arg) {
        optimisticData.put(getKey("publication"), arg);
        return this;
    }

    /**
    * The date that the resource publication was or is going to be published to the publication.
    */

    public String getPublishDate() {
        return (String) get("publishDate");
    }

    public ResourcePublicationV2 setPublishDate(String arg) {
        optimisticData.put(getKey("publishDate"), arg);
        return this;
    }

    /**
    * The resource published to the publication.
    */

    public Publishable getPublishable() {
        return (Publishable) get("publishable");
    }

    public ResourcePublicationV2 setPublishable(Publishable arg) {
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

