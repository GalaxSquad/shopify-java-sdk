// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* A page on the Online Store.
*/
public class Page extends AbstractResponse<Page> implements HasEvents, HasMetafieldDefinitions, HasMetafields, HasPublishedTranslations, MetafieldReference, MetafieldReferencer, Navigable, Node {
    public Page() {
    }

    public Page(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "body": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "bodySummary": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "createdAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "defaultCursor": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "events": {
                    responseData.put(key, new EventConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "handle": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "isPublished": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "metafield": {
                    Metafield optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Metafield(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "metafields": {
                    responseData.put(key, new MetafieldConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "publishedAt": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "templateSuffix": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "title": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "translations": {
                    List<Translation> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(new Translation(jsonAsObject(element1, key)));
                    }

                    responseData.put(key, list1);

                    break;
                }

                case "updatedAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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

    public Page(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "Page";
    }

    /**
    * The text content of the page, complete with HTML markup.
    */

    public String getBody() {
        return (String) get("body");
    }

    public Page setBody(String arg) {
        optimisticData.put(getKey("body"), arg);
        return this;
    }

    /**
    * The first 150 characters of the page body. If the page body contains more than 150 characters,
    * additional characters are truncated by ellipses.
    */

    public String getBodySummary() {
        return (String) get("bodySummary");
    }

    public Page setBodySummary(String arg) {
        optimisticData.put(getKey("bodySummary"), arg);
        return this;
    }

    /**
    * The date and time (ISO 8601 format) of the page creation.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public Page setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that returns the single next
    * record, sorted ascending by ID.
    */

    public String getDefaultCursor() {
        return (String) get("defaultCursor");
    }

    public Page setDefaultCursor(String arg) {
        optimisticData.put(getKey("defaultCursor"), arg);
        return this;
    }

    /**
    * The paginated list of events associated with the host subject.
    */

    public EventConnection getEvents() {
        return (EventConnection) get("events");
    }

    public Page setEvents(EventConnection arg) {
        optimisticData.put(getKey("events"), arg);
        return this;
    }

    /**
    * A unique, human-friendly string for the page.
    * In themes, the Liquid templating language refers to a page by its handle.
    */

    public String getHandle() {
        return (String) get("handle");
    }

    public Page setHandle(String arg) {
        optimisticData.put(getKey("handle"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * Whether or not the page is visible.
    */

    public Boolean getIsPublished() {
        return (Boolean) get("isPublished");
    }

    public Page setIsPublished(Boolean arg) {
        optimisticData.put(getKey("isPublished"), arg);
        return this;
    }

    /**
    * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
    * including its `namespace` and `key`, that's associated with a Shopify resource
    * for the purposes of adding and storing additional information.
    */

    public Metafield getMetafield() {
        return (Metafield) get("metafield");
    }

    public Page setMetafield(Metafield arg) {
        optimisticData.put(getKey("metafield"), arg);
        return this;
    }

    /**
    * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
    * that a merchant associates with a Shopify resource.
    */

    public MetafieldConnection getMetafields() {
        return (MetafieldConnection) get("metafields");
    }

    public Page setMetafields(MetafieldConnection arg) {
        optimisticData.put(getKey("metafields"), arg);
        return this;
    }

    /**
    * The date and time (ISO 8601 format) when the page became or will become visible.
    * Returns null when the page isn't visible.
    */

    public String getPublishedAt() {
        return (String) get("publishedAt");
    }

    public Page setPublishedAt(String arg) {
        optimisticData.put(getKey("publishedAt"), arg);
        return this;
    }

    /**
    * The suffix of the template that's used to render the page.
    */

    public String getTemplateSuffix() {
        return (String) get("templateSuffix");
    }

    public Page setTemplateSuffix(String arg) {
        optimisticData.put(getKey("templateSuffix"), arg);
        return this;
    }

    /**
    * Title of the page.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public Page setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    /**
    * The published translations associated with the resource.
    */

    public List<Translation> getTranslations() {
        return (List<Translation>) get("translations");
    }

    public Page setTranslations(List<Translation> arg) {
        optimisticData.put(getKey("translations"), arg);
        return this;
    }

    /**
    * The date and time (ISO 8601 format) of the latest page update.
    */

    public String getUpdatedAt() {
        return (String) get("updatedAt");
    }

    public Page setUpdatedAt(String arg) {
        optimisticData.put(getKey("updatedAt"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "body": return false;

            case "bodySummary": return false;

            case "createdAt": return false;

            case "defaultCursor": return false;

            case "events": return true;

            case "handle": return false;

            case "id": return false;

            case "isPublished": return false;

            case "metafield": return true;

            case "metafields": return true;

            case "publishedAt": return false;

            case "templateSuffix": return false;

            case "title": return false;

            case "translations": return true;

            case "updatedAt": return false;

            default: return false;
        }
    }
}

