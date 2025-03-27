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

/**
* A comment on an article.
*/
public class CommentQuery extends Query<CommentQuery> {
    CommentQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The article associated with the comment.
    */
    public CommentQuery article(ArticleQueryDefinition queryDef) {
        startField("article");

        _queryBuilder.append('{');
        queryDef.define(new ArticleQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The comment’s author.
    */
    public CommentQuery author(CommentAuthorQueryDefinition queryDef) {
        startField("author");

        _queryBuilder.append('{');
        queryDef.define(new CommentAuthorQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The content of the comment.
    */
    public CommentQuery body() {
        startField("body");

        return this;
    }

    /**
    * The content of the comment, complete with HTML formatting.
    */
    public CommentQuery bodyHtml() {
        startField("bodyHtml");

        return this;
    }

    /**
    * The date and time when the comment was created.
    */
    public CommentQuery createdAt() {
        startField("createdAt");

        return this;
    }

    public class EventsArguments extends Arguments {
        EventsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public EventsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * The elements that come after the specified
        * [cursor](https://shopify.dev/api/usage/pagination-graphql).
        */
        public EventsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public EventsArguments last(Integer value) {
            if (value != null) {
                startArgument("last");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * The elements that come before the specified
        * [cursor](https://shopify.dev/api/usage/pagination-graphql).
        */
        public EventsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public EventsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * Sort the underlying list using a key. If your query is slow or returns an error, then [try
        * specifying a sort key that matches the field used in the
        * search](https://shopify.dev/api/usage/pagination-graphql#search-performance-considerations).
        */
        public EventsArguments sortKey(EventSortKeys value) {
            if (value != null) {
                startArgument("sortKey");
                _queryBuilder.append(value.toString());
            }
            return this;
        }

        /**
        * A filter made up of terms, connectives, modifiers, and comparators.
        * | name | type | description | acceptable_values | default_value | example_use |
        * | ---- | ---- | ---- | ---- | ---- | ---- |
        * | action | string | The action that occured. | | | - `action:create` |
        * | comments | boolean | Whether or not to include
        * [comment-events](https://shopify.dev/api/admin-graphql/latest/objects/CommentEvent) in your search,
        * passing `false` will exclude comment-events, any other value will include comment-events. | | | -
        * `false`<br/> - `true` |
        * | created_at | time | Filter by the date and time when the event happened. | | | -
        * `created_at:>2020-10-21`<br/> - `created_at:<now` |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | subject_type | string | The resource type affected by this event. See
        * [EventSubjectType](https://shopify.dev/api/admin-graphql/latest/enums/EventSubjectType) for possible
        * values. | | | - `PRODUCT_VARIANT`<br/> - `PRODUCT`<br/> - `COLLECTION` |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public EventsArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface EventsArgumentsDefinition {
        void define(EventsArguments args);
    }

    /**
    * The paginated list of events associated with the host subject.
    */
    public CommentQuery events(EventConnectionQueryDefinition queryDef) {
        return events(args -> {}, queryDef);
    }

    /**
    * The paginated list of events associated with the host subject.
    */
    public CommentQuery events(EventsArgumentsDefinition argsDef, EventConnectionQueryDefinition queryDef) {
        startField("events");

        EventsArguments args = new EventsArguments(_queryBuilder);
        argsDef.define(args);
        EventsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new EventConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The IP address of the commenter.
    */
    public CommentQuery ip() {
        startField("ip");

        return this;
    }

    /**
    * Whether or not the comment is published.
    */
    public CommentQuery isPublished() {
        startField("isPublished");

        return this;
    }

    /**
    * The date and time when the comment was published.
    */
    public CommentQuery publishedAt() {
        startField("publishedAt");

        return this;
    }

    /**
    * The status of the comment.
    */
    public CommentQuery status() {
        startField("status");

        return this;
    }

    /**
    * The date and time when the comment was last updated.
    */
    public CommentQuery updatedAt() {
        startField("updatedAt");

        return this;
    }

    /**
    * The user agent of the commenter.
    */
    public CommentQuery userAgent() {
        startField("userAgent");

        return this;
    }
}
