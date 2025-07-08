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
* Shopify stores come with a built-in blogging engine, allowing a shop to have one or more blogs. 
* Blogs are meant
* to be used as a type of magazine or newsletter for the shop, with content that changes over time.
*/
public class Blog extends AbstractResponse<Blog> implements HasEvents, HasMetafieldDefinitions, HasMetafields, HasPublishedTranslations, MetafieldReferencer, Node {
    public Blog() {
    }

    public Blog(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "articles": {
                    responseData.put(key, new ArticleConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "articlesCount": {
                    Count optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Count(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "commentPolicy": {
                    responseData.put(key, CommentPolicy.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "createdAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "events": {
                    responseData.put(key, new EventConnection(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "feed": {
                    BlogFeed optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new BlogFeed(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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

    public Blog(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "Blog";
    }

    /**
    * List of the blog's articles.
    */

    public ArticleConnection getArticles() {
        return (ArticleConnection) get("articles");
    }

    public Blog setArticles(ArticleConnection arg) {
        optimisticData.put(getKey("articles"), arg);
        return this;
    }

    /**
    * Count of articles. Limited to a maximum of 10000 by default.
    */

    public Count getArticlesCount() {
        return (Count) get("articlesCount");
    }

    public Blog setArticlesCount(Count arg) {
        optimisticData.put(getKey("articlesCount"), arg);
        return this;
    }

    /**
    * Indicates whether readers can post comments to the blog and if comments are moderated or not.
    */

    public CommentPolicy getCommentPolicy() {
        return (CommentPolicy) get("commentPolicy");
    }

    public Blog setCommentPolicy(CommentPolicy arg) {
        optimisticData.put(getKey("commentPolicy"), arg);
        return this;
    }

    /**
    * The date and time when the blog was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public Blog setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * The paginated list of events associated with the host subject.
    */

    public EventConnection getEvents() {
        return (EventConnection) get("events");
    }

    public Blog setEvents(EventConnection arg) {
        optimisticData.put(getKey("events"), arg);
        return this;
    }

    /**
    * FeedBurner provider details. Any blogs that aren't already integrated with FeedBurner can't use the
    * service.
    */

    public BlogFeed getFeed() {
        return (BlogFeed) get("feed");
    }

    public Blog setFeed(BlogFeed arg) {
        optimisticData.put(getKey("feed"), arg);
        return this;
    }

    /**
    * A unique, human-friendly string for the blog. If no handle is specified, a handle will be generated
    * automatically from the blog title.
    * The handle is customizable and is used by the Liquid templating language to refer to the blog.
    */

    public String getHandle() {
        return (String) get("handle");
    }

    public Blog setHandle(String arg) {
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
    * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
    * including its `namespace` and `key`, that's associated with a Shopify resource
    * for the purposes of adding and storing additional information.
    */

    public Metafield getMetafield() {
        return (Metafield) get("metafield");
    }

    public Blog setMetafield(Metafield arg) {
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

    public Blog setMetafields(MetafieldConnection arg) {
        optimisticData.put(getKey("metafields"), arg);
        return this;
    }

    /**
    * A list of tags associated with the 200 most recent blog articles.
    */

    public List<String> getTags() {
        return (List<String>) get("tags");
    }

    public Blog setTags(List<String> arg) {
        optimisticData.put(getKey("tags"), arg);
        return this;
    }

    /**
    * The name of the template a blog is using if it's using an alternate template.
    * Returns `null` if a blog is using the default blog.liquid template.
    */

    public String getTemplateSuffix() {
        return (String) get("templateSuffix");
    }

    public Blog setTemplateSuffix(String arg) {
        optimisticData.put(getKey("templateSuffix"), arg);
        return this;
    }

    /**
    * The title of the blog.
    */

    public String getTitle() {
        return (String) get("title");
    }

    public Blog setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    /**
    * The published translations associated with the resource.
    */

    public List<Translation> getTranslations() {
        return (List<Translation>) get("translations");
    }

    public Blog setTranslations(List<Translation> arg) {
        optimisticData.put(getKey("translations"), arg);
        return this;
    }

    /**
    * The date and time when the blog was update.
    */

    public String getUpdatedAt() {
        return (String) get("updatedAt");
    }

    public Blog setUpdatedAt(String arg) {
        optimisticData.put(getKey("updatedAt"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "articles": return true;

            case "articlesCount": return true;

            case "commentPolicy": return false;

            case "createdAt": return false;

            case "events": return true;

            case "feed": return true;

            case "handle": return false;

            case "id": return false;

            case "metafield": return true;

            case "metafields": return true;

            case "tags": return false;

            case "templateSuffix": return false;

            case "title": return false;

            case "translations": return true;

            case "updatedAt": return false;

            default: return false;
        }
    }
}

