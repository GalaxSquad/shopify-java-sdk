// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import java.util.Map;

/**
* A comment on an article.
*/
public class Comment extends AbstractResponse<Comment> implements HasEvents, Node {
    public Comment() {
    }

    public Comment(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "article": {
                    Article optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Article(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "author": {
                    responseData.put(key, new CommentAuthor(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "body": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "bodyHtml": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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

                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "ip": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "isPublished": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

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

                case "status": {
                    responseData.put(key, CommentStatus.fromGraphQl(jsonAsString(field.getValue(), key)));

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

                case "userAgent": {
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

    public Comment(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "Comment";
    }

    /**
    * The article associated with the comment.
    */

    public Article getArticle() {
        return (Article) get("article");
    }

    public Comment setArticle(Article arg) {
        optimisticData.put(getKey("article"), arg);
        return this;
    }

    /**
    * The comment’s author.
    */

    public CommentAuthor getAuthor() {
        return (CommentAuthor) get("author");
    }

    public Comment setAuthor(CommentAuthor arg) {
        optimisticData.put(getKey("author"), arg);
        return this;
    }

    /**
    * The content of the comment.
    */

    public String getBody() {
        return (String) get("body");
    }

    public Comment setBody(String arg) {
        optimisticData.put(getKey("body"), arg);
        return this;
    }

    /**
    * The content of the comment, complete with HTML formatting.
    */

    public String getBodyHtml() {
        return (String) get("bodyHtml");
    }

    public Comment setBodyHtml(String arg) {
        optimisticData.put(getKey("bodyHtml"), arg);
        return this;
    }

    /**
    * The date and time when the comment was created.
    */

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public Comment setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * The paginated list of events associated with the host subject.
    */

    public EventConnection getEvents() {
        return (EventConnection) get("events");
    }

    public Comment setEvents(EventConnection arg) {
        optimisticData.put(getKey("events"), arg);
        return this;
    }

    /**
    * A globally-unique ID.
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The IP address of the commenter.
    */

    public String getIp() {
        return (String) get("ip");
    }

    public Comment setIp(String arg) {
        optimisticData.put(getKey("ip"), arg);
        return this;
    }

    /**
    * Whether or not the comment is published.
    */

    public Boolean getIsPublished() {
        return (Boolean) get("isPublished");
    }

    public Comment setIsPublished(Boolean arg) {
        optimisticData.put(getKey("isPublished"), arg);
        return this;
    }

    /**
    * The date and time when the comment was published.
    */

    public String getPublishedAt() {
        return (String) get("publishedAt");
    }

    public Comment setPublishedAt(String arg) {
        optimisticData.put(getKey("publishedAt"), arg);
        return this;
    }

    /**
    * The status of the comment.
    */

    public CommentStatus getStatus() {
        return (CommentStatus) get("status");
    }

    public Comment setStatus(CommentStatus arg) {
        optimisticData.put(getKey("status"), arg);
        return this;
    }

    /**
    * The date and time when the comment was last updated.
    */

    public String getUpdatedAt() {
        return (String) get("updatedAt");
    }

    public Comment setUpdatedAt(String arg) {
        optimisticData.put(getKey("updatedAt"), arg);
        return this;
    }

    /**
    * The user agent of the commenter.
    */

    public String getUserAgent() {
        return (String) get("userAgent");
    }

    public Comment setUserAgent(String arg) {
        optimisticData.put(getKey("userAgent"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "article": return true;

            case "author": return true;

            case "body": return false;

            case "bodyHtml": return false;

            case "createdAt": return false;

            case "events": return true;

            case "id": return false;

            case "ip": return false;

            case "isPublished": return false;

            case "publishedAt": return false;

            case "status": return false;

            case "updatedAt": return false;

            case "userAgent": return false;

            default: return false;
        }
    }
}

