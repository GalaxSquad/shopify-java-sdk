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
* An article in the blogging system.
*/
public class Article extends AbstractResponse<Article> implements HasEvents, HasMetafieldDefinitions, HasMetafields, HasPublishedTranslations, MetafieldReferencer, Navigable, Node {
    public Article() {
    }

    public Article(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "author": {
                    ArticleAuthor optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ArticleAuthor(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "blog": {
                    responseData.put(key, new Blog(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "body": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "comments": {
                    responseData.put(key, new CommentConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "commentsCount": {
                    Count optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Count(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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

                case "image": {
                    Image optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Image(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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

                case "summary": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "tags": {
                    List<String> list1 = new ArrayList<>();
                    for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                        list1.add(jsonAsString(element1, key));
                    }

                    responseData.put(key, list1);

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
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

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

    public Article(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "Article";
    }

    /**
    * The name of the author of the article.
    */

    public ArticleAuthor getAuthor() {
        return (ArticleAuthor) get("author");
    }

    public Article setAuthor(ArticleAuthor arg) {
        optimisticData.put(getKey("author"), arg);
        return this;
    }

    /**
    * The blog containing the article.
    */

    public Blog getBlog() {
        return (Blog) get("blog");
    }

    public Article setBlog(Blog arg) {
        optimisticData.put(getKey("blog"), arg);
        return this;
    }

    /**
    * The text of the article's body, complete with HTML markup.
    */

    public String getBody() {
        return (String) get("body");
    }

    public Article setBody(String arg) {
        optimisticData.put(getKey("body"), arg);
        return this;
    }

    /**
    * List of the article's comments.
    */

    public CommentConnection getComments() {
        return (CommentConnection) get("comments");
    }

    public Article setComments(CommentConnection arg) {
        optimisticData.put(getKey("comments"), arg);
        return this;
    }

    /**
    * Count of comments. Limited to a maximum of 10000 by default.
    */

    public Count getCommentsCount() {
        return (Count) get("commentsCount");
    }

    public Article setCommentsCount(Count arg) {
        optimisticData.put(getKey("commentsCount"), arg);
        return this;
    }

    /**
    * The date and time (ISO 8601 format) when the article was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public Article setCreatedAt(String arg) {
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

    public Article setDefaultCursor(String arg) {
        optimisticData.put(getKey("defaultCursor"), arg);
        return this;
    }

    /**
    * The paginated list of events associated with the host subject.
    */

    public EventConnection getEvents() {
        return (EventConnection) get("events");
    }

    public Article setEvents(EventConnection arg) {
        optimisticData.put(getKey("events"), arg);
        return this;
    }

    /**
    * A unique, human-friendly string for the article that's automatically generated from the article's
    * title.
    * The handle is used in the article's URL.
    */

    public String getHandle() {
        return (String) get("handle");
    }

    public Article setHandle(String arg) {
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
    * The image associated with the article.
    */

    public Image getImage() {
        return (Image) get("image");
    }

    public Article setImage(Image arg) {
        optimisticData.put(getKey("image"), arg);
        return this;
    }

    /**
    * Whether or not the article is visible.
    */

    public Boolean getIsPublished() {
        return (Boolean) get("isPublished");
    }

    public Article setIsPublished(Boolean arg) {
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

    public Article setMetafield(Metafield arg) {
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

    public Article setMetafields(MetafieldConnection arg) {
        optimisticData.put(getKey("metafields"), arg);
        return this;
    }

    /**
    * The date and time (ISO 8601 format) when the article became or will become visible.
    * Returns null when the article isn't visible.
    */

    public String getPublishedAt() {
        return (String) get("publishedAt");
    }

    public Article setPublishedAt(String arg) {
        optimisticData.put(getKey("publishedAt"), arg);
        return this;
    }

    /**
    * A summary of the article, which can include HTML markup.
    * The summary is used by the online store theme to display the article on other pages, such as the
    * home page or the main blog page.
    */

    public String getSummary() {
        return (String) get("summary");
    }

    public Article setSummary(String arg) {
        optimisticData.put(getKey("summary"), arg);
        return this;
    }

    /**
    * A comma-separated list of tags.
    * Tags are additional short descriptors formatted as a string of comma-separated values.
    */

    public List<String> getTags() {
        return (List<String>) get("tags");
    }

    public Article setTags(List<String> arg) {
        optimisticData.put(getKey("tags"), arg);
        return this;
    }

    /**
    * The name of the template an article is using if it's using an alternate template.
    * If an article is using the default `article.liquid` template, then the value returned is `null`.
    */

    public String getTemplateSuffix() {
        return (String) get("templateSuffix");
    }

    public Article setTemplateSuffix(String arg) {
        optimisticData.put(getKey("templateSuffix"), arg);
        return this;
    }

    /**
    * The title of the article.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public Article setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    /**
    * The published translations associated with the resource.
    */

    public List<Translation> getTranslations() {
        return (List<Translation>) get("translations");
    }

    public Article setTranslations(List<Translation> arg) {
        optimisticData.put(getKey("translations"), arg);
        return this;
    }

    /**
    * The date and time (ISO 8601 format) when the article was last updated.
    */

    public String getUpdatedAt() {
        return (String) get("updatedAt");
    }

    public Article setUpdatedAt(String arg) {
        optimisticData.put(getKey("updatedAt"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "author": return true;

            case "blog": return true;

            case "body": return false;

            case "comments": return true;

            case "commentsCount": return true;

            case "createdAt": return false;

            case "defaultCursor": return false;

            case "events": return true;

            case "handle": return false;

            case "id": return false;

            case "image": return true;

            case "isPublished": return false;

            case "metafield": return true;

            case "metafields": return true;

            case "publishedAt": return false;

            case "summary": return false;

            case "tags": return false;

            case "templateSuffix": return false;

            case "title": return false;

            case "translations": return true;

            case "updatedAt": return false;

            default: return false;
        }
    }
}

