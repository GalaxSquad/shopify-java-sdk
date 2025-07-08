// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;
import java.util.List;

/**
* The schema's entry-point for queries. This acts as the public, top-level API from which all queries
* must start.
*/
public class QueryRootQuery extends Query<QueryRootQuery> {
    QueryRootQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class AbandonedCheckoutsArguments extends Arguments {
        AbandonedCheckoutsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public AbandonedCheckoutsArguments first(Integer value) {
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
        public AbandonedCheckoutsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public AbandonedCheckoutsArguments last(Integer value) {
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
        public AbandonedCheckoutsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public AbandonedCheckoutsArguments reverse(Boolean value) {
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
        public AbandonedCheckoutsArguments sortKey(AbandonedCheckoutSortKeys value) {
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
        * | default | string | Filter by a case-insensitive search of multiple fields in a document. | | | -
        * `query=Bob Norman`<br/> - `query=title:green hoodie` |
        * | created_at | time | The date and time (in [ISO 8601
        * format](http://en.wikipedia.org/wiki/ISO_8601)) when the abandoned cart was created. |
        * | email_state | string | Filter by `abandoned_email_state` value. Possible values: `sent`,
        * `not_sent`, `scheduled` and `suppressed`. |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | recovery_state | string | Possible values: `recovered` and `not_recovered`. |
        * | status | string | Possible values: `open` and `closed`. |
        * | updated_at | time | The date and time (in [ISO 8601
        * format](http://en.wikipedia.org/wiki/ISO_8601)) when the abandoned cart was last updated. |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public AbandonedCheckoutsArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The ID of a [saved
        * search](https://shopify.dev/api/admin-graphql/latest/objects/savedsearch#field-id).
        * The search’s query string is used as the query argument.
        */
        public AbandonedCheckoutsArguments savedSearchId(ID value) {
            if (value != null) {
                startArgument("savedSearchId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface AbandonedCheckoutsArgumentsDefinition {
        void define(AbandonedCheckoutsArguments args);
    }

    /**
    * List of abandoned checkouts. Includes checkouts that were recovered after being abandoned.
    */
    public QueryRootQuery abandonedCheckouts(AbandonedCheckoutConnectionQueryDefinition queryDef) {
        return abandonedCheckouts(args -> {}, queryDef);
    }

    /**
    * List of abandoned checkouts. Includes checkouts that were recovered after being abandoned.
    */
    public QueryRootQuery abandonedCheckouts(AbandonedCheckoutsArgumentsDefinition argsDef, AbandonedCheckoutConnectionQueryDefinition queryDef) {
        startField("abandonedCheckouts");

        AbandonedCheckoutsArguments args = new AbandonedCheckoutsArguments(_queryBuilder);
        argsDef.define(args);
        AbandonedCheckoutsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new AbandonedCheckoutConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class AbandonedCheckoutsCountArguments extends Arguments {
        AbandonedCheckoutsCountArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * A filter made up of terms, connectives, modifiers, and comparators.
        * | name | type | description | acceptable_values | default_value | example_use |
        * | ---- | ---- | ---- | ---- | ---- | ---- |
        * | default | string | Filter by a case-insensitive search of multiple fields in a document. | | | -
        * `query=Bob Norman`<br/> - `query=title:green hoodie` |
        * | created_at | time | The date and time (in [ISO 8601
        * format](http://en.wikipedia.org/wiki/ISO_8601)) when the abandoned cart was created. |
        * | email_state | string | Filter by `abandoned_email_state` value. Possible values: `sent`,
        * `not_sent`, `scheduled` and `suppressed`. |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | recovery_state | string | Possible values: `recovered` and `not_recovered`. |
        * | status | string | Possible values: `open` and `closed`. |
        * | updated_at | time | The date and time (in [ISO 8601
        * format](http://en.wikipedia.org/wiki/ISO_8601)) when the abandoned cart was last updated. |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public AbandonedCheckoutsCountArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The ID of an existing saved search.
        * The search’s query string is used as the query argument.
        * Refer to the [`SavedSearch`](https://shopify.dev/api/admin-graphql/latest/objects/savedsearch)
        * object.
        */
        public AbandonedCheckoutsCountArguments savedSearchId(ID value) {
            if (value != null) {
                startArgument("savedSearchId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The upper bound on count value before returning a result. Use `null` to have no limit.
        */
        public AbandonedCheckoutsCountArguments limit(Integer value) {
            if (value != null) {
                startArgument("limit");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface AbandonedCheckoutsCountArgumentsDefinition {
        void define(AbandonedCheckoutsCountArguments args);
    }

    /**
    * Returns the count of abandoned checkouts for the given shop. Limited to a maximum of 10000 by
    * default.
    */
    public QueryRootQuery abandonedCheckoutsCount(CountQueryDefinition queryDef) {
        return abandonedCheckoutsCount(args -> {}, queryDef);
    }

    /**
    * Returns the count of abandoned checkouts for the given shop. Limited to a maximum of 10000 by
    * default.
    */
    public QueryRootQuery abandonedCheckoutsCount(AbandonedCheckoutsCountArgumentsDefinition argsDef, CountQueryDefinition queryDef) {
        startField("abandonedCheckoutsCount");

        AbandonedCheckoutsCountArguments args = new AbandonedCheckoutsCountArguments(_queryBuilder);
        argsDef.define(args);
        AbandonedCheckoutsCountArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns an abandonment by ID.
    */
    public QueryRootQuery abandonment(ID id, AbandonmentQueryDefinition queryDef) {
        startField("abandonment");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AbandonmentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns an Abandonment by the Abandoned Checkout ID.
    */
    public QueryRootQuery abandonmentByAbandonedCheckoutId(ID abandonedCheckoutId, AbandonmentQueryDefinition queryDef) {
        startField("abandonmentByAbandonedCheckoutId");

        _queryBuilder.append("(abandonedCheckoutId:");
        Query.appendQuotedString(_queryBuilder, abandonedCheckoutId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AbandonmentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class AppArguments extends Arguments {
        AppArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The ID to lookup the App by.
        */
        public AppArguments id(ID value) {
            if (value != null) {
                startArgument("id");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface AppArgumentsDefinition {
        void define(AppArguments args);
    }

    /**
    * Lookup an App by ID or return the currently authenticated App.
    */
    public QueryRootQuery app(AppQueryDefinition queryDef) {
        return app(args -> {}, queryDef);
    }

    /**
    * Lookup an App by ID or return the currently authenticated App.
    */
    public QueryRootQuery app(AppArgumentsDefinition argsDef, AppQueryDefinition queryDef) {
        startField("app");

        AppArguments args = new AppArguments(_queryBuilder);
        argsDef.define(args);
        AppArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new AppQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Fetches app by handle.
    * Returns null if the app doesn't exist.
    */
    public QueryRootQuery appByHandle(String handle, AppQueryDefinition queryDef) {
        startField("appByHandle");

        _queryBuilder.append("(handle:");
        Query.appendQuotedString(_queryBuilder, handle.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AppQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Fetches an app by its client ID.
    * Returns null if the app doesn't exist.
    */
    public QueryRootQuery appByKey(String apiKey, AppQueryDefinition queryDef) {
        startField("appByKey");

        _queryBuilder.append("(apiKey:");
        Query.appendQuotedString(_queryBuilder, apiKey.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AppQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * An app discount type.
    */
    public QueryRootQuery appDiscountType(String functionId, AppDiscountTypeQueryDefinition queryDef) {
        startField("appDiscountType");

        _queryBuilder.append("(functionId:");
        Query.appendQuotedString(_queryBuilder, functionId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AppDiscountTypeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A list of app discount types installed by apps.
    */
    public QueryRootQuery appDiscountTypes(AppDiscountTypeQueryDefinition queryDef) {
        startField("appDiscountTypes");

        _queryBuilder.append('{');
        queryDef.define(new AppDiscountTypeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class AppDiscountTypesNodesArguments extends Arguments {
        AppDiscountTypesNodesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public AppDiscountTypesNodesArguments first(Integer value) {
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
        public AppDiscountTypesNodesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public AppDiscountTypesNodesArguments last(Integer value) {
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
        public AppDiscountTypesNodesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public AppDiscountTypesNodesArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface AppDiscountTypesNodesArgumentsDefinition {
        void define(AppDiscountTypesNodesArguments args);
    }

    /**
    * A list of app discount types installed by apps.
    */
    public QueryRootQuery appDiscountTypesNodes(AppDiscountTypeConnectionQueryDefinition queryDef) {
        return appDiscountTypesNodes(args -> {}, queryDef);
    }

    /**
    * A list of app discount types installed by apps.
    */
    public QueryRootQuery appDiscountTypesNodes(AppDiscountTypesNodesArgumentsDefinition argsDef, AppDiscountTypeConnectionQueryDefinition queryDef) {
        startField("appDiscountTypesNodes");

        AppDiscountTypesNodesArguments args = new AppDiscountTypesNodesArguments(_queryBuilder);
        argsDef.define(args);
        AppDiscountTypesNodesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new AppDiscountTypeConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class AppInstallationArguments extends Arguments {
        AppInstallationArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * ID used to lookup AppInstallation.
        */
        public AppInstallationArguments id(ID value) {
            if (value != null) {
                startArgument("id");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface AppInstallationArgumentsDefinition {
        void define(AppInstallationArguments args);
    }

    /**
    * Lookup an AppInstallation by ID or return the AppInstallation for the currently authenticated App.
    */
    public QueryRootQuery appInstallation(AppInstallationQueryDefinition queryDef) {
        return appInstallation(args -> {}, queryDef);
    }

    /**
    * Lookup an AppInstallation by ID or return the AppInstallation for the currently authenticated App.
    */
    public QueryRootQuery appInstallation(AppInstallationArgumentsDefinition argsDef, AppInstallationQueryDefinition queryDef) {
        startField("appInstallation");

        AppInstallationArguments args = new AppInstallationArguments(_queryBuilder);
        argsDef.define(args);
        AppInstallationArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new AppInstallationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class AppInstallationsArguments extends Arguments {
        AppInstallationsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public AppInstallationsArguments first(Integer value) {
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
        public AppInstallationsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public AppInstallationsArguments last(Integer value) {
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
        public AppInstallationsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public AppInstallationsArguments reverse(Boolean value) {
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
        public AppInstallationsArguments sortKey(AppInstallationSortKeys value) {
            if (value != null) {
                startArgument("sortKey");
                _queryBuilder.append(value.toString());
            }
            return this;
        }

        /**
        * The category of app installations to fetch.
        */
        public AppInstallationsArguments category(AppInstallationCategory value) {
            if (value != null) {
                startArgument("category");
                _queryBuilder.append(value.toString());
            }
            return this;
        }

        /**
        * The privacy level of app installations to fetch.
        */
        public AppInstallationsArguments privacy(AppInstallationPrivacy value) {
            if (value != null) {
                startArgument("privacy");
                _queryBuilder.append(value.toString());
            }
            return this;
        }
    }

    public interface AppInstallationsArgumentsDefinition {
        void define(AppInstallationsArguments args);
    }

    /**
    * A list of app installations. To use this query, you need to contact [Shopify
    * Support](https://partners.shopify.com/current/support/) to grant your custom app the `read_apps`
    * access scope. Public apps can't be granted this access scope.
    */
    public QueryRootQuery appInstallations(AppInstallationConnectionQueryDefinition queryDef) {
        return appInstallations(args -> {}, queryDef);
    }

    /**
    * A list of app installations. To use this query, you need to contact [Shopify
    * Support](https://partners.shopify.com/current/support/) to grant your custom app the `read_apps`
    * access scope. Public apps can't be granted this access scope.
    */
    public QueryRootQuery appInstallations(AppInstallationsArgumentsDefinition argsDef, AppInstallationConnectionQueryDefinition queryDef) {
        startField("appInstallations");

        AppInstallationsArguments args = new AppInstallationsArguments(_queryBuilder);
        argsDef.define(args);
        AppInstallationsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new AppInstallationConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns an Article resource by ID.
    */
    public QueryRootQuery article(ID id, ArticleQueryDefinition queryDef) {
        startField("article");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ArticleQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ArticleAuthorsArguments extends Arguments {
        ArticleAuthorsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ArticleAuthorsArguments first(Integer value) {
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
        public ArticleAuthorsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ArticleAuthorsArguments last(Integer value) {
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
        public ArticleAuthorsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public ArticleAuthorsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ArticleAuthorsArgumentsDefinition {
        void define(ArticleAuthorsArguments args);
    }

    /**
    * List of article authors for the shop.
    */
    public QueryRootQuery articleAuthors(ArticleAuthorConnectionQueryDefinition queryDef) {
        return articleAuthors(args -> {}, queryDef);
    }

    /**
    * List of article authors for the shop.
    */
    public QueryRootQuery articleAuthors(ArticleAuthorsArgumentsDefinition argsDef, ArticleAuthorConnectionQueryDefinition queryDef) {
        startField("articleAuthors");

        ArticleAuthorsArguments args = new ArticleAuthorsArguments(_queryBuilder);
        argsDef.define(args);
        ArticleAuthorsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ArticleAuthorConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ArticleTagsArguments extends Arguments {
        ArticleTagsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * Type of sort order.
        */
        public ArticleTagsArguments sort(ArticleTagSort value) {
            if (value != null) {
                startArgument("sort");
                _queryBuilder.append(value.toString());
            }
            return this;
        }
    }

    public interface ArticleTagsArgumentsDefinition {
        void define(ArticleTagsArguments args);
    }

    /**
    * List of all article tags.
    */
    public QueryRootQuery articleTags(int limit) {
        return articleTags(limit, args -> {});
    }

    /**
    * List of all article tags.
    */
    public QueryRootQuery articleTags(int limit, ArticleTagsArgumentsDefinition argsDef) {
        startField("articleTags");

        _queryBuilder.append("(limit:");
        _queryBuilder.append(limit);

        argsDef.define(new ArticleTagsArguments(_queryBuilder));

        _queryBuilder.append(')');

        return this;
    }

    public class ArticlesArguments extends Arguments {
        ArticlesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ArticlesArguments first(Integer value) {
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
        public ArticlesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ArticlesArguments last(Integer value) {
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
        public ArticlesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public ArticlesArguments reverse(Boolean value) {
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
        public ArticlesArguments sortKey(ArticleSortKeys value) {
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
        * | default | string | Filter by a case-insensitive search of multiple fields in a document. | | | -
        * `query=Bob Norman`<br/> - `query=handle:summer-collection-announcement` |
        * | author | string | Filter by the author of the article. |
        * | blog_id | string | Filter by the ID of the blog the article belongs to. | | | -
        * `blog_id:1234`<br/> - `blog_id:>=1234`<br/> - `blog_id:<=1234` |
        * | blog_title | string |
        * | created_at | time | Filter by the date and time when the article was created. | | | -
        * `created_at:>'2020-10-21T23:39:20Z'`<br/> - `created_at:<now`<br/> - `created_at:<=2024` |
        * | handle | string | Filter by the article's handle. | | | -
        * `handle:summer-collection-announcement`<br/> - `handle:how-to-guide` |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | published_at | time | Filter by the date and time when the article was published. | | | -
        * `published_at:>'2020-10-21T23:39:20Z'`<br/> - `published_at:<now`<br/> - `published_at:<=2024` |
        * | published_status | string | Filter by published status |
        * | tag | string | Filter objects by the `tag` field. | | | - `tag:my_tag` |
        * | tag_not | string | Filter by objects that don’t have the specified tag. | | | - `tag_not:my_tag` |
        * | title | string | Filter by the title of the article. | | | - `title:summer-collection`<br/> -
        * `title:green hoodie` |
        * | updated_at | time | Filter by the date and time when the article was last updated. | | | -
        * `updated_at:>'2020-10-21T23:39:20Z'`<br/> - `updated_at:<now`<br/> - `updated_at:<=2024` |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public ArticlesArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface ArticlesArgumentsDefinition {
        void define(ArticlesArguments args);
    }

    /**
    * List of the shop's articles.
    */
    public QueryRootQuery articles(ArticleConnectionQueryDefinition queryDef) {
        return articles(args -> {}, queryDef);
    }

    /**
    * List of the shop's articles.
    */
    public QueryRootQuery articles(ArticlesArgumentsDefinition argsDef, ArticleConnectionQueryDefinition queryDef) {
        startField("articles");

        ArticlesArguments args = new ArticlesArguments(_queryBuilder);
        argsDef.define(args);
        ArticlesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ArticleConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class AssignedFulfillmentOrdersArguments extends Arguments {
        AssignedFulfillmentOrdersArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The assigment status of the fulfillment orders that should be returned.
        * If `assignmentStatus` argument is not provided, then
        * the query will return all assigned fulfillment orders,
        * except those that have the `CLOSED` status.
        */
        public AssignedFulfillmentOrdersArguments assignmentStatus(FulfillmentOrderAssignmentStatus value) {
            if (value != null) {
                startArgument("assignmentStatus");
                _queryBuilder.append(value.toString());
            }
            return this;
        }

        /**
        * Returns fulfillment orders only for certain locations, specified by a list of location IDs.
        */
        public AssignedFulfillmentOrdersArguments locationIds(List<ID> value) {
            if (value != null) {
                startArgument("locationIds");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public AssignedFulfillmentOrdersArguments first(Integer value) {
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
        public AssignedFulfillmentOrdersArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public AssignedFulfillmentOrdersArguments last(Integer value) {
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
        public AssignedFulfillmentOrdersArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public AssignedFulfillmentOrdersArguments reverse(Boolean value) {
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
        public AssignedFulfillmentOrdersArguments sortKey(FulfillmentOrderSortKeys value) {
            if (value != null) {
                startArgument("sortKey");
                _queryBuilder.append(value.toString());
            }
            return this;
        }
    }

    public interface AssignedFulfillmentOrdersArgumentsDefinition {
        void define(AssignedFulfillmentOrdersArguments args);
    }

    /**
    * The paginated list of fulfillment orders assigned to the shop locations owned by the app.
    * Assigned fulfillment orders are fulfillment orders that are set to be fulfilled from locations
    * managed by
    * [fulfillment services](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentService)
    * that are registered by the app.
    * One app (api_client) can host multiple fulfillment services on a shop.
    * Each fulfillment service manages a dedicated location on a shop.
    * Assigned fulfillment orders can have associated
    * [fulfillment
    * requests](https://shopify.dev/api/admin-graphql/latest/enums/FulfillmentOrderRequestStatus),
    * or might currently not be requested to be fulfilled.
    * The app must have the `read_assigned_fulfillment_orders`
    * [access scope](https://shopify.dev/docs/api/usage/access-scopes)
    * to be able to retrieve the fulfillment orders assigned to its locations.
    * All assigned fulfillment orders (except those with the `CLOSED` status) will be returned by default.
    * Perform filtering with the `assignmentStatus` argument
    * to receive only fulfillment orders that have been requested to be fulfilled.
    */
    public QueryRootQuery assignedFulfillmentOrders(FulfillmentOrderConnectionQueryDefinition queryDef) {
        return assignedFulfillmentOrders(args -> {}, queryDef);
    }

    /**
    * The paginated list of fulfillment orders assigned to the shop locations owned by the app.
    * Assigned fulfillment orders are fulfillment orders that are set to be fulfilled from locations
    * managed by
    * [fulfillment services](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentService)
    * that are registered by the app.
    * One app (api_client) can host multiple fulfillment services on a shop.
    * Each fulfillment service manages a dedicated location on a shop.
    * Assigned fulfillment orders can have associated
    * [fulfillment
    * requests](https://shopify.dev/api/admin-graphql/latest/enums/FulfillmentOrderRequestStatus),
    * or might currently not be requested to be fulfilled.
    * The app must have the `read_assigned_fulfillment_orders`
    * [access scope](https://shopify.dev/docs/api/usage/access-scopes)
    * to be able to retrieve the fulfillment orders assigned to its locations.
    * All assigned fulfillment orders (except those with the `CLOSED` status) will be returned by default.
    * Perform filtering with the `assignmentStatus` argument
    * to receive only fulfillment orders that have been requested to be fulfilled.
    */
    public QueryRootQuery assignedFulfillmentOrders(AssignedFulfillmentOrdersArgumentsDefinition argsDef, FulfillmentOrderConnectionQueryDefinition queryDef) {
        startField("assignedFulfillmentOrders");

        AssignedFulfillmentOrdersArguments args = new AssignedFulfillmentOrdersArguments(_queryBuilder);
        argsDef.define(args);
        AssignedFulfillmentOrdersArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns an automatic discount resource by ID.
    */
    public QueryRootQuery automaticDiscountNode(ID id, DiscountAutomaticNodeQueryDefinition queryDef) {
        startField("automaticDiscountNode");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DiscountAutomaticNodeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class AutomaticDiscountNodesArguments extends Arguments {
        AutomaticDiscountNodesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public AutomaticDiscountNodesArguments first(Integer value) {
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
        public AutomaticDiscountNodesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public AutomaticDiscountNodesArguments last(Integer value) {
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
        public AutomaticDiscountNodesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public AutomaticDiscountNodesArguments reverse(Boolean value) {
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
        public AutomaticDiscountNodesArguments sortKey(AutomaticDiscountSortKeys value) {
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
        * | default | string | Filter by a case-insensitive search of multiple fields in a document. | | | -
        * `query=Bob Norman`<br/> - `query=title:green hoodie` |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | status | string | Filter by the discount status. | - `active`<br/> - `expired`<br/> - `scheduled`
        * | | - `status:scheduled` |
        * | type | string | Filter by the [discount
        * type](https://help.shopify.com/manual/discounts/discount-types). | - `all`<br/> -
        * `all_with_app`<br/> - `app`<br/> - `bxgy`<br/> - `fixed_amount`<br/> - `percentage` | | -
        * `type:bxgy` |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public AutomaticDiscountNodesArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The ID of a [saved
        * search](https://shopify.dev/api/admin-graphql/latest/objects/savedsearch#field-id).
        * The search’s query string is used as the query argument.
        */
        public AutomaticDiscountNodesArguments savedSearchId(ID value) {
            if (value != null) {
                startArgument("savedSearchId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface AutomaticDiscountNodesArgumentsDefinition {
        void define(AutomaticDiscountNodesArguments args);
    }

    /**
    * Returns a list of [automatic
    * discounts](https://help.shopify.com/manual/discounts/discount-types#automatic-discounts).
    */
    public QueryRootQuery automaticDiscountNodes(DiscountAutomaticNodeConnectionQueryDefinition queryDef) {
        return automaticDiscountNodes(args -> {}, queryDef);
    }

    /**
    * Returns a list of [automatic
    * discounts](https://help.shopify.com/manual/discounts/discount-types#automatic-discounts).
    */
    public QueryRootQuery automaticDiscountNodes(AutomaticDiscountNodesArgumentsDefinition argsDef, DiscountAutomaticNodeConnectionQueryDefinition queryDef) {
        startField("automaticDiscountNodes");

        AutomaticDiscountNodesArguments args = new AutomaticDiscountNodesArguments(_queryBuilder);
        argsDef.define(args);
        AutomaticDiscountNodesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new DiscountAutomaticNodeConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class AutomaticDiscountSavedSearchesArguments extends Arguments {
        AutomaticDiscountSavedSearchesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public AutomaticDiscountSavedSearchesArguments first(Integer value) {
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
        public AutomaticDiscountSavedSearchesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public AutomaticDiscountSavedSearchesArguments last(Integer value) {
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
        public AutomaticDiscountSavedSearchesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public AutomaticDiscountSavedSearchesArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface AutomaticDiscountSavedSearchesArgumentsDefinition {
        void define(AutomaticDiscountSavedSearchesArguments args);
    }

    /**
    * List of the shop's automatic discount saved searches.
    */
    public QueryRootQuery automaticDiscountSavedSearches(SavedSearchConnectionQueryDefinition queryDef) {
        return automaticDiscountSavedSearches(args -> {}, queryDef);
    }

    /**
    * List of the shop's automatic discount saved searches.
    */
    public QueryRootQuery automaticDiscountSavedSearches(AutomaticDiscountSavedSearchesArgumentsDefinition argsDef, SavedSearchConnectionQueryDefinition queryDef) {
        startField("automaticDiscountSavedSearches");

        AutomaticDiscountSavedSearchesArguments args = new AutomaticDiscountSavedSearchesArguments(_queryBuilder);
        argsDef.define(args);
        AutomaticDiscountSavedSearchesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SavedSearchConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The regions that can be used as the backup region of the shop.
    */
    public QueryRootQuery availableBackupRegions(MarketRegionQueryDefinition queryDef) {
        startField("availableBackupRegions");

        _queryBuilder.append('{');
        queryDef.define(new MarketRegionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns a list of activated carrier services and associated shop locations that support them.
    */
    public QueryRootQuery availableCarrierServices(DeliveryCarrierServiceAndLocationsQueryDefinition queryDef) {
        startField("availableCarrierServices");

        _queryBuilder.append('{');
        queryDef.define(new DeliveryCarrierServiceAndLocationsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A list of available locales.
    */
    public QueryRootQuery availableLocales(LocaleQueryDefinition queryDef) {
        startField("availableLocales");

        _queryBuilder.append('{');
        queryDef.define(new LocaleQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The backup region of the shop.
    */
    public QueryRootQuery backupRegion(MarketRegionQueryDefinition queryDef) {
        startField("backupRegion");

        _queryBuilder.append('{');
        queryDef.define(new MarketRegionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns a Blog resource by ID.
    */
    public QueryRootQuery blog(ID id, BlogQueryDefinition queryDef) {
        startField("blog");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new BlogQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class BlogsArguments extends Arguments {
        BlogsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public BlogsArguments first(Integer value) {
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
        public BlogsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public BlogsArguments last(Integer value) {
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
        public BlogsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public BlogsArguments reverse(Boolean value) {
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
        public BlogsArguments sortKey(BlogSortKeys value) {
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
        * | default | string | Filter by a case-insensitive search of multiple fields in a document. | | | -
        * `query=Bob Norman`<br/> - `query=title:green hoodie` |
        * | created_at | time |
        * | handle | string |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | title | string |
        * | updated_at | time |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public BlogsArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface BlogsArgumentsDefinition {
        void define(BlogsArguments args);
    }

    /**
    * List of the shop's blogs.
    */
    public QueryRootQuery blogs(BlogConnectionQueryDefinition queryDef) {
        return blogs(args -> {}, queryDef);
    }

    /**
    * List of the shop's blogs.
    */
    public QueryRootQuery blogs(BlogsArgumentsDefinition argsDef, BlogConnectionQueryDefinition queryDef) {
        startField("blogs");

        BlogsArguments args = new BlogsArguments(_queryBuilder);
        argsDef.define(args);
        BlogsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new BlogConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class BlogsCountArguments extends Arguments {
        BlogsCountArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * A filter made up of terms, connectives, modifiers, and comparators.
        * | name | type | description | acceptable_values | default_value | example_use |
        * | ---- | ---- | ---- | ---- | ---- | ---- |
        * | default | string | Filter by a case-insensitive search of multiple fields in a document. | | | -
        * `query=Bob Norman`<br/> - `query=title:green hoodie` |
        * | created_at | time |
        * | handle | string |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | title | string |
        * | updated_at | time |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public BlogsCountArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The upper bound on count value before returning a result. Use `null` to have no limit.
        */
        public BlogsCountArguments limit(Integer value) {
            if (value != null) {
                startArgument("limit");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface BlogsCountArgumentsDefinition {
        void define(BlogsCountArguments args);
    }

    /**
    * Count of blogs. Limited to a maximum of 10000 by default.
    */
    public QueryRootQuery blogsCount(CountQueryDefinition queryDef) {
        return blogsCount(args -> {}, queryDef);
    }

    /**
    * Count of blogs. Limited to a maximum of 10000 by default.
    */
    public QueryRootQuery blogsCount(BlogsCountArgumentsDefinition argsDef, CountQueryDefinition queryDef) {
        startField("blogsCount");

        BlogsCountArguments args = new BlogsCountArguments(_queryBuilder);
        argsDef.define(args);
        BlogsCountArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns a list of Business Entities associated with the shop.
    */
    public QueryRootQuery businessEntities(BusinessEntityQueryDefinition queryDef) {
        startField("businessEntities");

        _queryBuilder.append('{');
        queryDef.define(new BusinessEntityQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class BusinessEntityArguments extends Arguments {
        BusinessEntityArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The ID of the Business Entity to return. Returns the primary Business Entity if not provided.
        */
        public BusinessEntityArguments id(ID value) {
            if (value != null) {
                startArgument("id");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface BusinessEntityArgumentsDefinition {
        void define(BusinessEntityArguments args);
    }

    /**
    * Returns a Business Entity by ID.
    */
    public QueryRootQuery businessEntity(BusinessEntityQueryDefinition queryDef) {
        return businessEntity(args -> {}, queryDef);
    }

    /**
    * Returns a Business Entity by ID.
    */
    public QueryRootQuery businessEntity(BusinessEntityArgumentsDefinition argsDef, BusinessEntityQueryDefinition queryDef) {
        startField("businessEntity");

        BusinessEntityArguments args = new BusinessEntityArguments(_queryBuilder);
        argsDef.define(args);
        BusinessEntityArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new BusinessEntityQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns a `DeliveryCarrierService` object by ID.
    */
    public QueryRootQuery carrierService(ID id, DeliveryCarrierServiceQueryDefinition queryDef) {
        startField("carrierService");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeliveryCarrierServiceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CarrierServicesArguments extends Arguments {
        CarrierServicesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CarrierServicesArguments first(Integer value) {
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
        public CarrierServicesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CarrierServicesArguments last(Integer value) {
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
        public CarrierServicesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public CarrierServicesArguments reverse(Boolean value) {
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
        public CarrierServicesArguments sortKey(CarrierServiceSortKeys value) {
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
        * | active | boolean |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public CarrierServicesArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface CarrierServicesArgumentsDefinition {
        void define(CarrierServicesArguments args);
    }

    /**
    * Retrieve a list of CarrierServices.
    */
    public QueryRootQuery carrierServices(DeliveryCarrierServiceConnectionQueryDefinition queryDef) {
        return carrierServices(args -> {}, queryDef);
    }

    /**
    * Retrieve a list of CarrierServices.
    */
    public QueryRootQuery carrierServices(CarrierServicesArgumentsDefinition argsDef, DeliveryCarrierServiceConnectionQueryDefinition queryDef) {
        startField("carrierServices");

        CarrierServicesArguments args = new CarrierServicesArguments(_queryBuilder);
        argsDef.define(args);
        CarrierServicesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new DeliveryCarrierServiceConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CartTransformsArguments extends Arguments {
        CartTransformsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CartTransformsArguments first(Integer value) {
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
        public CartTransformsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CartTransformsArguments last(Integer value) {
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
        public CartTransformsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public CartTransformsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CartTransformsArgumentsDefinition {
        void define(CartTransformsArguments args);
    }

    /**
    * List of Cart transform objects owned by the current API client.
    */
    public QueryRootQuery cartTransforms(CartTransformConnectionQueryDefinition queryDef) {
        return cartTransforms(args -> {}, queryDef);
    }

    /**
    * List of Cart transform objects owned by the current API client.
    */
    public QueryRootQuery cartTransforms(CartTransformsArgumentsDefinition argsDef, CartTransformConnectionQueryDefinition queryDef) {
        startField("cartTransforms");

        CartTransformsArguments args = new CartTransformsArguments(_queryBuilder);
        argsDef.define(args);
        CartTransformsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CartTransformConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Lookup a cash tracking session by ID.
    */
    public QueryRootQuery cashTrackingSession(ID id, CashTrackingSessionQueryDefinition queryDef) {
        startField("cashTrackingSession");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CashTrackingSessionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CashTrackingSessionsArguments extends Arguments {
        CashTrackingSessionsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CashTrackingSessionsArguments first(Integer value) {
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
        public CashTrackingSessionsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CashTrackingSessionsArguments last(Integer value) {
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
        public CashTrackingSessionsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public CashTrackingSessionsArguments reverse(Boolean value) {
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
        public CashTrackingSessionsArguments sortKey(CashTrackingSessionsSortKeys value) {
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
        * | closing_time | time |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | location_id | id |
        * | opening_time | time |
        * | point_of_sale_device_ids | string |
        * | status | string |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public CashTrackingSessionsArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface CashTrackingSessionsArgumentsDefinition {
        void define(CashTrackingSessionsArguments args);
    }

    /**
    * Returns a shop's cash tracking sessions for locations with a POS Pro subscription.
    * Tip: To query for cash tracking sessions in bulk, you can
    * [perform a bulk operation](https://shopify.dev/docs/api/usage/bulk-operations/queries).
    */
    public QueryRootQuery cashTrackingSessions(CashTrackingSessionConnectionQueryDefinition queryDef) {
        return cashTrackingSessions(args -> {}, queryDef);
    }

    /**
    * Returns a shop's cash tracking sessions for locations with a POS Pro subscription.
    * Tip: To query for cash tracking sessions in bulk, you can
    * [perform a bulk operation](https://shopify.dev/docs/api/usage/bulk-operations/queries).
    */
    public QueryRootQuery cashTrackingSessions(CashTrackingSessionsArgumentsDefinition argsDef, CashTrackingSessionConnectionQueryDefinition queryDef) {
        startField("cashTrackingSessions");

        CashTrackingSessionsArguments args = new CashTrackingSessionsArguments(_queryBuilder);
        argsDef.define(args);
        CashTrackingSessionsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CashTrackingSessionConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Retrieves a [catalog](https://shopify.dev/docs/api/admin-graphql/latest/interfaces/Catalog) by its
    * ID.
    * A catalog represents a list of products with publishing and pricing information,
    * and can be associated with a context, such as a market, company location, or app.
    * Use the `catalog` query to retrieve information associated with the following workflows:
    * - Managing product publications across different contexts
    * - Setting up contextual pricing with price lists
    * - Managing market-specific product availability
    * - Configuring B2B customer catalogs
    * There are several types of catalogs:
    * - [`MarketCatalog`](https://shopify.dev/docs/api/admin-graphql/latest/objects/MarketCatalog)
    * - [`AppCatalog`](https://shopify.dev/docs/api/admin-graphql/latest/objects/AppCatalog)
    * -
    * [`CompanyLocationCatalog`](https://shopify.dev/docs/api/admin-graphql/latest/objects/CompanyLocation
    * Catalog)
    * Learn more about [catalogs for different
    * markets](https://shopify.dev/docs/apps/build/markets/catalogs-different-markets).
    */
    public QueryRootQuery catalog(ID id, CatalogQueryDefinition queryDef) {
        startField("catalog");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CatalogQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns the most recent catalog operations for the shop.
    */
    public QueryRootQuery catalogOperations(ResourceOperationQueryDefinition queryDef) {
        startField("catalogOperations");

        _queryBuilder.append('{');
        queryDef.define(new ResourceOperationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CatalogsArguments extends Arguments {
        CatalogsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The type of the catalogs to be returned.
        */
        public CatalogsArguments type(CatalogType value) {
            if (value != null) {
                startArgument("type");
                _queryBuilder.append(value.toString());
            }
            return this;
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CatalogsArguments first(Integer value) {
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
        public CatalogsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CatalogsArguments last(Integer value) {
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
        public CatalogsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public CatalogsArguments reverse(Boolean value) {
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
        public CatalogsArguments sortKey(CatalogSortKeys value) {
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
        * | default | string | Filter by a case-insensitive search of multiple fields in a document. | | | -
        * `query=Bob Norman`<br/> - `query=title:green hoodie` |
        * | app_id | id |
        * | company_id | id |
        * | company_location_id | id |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | managed_country_id | id |
        * | market_id | id |
        * | status | string |
        * | title | string |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public CatalogsArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface CatalogsArgumentsDefinition {
        void define(CatalogsArguments args);
    }

    /**
    * The catalogs belonging to the shop.
    */
    public QueryRootQuery catalogs(CatalogConnectionQueryDefinition queryDef) {
        return catalogs(args -> {}, queryDef);
    }

    /**
    * The catalogs belonging to the shop.
    */
    public QueryRootQuery catalogs(CatalogsArgumentsDefinition argsDef, CatalogConnectionQueryDefinition queryDef) {
        startField("catalogs");

        CatalogsArguments args = new CatalogsArguments(_queryBuilder);
        argsDef.define(args);
        CatalogsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CatalogConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CatalogsCountArguments extends Arguments {
        CatalogsCountArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The type of the catalogs to be returned.
        */
        public CatalogsCountArguments type(CatalogType value) {
            if (value != null) {
                startArgument("type");
                _queryBuilder.append(value.toString());
            }
            return this;
        }

        /**
        * A filter made up of terms, connectives, modifiers, and comparators.
        * | name | type | description | acceptable_values | default_value | example_use |
        * | ---- | ---- | ---- | ---- | ---- | ---- |
        * | default | string | Filter by a case-insensitive search of multiple fields in a document. | | | -
        * `query=Bob Norman`<br/> - `query=title:green hoodie` |
        * | app_id | id |
        * | company_id | id |
        * | company_location_id | id |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | managed_country_id | id |
        * | market_id | id |
        * | status | string |
        * | title | string |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public CatalogsCountArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The upper bound on count value before returning a result. Use `null` to have no limit.
        */
        public CatalogsCountArguments limit(Integer value) {
            if (value != null) {
                startArgument("limit");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CatalogsCountArgumentsDefinition {
        void define(CatalogsCountArguments args);
    }

    /**
    * The count of catalogs belonging to the shop. Limited to a maximum of 10000 by default.
    */
    public QueryRootQuery catalogsCount(CountQueryDefinition queryDef) {
        return catalogsCount(args -> {}, queryDef);
    }

    /**
    * The count of catalogs belonging to the shop. Limited to a maximum of 10000 by default.
    */
    public QueryRootQuery catalogsCount(CatalogsCountArgumentsDefinition argsDef, CountQueryDefinition queryDef) {
        startField("catalogsCount");

        CatalogsCountArguments args = new CatalogsCountArguments(_queryBuilder);
        argsDef.define(args);
        CatalogsCountArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns the visual customizations for checkout for a given checkout profile.
    * To learn more about updating checkout branding settings, refer to the
    * [checkoutBrandingUpsert](https://shopify.dev/api/admin-graphql/unstable/mutations/checkoutBrandingUp
    * sert)
    * mutation and the checkout branding [tutorial](https://shopify.dev/docs/apps/checkout/styling).
    */
    public QueryRootQuery checkoutBranding(ID checkoutProfileId, CheckoutBrandingQueryDefinition queryDef) {
        startField("checkoutBranding");

        _queryBuilder.append("(checkoutProfileId:");
        Query.appendQuotedString(_queryBuilder, checkoutProfileId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CheckoutBrandingQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A checkout profile on a shop.
    */
    public QueryRootQuery checkoutProfile(ID id, CheckoutProfileQueryDefinition queryDef) {
        startField("checkoutProfile");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CheckoutProfileQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CheckoutProfilesArguments extends Arguments {
        CheckoutProfilesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CheckoutProfilesArguments first(Integer value) {
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
        public CheckoutProfilesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CheckoutProfilesArguments last(Integer value) {
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
        public CheckoutProfilesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public CheckoutProfilesArguments reverse(Boolean value) {
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
        public CheckoutProfilesArguments sortKey(CheckoutProfileSortKeys value) {
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
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | is_published | boolean |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public CheckoutProfilesArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface CheckoutProfilesArgumentsDefinition {
        void define(CheckoutProfilesArguments args);
    }

    /**
    * List of checkout profiles on a shop.
    */
    public QueryRootQuery checkoutProfiles(CheckoutProfileConnectionQueryDefinition queryDef) {
        return checkoutProfiles(args -> {}, queryDef);
    }

    /**
    * List of checkout profiles on a shop.
    */
    public QueryRootQuery checkoutProfiles(CheckoutProfilesArgumentsDefinition argsDef, CheckoutProfileConnectionQueryDefinition queryDef) {
        startField("checkoutProfiles");

        CheckoutProfilesArguments args = new CheckoutProfilesArguments(_queryBuilder);
        argsDef.define(args);
        CheckoutProfilesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CheckoutProfileConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns a [code discount](https://help.shopify.com/manual/discounts/discount-types#discount-codes)
    * resource by ID.
    */
    public QueryRootQuery codeDiscountNode(ID id, DiscountCodeNodeQueryDefinition queryDef) {
        startField("codeDiscountNode");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DiscountCodeNodeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns a code discount identified by its discount code.
    */
    public QueryRootQuery codeDiscountNodeByCode(String code, DiscountCodeNodeQueryDefinition queryDef) {
        startField("codeDiscountNodeByCode");

        _queryBuilder.append("(code:");
        Query.appendQuotedString(_queryBuilder, code.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DiscountCodeNodeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CodeDiscountNodesArguments extends Arguments {
        CodeDiscountNodesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CodeDiscountNodesArguments first(Integer value) {
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
        public CodeDiscountNodesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CodeDiscountNodesArguments last(Integer value) {
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
        public CodeDiscountNodesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public CodeDiscountNodesArguments reverse(Boolean value) {
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
        public CodeDiscountNodesArguments sortKey(CodeDiscountSortKeys value) {
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
        * | default | string | Filter by a case-insensitive search of multiple fields in a document. | | | -
        * `query=Bob Norman`<br/> - `query=title:green hoodie` |
        * | combines_with | string | Filter by the [discount
        * classes](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations) that
        * you can use in combination with [Shopify discount
        * types](https://help.shopify.com/manual/discounts/discount-types). | - `order_discounts`<br/> -
        * `product_discounts`<br/> - `shipping_discounts` | | - `combines_with:product_discounts` |
        * | created_at | time | Filter by the date and time when the discount was created. | | | -
        * `created_at:>'2020-10-21T23:39:20Z'`<br/> - `created_at:<now`<br/> - `created_at:<='2024'` |
        * | discount_type | string | Filter by the [discount
        * type](https://help.shopify.com/manual/discounts/discount-types). | - `bogo`<br/> -
        * `fixed_amount`<br/> - `free_shipping`<br/> - `percentage` | | - `discount_type:fixed_amount` |
        * | ends_at | time | Filter by the date and time when the discount expires and is no longer available
        * for customer use. | | | - `ends_at:>'2020-10-21T23:39:20Z'`<br/> - `ends_at:<now`<br/> -
        * `ends_at:<='2024'` |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | starts_at | time | Filter by the date and time, in the shop's timezone, when the discount becomes
        * active and is available for customer use. | | | - `starts_at:>'2020-10-21T23:39:20Z'`<br/> -
        * `starts_at:<now`<br/> - `starts_at:<='2024'` |
        * | status | string | Filter by the status of the discount. | - `active`<br/> - `expired`<br/> -
        * `scheduled` | | - `status:scheduled` |
        * | times_used | integer | Filter by the number of times the discount has been used. For example, if a
        * "Buy 3, Get 1 Free" t-shirt discount is automatically applied in 200 transactions, then the discount
        * has been used 200 times. <br><br> This value is updated asynchronously. As a result, it might be
        * different than the actual usage count. | | | - `times_used:0`<br/> - `times_used:>150`<br/> -
        * `times_used:>=200` |
        * | title | string | Filter by the discount name that displays to customers. | | | - `title:Black
        * Friday Sale` |
        * | type | string | Filter by the [discount
        * type](https://help.shopify.com/manual/discounts/discount-types). | - `all`<br/> -
        * `all_with_app`<br/> - `app`<br/> - `bxgy`<br/> - `fixed_amount`<br/> - `free_shipping`<br/> -
        * `percentage` | | - `type:percentage` |
        * | updated_at | time | Filter by the date and time when the discount was last updated. | | | -
        * `updated_at:>'2020-10-21T23:39:20Z'`<br/> - `updated_at:<now`<br/> - `updated_at:<='2024'` |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public CodeDiscountNodesArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The ID of a [saved
        * search](https://shopify.dev/api/admin-graphql/latest/objects/savedsearch#field-id).
        * The search’s query string is used as the query argument.
        */
        public CodeDiscountNodesArguments savedSearchId(ID value) {
            if (value != null) {
                startArgument("savedSearchId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface CodeDiscountNodesArgumentsDefinition {
        void define(CodeDiscountNodesArguments args);
    }

    /**
    * Returns a list of [code-based
    * discounts](https://help.shopify.com/manual/discounts/discount-types#discount-codes).
    */
    public QueryRootQuery codeDiscountNodes(DiscountCodeNodeConnectionQueryDefinition queryDef) {
        return codeDiscountNodes(args -> {}, queryDef);
    }

    /**
    * Returns a list of [code-based
    * discounts](https://help.shopify.com/manual/discounts/discount-types#discount-codes).
    */
    public QueryRootQuery codeDiscountNodes(CodeDiscountNodesArgumentsDefinition argsDef, DiscountCodeNodeConnectionQueryDefinition queryDef) {
        startField("codeDiscountNodes");

        CodeDiscountNodesArguments args = new CodeDiscountNodesArguments(_queryBuilder);
        argsDef.define(args);
        CodeDiscountNodesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new DiscountCodeNodeConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CodeDiscountSavedSearchesArguments extends Arguments {
        CodeDiscountSavedSearchesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CodeDiscountSavedSearchesArguments first(Integer value) {
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
        public CodeDiscountSavedSearchesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CodeDiscountSavedSearchesArguments last(Integer value) {
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
        public CodeDiscountSavedSearchesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public CodeDiscountSavedSearchesArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CodeDiscountSavedSearchesArgumentsDefinition {
        void define(CodeDiscountSavedSearchesArguments args);
    }

    /**
    * List of the shop's code discount saved searches.
    */
    public QueryRootQuery codeDiscountSavedSearches(SavedSearchConnectionQueryDefinition queryDef) {
        return codeDiscountSavedSearches(args -> {}, queryDef);
    }

    /**
    * List of the shop's code discount saved searches.
    */
    public QueryRootQuery codeDiscountSavedSearches(CodeDiscountSavedSearchesArgumentsDefinition argsDef, SavedSearchConnectionQueryDefinition queryDef) {
        startField("codeDiscountSavedSearches");

        CodeDiscountSavedSearchesArguments args = new CodeDiscountSavedSearchesArguments(_queryBuilder);
        argsDef.define(args);
        CodeDiscountSavedSearchesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SavedSearchConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Retrieves a [collection](https://shopify.dev/docs/api/admin-graphql/latest/objects/Collection) by
    * its ID.
    * A collection represents a grouping of
    * [products](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product)
    * that merchants can display and sell as a group in their [online
    * store](https://shopify.dev/docs/apps/build/online-store) and
    * other [sales channels](https://shopify.dev/docs/apps/build/sales-channels).
    * Use the `collection` query when you need to:
    * - Manage collection publishing across sales channels
    * - Access collection metadata and SEO information
    * - Work with collection rules and product relationships
    * A collection can be either a custom
    * ([manual](https://help.shopify.com/manual/products/collections/manual-shopify-collection))
    * collection where products are manually added, or a smart
    * ([automated](https://help.shopify.com/manual/products/collections/automated-collections))
    * collection where products are automatically included based on defined rules. Each collection has
    * associated metadata including
    * title, description, handle, image, and
    * [metafields](https://shopify.dev/docs/apps/build/custom-data/metafields).
    */
    public QueryRootQuery collection(ID id, CollectionQueryDefinition queryDef) {
        startField("collection");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CollectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Return a collection by an identifier.
    */
    public QueryRootQuery collectionByIdentifier(CollectionIdentifierInput identifier, CollectionQueryDefinition queryDef) {
        startField("collectionByIdentifier");

        _queryBuilder.append("(identifier:");
        identifier.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CollectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Lists all rules that can be used to create smart collections.
    */
    public QueryRootQuery collectionRulesConditions(CollectionRuleConditionsQueryDefinition queryDef) {
        startField("collectionRulesConditions");

        _queryBuilder.append('{');
        queryDef.define(new CollectionRuleConditionsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CollectionSavedSearchesArguments extends Arguments {
        CollectionSavedSearchesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CollectionSavedSearchesArguments first(Integer value) {
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
        public CollectionSavedSearchesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CollectionSavedSearchesArguments last(Integer value) {
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
        public CollectionSavedSearchesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public CollectionSavedSearchesArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CollectionSavedSearchesArgumentsDefinition {
        void define(CollectionSavedSearchesArguments args);
    }

    /**
    * Returns a list of the shop's collection saved searches.
    */
    public QueryRootQuery collectionSavedSearches(SavedSearchConnectionQueryDefinition queryDef) {
        return collectionSavedSearches(args -> {}, queryDef);
    }

    /**
    * Returns a list of the shop's collection saved searches.
    */
    public QueryRootQuery collectionSavedSearches(CollectionSavedSearchesArgumentsDefinition argsDef, SavedSearchConnectionQueryDefinition queryDef) {
        startField("collectionSavedSearches");

        CollectionSavedSearchesArguments args = new CollectionSavedSearchesArguments(_queryBuilder);
        argsDef.define(args);
        CollectionSavedSearchesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SavedSearchConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CollectionsArguments extends Arguments {
        CollectionsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CollectionsArguments first(Integer value) {
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
        public CollectionsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CollectionsArguments last(Integer value) {
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
        public CollectionsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public CollectionsArguments reverse(Boolean value) {
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
        public CollectionsArguments sortKey(CollectionSortKeys value) {
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
        * | default | string | Filter by a case-insensitive search of multiple fields in a document. | | | -
        * `query=Bob Norman`<br/> - `query=title:green hoodie` |
        * | collection_type | string | | - `custom`<br/> - `smart` |
        * | handle | string |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | product_id | id | Filter by collections containing a product by its ID. |
        * | product_publication_status | string | Filter by the publication status of the resource on a
        * channel, such as the online store. The value is a composite of the [channel `app`
        * ID](https://shopify.dev/api/admin-graphql/latest/objects/Channel#app-price) (`Channel.app.id`) and
        * one of the valid values. | - `approved`<br/> - `rejected`<br/> - `needs_action`<br/> -
        * `awaiting_review`<br/> - `published`<br/> - `demoted`<br/> - `scheduled`<br/> -
        * `provisionally_published` | | - `product_publication_status:189769876-approved` |
        * | publishable_status | string | Filter by the publishable status of the resource on a channel, such
        * as the online store. The value is a composite of either the [channel `app`
        * ID](https://shopify.dev/api/admin-graphql/latest/objects/Channel#app-price) (`Channel.app.id`) or
        * [channel `name`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Channel#field-name) and
        * one of the valid values. | - `online_store_channel`<br/> - `published`<br/> - `unpublished`<br/> -
        * `visible`<br/> - `unavailable`<br/> - `hidden`<br/> - `intended`<br/> - `visible` | | -
        * `publishable_status:published`<br/> - `publishable_status:189769876-visible`<br/> -
        * `publishable_status:pos-hidden` |
        * | published_at | time | Filter by the date and time when the collection was published to the Online
        * Store. |
        * | published_status | string | Filter by the published status of the resource on a channel, such as
        * the online store. | - `unset`<br/> - `pending`<br/> - `approved`<br/> - `not approved` | | -
        * `published_status:approved` |
        * | title | string |
        * | updated_at | time |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public CollectionsArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The ID of a [saved
        * search](https://shopify.dev/api/admin-graphql/latest/objects/savedsearch#field-id).
        * The search’s query string is used as the query argument.
        */
        public CollectionsArguments savedSearchId(ID value) {
            if (value != null) {
                startArgument("savedSearchId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface CollectionsArgumentsDefinition {
        void define(CollectionsArguments args);
    }

    /**
    * Retrieves a list of
    * [collections](https://shopify.dev/docs/api/admin-graphql/latest/objects/Collection)
    * in a store. Collections are groups of
    * [products](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product)
    * that merchants can organize for display in their [online
    * store](https://shopify.dev/docs/apps/build/online-store) and
    * other [sales channels](https://shopify.dev/docs/apps/build/sales-channels).
    * For example, an athletics store might create different collections for running attire, shoes, and
    * accessories.
    * Use the `collections` query when you need to:
    * - Build a browsing interface for a store's product groupings.
    * - Create collection searching, sorting, and filtering experiences (for example, by title, type, or
    * published status).
    * - Sync collection data with external systems.
    * - Manage both custom
    * ([manual](https://help.shopify.com/manual/products/collections/manual-shopify-collection))
    * and smart ([automated](https://help.shopify.com/manual/products/collections/automated-collections))
    * collections.
    * The `collections` query supports [pagination](https://shopify.dev/docs/api/usage/pagination-graphql)
    * for large catalogs and [saved
    * searches](https://shopify.dev/docs/api/admin-graphql/latest/queries/collections#arguments-savedSearc
    * hId)
    * for frequently used collection queries.
    * The `collections` query returns collections with their associated metadata, including:
    * - Basic collection information (title, description, handle, and type)
    * - Collection image and SEO metadata
    * - Product count and product relationships
    * - Collection rules (for smart collections)
    * - Publishing status and publication details
    * - Metafields and custom attributes
    * Learn more about [using metafields with smart
    * collections](https://shopify.dev/docs/apps/build/custom-data/metafields/use-metafield-capabilities).
    */
    public QueryRootQuery collections(CollectionConnectionQueryDefinition queryDef) {
        return collections(args -> {}, queryDef);
    }

    /**
    * Retrieves a list of
    * [collections](https://shopify.dev/docs/api/admin-graphql/latest/objects/Collection)
    * in a store. Collections are groups of
    * [products](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product)
    * that merchants can organize for display in their [online
    * store](https://shopify.dev/docs/apps/build/online-store) and
    * other [sales channels](https://shopify.dev/docs/apps/build/sales-channels).
    * For example, an athletics store might create different collections for running attire, shoes, and
    * accessories.
    * Use the `collections` query when you need to:
    * - Build a browsing interface for a store's product groupings.
    * - Create collection searching, sorting, and filtering experiences (for example, by title, type, or
    * published status).
    * - Sync collection data with external systems.
    * - Manage both custom
    * ([manual](https://help.shopify.com/manual/products/collections/manual-shopify-collection))
    * and smart ([automated](https://help.shopify.com/manual/products/collections/automated-collections))
    * collections.
    * The `collections` query supports [pagination](https://shopify.dev/docs/api/usage/pagination-graphql)
    * for large catalogs and [saved
    * searches](https://shopify.dev/docs/api/admin-graphql/latest/queries/collections#arguments-savedSearc
    * hId)
    * for frequently used collection queries.
    * The `collections` query returns collections with their associated metadata, including:
    * - Basic collection information (title, description, handle, and type)
    * - Collection image and SEO metadata
    * - Product count and product relationships
    * - Collection rules (for smart collections)
    * - Publishing status and publication details
    * - Metafields and custom attributes
    * Learn more about [using metafields with smart
    * collections](https://shopify.dev/docs/apps/build/custom-data/metafields/use-metafield-capabilities).
    */
    public QueryRootQuery collections(CollectionsArgumentsDefinition argsDef, CollectionConnectionQueryDefinition queryDef) {
        startField("collections");

        CollectionsArguments args = new CollectionsArguments(_queryBuilder);
        argsDef.define(args);
        CollectionsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CollectionConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CollectionsCountArguments extends Arguments {
        CollectionsCountArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * A filter made up of terms, connectives, modifiers, and comparators.
        * | name | type | description | acceptable_values | default_value | example_use |
        * | ---- | ---- | ---- | ---- | ---- | ---- |
        * | default | string | Filter by a case-insensitive search of multiple fields in a document. | | | -
        * `query=Bob Norman`<br/> - `query=title:green hoodie` |
        * | collection_type | string | | - `custom`<br/> - `smart` |
        * | handle | string |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | product_id | id | Filter by collections containing a product by its ID. |
        * | product_publication_status | string | Filter by the publication status of the resource on a
        * channel, such as the online store. The value is a composite of the [channel `app`
        * ID](https://shopify.dev/api/admin-graphql/latest/objects/Channel#app-price) (`Channel.app.id`) and
        * one of the valid values. | - `approved`<br/> - `rejected`<br/> - `needs_action`<br/> -
        * `awaiting_review`<br/> - `published`<br/> - `demoted`<br/> - `scheduled`<br/> -
        * `provisionally_published` | | - `product_publication_status:189769876-approved` |
        * | publishable_status | string | Filter by the publishable status of the resource on a channel, such
        * as the online store. The value is a composite of either the [channel `app`
        * ID](https://shopify.dev/api/admin-graphql/latest/objects/Channel#app-price) (`Channel.app.id`) or
        * [channel `name`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Channel#field-name) and
        * one of the valid values. | - `online_store_channel`<br/> - `published`<br/> - `unpublished`<br/> -
        * `visible`<br/> - `unavailable`<br/> - `hidden`<br/> - `intended`<br/> - `visible` | | -
        * `publishable_status:published`<br/> - `publishable_status:189769876-visible`<br/> -
        * `publishable_status:pos-hidden` |
        * | published_at | time | Filter by the date and time when the collection was published to the Online
        * Store. |
        * | published_status | string | Filter by the published status of the resource on a channel, such as
        * the online store. | - `unset`<br/> - `pending`<br/> - `approved`<br/> - `not approved` | | -
        * `published_status:approved` |
        * | title | string |
        * | updated_at | time |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public CollectionsCountArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The ID of an existing saved search.
        * The search’s query string is used as the query argument.
        * Refer to the [`SavedSearch`](https://shopify.dev/api/admin-graphql/latest/objects/savedsearch)
        * object.
        */
        public CollectionsCountArguments savedSearchId(ID value) {
            if (value != null) {
                startArgument("savedSearchId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The upper bound on count value before returning a result. Use `null` to have no limit.
        */
        public CollectionsCountArguments limit(Integer value) {
            if (value != null) {
                startArgument("limit");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CollectionsCountArgumentsDefinition {
        void define(CollectionsCountArguments args);
    }

    /**
    * Count of collections. Limited to a maximum of 10000 by default.
    */
    public QueryRootQuery collectionsCount(CountQueryDefinition queryDef) {
        return collectionsCount(args -> {}, queryDef);
    }

    /**
    * Count of collections. Limited to a maximum of 10000 by default.
    */
    public QueryRootQuery collectionsCount(CollectionsCountArgumentsDefinition argsDef, CountQueryDefinition queryDef) {
        startField("collectionsCount");

        CollectionsCountArguments args = new CollectionsCountArguments(_queryBuilder);
        argsDef.define(args);
        CollectionsCountArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns a Comment resource by ID.
    */
    public QueryRootQuery comment(ID id, CommentQueryDefinition queryDef) {
        startField("comment");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CommentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CommentsArguments extends Arguments {
        CommentsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CommentsArguments first(Integer value) {
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
        public CommentsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CommentsArguments last(Integer value) {
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
        public CommentsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public CommentsArguments reverse(Boolean value) {
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
        public CommentsArguments sortKey(CommentSortKeys value) {
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
        * | default | string | Filter by a case-insensitive search of multiple fields in a document. | | | -
        * `query=Bob Norman`<br/> - `query=title:green hoodie` |
        * | created_at | time | Filter by the date and time when the comment was created. | | | -
        * `created_at:>'2020-10-21T23:39:20Z'`<br/> - `created_at:<now`<br/> - `created_at:<=2024` |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | published_at | time | Filter by the date and time when the comment was published. | | | -
        * `published_at:>'2020-10-21T23:39:20Z'`<br/> - `published_at:<now`<br/> - `published_at:<=2024` |
        * | published_status | string | Filter by published status | - `any`<br/> - `published`<br/> -
        * `unpublished` | | - `published_status:any`<br/> - `published_status:published`<br/> -
        * `published_status:unpublished` |
        * | status | string |
        * | updated_at | time | Filter by the date and time when the comment was last updated. | | | -
        * `updated_at:>'2020-10-21T23:39:20Z'`<br/> - `updated_at:<now`<br/> - `updated_at:<=2024` |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public CommentsArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface CommentsArgumentsDefinition {
        void define(CommentsArguments args);
    }

    /**
    * List of the shop's comments.
    */
    public QueryRootQuery comments(CommentConnectionQueryDefinition queryDef) {
        return comments(args -> {}, queryDef);
    }

    /**
    * List of the shop's comments.
    */
    public QueryRootQuery comments(CommentsArgumentsDefinition argsDef, CommentConnectionQueryDefinition queryDef) {
        startField("comments");

        CommentsArguments args = new CommentsArguments(_queryBuilder);
        argsDef.define(args);
        CommentsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CommentConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CompaniesArguments extends Arguments {
        CompaniesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CompaniesArguments first(Integer value) {
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
        public CompaniesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CompaniesArguments last(Integer value) {
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
        public CompaniesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public CompaniesArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * Sort the underlying list by the given key.
        */
        public CompaniesArguments sortKey(CompanySortKeys value) {
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
        * | default | string | Filter by a case-insensitive search of multiple fields in a document. | | | -
        * `query=Bob Norman`<br/> - `query=title:green hoodie` |
        * | active_customers_count | integer |
        * | created_at | time |
        * | external_id | id |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | name | string |
        * | since_date | time |
        * | updated_at | time |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public CompaniesArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface CompaniesArgumentsDefinition {
        void define(CompaniesArguments args);
    }

    /**
    * Returns the list of companies in the shop.
    */
    public QueryRootQuery companies(CompanyConnectionQueryDefinition queryDef) {
        return companies(args -> {}, queryDef);
    }

    /**
    * Returns the list of companies in the shop.
    */
    public QueryRootQuery companies(CompaniesArgumentsDefinition argsDef, CompanyConnectionQueryDefinition queryDef) {
        startField("companies");

        CompaniesArguments args = new CompaniesArguments(_queryBuilder);
        argsDef.define(args);
        CompaniesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CompanyConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CompaniesCountArguments extends Arguments {
        CompaniesCountArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The upper bound on count value before returning a result. Use `null` to have no limit.
        */
        public CompaniesCountArguments limit(Integer value) {
            if (value != null) {
                startArgument("limit");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CompaniesCountArgumentsDefinition {
        void define(CompaniesCountArguments args);
    }

    /**
    * The number of companies for a shop. Limited to a maximum of 10000 by default.
    */
    public QueryRootQuery companiesCount(CountQueryDefinition queryDef) {
        return companiesCount(args -> {}, queryDef);
    }

    /**
    * The number of companies for a shop. Limited to a maximum of 10000 by default.
    */
    public QueryRootQuery companiesCount(CompaniesCountArgumentsDefinition argsDef, CountQueryDefinition queryDef) {
        startField("companiesCount");

        CompaniesCountArguments args = new CompaniesCountArguments(_queryBuilder);
        argsDef.define(args);
        CompaniesCountArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns a `Company` object by ID.
    */
    public QueryRootQuery company(ID id, CompanyQueryDefinition queryDef) {
        startField("company");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CompanyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns a `CompanyContact` object by ID.
    */
    public QueryRootQuery companyContact(ID id, CompanyContactQueryDefinition queryDef) {
        startField("companyContact");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CompanyContactQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns a `CompanyContactRole` object by ID.
    */
    public QueryRootQuery companyContactRole(ID id, CompanyContactRoleQueryDefinition queryDef) {
        startField("companyContactRole");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CompanyContactRoleQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns a `CompanyLocation` object by ID.
    */
    public QueryRootQuery companyLocation(ID id, CompanyLocationQueryDefinition queryDef) {
        startField("companyLocation");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CompanyLocationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CompanyLocationsArguments extends Arguments {
        CompanyLocationsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CompanyLocationsArguments first(Integer value) {
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
        public CompanyLocationsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CompanyLocationsArguments last(Integer value) {
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
        public CompanyLocationsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public CompanyLocationsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * Sort the underlying list by the given key.
        */
        public CompanyLocationsArguments sortKey(CompanyLocationSortKeys value) {
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
        * | default | string | Filter by a case-insensitive search of multiple fields in a document. | | | -
        * `query=Bob Norman`<br/> - `query=title:green hoodie` |
        * | company_id | id |
        * | created_at | time |
        * | external_id | string |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | ids | string |
        * | name | string |
        * | updated_at | time |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public CompanyLocationsArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface CompanyLocationsArgumentsDefinition {
        void define(CompanyLocationsArguments args);
    }

    /**
    * Returns the list of company locations in the shop.
    */
    public QueryRootQuery companyLocations(CompanyLocationConnectionQueryDefinition queryDef) {
        return companyLocations(args -> {}, queryDef);
    }

    /**
    * Returns the list of company locations in the shop.
    */
    public QueryRootQuery companyLocations(CompanyLocationsArgumentsDefinition argsDef, CompanyLocationConnectionQueryDefinition queryDef) {
        startField("companyLocations");

        CompanyLocationsArguments args = new CompanyLocationsArguments(_queryBuilder);
        argsDef.define(args);
        CompanyLocationsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CompanyLocationConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ConsentPolicyArguments extends Arguments {
        ConsentPolicyArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Return the policy with the provided ID.
        */
        public ConsentPolicyArguments id(ID value) {
            if (value != null) {
                startArgument("id");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Return policies with the provided country code.
        */
        public ConsentPolicyArguments countryCode(PrivacyCountryCode value) {
            if (value != null) {
                startArgument("countryCode");
                _queryBuilder.append(value.toString());
            }
            return this;
        }

        /**
        * Return policies with the provided region code.
        */
        public ConsentPolicyArguments regionCode(String value) {
            if (value != null) {
                startArgument("regionCode");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Return policies where consent is required or not.
        */
        public ConsentPolicyArguments consentRequired(Boolean value) {
            if (value != null) {
                startArgument("consentRequired");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * Return policies where data sale opt out is required or not.
        */
        public ConsentPolicyArguments dataSaleOptOutRequired(Boolean value) {
            if (value != null) {
                startArgument("dataSaleOptOutRequired");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ConsentPolicyArgumentsDefinition {
        void define(ConsentPolicyArguments args);
    }

    /**
    * Returns the customer privacy consent policies of a shop.
    */
    public QueryRootQuery consentPolicy(ConsentPolicyQueryDefinition queryDef) {
        return consentPolicy(args -> {}, queryDef);
    }

    /**
    * Returns the customer privacy consent policies of a shop.
    */
    public QueryRootQuery consentPolicy(ConsentPolicyArgumentsDefinition argsDef, ConsentPolicyQueryDefinition queryDef) {
        startField("consentPolicy");

        ConsentPolicyArguments args = new ConsentPolicyArguments(_queryBuilder);
        argsDef.define(args);
        ConsentPolicyArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ConsentPolicyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * List of countries and regions for which consent policies can be created or updated.
    */
    public QueryRootQuery consentPolicyRegions(ConsentPolicyRegionQueryDefinition queryDef) {
        startField("consentPolicyRegions");

        _queryBuilder.append('{');
        queryDef.define(new ConsentPolicyRegionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Return the AppInstallation for the currently authenticated App.
    */
    public QueryRootQuery currentAppInstallation(AppInstallationQueryDefinition queryDef) {
        startField("currentAppInstallation");

        _queryBuilder.append('{');
        queryDef.define(new AppInstallationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CurrentBulkOperationArguments extends Arguments {
        CurrentBulkOperationArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The current bulk operation's type.
        */
        public CurrentBulkOperationArguments type(BulkOperationType value) {
            if (value != null) {
                startArgument("type");
                _queryBuilder.append(value.toString());
            }
            return this;
        }
    }

    public interface CurrentBulkOperationArgumentsDefinition {
        void define(CurrentBulkOperationArguments args);
    }

    /**
    * Returns the current app's most recent BulkOperation. Apps can run one bulk query and one bulk
    * mutation operation at a time, by shop.
    */
    public QueryRootQuery currentBulkOperation(BulkOperationQueryDefinition queryDef) {
        return currentBulkOperation(args -> {}, queryDef);
    }

    /**
    * Returns the current app's most recent BulkOperation. Apps can run one bulk query and one bulk
    * mutation operation at a time, by shop.
    */
    public QueryRootQuery currentBulkOperation(CurrentBulkOperationArgumentsDefinition argsDef, BulkOperationQueryDefinition queryDef) {
        startField("currentBulkOperation");

        CurrentBulkOperationArguments args = new CurrentBulkOperationArguments(_queryBuilder);
        argsDef.define(args);
        CurrentBulkOperationArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new BulkOperationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The staff member making the API request.
    */
    public QueryRootQuery currentStaffMember(StaffMemberQueryDefinition queryDef) {
        startField("currentStaffMember");

        _queryBuilder.append('{');
        queryDef.define(new StaffMemberQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns a `Customer` resource by ID.
    */
    public QueryRootQuery customer(ID id, CustomerQueryDefinition queryDef) {
        startField("customer");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CustomerQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns a customer account page.
    */
    public QueryRootQuery customerAccountPage(ID id, CustomerAccountPageQueryDefinition queryDef) {
        startField("customerAccountPage");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CustomerAccountPageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CustomerAccountPagesArguments extends Arguments {
        CustomerAccountPagesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CustomerAccountPagesArguments first(Integer value) {
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
        public CustomerAccountPagesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CustomerAccountPagesArguments last(Integer value) {
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
        public CustomerAccountPagesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public CustomerAccountPagesArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CustomerAccountPagesArgumentsDefinition {
        void define(CustomerAccountPagesArguments args);
    }

    /**
    * List of the shop's customer account pages.
    */
    public QueryRootQuery customerAccountPages(CustomerAccountPageConnectionQueryDefinition queryDef) {
        return customerAccountPages(args -> {}, queryDef);
    }

    /**
    * List of the shop's customer account pages.
    */
    public QueryRootQuery customerAccountPages(CustomerAccountPagesArgumentsDefinition argsDef, CustomerAccountPageConnectionQueryDefinition queryDef) {
        startField("customerAccountPages");

        CustomerAccountPagesArguments args = new CustomerAccountPagesArguments(_queryBuilder);
        argsDef.define(args);
        CustomerAccountPagesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CustomerAccountPageConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Return a customer by an identifier.
    */
    public QueryRootQuery customerByIdentifier(CustomerIdentifierInput identifier, CustomerQueryDefinition queryDef) {
        startField("customerByIdentifier");

        _queryBuilder.append("(identifier:");
        identifier.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CustomerQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns the status of a customer merge request job.
    */
    public QueryRootQuery customerMergeJobStatus(ID jobId, CustomerMergeRequestQueryDefinition queryDef) {
        startField("customerMergeJobStatus");

        _queryBuilder.append("(jobId:");
        Query.appendQuotedString(_queryBuilder, jobId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CustomerMergeRequestQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CustomerMergePreviewArguments extends Arguments {
        CustomerMergePreviewArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The fields to override the default customer merge rules.
        */
        public CustomerMergePreviewArguments overrideFields(CustomerMergeOverrideFields value) {
            if (value != null) {
                startArgument("overrideFields");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface CustomerMergePreviewArgumentsDefinition {
        void define(CustomerMergePreviewArguments args);
    }

    /**
    * Returns a preview of a customer merge request.
    */
    public QueryRootQuery customerMergePreview(ID customerOneId, ID customerTwoId, CustomerMergePreviewQueryDefinition queryDef) {
        return customerMergePreview(customerOneId, customerTwoId, args -> {}, queryDef);
    }

    /**
    * Returns a preview of a customer merge request.
    */
    public QueryRootQuery customerMergePreview(ID customerOneId, ID customerTwoId, CustomerMergePreviewArgumentsDefinition argsDef, CustomerMergePreviewQueryDefinition queryDef) {
        startField("customerMergePreview");

        _queryBuilder.append("(customerOneId:");
        Query.appendQuotedString(_queryBuilder, customerOneId.toString());

        _queryBuilder.append(",customerTwoId:");
        Query.appendQuotedString(_queryBuilder, customerTwoId.toString());

        argsDef.define(new CustomerMergePreviewArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CustomerMergePreviewQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CustomerPaymentMethodArguments extends Arguments {
        CustomerPaymentMethodArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * Whether to show the customer's revoked payment method.
        */
        public CustomerPaymentMethodArguments showRevoked(Boolean value) {
            if (value != null) {
                startArgument("showRevoked");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CustomerPaymentMethodArgumentsDefinition {
        void define(CustomerPaymentMethodArguments args);
    }

    /**
    * Returns a CustomerPaymentMethod resource by its ID.
    */
    public QueryRootQuery customerPaymentMethod(ID id, CustomerPaymentMethodQueryDefinition queryDef) {
        return customerPaymentMethod(id, args -> {}, queryDef);
    }

    /**
    * Returns a CustomerPaymentMethod resource by its ID.
    */
    public QueryRootQuery customerPaymentMethod(ID id, CustomerPaymentMethodArgumentsDefinition argsDef, CustomerPaymentMethodQueryDefinition queryDef) {
        startField("customerPaymentMethod");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        argsDef.define(new CustomerPaymentMethodArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CustomerPaymentMethodQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CustomerSavedSearchesArguments extends Arguments {
        CustomerSavedSearchesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CustomerSavedSearchesArguments first(Integer value) {
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
        public CustomerSavedSearchesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CustomerSavedSearchesArguments last(Integer value) {
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
        public CustomerSavedSearchesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public CustomerSavedSearchesArguments reverse(Boolean value) {
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
        public CustomerSavedSearchesArguments sortKey(CustomerSavedSearchSortKeys value) {
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
        * | default | string | Filter by a case-insensitive search of multiple fields in a document. | | | -
        * `query=Bob Norman`<br/> - `query=title:green hoodie` |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | name | string |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public CustomerSavedSearchesArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface CustomerSavedSearchesArgumentsDefinition {
        void define(CustomerSavedSearchesArguments args);
    }

    /**
    * List of the shop's customer saved searches.
    */
    public QueryRootQuery customerSavedSearches(SavedSearchConnectionQueryDefinition queryDef) {
        return customerSavedSearches(args -> {}, queryDef);
    }

    /**
    * List of the shop's customer saved searches.
    */
    public QueryRootQuery customerSavedSearches(CustomerSavedSearchesArgumentsDefinition argsDef, SavedSearchConnectionQueryDefinition queryDef) {
        startField("customerSavedSearches");

        CustomerSavedSearchesArguments args = new CustomerSavedSearchesArguments(_queryBuilder);
        argsDef.define(args);
        CustomerSavedSearchesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SavedSearchConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CustomerSegmentMembersArguments extends Arguments {
        CustomerSegmentMembersArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The ID of the segment.
        */
        public CustomerSegmentMembersArguments segmentId(ID value) {
            if (value != null) {
                startArgument("segmentId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The query that's used to filter the members. The query is composed of a combination of conditions on
        * facts about customers such as `email_subscription_status = 'SUBSCRIBED'` with [this
        * syntax](https://shopify.dev/api/shopifyql/segment-query-language-reference).
        */
        public CustomerSegmentMembersArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The ID of the segment members query.
        */
        public CustomerSegmentMembersArguments queryId(ID value) {
            if (value != null) {
                startArgument("queryId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The timezone that's used to interpret relative date arguments. The timezone defaults to UTC if the
        * timezone isn't provided.
        */
        public CustomerSegmentMembersArguments timezone(String value) {
            if (value != null) {
                startArgument("timezone");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the list. The sorting behaviour defaults to ascending order.
        */
        public CustomerSegmentMembersArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * Sort the list by a given key.
        */
        public CustomerSegmentMembersArguments sortKey(String value) {
            if (value != null) {
                startArgument("sortKey");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CustomerSegmentMembersArguments first(Integer value) {
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
        public CustomerSegmentMembersArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CustomerSegmentMembersArguments last(Integer value) {
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
        public CustomerSegmentMembersArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface CustomerSegmentMembersArgumentsDefinition {
        void define(CustomerSegmentMembersArguments args);
    }

    /**
    * The list of members, such as customers, that's associated with an individual segment.
    * The maximum page size is 1000.
    */
    public QueryRootQuery customerSegmentMembers(CustomerSegmentMemberConnectionQueryDefinition queryDef) {
        return customerSegmentMembers(args -> {}, queryDef);
    }

    /**
    * The list of members, such as customers, that's associated with an individual segment.
    * The maximum page size is 1000.
    */
    public QueryRootQuery customerSegmentMembers(CustomerSegmentMembersArgumentsDefinition argsDef, CustomerSegmentMemberConnectionQueryDefinition queryDef) {
        startField("customerSegmentMembers");

        CustomerSegmentMembersArguments args = new CustomerSegmentMembersArguments(_queryBuilder);
        argsDef.define(args);
        CustomerSegmentMembersArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CustomerSegmentMemberConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns a segment members query resource by ID.
    */
    public QueryRootQuery customerSegmentMembersQuery(ID id, CustomerSegmentMembersQueryQueryDefinition queryDef) {
        startField("customerSegmentMembersQuery");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CustomerSegmentMembersQueryQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether a member, which is a customer, belongs to a segment.
    */
    public QueryRootQuery customerSegmentMembership(List<ID> segmentIds, ID customerId, SegmentMembershipResponseQueryDefinition queryDef) {
        startField("customerSegmentMembership");

        _queryBuilder.append("(segmentIds:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ID item1 : segmentIds) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                Query.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(",customerId:");
        Query.appendQuotedString(_queryBuilder, customerId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SegmentMembershipResponseQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CustomersArguments extends Arguments {
        CustomersArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CustomersArguments first(Integer value) {
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
        public CustomersArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CustomersArguments last(Integer value) {
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
        public CustomersArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public CustomersArguments reverse(Boolean value) {
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
        public CustomersArguments sortKey(CustomerSortKeys value) {
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
        * | default | string | Filter by a case-insensitive search of multiple fields in a document. | | | -
        * `query=Bob Norman`<br/> - `query=title:green hoodie` |
        * | accepts_marketing | boolean | Filter by whether a customer has consented to receive marketing
        * material. | | | - `accepts_marketing:true` |
        * | country | string | Filter by the country associated with the customer's address. Use either the
        * country name or the two-letter country code. | | | - `country:Canada`<br/> - `country:JP` |
        * | customer_date | time | Filter by the date and time when the customer record was created. This
        * query parameter filters by the
        * [`createdAt`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Customer#field-createdAt)
        * field. | | | - `customer_date:'2024-03-15T14:30:00Z'`<br/> - `customer_date:'>=2024-01-01'` |
        * | email | string | The customer's email address, used to communicate information about orders and
        * for the purposes of email marketing campaigns. You can use a wildcard value to filter the query by
        * customers who have an email address specified. Please note that _email_ is a tokenized field: To
        * retrieve exact matches, quote the email address (_phrase query_) as described in [Shopify API search
        * syntax](https://shopify.dev/docs/api/usage/search-syntax). | | | - `email:gmail.com`<br/> -
        * `email:"bo.wang@example.com"`<br/> - `email:*` |
        * | first_name | string | Filter by the customer's first name. | | | - `first_name:Jane` |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | last_abandoned_order_date | time | Filter by the date and time of the customer's most recent
        * abandoned checkout. An abandoned checkout occurs when a customer adds items to their cart, begins
        * the checkout process, but leaves the site without completing their purchase. | | | -
        * `last_abandoned_order_date:'2024-04-01T10:00:00Z'`<br/> - `last_abandoned_order_date:'>=2024-01-01'`
        * |
        * | last_name | string | Filter by the customer's last name. | | | - `last_name:Reeves` |
        * | order_date | time | Filter by the date and time that the order was placed by the customer. Use
        * this query filter to check if a customer has placed at least one order within a specified date
        * range. | | | - `order_date:'2024-02-20T00:00:00Z'`<br/> - `order_date:'>=2024-01-01'`<br/> -
        * `order_date:'2024-01-01..2024-03-31'` |
        * | orders_count | integer | Filter by the total number of orders a customer has placed. | | | -
        * `orders_count:5` |
        * | phone | string | The phone number of the customer, used to communicate information about orders
        * and for the purposes of SMS marketing campaigns. You can use a wildcard value to filter the query by
        * customers who have a phone number specified. | | | - `phone:+18005550100`<br/> - `phone:*` |
        * | state | string | Filter by the
        * [state](https://shopify.dev/docs/api/admin-graphql/latest/objects/Customer#field-state) of the
        * customer's account with the shop. This filter is only valid when [Classic Customer
        * Accounts](https://shopify.dev/docs/api/admin-graphql/latest/objects/CustomerAccountsV2#field-custome
        * rAccountsVersion) is active. | | | - `state:ENABLED`<br/> - `state:INVITED`<br/> -
        * `state:DISABLED`<br/> - `state:DECLINED` |
        * | tag | string | Filter by the tags that are associated with the customer. This query parameter
        * accepts multiple tags separated by commas. | | | - `tag:'VIP'`<br/> - `tag:'Wholesale,Repeat'` |
        * | tag_not | string | Filter by the tags that aren't associated with the customer. This query
        * parameter accepts multiple tags separated by commas. | | | - `tag_not:'Prospect'`<br/> -
        * `tag_not:'Test,Internal'` |
        * | total_spent | float | Filter by the total amount of money a customer has spent across all orders.
        * | | | - `total_spent:100.50`<br/> - `total_spent:50.00`<br/> - `total_spent:>100.50`<br/> -
        * `total_spent:>50.00` |
        * | updated_at | time | The date and time, matching a whole day, when the customer's information was
        * last updated. | | | - `updated_at:2024-01-01T00:00:00Z`<br/> - `updated_at:<now`<br/> -
        * `updated_at:<=2024` |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public CustomersArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface CustomersArgumentsDefinition {
        void define(CustomersArguments args);
    }

    /**
    * Returns a list of [customers](https://shopify.dev/api/admin-graphql/latest/objects/Customer) in your
    * Shopify store, including key information such as name, email, location, and purchase history.
    * Use this query to segment your audience, personalize marketing campaigns, or analyze customer
    * behavior by applying filters based on location, order history, marketing preferences and tags.
    * The `customers` query supports [pagination](https://shopify.dev/api/usage/pagination-graphql) and
    * [sorting](https://shopify.dev/api/admin-graphql/latest/enums/CustomerSortKeys).
    */
    public QueryRootQuery customers(CustomerConnectionQueryDefinition queryDef) {
        return customers(args -> {}, queryDef);
    }

    /**
    * Returns a list of [customers](https://shopify.dev/api/admin-graphql/latest/objects/Customer) in your
    * Shopify store, including key information such as name, email, location, and purchase history.
    * Use this query to segment your audience, personalize marketing campaigns, or analyze customer
    * behavior by applying filters based on location, order history, marketing preferences and tags.
    * The `customers` query supports [pagination](https://shopify.dev/api/usage/pagination-graphql) and
    * [sorting](https://shopify.dev/api/admin-graphql/latest/enums/CustomerSortKeys).
    */
    public QueryRootQuery customers(CustomersArgumentsDefinition argsDef, CustomerConnectionQueryDefinition queryDef) {
        startField("customers");

        CustomersArguments args = new CustomersArguments(_queryBuilder);
        argsDef.define(args);
        CustomersArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CustomerConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CustomersCountArguments extends Arguments {
        CustomersCountArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * A filter made up of terms, connectives, modifiers, and comparators.
        * | name | type | description | acceptable_values | default_value | example_use |
        * | ---- | ---- | ---- | ---- | ---- | ---- |
        * | created_at | time |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | updated_at | time |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public CustomersCountArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The upper bound on count value before returning a result. Use `null` to have no limit.
        */
        public CustomersCountArguments limit(Integer value) {
            if (value != null) {
                startArgument("limit");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CustomersCountArgumentsDefinition {
        void define(CustomersCountArguments args);
    }

    /**
    * The number of customers. Limited to a maximum of 10000 by default.
    */
    public QueryRootQuery customersCount(CountQueryDefinition queryDef) {
        return customersCount(args -> {}, queryDef);
    }

    /**
    * The number of customers. Limited to a maximum of 10000 by default.
    */
    public QueryRootQuery customersCount(CustomersCountArgumentsDefinition argsDef, CountQueryDefinition queryDef) {
        startField("customersCount");

        CustomersCountArguments args = new CustomersCountArguments(_queryBuilder);
        argsDef.define(args);
        CustomersCountArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The delivery customization.
    */
    public QueryRootQuery deliveryCustomization(ID id, DeliveryCustomizationQueryDefinition queryDef) {
        startField("deliveryCustomization");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeliveryCustomizationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class DeliveryCustomizationsArguments extends Arguments {
        DeliveryCustomizationsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public DeliveryCustomizationsArguments first(Integer value) {
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
        public DeliveryCustomizationsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public DeliveryCustomizationsArguments last(Integer value) {
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
        public DeliveryCustomizationsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public DeliveryCustomizationsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * A filter made up of terms, connectives, modifiers, and comparators.
        * | name | type | description | acceptable_values | default_value | example_use |
        * | ---- | ---- | ---- | ---- | ---- | ---- |
        * | enabled | boolean |
        * | function_id | string |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public DeliveryCustomizationsArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface DeliveryCustomizationsArgumentsDefinition {
        void define(DeliveryCustomizationsArguments args);
    }

    /**
    * The delivery customizations.
    */
    public QueryRootQuery deliveryCustomizations(DeliveryCustomizationConnectionQueryDefinition queryDef) {
        return deliveryCustomizations(args -> {}, queryDef);
    }

    /**
    * The delivery customizations.
    */
    public QueryRootQuery deliveryCustomizations(DeliveryCustomizationsArgumentsDefinition argsDef, DeliveryCustomizationConnectionQueryDefinition queryDef) {
        startField("deliveryCustomizations");

        DeliveryCustomizationsArguments args = new DeliveryCustomizationsArguments(_queryBuilder);
        argsDef.define(args);
        DeliveryCustomizationsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new DeliveryCustomizationConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns a Delivery Profile resource by ID.
    */
    public QueryRootQuery deliveryProfile(ID id, DeliveryProfileQueryDefinition queryDef) {
        startField("deliveryProfile");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeliveryProfileQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class DeliveryProfilesArguments extends Arguments {
        DeliveryProfilesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * If `true`, returns only delivery profiles that were created by the merchant.
        */
        public DeliveryProfilesArguments merchantOwnedOnly(Boolean value) {
            if (value != null) {
                startArgument("merchantOwnedOnly");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public DeliveryProfilesArguments first(Integer value) {
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
        public DeliveryProfilesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public DeliveryProfilesArguments last(Integer value) {
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
        public DeliveryProfilesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public DeliveryProfilesArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface DeliveryProfilesArgumentsDefinition {
        void define(DeliveryProfilesArguments args);
    }

    /**
    * Returns a list of saved delivery profiles.
    */
    public QueryRootQuery deliveryProfiles(DeliveryProfileConnectionQueryDefinition queryDef) {
        return deliveryProfiles(args -> {}, queryDef);
    }

    /**
    * Returns a list of saved delivery profiles.
    */
    public QueryRootQuery deliveryProfiles(DeliveryProfilesArgumentsDefinition argsDef, DeliveryProfileConnectionQueryDefinition queryDef) {
        startField("deliveryProfiles");

        DeliveryProfilesArguments args = new DeliveryProfilesArguments(_queryBuilder);
        argsDef.define(args);
        DeliveryProfilesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new DeliveryProfileConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class DeliveryPromiseParticipantsArguments extends Arguments {
        DeliveryPromiseParticipantsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The product variant ID to filter by.
        */
        public DeliveryPromiseParticipantsArguments ownerIds(List<ID> value) {
            if (value != null) {
                startArgument("ownerIds");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public DeliveryPromiseParticipantsArguments first(Integer value) {
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
        public DeliveryPromiseParticipantsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public DeliveryPromiseParticipantsArguments last(Integer value) {
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
        public DeliveryPromiseParticipantsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public DeliveryPromiseParticipantsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface DeliveryPromiseParticipantsArgumentsDefinition {
        void define(DeliveryPromiseParticipantsArguments args);
    }

    /**
    * Returns delivery promise participants.
    */
    public QueryRootQuery deliveryPromiseParticipants(String brandedPromiseHandle, DeliveryPromiseParticipantConnectionQueryDefinition queryDef) {
        return deliveryPromiseParticipants(brandedPromiseHandle, args -> {}, queryDef);
    }

    /**
    * Returns delivery promise participants.
    */
    public QueryRootQuery deliveryPromiseParticipants(String brandedPromiseHandle, DeliveryPromiseParticipantsArgumentsDefinition argsDef, DeliveryPromiseParticipantConnectionQueryDefinition queryDef) {
        startField("deliveryPromiseParticipants");

        _queryBuilder.append("(brandedPromiseHandle:");
        Query.appendQuotedString(_queryBuilder, brandedPromiseHandle.toString());

        argsDef.define(new DeliveryPromiseParticipantsArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeliveryPromiseParticipantConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Lookup a delivery promise provider.
    */
    public QueryRootQuery deliveryPromiseProvider(ID locationId, DeliveryPromiseProviderQueryDefinition queryDef) {
        startField("deliveryPromiseProvider");

        _queryBuilder.append("(locationId:");
        Query.appendQuotedString(_queryBuilder, locationId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeliveryPromiseProviderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Represents the delivery promise settings for a shop.
    */
    public QueryRootQuery deliveryPromiseSettings(DeliveryPromiseSettingQueryDefinition queryDef) {
        startField("deliveryPromiseSettings");

        _queryBuilder.append('{');
        queryDef.define(new DeliveryPromiseSettingQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns the shop-wide shipping settings.
    */
    public QueryRootQuery deliverySettings(DeliverySettingQueryDefinition queryDef) {
        startField("deliverySettings");

        _queryBuilder.append('{');
        queryDef.define(new DeliverySettingQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class DiscountCodesCountArguments extends Arguments {
        DiscountCodesCountArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * A filter made up of terms, connectives, modifiers, and comparators.
        * | name | type | description | acceptable_values | default_value | example_use |
        * | ---- | ---- | ---- | ---- | ---- | ---- |
        * | default | string | Filter by a case-insensitive search of multiple fields in a document. | | | -
        * `query=Bob Norman`<br/> - `query=title:green hoodie` |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | times_used | integer |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public DiscountCodesCountArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The upper bound on count value before returning a result. Use `null` to have no limit.
        */
        public DiscountCodesCountArguments limit(Integer value) {
            if (value != null) {
                startArgument("limit");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface DiscountCodesCountArgumentsDefinition {
        void define(DiscountCodesCountArguments args);
    }

    /**
    * The total number of discount codes for the shop. Limited to a maximum of 10000 by default.
    */
    public QueryRootQuery discountCodesCount(CountQueryDefinition queryDef) {
        return discountCodesCount(args -> {}, queryDef);
    }

    /**
    * The total number of discount codes for the shop. Limited to a maximum of 10000 by default.
    */
    public QueryRootQuery discountCodesCount(DiscountCodesCountArgumentsDefinition argsDef, CountQueryDefinition queryDef) {
        startField("discountCodesCount");

        DiscountCodesCountArguments args = new DiscountCodesCountArguments(_queryBuilder);
        argsDef.define(args);
        DiscountCodesCountArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns a discount resource by ID.
    */
    public QueryRootQuery discountNode(ID id, DiscountNodeQueryDefinition queryDef) {
        startField("discountNode");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DiscountNodeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class DiscountNodesArguments extends Arguments {
        DiscountNodesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public DiscountNodesArguments first(Integer value) {
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
        public DiscountNodesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public DiscountNodesArguments last(Integer value) {
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
        public DiscountNodesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public DiscountNodesArguments reverse(Boolean value) {
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
        public DiscountNodesArguments sortKey(DiscountSortKeys value) {
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
        * | default | string | Filter by a case-insensitive search of multiple fields in a document. | | | -
        * `query=Bob Norman`<br/> - `query=title:green hoodie` |
        * | code | string | Filter by the discount code. Not supported for bulk discounts. | | | -
        * `code:WELCOME10` |
        * | combines_with | string | Filter by the [Shopify Functions discount
        * classes](https://shopify.dev/docs/apps/build/discounts#discount-classes) that the [discount
        * type](https://shopify.dev/docs/api/admin-graphql/latest/queries/discountnodes#argument-query-filter-
        * discount_type) can combine with. | - `order_discounts`<br/> - `product_discounts`<br/> -
        * `shipping_discounts` | | - `combines_with:product_discounts` |
        * | created_at | time | Filter by the date and time, in the shop's timezone, when the discount was
        * created. | | | - `created_at:>'2020-10-21T23:39:20Z'`<br/> - `created_at:<now`<br/> -
        * `created_at:<='2024'` |
        * | discount_class | string | Filter by the [discount
        * class](https://shopify.dev/docs/apps/build/discounts#discount-classes). | - `order`<br/> -
        * `product`<br/> - `shipping` | | - `discount_class:product` |
        * | discount_type | string | Filter by the [discount
        * type](https://help.shopify.com/manual/discounts/discount-types). | - `bogo`<br/> -
        * `fixed_amount`<br/> - `free_shipping`<br/> - `percentage` | | - `type:fixed_amount` |
        * | ends_at | time | Filter by the date and time, in the shop's timezone, when the discount ends. | |
        * | - `ends_at:>'2020-10-21T23:39:20Z'`<br/> - `ends_at:<now`<br/> - `ends_at:<='2024'` |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | method | string | Filter by the [discount
        * method](https://shopify.dev/docs/apps/build/discounts#discount-methods). | - `automatic`<br/> -
        * `code` | | - `method:code` |
        * | starts_at | time | Filter by the date and time, in the shop's timezone, when the discount becomes
        * active and is available for customer use. | | | - `starts_at:>'2020-10-21T23:39:20Z'`<br/> -
        * `starts_at:<now`<br/> - `starts_at:<='2024'` |
        * | status | string | Filter by the status of the discount. | - `active`<br/> - `expired`<br/> -
        * `scheduled` | | - `status:scheduled` |
        * | times_used | integer | Filter by the number of times the discount has been used. For example, if a
        * "Buy 3, Get 1 Free" t-shirt discount is automatically applied in 200 transactions, then the discount
        * has been used 200 times. <br><br> This value is updated asynchronously. As a result, it might be
        * different than the actual usage count. | | | - `times_used:0`<br/> - `times_used:>150`<br/> -
        * `times_used:>=200` |
        * | title | string | Filter by the discount name that displays to merchants in the Shopify admin and
        * to customers. | | | - `title:Black Friday Sale` |
        * | type | string | Filter by the [discount
        * type](https://help.shopify.com/manual/discounts/discount-types). | - `all`<br/> -
        * `all_with_app`<br/> - `app`<br/> - `bxgy`<br/> - `fixed_amount`<br/> - `free_shipping`<br/> -
        * `percentage` | | - `type:percentage` |
        * | updated_at | time | Filter by the date and time, in the shop's timezone, when the discount was
        * last updated. | | | - `updated_at:>'2020-10-21T23:39:20Z'`<br/> - `updated_at:<now`<br/> -
        * `updated_at:<='2024'` |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public DiscountNodesArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The ID of a [saved
        * search](https://shopify.dev/api/admin-graphql/latest/objects/savedsearch#field-id).
        * The search’s query string is used as the query argument.
        */
        public DiscountNodesArguments savedSearchId(ID value) {
            if (value != null) {
                startArgument("savedSearchId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface DiscountNodesArgumentsDefinition {
        void define(DiscountNodesArguments args);
    }

    /**
    * Returns a list of discounts.
    */
    public QueryRootQuery discountNodes(DiscountNodeConnectionQueryDefinition queryDef) {
        return discountNodes(args -> {}, queryDef);
    }

    /**
    * Returns a list of discounts.
    */
    public QueryRootQuery discountNodes(DiscountNodesArgumentsDefinition argsDef, DiscountNodeConnectionQueryDefinition queryDef) {
        startField("discountNodes");

        DiscountNodesArguments args = new DiscountNodesArguments(_queryBuilder);
        argsDef.define(args);
        DiscountNodesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new DiscountNodeConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class DiscountNodesCountArguments extends Arguments {
        DiscountNodesCountArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * A filter made up of terms, connectives, modifiers, and comparators.
        * | name | type | description | acceptable_values | default_value | example_use |
        * | ---- | ---- | ---- | ---- | ---- | ---- |
        * | default | string | Filter by a case-insensitive search of multiple fields in a document. | | | -
        * `query=Bob Norman`<br/> - `query=title:green hoodie` |
        * | code | string | Filter by the discount code. Not supported for bulk discounts. | | | -
        * `code:WELCOME10` |
        * | combines_with | string | Filter by the [Shopify Functions discount
        * classes](https://shopify.dev/docs/apps/build/discounts#discount-classes) that the [discount
        * type](https://shopify.dev/docs/api/admin-graphql/latest/queries/discountnodes#argument-query-filter-
        * discount_type) can combine with. | - `order_discounts`<br/> - `product_discounts`<br/> -
        * `shipping_discounts` | | - `combines_with:product_discounts` |
        * | created_at | time | Filter by the date and time, in the shop's timezone, when the discount was
        * created. | | | - `created_at:>'2020-10-21T23:39:20Z'`<br/> - `created_at:<now`<br/> -
        * `created_at:<='2024'` |
        * | discount_class | string | Filter by the [discount
        * class](https://shopify.dev/docs/apps/build/discounts#discount-classes). | - `order`<br/> -
        * `product`<br/> - `shipping` | | - `discount_class:product` |
        * | discount_type | string | Filter by the [discount
        * type](https://help.shopify.com/manual/discounts/discount-types). | - `bogo`<br/> -
        * `fixed_amount`<br/> - `free_shipping`<br/> - `percentage` | | - `type:fixed_amount` |
        * | ends_at | time | Filter by the date and time, in the shop's timezone, when the discount ends. | |
        * | - `ends_at:>'2020-10-21T23:39:20Z'`<br/> - `ends_at:<now`<br/> - `ends_at:<='2024'` |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | method | string | Filter by the [discount
        * method](https://shopify.dev/docs/apps/build/discounts#discount-methods). | - `automatic`<br/> -
        * `code` | | - `method:code` |
        * | starts_at | time | Filter by the date and time, in the shop's timezone, when the discount becomes
        * active and is available for customer use. | | | - `starts_at:>'2020-10-21T23:39:20Z'`<br/> -
        * `starts_at:<now`<br/> - `starts_at:<='2024'` |
        * | status | string | Filter by the status of the discount. | - `active`<br/> - `expired`<br/> -
        * `scheduled` | | - `status:scheduled` |
        * | times_used | integer | Filter by the number of times the discount has been used. For example, if a
        * "Buy 3, Get 1 Free" t-shirt discount is automatically applied in 200 transactions, then the discount
        * has been used 200 times. <br><br> This value is updated asynchronously. As a result, it might be
        * different than the actual usage count. | | | - `times_used:0`<br/> - `times_used:>150`<br/> -
        * `times_used:>=200` |
        * | title | string | Filter by the discount name that displays to merchants in the Shopify admin and
        * to customers. | | | - `title:Black Friday Sale` |
        * | type | string | Filter by the [discount
        * type](https://help.shopify.com/manual/discounts/discount-types). | - `all`<br/> -
        * `all_with_app`<br/> - `app`<br/> - `bxgy`<br/> - `fixed_amount`<br/> - `free_shipping`<br/> -
        * `percentage` | | - `type:percentage` |
        * | updated_at | time | Filter by the date and time, in the shop's timezone, when the discount was
        * last updated. | | | - `updated_at:>'2020-10-21T23:39:20Z'`<br/> - `updated_at:<now`<br/> -
        * `updated_at:<='2024'` |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public DiscountNodesCountArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The ID of an existing saved search.
        * The search’s query string is used as the query argument.
        * Refer to the [`SavedSearch`](https://shopify.dev/api/admin-graphql/latest/objects/savedsearch)
        * object.
        */
        public DiscountNodesCountArguments savedSearchId(ID value) {
            if (value != null) {
                startArgument("savedSearchId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The upper bound on count value before returning a result. Use `null` to have no limit.
        */
        public DiscountNodesCountArguments limit(Integer value) {
            if (value != null) {
                startArgument("limit");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface DiscountNodesCountArgumentsDefinition {
        void define(DiscountNodesCountArguments args);
    }

    /**
    * The total number of discounts for the shop. Limited to a maximum of 10000 by default.
    */
    public QueryRootQuery discountNodesCount(CountQueryDefinition queryDef) {
        return discountNodesCount(args -> {}, queryDef);
    }

    /**
    * The total number of discounts for the shop. Limited to a maximum of 10000 by default.
    */
    public QueryRootQuery discountNodesCount(DiscountNodesCountArgumentsDefinition argsDef, CountQueryDefinition queryDef) {
        startField("discountNodesCount");

        DiscountNodesCountArguments args = new DiscountNodesCountArguments(_queryBuilder);
        argsDef.define(args);
        DiscountNodesCountArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns a bulk code creation resource by ID.
    */
    public QueryRootQuery discountRedeemCodeBulkCreation(ID id, DiscountRedeemCodeBulkCreationQueryDefinition queryDef) {
        startField("discountRedeemCodeBulkCreation");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DiscountRedeemCodeBulkCreationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class DiscountRedeemCodeSavedSearchesArguments extends Arguments {
        DiscountRedeemCodeSavedSearchesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public DiscountRedeemCodeSavedSearchesArguments first(Integer value) {
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
        public DiscountRedeemCodeSavedSearchesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public DiscountRedeemCodeSavedSearchesArguments last(Integer value) {
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
        public DiscountRedeemCodeSavedSearchesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public DiscountRedeemCodeSavedSearchesArguments reverse(Boolean value) {
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
        public DiscountRedeemCodeSavedSearchesArguments sortKey(DiscountCodeSortKeys value) {
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
        * | default | string | Filter by a case-insensitive search of multiple fields in a document. | | | -
        * `query=Bob Norman`<br/> - `query=title:green hoodie` |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | times_used | integer |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public DiscountRedeemCodeSavedSearchesArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface DiscountRedeemCodeSavedSearchesArgumentsDefinition {
        void define(DiscountRedeemCodeSavedSearchesArguments args);
    }

    /**
    * List of the shop's redeemed discount code saved searches.
    */
    public QueryRootQuery discountRedeemCodeSavedSearches(SavedSearchConnectionQueryDefinition queryDef) {
        return discountRedeemCodeSavedSearches(args -> {}, queryDef);
    }

    /**
    * List of the shop's redeemed discount code saved searches.
    */
    public QueryRootQuery discountRedeemCodeSavedSearches(DiscountRedeemCodeSavedSearchesArgumentsDefinition argsDef, SavedSearchConnectionQueryDefinition queryDef) {
        startField("discountRedeemCodeSavedSearches");

        DiscountRedeemCodeSavedSearchesArguments args = new DiscountRedeemCodeSavedSearchesArguments(_queryBuilder);
        argsDef.define(args);
        DiscountRedeemCodeSavedSearchesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SavedSearchConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns dispute details based on ID.
    */
    public QueryRootQuery dispute(ID id, ShopifyPaymentsDisputeQueryDefinition queryDef) {
        startField("dispute");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ShopifyPaymentsDisputeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns dispute evidence details based on ID.
    */
    public QueryRootQuery disputeEvidence(ID id, ShopifyPaymentsDisputeEvidenceQueryDefinition queryDef) {
        startField("disputeEvidence");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ShopifyPaymentsDisputeEvidenceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class DisputesArguments extends Arguments {
        DisputesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public DisputesArguments first(Integer value) {
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
        public DisputesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public DisputesArguments last(Integer value) {
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
        public DisputesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public DisputesArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * A filter made up of terms, connectives, modifiers, and comparators.
        * | name | type | description | acceptable_values | default_value | example_use |
        * | ---- | ---- | ---- | ---- | ---- | ---- |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | initiated_at | time |
        * | status | string |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public DisputesArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface DisputesArgumentsDefinition {
        void define(DisputesArguments args);
    }

    /**
    * All disputes related to the Shop.
    */
    public QueryRootQuery disputes(ShopifyPaymentsDisputeConnectionQueryDefinition queryDef) {
        return disputes(args -> {}, queryDef);
    }

    /**
    * All disputes related to the Shop.
    */
    public QueryRootQuery disputes(DisputesArgumentsDefinition argsDef, ShopifyPaymentsDisputeConnectionQueryDefinition queryDef) {
        startField("disputes");

        DisputesArguments args = new DisputesArguments(_queryBuilder);
        argsDef.define(args);
        DisputesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ShopifyPaymentsDisputeConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Lookup a Domain by ID.
    */
    public QueryRootQuery domain(ID id, DomainQueryDefinition queryDef) {
        startField("domain");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DomainQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Retrieves a [draft order](https://shopify.dev/docs/api/admin-graphql/latest/objects/DraftOrder) by
    * its ID.
    * A draft order is an order created by a merchant on behalf of their
    * customers. Draft orders contain all necessary order details (products, pricing, customer
    * information)
    * but require payment to be accepted before they can be converted into
    * [completed orders](https://shopify.dev/docs/api/admin-graphql/latest/mutations/draftOrderComplete).
    * Use the `draftOrder` query to retrieve information associated with the following workflows:
    * - Creating orders for phone, in-person, or chat sales
    * - Sending invoices to customers with secure checkout links
    * - Managing custom items and additional costs
    * - Selling products at discount or wholesale rates
    * - Processing pre-orders and saving drafts for later completion
    * A draft order is associated with a
    * [customer](https://shopify.dev/docs/api/admin-graphql/latest/objects/Customer)
    * and contains multiple [line
    * items](https://shopify.dev/docs/api/admin-graphql/latest/objects/DraftOrderLineItem).
    * Each draft order has a
    * [status](https://shopify.dev/docs/api/admin-graphql/latest/objects/DraftOrder#field-DraftOrder.field
    * s.status),
    * which indicates its progress through the sales workflow.
    */
    public QueryRootQuery draftOrder(ID id, DraftOrderQueryDefinition queryDef) {
        startField("draftOrder");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DraftOrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class DraftOrderAvailableDeliveryOptionsArguments extends Arguments {
        DraftOrderAvailableDeliveryOptionsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The search term for the delivery options.
        */
        public DraftOrderAvailableDeliveryOptionsArguments search(String value) {
            if (value != null) {
                startArgument("search");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The offset for the local pickup options.
        */
        public DraftOrderAvailableDeliveryOptionsArguments localPickupFrom(Integer value) {
            if (value != null) {
                startArgument("localPickupFrom");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * The number of local pickup options required.
        */
        public DraftOrderAvailableDeliveryOptionsArguments localPickupCount(Integer value) {
            if (value != null) {
                startArgument("localPickupCount");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * Unique token used to trace execution and help optimize the calculation.
        */
        public DraftOrderAvailableDeliveryOptionsArguments sessionToken(String value) {
            if (value != null) {
                startArgument("sessionToken");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface DraftOrderAvailableDeliveryOptionsArgumentsDefinition {
        void define(DraftOrderAvailableDeliveryOptionsArguments args);
    }

    /**
    * Returns a list of available delivery options for a draft order.
    */
    public QueryRootQuery draftOrderAvailableDeliveryOptions(DraftOrderAvailableDeliveryOptionsInput input, DraftOrderAvailableDeliveryOptionsQueryDefinition queryDef) {
        return draftOrderAvailableDeliveryOptions(input, args -> {}, queryDef);
    }

    /**
    * Returns a list of available delivery options for a draft order.
    */
    public QueryRootQuery draftOrderAvailableDeliveryOptions(DraftOrderAvailableDeliveryOptionsInput input, DraftOrderAvailableDeliveryOptionsArgumentsDefinition argsDef, DraftOrderAvailableDeliveryOptionsQueryDefinition queryDef) {
        startField("draftOrderAvailableDeliveryOptions");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        argsDef.define(new DraftOrderAvailableDeliveryOptionsArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DraftOrderAvailableDeliveryOptionsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class DraftOrderSavedSearchesArguments extends Arguments {
        DraftOrderSavedSearchesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public DraftOrderSavedSearchesArguments first(Integer value) {
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
        public DraftOrderSavedSearchesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public DraftOrderSavedSearchesArguments last(Integer value) {
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
        public DraftOrderSavedSearchesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public DraftOrderSavedSearchesArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface DraftOrderSavedSearchesArgumentsDefinition {
        void define(DraftOrderSavedSearchesArguments args);
    }

    /**
    * List of the shop's draft order saved searches.
    */
    public QueryRootQuery draftOrderSavedSearches(SavedSearchConnectionQueryDefinition queryDef) {
        return draftOrderSavedSearches(args -> {}, queryDef);
    }

    /**
    * List of the shop's draft order saved searches.
    */
    public QueryRootQuery draftOrderSavedSearches(DraftOrderSavedSearchesArgumentsDefinition argsDef, SavedSearchConnectionQueryDefinition queryDef) {
        startField("draftOrderSavedSearches");

        DraftOrderSavedSearchesArguments args = new DraftOrderSavedSearchesArguments(_queryBuilder);
        argsDef.define(args);
        DraftOrderSavedSearchesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SavedSearchConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns a DraftOrderTag resource by ID.
    */
    public QueryRootQuery draftOrderTag(ID id, DraftOrderTagQueryDefinition queryDef) {
        startField("draftOrderTag");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DraftOrderTagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class DraftOrdersArguments extends Arguments {
        DraftOrdersArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public DraftOrdersArguments first(Integer value) {
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
        public DraftOrdersArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public DraftOrdersArguments last(Integer value) {
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
        public DraftOrdersArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public DraftOrdersArguments reverse(Boolean value) {
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
        public DraftOrdersArguments sortKey(DraftOrderSortKeys value) {
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
        * | default | string | Filter by a case-insensitive search of multiple fields in a document. | | | -
        * `query=Bob Norman`<br/> - `query=title:green hoodie` |
        * | created_at | time |
        * | customer_id | id |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | source | string |
        * | status | string |
        * | tag | string |
        * | updated_at | time |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public DraftOrdersArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The ID of a [saved
        * search](https://shopify.dev/api/admin-graphql/latest/objects/savedsearch#field-id).
        * The search’s query string is used as the query argument.
        */
        public DraftOrdersArguments savedSearchId(ID value) {
            if (value != null) {
                startArgument("savedSearchId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface DraftOrdersArgumentsDefinition {
        void define(DraftOrdersArguments args);
    }

    /**
    * List of saved draft orders.
    */
    public QueryRootQuery draftOrders(DraftOrderConnectionQueryDefinition queryDef) {
        return draftOrders(args -> {}, queryDef);
    }

    /**
    * List of saved draft orders.
    */
    public QueryRootQuery draftOrders(DraftOrdersArgumentsDefinition argsDef, DraftOrderConnectionQueryDefinition queryDef) {
        startField("draftOrders");

        DraftOrdersArguments args = new DraftOrdersArguments(_queryBuilder);
        argsDef.define(args);
        DraftOrdersArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new DraftOrderConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class DraftOrdersCountArguments extends Arguments {
        DraftOrdersCountArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * A filter made up of terms, connectives, modifiers, and comparators.
        * | name | type | description | acceptable_values | default_value | example_use |
        * | ---- | ---- | ---- | ---- | ---- | ---- |
        * | default | string | Filter by a case-insensitive search of multiple fields in a document. | | | -
        * `query=Bob Norman`<br/> - `query=title:green hoodie` |
        * | created_at | time |
        * | customer_id | id |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | ids | string |
        * | source | string |
        * | status | string |
        * | tag | string |
        * | updated_at | time |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public DraftOrdersCountArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The ID of an existing saved search.
        * The search’s query string is used as the query argument.
        * Refer to the [`SavedSearch`](https://shopify.dev/api/admin-graphql/latest/objects/savedsearch)
        * object.
        */
        public DraftOrdersCountArguments savedSearchId(ID value) {
            if (value != null) {
                startArgument("savedSearchId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The upper bound on count value before returning a result. Use `null` to have no limit.
        */
        public DraftOrdersCountArguments limit(Integer value) {
            if (value != null) {
                startArgument("limit");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface DraftOrdersCountArgumentsDefinition {
        void define(DraftOrdersCountArguments args);
    }

    /**
    * Returns the number of draft orders that match the query. Limited to a maximum of 10000 by default.
    */
    public QueryRootQuery draftOrdersCount(CountQueryDefinition queryDef) {
        return draftOrdersCount(args -> {}, queryDef);
    }

    /**
    * Returns the number of draft orders that match the query. Limited to a maximum of 10000 by default.
    */
    public QueryRootQuery draftOrdersCount(DraftOrdersCountArgumentsDefinition argsDef, CountQueryDefinition queryDef) {
        startField("draftOrdersCount");

        DraftOrdersCountArguments args = new DraftOrdersCountArguments(_queryBuilder);
        argsDef.define(args);
        DraftOrdersCountArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Get a single event by its id.
    */
    public QueryRootQuery event(ID id, EventQueryDefinition queryDef) {
        startField("event");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new EventQuery(_queryBuilder));
        _queryBuilder.append('}');

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
    * The paginated list of events associated with the store.
    */
    public QueryRootQuery events(EventConnectionQueryDefinition queryDef) {
        return events(args -> {}, queryDef);
    }

    /**
    * The paginated list of events associated with the store.
    */
    public QueryRootQuery events(EventsArgumentsDefinition argsDef, EventConnectionQueryDefinition queryDef) {
        startField("events");

        EventsArguments args = new EventsArguments(_queryBuilder);
        argsDef.define(args);
        EventsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new EventConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class EventsCountArguments extends Arguments {
        EventsCountArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
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
        public EventsCountArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface EventsCountArgumentsDefinition {
        void define(EventsCountArguments args);
    }

    /**
    * Count of events. Limited to a maximum of 10000.
    */
    public QueryRootQuery eventsCount(CountQueryDefinition queryDef) {
        return eventsCount(args -> {}, queryDef);
    }

    /**
    * Count of events. Limited to a maximum of 10000.
    */
    public QueryRootQuery eventsCount(EventsCountArgumentsDefinition argsDef, CountQueryDefinition queryDef) {
        startField("eventsCount");

        EventsCountArguments args = new EventsCountArguments(_queryBuilder);
        argsDef.define(args);
        EventsCountArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class FileSavedSearchesArguments extends Arguments {
        FileSavedSearchesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public FileSavedSearchesArguments first(Integer value) {
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
        public FileSavedSearchesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public FileSavedSearchesArguments last(Integer value) {
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
        public FileSavedSearchesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public FileSavedSearchesArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface FileSavedSearchesArgumentsDefinition {
        void define(FileSavedSearchesArguments args);
    }

    /**
    * A list of the shop's file saved searches.
    */
    public QueryRootQuery fileSavedSearches(SavedSearchConnectionQueryDefinition queryDef) {
        return fileSavedSearches(args -> {}, queryDef);
    }

    /**
    * A list of the shop's file saved searches.
    */
    public QueryRootQuery fileSavedSearches(FileSavedSearchesArgumentsDefinition argsDef, SavedSearchConnectionQueryDefinition queryDef) {
        startField("fileSavedSearches");

        FileSavedSearchesArguments args = new FileSavedSearchesArguments(_queryBuilder);
        argsDef.define(args);
        FileSavedSearchesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SavedSearchConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class FilesArguments extends Arguments {
        FilesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public FilesArguments first(Integer value) {
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
        public FilesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public FilesArguments last(Integer value) {
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
        public FilesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public FilesArguments reverse(Boolean value) {
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
        public FilesArguments sortKey(FileSortKeys value) {
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
        * | default | string | Filter by a case-insensitive search of multiple fields in a document. | | | -
        * `query=Bob Norman`<br/> - `query=title:green hoodie` |
        * | created_at | time |
        * | filename | string |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | ids | string |
        * | media_type | string |
        * | original_upload_size | float |
        * | product_id | string |
        * | status | string |
        * | updated_at | time |
        * | used_in | string |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public FilesArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The ID of a [saved
        * search](https://shopify.dev/api/admin-graphql/latest/objects/savedsearch#field-id).
        * The search’s query string is used as the query argument.
        */
        public FilesArguments savedSearchId(ID value) {
            if (value != null) {
                startArgument("savedSearchId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface FilesArgumentsDefinition {
        void define(FilesArguments args);
    }

    /**
    * Retrieves a paginated list of files that have been uploaded to a Shopify store. Files represent
    * digital assets
    * that merchants can upload to their store for various purposes including product images, marketing
    * materials,
    * documents, and brand assets.
    * Use the `files` query to retrieve information associated with the following workflows:
    * - [Managing product media and
    * images](https://shopify.dev/docs/apps/build/online-store/product-media)
    * - [Theme development and asset
    * management](https://shopify.dev/docs/storefronts/themes/store/success/brand-assets)
    * - Brand asset management and [checkout
    * branding](https://shopify.dev/docs/apps/build/checkout/styling/add-favicon)
    * Files can include multiple [content
    * types](https://shopify.dev/docs/api/admin-graphql/latest/enums/FileContentType),
    * such as images, videos, 3D models, and generic files. Each file has
    * properties like dimensions, file size, alt text for accessibility, and upload status. Files can be
    * filtered
    * by [media type](https://shopify.dev/docs/api/admin-graphql/latest/enums/MediaContentType) and can be
    * associated with
    * [products](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product),
    * [themes](https://shopify.dev/docs/api/admin-graphql/latest/objects/OnlineStoreTheme),
    * and other store resources.
    */
    public QueryRootQuery files(FileConnectionQueryDefinition queryDef) {
        return files(args -> {}, queryDef);
    }

    /**
    * Retrieves a paginated list of files that have been uploaded to a Shopify store. Files represent
    * digital assets
    * that merchants can upload to their store for various purposes including product images, marketing
    * materials,
    * documents, and brand assets.
    * Use the `files` query to retrieve information associated with the following workflows:
    * - [Managing product media and
    * images](https://shopify.dev/docs/apps/build/online-store/product-media)
    * - [Theme development and asset
    * management](https://shopify.dev/docs/storefronts/themes/store/success/brand-assets)
    * - Brand asset management and [checkout
    * branding](https://shopify.dev/docs/apps/build/checkout/styling/add-favicon)
    * Files can include multiple [content
    * types](https://shopify.dev/docs/api/admin-graphql/latest/enums/FileContentType),
    * such as images, videos, 3D models, and generic files. Each file has
    * properties like dimensions, file size, alt text for accessibility, and upload status. Files can be
    * filtered
    * by [media type](https://shopify.dev/docs/api/admin-graphql/latest/enums/MediaContentType) and can be
    * associated with
    * [products](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product),
    * [themes](https://shopify.dev/docs/api/admin-graphql/latest/objects/OnlineStoreTheme),
    * and other store resources.
    */
    public QueryRootQuery files(FilesArgumentsDefinition argsDef, FileConnectionQueryDefinition queryDef) {
        startField("files");

        FilesArguments args = new FilesArguments(_queryBuilder);
        argsDef.define(args);
        FilesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new FileConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns the access policy for a finance app .
    */
    public QueryRootQuery financeAppAccessPolicy(FinanceAppAccessPolicyQueryDefinition queryDef) {
        startField("financeAppAccessPolicy");

        _queryBuilder.append('{');
        queryDef.define(new FinanceAppAccessPolicyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns the KYC information for the shop's Shopify Payments account, used in embedded finance apps.
    */
    public QueryRootQuery financeKycInformation(FinanceKycInformationQueryDefinition queryDef) {
        startField("financeKycInformation");

        _queryBuilder.append('{');
        queryDef.define(new FinanceKycInformationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns a Fulfillment resource by ID.
    */
    public QueryRootQuery fulfillment(ID id, FulfillmentQueryDefinition queryDef) {
        startField("fulfillment");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The fulfillment constraint rules that belong to a shop.
    */
    public QueryRootQuery fulfillmentConstraintRules(FulfillmentConstraintRuleQueryDefinition queryDef) {
        startField("fulfillmentConstraintRules");

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentConstraintRuleQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns a Fulfillment order resource by ID.
    */
    public QueryRootQuery fulfillmentOrder(ID id, FulfillmentOrderQueryDefinition queryDef) {
        startField("fulfillmentOrder");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class FulfillmentOrdersArguments extends Arguments {
        FulfillmentOrdersArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Whether to include closed fulfillment orders.
        */
        public FulfillmentOrdersArguments includeClosed(Boolean value) {
            if (value != null) {
                startArgument("includeClosed");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public FulfillmentOrdersArguments first(Integer value) {
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
        public FulfillmentOrdersArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public FulfillmentOrdersArguments last(Integer value) {
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
        public FulfillmentOrdersArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public FulfillmentOrdersArguments reverse(Boolean value) {
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
        public FulfillmentOrdersArguments sortKey(FulfillmentOrderSortKeys value) {
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
        * | default | string | Filter by a case-insensitive search of multiple fields in a document. | | | -
        * `query=Bob Norman`<br/> - `query=title:green hoodie` |
        * | assigned_location_id | id |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | status | string |
        * | updated_at | time |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public FulfillmentOrdersArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface FulfillmentOrdersArgumentsDefinition {
        void define(FulfillmentOrdersArguments args);
    }

    /**
    * The paginated list of all fulfillment orders.
    * The returned fulfillment orders are filtered according to the
    * [fulfillment order access
    * scopes](https://shopify.dev/api/admin-graphql/latest/objects/fulfillmentorder#api-access-scopes)
    * granted to the app.
    * Use this query to retrieve fulfillment orders assigned to merchant-managed locations,
    * third-party fulfillment service locations, or all kinds of locations together.
    * For fetching only the fulfillment orders assigned to the app's locations, use the
    * [assignedFulfillmentOrders](https://shopify.dev/api/admin-graphql/2024-07/objects/queryroot#connecti
    * on-assignedfulfillmentorders)
    * connection.
    */
    public QueryRootQuery fulfillmentOrders(FulfillmentOrderConnectionQueryDefinition queryDef) {
        return fulfillmentOrders(args -> {}, queryDef);
    }

    /**
    * The paginated list of all fulfillment orders.
    * The returned fulfillment orders are filtered according to the
    * [fulfillment order access
    * scopes](https://shopify.dev/api/admin-graphql/latest/objects/fulfillmentorder#api-access-scopes)
    * granted to the app.
    * Use this query to retrieve fulfillment orders assigned to merchant-managed locations,
    * third-party fulfillment service locations, or all kinds of locations together.
    * For fetching only the fulfillment orders assigned to the app's locations, use the
    * [assignedFulfillmentOrders](https://shopify.dev/api/admin-graphql/2024-07/objects/queryroot#connecti
    * on-assignedfulfillmentorders)
    * connection.
    */
    public QueryRootQuery fulfillmentOrders(FulfillmentOrdersArgumentsDefinition argsDef, FulfillmentOrderConnectionQueryDefinition queryDef) {
        startField("fulfillmentOrders");

        FulfillmentOrdersArguments args = new FulfillmentOrdersArguments(_queryBuilder);
        argsDef.define(args);
        FulfillmentOrdersArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns a FulfillmentService resource by ID.
    */
    public QueryRootQuery fulfillmentService(ID id, FulfillmentServiceQueryDefinition queryDef) {
        startField("fulfillmentService");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentServiceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns a gift card resource by ID.
    */
    public QueryRootQuery giftCard(ID id, GiftCardQueryDefinition queryDef) {
        startField("giftCard");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new GiftCardQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The configuration for the shop's gift cards.
    */
    public QueryRootQuery giftCardConfiguration(GiftCardConfigurationQueryDefinition queryDef) {
        startField("giftCardConfiguration");

        _queryBuilder.append('{');
        queryDef.define(new GiftCardConfigurationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class GiftCardsArguments extends Arguments {
        GiftCardsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public GiftCardsArguments first(Integer value) {
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
        public GiftCardsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public GiftCardsArguments last(Integer value) {
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
        public GiftCardsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public GiftCardsArguments reverse(Boolean value) {
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
        public GiftCardsArguments sortKey(GiftCardSortKeys value) {
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
        * | default | string | Searched fields: code. | | | - `query=Bob Norman`<br/> - `query=title:green
        * hoodie` |
        * | balance_status | string | | - `full`<br/> - `partial`<br/> - `empty`<br/> - `full_or_partial` | |
        * - `balance_status:full` |
        * | created_at | time | | | | - `created_at:>=2020-01-01T12:00:00Z` |
        * | expires_on | date | | | | - `expires_on:>=2020-01-01` |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | initial_value | string | | | | - `initial_value:>=100` |
        * | source | string | | - `manual`<br/> - `purchased`<br/> - `api_client` | | - `source:manual` |
        * | status | string | | - `disabled`<br/> - `enabled`<br/> - `expired`<br/> - `expiring` | | -
        * `status:disabled OR status:expired` |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public GiftCardsArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The ID of a [saved
        * search](https://shopify.dev/api/admin-graphql/latest/objects/savedsearch#field-id).
        * The search’s query string is used as the query argument.
        */
        public GiftCardsArguments savedSearchId(ID value) {
            if (value != null) {
                startArgument("savedSearchId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface GiftCardsArgumentsDefinition {
        void define(GiftCardsArguments args);
    }

    /**
    * Returns a list of gift cards.
    */
    public QueryRootQuery giftCards(GiftCardConnectionQueryDefinition queryDef) {
        return giftCards(args -> {}, queryDef);
    }

    /**
    * Returns a list of gift cards.
    */
    public QueryRootQuery giftCards(GiftCardsArgumentsDefinition argsDef, GiftCardConnectionQueryDefinition queryDef) {
        startField("giftCards");

        GiftCardsArguments args = new GiftCardsArguments(_queryBuilder);
        argsDef.define(args);
        GiftCardsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new GiftCardConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class GiftCardsCountArguments extends Arguments {
        GiftCardsCountArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * A filter made up of terms, connectives, modifiers, and comparators.
        * | name | type | description | acceptable_values | default_value | example_use |
        * | ---- | ---- | ---- | ---- | ---- | ---- |
        * | default | string | Searched fields: code. | | | - `query=Bob Norman`<br/> - `query=title:green
        * hoodie` |
        * | balance_status | string | | - `full`<br/> - `partial`<br/> - `empty`<br/> - `full_or_partial` | |
        * - `balance_status:full` |
        * | created_at | time | | | | - `created_at:>=2020-01-01T12:00:00Z` |
        * | expires_on | date | | | | - `expires_on:>=2020-01-01` |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | initial_value | string | | | | - `initial_value:>=100` |
        * | source | string | | - `manual`<br/> - `purchased`<br/> - `api_client` | | - `source:manual` |
        * | status | string | | - `disabled`<br/> - `enabled`<br/> - `expired`<br/> - `expiring` | | -
        * `status:disabled OR status:expired` |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public GiftCardsCountArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The ID of an existing saved search.
        * The search’s query string is used as the query argument.
        * Refer to the [`SavedSearch`](https://shopify.dev/api/admin-graphql/latest/objects/savedsearch)
        * object.
        */
        public GiftCardsCountArguments savedSearchId(ID value) {
            if (value != null) {
                startArgument("savedSearchId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The upper bound on count value before returning a result. Use `null` to have no limit.
        */
        public GiftCardsCountArguments limit(Integer value) {
            if (value != null) {
                startArgument("limit");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface GiftCardsCountArgumentsDefinition {
        void define(GiftCardsCountArguments args);
    }

    /**
    * The total number of gift cards issued for the shop. Limited to a maximum of 10000 by default.
    */
    public QueryRootQuery giftCardsCount(CountQueryDefinition queryDef) {
        return giftCardsCount(args -> {}, queryDef);
    }

    /**
    * The total number of gift cards issued for the shop. Limited to a maximum of 10000 by default.
    */
    public QueryRootQuery giftCardsCount(GiftCardsCountArgumentsDefinition argsDef, CountQueryDefinition queryDef) {
        startField("giftCardsCount");

        GiftCardsCountArguments args = new GiftCardsCountArguments(_queryBuilder);
        argsDef.define(args);
        GiftCardsCountArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns an
    * [InventoryItem](https://shopify.dev/docs/api/admin-graphql/latest/objects/InventoryItem)
    * object by ID.
    */
    public QueryRootQuery inventoryItem(ID id, InventoryItemQueryDefinition queryDef) {
        startField("inventoryItem");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new InventoryItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class InventoryItemsArguments extends Arguments {
        InventoryItemsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public InventoryItemsArguments first(Integer value) {
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
        public InventoryItemsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public InventoryItemsArguments last(Integer value) {
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
        public InventoryItemsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public InventoryItemsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * A filter made up of terms, connectives, modifiers, and comparators.
        * | name | type | description | acceptable_values | default_value | example_use |
        * | ---- | ---- | ---- | ---- | ---- | ---- |
        * | created_at | time |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | sku | string | Filter by the inventory item
        * [`sku`](https://shopify.dev/docs/api/admin-graphql/latest/objects/InventoryItem#field-sku) field.
        * [Learn more about SKUs](https://help.shopify.com/manual/products/details/sku). | | | -
        * `sku:XYZ-12345` |
        * | updated_at | time |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public InventoryItemsArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface InventoryItemsArgumentsDefinition {
        void define(InventoryItemsArguments args);
    }

    /**
    * Returns a list of inventory items.
    */
    public QueryRootQuery inventoryItems(InventoryItemConnectionQueryDefinition queryDef) {
        return inventoryItems(args -> {}, queryDef);
    }

    /**
    * Returns a list of inventory items.
    */
    public QueryRootQuery inventoryItems(InventoryItemsArgumentsDefinition argsDef, InventoryItemConnectionQueryDefinition queryDef) {
        startField("inventoryItems");

        InventoryItemsArguments args = new InventoryItemsArguments(_queryBuilder);
        argsDef.define(args);
        InventoryItemsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new InventoryItemConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns an
    * [InventoryLevel](https://shopify.dev/docs/api/admin-graphql/latest/objects/InventoryLevel)
    * object by ID.
    */
    public QueryRootQuery inventoryLevel(ID id, InventoryLevelQueryDefinition queryDef) {
        startField("inventoryLevel");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new InventoryLevelQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * General inventory properties for the shop.
    */
    public QueryRootQuery inventoryProperties(InventoryPropertiesQueryDefinition queryDef) {
        startField("inventoryProperties");

        _queryBuilder.append('{');
        queryDef.define(new InventoryPropertiesQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns an inventory shipment by ID.
    */
    public QueryRootQuery inventoryShipment(ID id, InventoryShipmentQueryDefinition queryDef) {
        startField("inventoryShipment");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new InventoryShipmentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns an inventory transfer by ID.
    */
    public QueryRootQuery inventoryTransfer(ID id, InventoryTransferQueryDefinition queryDef) {
        startField("inventoryTransfer");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new InventoryTransferQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class InventoryTransfersArguments extends Arguments {
        InventoryTransfersArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public InventoryTransfersArguments first(Integer value) {
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
        public InventoryTransfersArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public InventoryTransfersArguments last(Integer value) {
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
        public InventoryTransfersArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public InventoryTransfersArguments reverse(Boolean value) {
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
        public InventoryTransfersArguments sortKey(TransferSortKeys value) {
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
        * | default | string | Filter by a case-insensitive search of multiple fields in a document. | | | -
        * `query=Bob Norman`<br/> - `query=title:green hoodie` |
        * | created_at | time |
        * | destination_id | id |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | origin_id | id |
        * | product_id | id |
        * | product_variant_id | id |
        * | source_id | id |
        * | status | string |
        * | tag | string | Filter objects by the `tag` field. | | | - `tag:my_tag` |
        * | tag_not | string | Filter by objects that don’t have the specified tag. | | | - `tag_not:my_tag` |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public InventoryTransfersArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The ID of a [saved
        * search](https://shopify.dev/api/admin-graphql/latest/objects/savedsearch#field-id).
        * The search’s query string is used as the query argument.
        */
        public InventoryTransfersArguments savedSearchId(ID value) {
            if (value != null) {
                startArgument("savedSearchId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface InventoryTransfersArgumentsDefinition {
        void define(InventoryTransfersArguments args);
    }

    /**
    * Returns a paginated list of transfers.
    */
    public QueryRootQuery inventoryTransfers(InventoryTransferConnectionQueryDefinition queryDef) {
        return inventoryTransfers(args -> {}, queryDef);
    }

    /**
    * Returns a paginated list of transfers.
    */
    public QueryRootQuery inventoryTransfers(InventoryTransfersArgumentsDefinition argsDef, InventoryTransferConnectionQueryDefinition queryDef) {
        startField("inventoryTransfers");

        InventoryTransfersArguments args = new InventoryTransfersArguments(_queryBuilder);
        argsDef.define(args);
        InventoryTransfersArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new InventoryTransferConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns a Job resource by ID. Used to check the status of internal jobs and any applicable changes.
    */
    public QueryRootQuery job(ID id, JobQueryDefinition queryDef) {
        startField("job");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new JobQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class LocationArguments extends Arguments {
        LocationArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The ID of the location to return. If no ID is provided, the primary location of the Shop is
        * returned.
        */
        public LocationArguments id(ID value) {
            if (value != null) {
                startArgument("id");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface LocationArgumentsDefinition {
        void define(LocationArguments args);
    }

    /**
    * Returns an inventory Location resource by ID.
    */
    public QueryRootQuery location(LocationQueryDefinition queryDef) {
        return location(args -> {}, queryDef);
    }

    /**
    * Returns an inventory Location resource by ID.
    */
    public QueryRootQuery location(LocationArgumentsDefinition argsDef, LocationQueryDefinition queryDef) {
        startField("location");

        LocationArguments args = new LocationArguments(_queryBuilder);
        argsDef.define(args);
        LocationArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new LocationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Return a location by an identifier.
    */
    public QueryRootQuery locationByIdentifier(LocationIdentifierInput identifier, LocationQueryDefinition queryDef) {
        startField("locationByIdentifier");

        _queryBuilder.append("(identifier:");
        identifier.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new LocationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class LocationsArguments extends Arguments {
        LocationsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public LocationsArguments first(Integer value) {
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
        public LocationsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public LocationsArguments last(Integer value) {
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
        public LocationsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public LocationsArguments reverse(Boolean value) {
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
        public LocationsArguments sortKey(LocationSortKeys value) {
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
        * | default | string | Filter by a case-insensitive search of multiple fields in a document. | | | -
        * `query=Bob Norman`<br/> - `query=title:green hoodie` |
        * | active | string |
        * | address1 | string |
        * | address2 | string |
        * | city | string |
        * | country | string |
        * | created_at | time |
        * | geolocated | boolean |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | legacy | boolean |
        * | location_id | id |
        * | name | string |
        * | pickup_in_store | string | | - `enabled`<br/> - `disabled` |
        * | province | string |
        * | zip | string |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public LocationsArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Whether to include the legacy locations of fulfillment services.
        */
        public LocationsArguments includeLegacy(Boolean value) {
            if (value != null) {
                startArgument("includeLegacy");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * Whether to include the locations that are deactivated.
        */
        public LocationsArguments includeInactive(Boolean value) {
            if (value != null) {
                startArgument("includeInactive");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface LocationsArgumentsDefinition {
        void define(LocationsArguments args);
    }

    /**
    * Returns a list of active inventory locations.
    */
    public QueryRootQuery locations(LocationConnectionQueryDefinition queryDef) {
        return locations(args -> {}, queryDef);
    }

    /**
    * Returns a list of active inventory locations.
    */
    public QueryRootQuery locations(LocationsArgumentsDefinition argsDef, LocationConnectionQueryDefinition queryDef) {
        startField("locations");

        LocationsArguments args = new LocationsArguments(_queryBuilder);
        argsDef.define(args);
        LocationsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new LocationConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class LocationsAvailableForDeliveryProfilesConnectionArguments extends Arguments {
        LocationsAvailableForDeliveryProfilesConnectionArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public LocationsAvailableForDeliveryProfilesConnectionArguments first(Integer value) {
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
        public LocationsAvailableForDeliveryProfilesConnectionArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public LocationsAvailableForDeliveryProfilesConnectionArguments last(Integer value) {
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
        public LocationsAvailableForDeliveryProfilesConnectionArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public LocationsAvailableForDeliveryProfilesConnectionArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface LocationsAvailableForDeliveryProfilesConnectionArgumentsDefinition {
        void define(LocationsAvailableForDeliveryProfilesConnectionArguments args);
    }

    /**
    * Returns a list of all origin locations available for a delivery profile.
    */
    public QueryRootQuery locationsAvailableForDeliveryProfilesConnection(LocationConnectionQueryDefinition queryDef) {
        return locationsAvailableForDeliveryProfilesConnection(args -> {}, queryDef);
    }

    /**
    * Returns a list of all origin locations available for a delivery profile.
    */
    public QueryRootQuery locationsAvailableForDeliveryProfilesConnection(LocationsAvailableForDeliveryProfilesConnectionArgumentsDefinition argsDef, LocationConnectionQueryDefinition queryDef) {
        startField("locationsAvailableForDeliveryProfilesConnection");

        LocationsAvailableForDeliveryProfilesConnectionArguments args = new LocationsAvailableForDeliveryProfilesConnectionArguments(_queryBuilder);
        argsDef.define(args);
        LocationsAvailableForDeliveryProfilesConnectionArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new LocationConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class LocationsCountArguments extends Arguments {
        LocationsCountArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * A filter made up of terms, connectives, modifiers, and comparators.
        * | name | type | description | acceptable_values | default_value | example_use |
        * | ---- | ---- | ---- | ---- | ---- | ---- |
        * | default | string | Filter by a case-insensitive search of multiple fields in a document. | | | -
        * `query=Bob Norman`<br/> - `query=title:green hoodie` |
        * | active | string |
        * | address1 | string |
        * | address2 | string |
        * | city | string |
        * | country | string |
        * | created_at | time |
        * | geolocated | boolean |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | legacy | boolean |
        * | location_id | id |
        * | name | string |
        * | pickup_in_store | string | | - `enabled`<br/> - `disabled` |
        * | province | string |
        * | zip | string |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public LocationsCountArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The upper bound on count value before returning a result. Use `null` to have no limit.
        */
        public LocationsCountArguments limit(Integer value) {
            if (value != null) {
                startArgument("limit");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface LocationsCountArgumentsDefinition {
        void define(LocationsCountArguments args);
    }

    /**
    * Returns the count of locations for the given shop. Limited to a maximum of 10000 by default.
    */
    public QueryRootQuery locationsCount(CountQueryDefinition queryDef) {
        return locationsCount(args -> {}, queryDef);
    }

    /**
    * Returns the count of locations for the given shop. Limited to a maximum of 10000 by default.
    */
    public QueryRootQuery locationsCount(LocationsCountArgumentsDefinition argsDef, CountQueryDefinition queryDef) {
        startField("locationsCount");

        LocationsCountArguments args = new LocationsCountArguments(_queryBuilder);
        argsDef.define(args);
        LocationsCountArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ManualHoldsFulfillmentOrdersArguments extends Arguments {
        ManualHoldsFulfillmentOrdersArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The query conditions used to filter fulfillment orders. Only fulfillment orders corresponding to
        * orders matching the query will be counted.
        * Supported filter parameters:
        * - `order_financial_status`
        * - `order_risk_level`
        * - `shipping_address_coordinates_validated`
        * See the detailed [search syntax](https://shopify.dev/api/usage/search-syntax)
        * for more information about using filters.
        */
        public ManualHoldsFulfillmentOrdersArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ManualHoldsFulfillmentOrdersArguments first(Integer value) {
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
        public ManualHoldsFulfillmentOrdersArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ManualHoldsFulfillmentOrdersArguments last(Integer value) {
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
        public ManualHoldsFulfillmentOrdersArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public ManualHoldsFulfillmentOrdersArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ManualHoldsFulfillmentOrdersArgumentsDefinition {
        void define(ManualHoldsFulfillmentOrdersArguments args);
    }

    /**
    * Returns a list of fulfillment orders that are on hold.
    */
    public QueryRootQuery manualHoldsFulfillmentOrders(FulfillmentOrderConnectionQueryDefinition queryDef) {
        return manualHoldsFulfillmentOrders(args -> {}, queryDef);
    }

    /**
    * Returns a list of fulfillment orders that are on hold.
    */
    public QueryRootQuery manualHoldsFulfillmentOrders(ManualHoldsFulfillmentOrdersArgumentsDefinition argsDef, FulfillmentOrderConnectionQueryDefinition queryDef) {
        startField("manualHoldsFulfillmentOrders");

        ManualHoldsFulfillmentOrdersArguments args = new ManualHoldsFulfillmentOrdersArguments(_queryBuilder);
        argsDef.define(args);
        ManualHoldsFulfillmentOrdersArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new FulfillmentOrderConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns a market resource by ID.
    */
    public QueryRootQuery market(ID id, MarketQueryDefinition queryDef) {
        startField("market");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MarketQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A resource that can have localized values for different markets.
    */
    public QueryRootQuery marketLocalizableResource(ID resourceId, MarketLocalizableResourceQueryDefinition queryDef) {
        startField("marketLocalizableResource");

        _queryBuilder.append("(resourceId:");
        Query.appendQuotedString(_queryBuilder, resourceId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MarketLocalizableResourceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class MarketLocalizableResourcesArguments extends Arguments {
        MarketLocalizableResourcesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public MarketLocalizableResourcesArguments first(Integer value) {
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
        public MarketLocalizableResourcesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public MarketLocalizableResourcesArguments last(Integer value) {
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
        public MarketLocalizableResourcesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public MarketLocalizableResourcesArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface MarketLocalizableResourcesArgumentsDefinition {
        void define(MarketLocalizableResourcesArguments args);
    }

    /**
    * Resources that can have localized values for different markets.
    */
    public QueryRootQuery marketLocalizableResources(MarketLocalizableResourceType resourceType, MarketLocalizableResourceConnectionQueryDefinition queryDef) {
        return marketLocalizableResources(resourceType, args -> {}, queryDef);
    }

    /**
    * Resources that can have localized values for different markets.
    */
    public QueryRootQuery marketLocalizableResources(MarketLocalizableResourceType resourceType, MarketLocalizableResourcesArgumentsDefinition argsDef, MarketLocalizableResourceConnectionQueryDefinition queryDef) {
        startField("marketLocalizableResources");

        _queryBuilder.append("(resourceType:");
        _queryBuilder.append(resourceType.toString());

        argsDef.define(new MarketLocalizableResourcesArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MarketLocalizableResourceConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class MarketLocalizableResourcesByIdsArguments extends Arguments {
        MarketLocalizableResourcesByIdsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public MarketLocalizableResourcesByIdsArguments first(Integer value) {
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
        public MarketLocalizableResourcesByIdsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public MarketLocalizableResourcesByIdsArguments last(Integer value) {
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
        public MarketLocalizableResourcesByIdsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public MarketLocalizableResourcesByIdsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface MarketLocalizableResourcesByIdsArgumentsDefinition {
        void define(MarketLocalizableResourcesByIdsArguments args);
    }

    /**
    * Resources that can have localized values for different markets.
    */
    public QueryRootQuery marketLocalizableResourcesByIds(List<ID> resourceIds, MarketLocalizableResourceConnectionQueryDefinition queryDef) {
        return marketLocalizableResourcesByIds(resourceIds, args -> {}, queryDef);
    }

    /**
    * Resources that can have localized values for different markets.
    */
    public QueryRootQuery marketLocalizableResourcesByIds(List<ID> resourceIds, MarketLocalizableResourcesByIdsArgumentsDefinition argsDef, MarketLocalizableResourceConnectionQueryDefinition queryDef) {
        startField("marketLocalizableResourcesByIds");

        _queryBuilder.append("(resourceIds:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ID item1 : resourceIds) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                Query.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        argsDef.define(new MarketLocalizableResourcesByIdsArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MarketLocalizableResourceConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class MarketingActivitiesArguments extends Arguments {
        MarketingActivitiesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The list of marketing activity IDs to filter by.
        */
        public MarketingActivitiesArguments marketingActivityIds(List<ID> value) {
            if (value != null) {
                startArgument("marketingActivityIds");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }

        /**
        * The list of remote IDs associated with marketing activities to filter by.
        */
        public MarketingActivitiesArguments remoteIds(List<String> value) {
            if (value != null) {
                startArgument("remoteIds");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (String item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }

        /**
        * The UTM parameters associated with marketing activities to filter by.
        */
        public MarketingActivitiesArguments utm(UTMInput value) {
            if (value != null) {
                startArgument("utm");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public MarketingActivitiesArguments first(Integer value) {
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
        public MarketingActivitiesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public MarketingActivitiesArguments last(Integer value) {
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
        public MarketingActivitiesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public MarketingActivitiesArguments reverse(Boolean value) {
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
        public MarketingActivitiesArguments sortKey(MarketingActivitySortKeys value) {
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
        * | default | string | Filter by a case-insensitive search of multiple fields in a document. | | | -
        * `query=Bob Norman`<br/> - `query=title:green hoodie` |
        * | app_id | id |
        * | app_name | string | A comma-separated list of app names. |
        * | created_at | time |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | marketing_campaign_id | id |
        * | scheduled_to_end_at | time |
        * | scheduled_to_start_at | time |
        * | tactic | string |
        * | title | string |
        * | updated_at | time |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public MarketingActivitiesArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The ID of a [saved
        * search](https://shopify.dev/api/admin-graphql/latest/objects/savedsearch#field-id).
        * The search’s query string is used as the query argument.
        */
        public MarketingActivitiesArguments savedSearchId(ID value) {
            if (value != null) {
                startArgument("savedSearchId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface MarketingActivitiesArgumentsDefinition {
        void define(MarketingActivitiesArguments args);
    }

    /**
    * A list of marketing activities associated with the marketing app.
    */
    public QueryRootQuery marketingActivities(MarketingActivityConnectionQueryDefinition queryDef) {
        return marketingActivities(args -> {}, queryDef);
    }

    /**
    * A list of marketing activities associated with the marketing app.
    */
    public QueryRootQuery marketingActivities(MarketingActivitiesArgumentsDefinition argsDef, MarketingActivityConnectionQueryDefinition queryDef) {
        startField("marketingActivities");

        MarketingActivitiesArguments args = new MarketingActivitiesArguments(_queryBuilder);
        argsDef.define(args);
        MarketingActivitiesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new MarketingActivityConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns a MarketingActivity resource by ID.
    */
    public QueryRootQuery marketingActivity(ID id, MarketingActivityQueryDefinition queryDef) {
        startField("marketingActivity");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MarketingActivityQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns a `MarketingEvent` resource by ID.
    */
    public QueryRootQuery marketingEvent(ID id, MarketingEventQueryDefinition queryDef) {
        startField("marketingEvent");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MarketingEventQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class MarketingEventsArguments extends Arguments {
        MarketingEventsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public MarketingEventsArguments first(Integer value) {
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
        public MarketingEventsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public MarketingEventsArguments last(Integer value) {
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
        public MarketingEventsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public MarketingEventsArguments reverse(Boolean value) {
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
        public MarketingEventsArguments sortKey(MarketingEventSortKeys value) {
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
        * | app_id | id |
        * | description | string |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | started_at | time |
        * | type | string |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public MarketingEventsArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface MarketingEventsArgumentsDefinition {
        void define(MarketingEventsArguments args);
    }

    /**
    * A list of marketing events associated with the marketing app.
    */
    public QueryRootQuery marketingEvents(MarketingEventConnectionQueryDefinition queryDef) {
        return marketingEvents(args -> {}, queryDef);
    }

    /**
    * A list of marketing events associated with the marketing app.
    */
    public QueryRootQuery marketingEvents(MarketingEventsArgumentsDefinition argsDef, MarketingEventConnectionQueryDefinition queryDef) {
        startField("marketingEvents");

        MarketingEventsArguments args = new MarketingEventsArguments(_queryBuilder);
        argsDef.define(args);
        MarketingEventsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new MarketingEventConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class MarketsArguments extends Arguments {
        MarketsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Filters markets by type.
        */
        public MarketsArguments type(MarketType value) {
            if (value != null) {
                startArgument("type");
                _queryBuilder.append(value.toString());
            }
            return this;
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public MarketsArguments first(Integer value) {
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
        public MarketsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public MarketsArguments last(Integer value) {
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
        public MarketsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public MarketsArguments reverse(Boolean value) {
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
        public MarketsArguments sortKey(MarketsSortKeys value) {
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
        * | default | string | Filter by a case-insensitive search of multiple fields in a document. | | | -
        * `query=Bob Norman`<br/> - `query=title:green hoodie` |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | market_condition_types | string | A comma-separated list of condition types. |
        * | market_type | string |
        * | name | string |
        * | status | string | | - `ACTIVE`<br/> - `DRAFT` |
        * | wildcard_company_location_with_country_code | string |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public MarketsArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface MarketsArgumentsDefinition {
        void define(MarketsArguments args);
    }

    /**
    * The markets configured for the shop.
    */
    public QueryRootQuery markets(MarketConnectionQueryDefinition queryDef) {
        return markets(args -> {}, queryDef);
    }

    /**
    * The markets configured for the shop.
    */
    public QueryRootQuery markets(MarketsArgumentsDefinition argsDef, MarketConnectionQueryDefinition queryDef) {
        startField("markets");

        MarketsArguments args = new MarketsArguments(_queryBuilder);
        argsDef.define(args);
        MarketsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new MarketConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The resolved values for a buyer signal.
    */
    public QueryRootQuery marketsResolvedValues(BuyerSignalInput buyerSignal, MarketsResolvedValuesQueryDefinition queryDef) {
        startField("marketsResolvedValues");

        _queryBuilder.append("(buyerSignal:");
        buyerSignal.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MarketsResolvedValuesQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns a Menu resource by ID.
    */
    public QueryRootQuery menu(ID id, MenuQueryDefinition queryDef) {
        startField("menu");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MenuQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class MenusArguments extends Arguments {
        MenusArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public MenusArguments first(Integer value) {
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
        public MenusArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public MenusArguments last(Integer value) {
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
        public MenusArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public MenusArguments reverse(Boolean value) {
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
        public MenusArguments sortKey(MenuSortKeys value) {
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
        * | default | string | Filter by a case-insensitive search of multiple fields in a document. | | | -
        * `query=Bob Norman`<br/> - `query=title:green hoodie` |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | title | string |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public MenusArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface MenusArgumentsDefinition {
        void define(MenusArguments args);
    }

    /**
    * The shop's menus.
    */
    public QueryRootQuery menus(MenuConnectionQueryDefinition queryDef) {
        return menus(args -> {}, queryDef);
    }

    /**
    * The shop's menus.
    */
    public QueryRootQuery menus(MenusArgumentsDefinition argsDef, MenuConnectionQueryDefinition queryDef) {
        startField("menus");

        MenusArguments args = new MenusArguments(_queryBuilder);
        argsDef.define(args);
        MenusArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new MenuConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class MetafieldDefinitionArguments extends Arguments {
        MetafieldDefinitionArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The identifier of the MetafieldDefinition to return.
        */
        public MetafieldDefinitionArguments identifier(MetafieldDefinitionIdentifierInput value) {
            if (value != null) {
                startArgument("identifier");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface MetafieldDefinitionArgumentsDefinition {
        void define(MetafieldDefinitionArguments args);
    }

    /**
    * Returns a metafield definition by identifier.
    */
    public QueryRootQuery metafieldDefinition(MetafieldDefinitionQueryDefinition queryDef) {
        return metafieldDefinition(args -> {}, queryDef);
    }

    /**
    * Returns a metafield definition by identifier.
    */
    public QueryRootQuery metafieldDefinition(MetafieldDefinitionArgumentsDefinition argsDef, MetafieldDefinitionQueryDefinition queryDef) {
        startField("metafieldDefinition");

        MetafieldDefinitionArguments args = new MetafieldDefinitionArguments(_queryBuilder);
        argsDef.define(args);
        MetafieldDefinitionArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new MetafieldDefinitionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Each metafield definition has a type, which defines the type of information that it can store.
    * This type is enforced across every instance of the resource that owns the metafield definition.
    * Refer to the [list of supported metafield types](https://shopify.dev/apps/metafields/types).
    */
    public QueryRootQuery metafieldDefinitionTypes(MetafieldDefinitionTypeQueryDefinition queryDef) {
        startField("metafieldDefinitionTypes");

        _queryBuilder.append('{');
        queryDef.define(new MetafieldDefinitionTypeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class MetafieldDefinitionsArguments extends Arguments {
        MetafieldDefinitionsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * Filter metafield definition by key.
        */
        public MetafieldDefinitionsArguments key(String value) {
            if (value != null) {
                startArgument("key");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Filter metafield definition by namespace.
        */
        public MetafieldDefinitionsArguments namespace(String value) {
            if (value != null) {
                startArgument("namespace");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Filter the metafield definition by the pinned status.
        */
        public MetafieldDefinitionsArguments pinnedStatus(MetafieldDefinitionPinnedStatus value) {
            if (value != null) {
                startArgument("pinnedStatus");
                _queryBuilder.append(value.toString());
            }
            return this;
        }

        /**
        * Filter metafield definitions based on whether they apply to a given resource subtype.
        */
        public MetafieldDefinitionsArguments constraintSubtype(MetafieldDefinitionConstraintSubtypeIdentifier value) {
            if (value != null) {
                startArgument("constraintSubtype");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * Filter metafield definitions based on whether they are constrained.
        */
        public MetafieldDefinitionsArguments constraintStatus(MetafieldDefinitionConstraintStatus value) {
            if (value != null) {
                startArgument("constraintStatus");
                _queryBuilder.append(value.toString());
            }
            return this;
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public MetafieldDefinitionsArguments first(Integer value) {
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
        public MetafieldDefinitionsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public MetafieldDefinitionsArguments last(Integer value) {
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
        public MetafieldDefinitionsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public MetafieldDefinitionsArguments reverse(Boolean value) {
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
        public MetafieldDefinitionsArguments sortKey(MetafieldDefinitionSortKeys value) {
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
        * | default | string | Filter by a case-insensitive search of multiple fields in a document. | | | -
        * `query=Bob Norman`<br/> - `query=title:green hoodie` |
        * | created_at | time | Filter by the date and time when the metafield definition was created. | | | -
        * `created_at:>2020-10-21T23:39:20Z`<br/> - `created_at:<now`<br/> - `created_at:<=2024` |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | key | string | Filter by the metafield definition
        * [`key`](https://shopify.dev/docs/api/admin-graphql/latest/objects/MetafieldDefinition#field-key)
        * field. | | | - `key:some-key` |
        * | namespace | string | Filter by the metafield definition
        * [`namespace`](https://shopify.dev/docs/api/admin-graphql/latest/objects/MetafieldDefinition#field-na
        * mespace) field. | | | - `namespace:some-namespace` |
        * | owner_type | string | Filter by the metafield definition
        * [`ownerType`](https://shopify.dev/docs/api/admin-graphql/latest/objects/MetafieldDefinition#field-ow
        * nertype) field. | | | - `owner_type:PRODUCT` |
        * | type | string | Filter by the metafield definition
        * [`type`](https://shopify.dev/docs/api/admin-graphql/latest/objects/MetafieldDefinition#field-type)
        * field. | | | - `type:single_line_text_field` |
        * | updated_at | time | Filter by the date and time when the metafield definition was last updated. |
        * | | - `updated_at:>2020-10-21T23:39:20Z`<br/> - `updated_at:<now`<br/> - `updated_at:<=2024` |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public MetafieldDefinitionsArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface MetafieldDefinitionsArgumentsDefinition {
        void define(MetafieldDefinitionsArguments args);
    }

    /**
    * Returns a list of metafield definitions.
    */
    public QueryRootQuery metafieldDefinitions(MetafieldOwnerType ownerType, MetafieldDefinitionConnectionQueryDefinition queryDef) {
        return metafieldDefinitions(ownerType, args -> {}, queryDef);
    }

    /**
    * Returns a list of metafield definitions.
    */
    public QueryRootQuery metafieldDefinitions(MetafieldOwnerType ownerType, MetafieldDefinitionsArgumentsDefinition argsDef, MetafieldDefinitionConnectionQueryDefinition queryDef) {
        startField("metafieldDefinitions");

        _queryBuilder.append("(ownerType:");
        _queryBuilder.append(ownerType.toString());

        argsDef.define(new MetafieldDefinitionsArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MetafieldDefinitionConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Retrieves a metaobject by ID.
    */
    public QueryRootQuery metaobject(ID id, MetaobjectQueryDefinition queryDef) {
        startField("metaobject");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MetaobjectQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Retrieves a metaobject by handle.
    */
    public QueryRootQuery metaobjectByHandle(MetaobjectHandleInput handle, MetaobjectQueryDefinition queryDef) {
        startField("metaobjectByHandle");

        _queryBuilder.append("(handle:");
        handle.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MetaobjectQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Retrieves a metaobject definition by ID.
    */
    public QueryRootQuery metaobjectDefinition(ID id, MetaobjectDefinitionQueryDefinition queryDef) {
        startField("metaobjectDefinition");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MetaobjectDefinitionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Finds a metaobject definition by type.
    */
    public QueryRootQuery metaobjectDefinitionByType(String type, MetaobjectDefinitionQueryDefinition queryDef) {
        startField("metaobjectDefinitionByType");

        _queryBuilder.append("(type:");
        Query.appendQuotedString(_queryBuilder, type.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MetaobjectDefinitionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class MetaobjectDefinitionsArguments extends Arguments {
        MetaobjectDefinitionsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public MetaobjectDefinitionsArguments first(Integer value) {
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
        public MetaobjectDefinitionsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public MetaobjectDefinitionsArguments last(Integer value) {
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
        public MetaobjectDefinitionsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public MetaobjectDefinitionsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface MetaobjectDefinitionsArgumentsDefinition {
        void define(MetaobjectDefinitionsArguments args);
    }

    /**
    * All metaobject definitions.
    */
    public QueryRootQuery metaobjectDefinitions(MetaobjectDefinitionConnectionQueryDefinition queryDef) {
        return metaobjectDefinitions(args -> {}, queryDef);
    }

    /**
    * All metaobject definitions.
    */
    public QueryRootQuery metaobjectDefinitions(MetaobjectDefinitionsArgumentsDefinition argsDef, MetaobjectDefinitionConnectionQueryDefinition queryDef) {
        startField("metaobjectDefinitions");

        MetaobjectDefinitionsArguments args = new MetaobjectDefinitionsArguments(_queryBuilder);
        argsDef.define(args);
        MetaobjectDefinitionsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new MetaobjectDefinitionConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class MetaobjectsArguments extends Arguments {
        MetaobjectsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The key of a field to sort with. Supports "id", "type", "updated_at", and "display_name".
        */
        public MetaobjectsArguments sortKey(String value) {
            if (value != null) {
                startArgument("sortKey");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public MetaobjectsArguments first(Integer value) {
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
        public MetaobjectsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public MetaobjectsArguments last(Integer value) {
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
        public MetaobjectsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public MetaobjectsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * A filter made up of terms, connectives, modifiers, and comparators.
        * | name | type | description | acceptable_values | default_value | example_use |
        * | ---- | ---- | ---- | ---- | ---- | ---- |
        * | display_name | string |
        * | handle | string |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | updated_at | time |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public MetaobjectsArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface MetaobjectsArgumentsDefinition {
        void define(MetaobjectsArguments args);
    }

    /**
    * All metaobjects for the shop.
    */
    public QueryRootQuery metaobjects(String type, MetaobjectConnectionQueryDefinition queryDef) {
        return metaobjects(type, args -> {}, queryDef);
    }

    /**
    * All metaobjects for the shop.
    */
    public QueryRootQuery metaobjects(String type, MetaobjectsArgumentsDefinition argsDef, MetaobjectConnectionQueryDefinition queryDef) {
        startField("metaobjects");

        _queryBuilder.append("(type:");
        Query.appendQuotedString(_queryBuilder, type.toString());

        argsDef.define(new MetaobjectsArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MetaobjectConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Return a mobile platform application by its ID.
    */
    public QueryRootQuery mobilePlatformApplication(ID id, MobilePlatformApplicationQueryDefinition queryDef) {
        startField("mobilePlatformApplication");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MobilePlatformApplicationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class MobilePlatformApplicationsArguments extends Arguments {
        MobilePlatformApplicationsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public MobilePlatformApplicationsArguments first(Integer value) {
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
        public MobilePlatformApplicationsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public MobilePlatformApplicationsArguments last(Integer value) {
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
        public MobilePlatformApplicationsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public MobilePlatformApplicationsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface MobilePlatformApplicationsArgumentsDefinition {
        void define(MobilePlatformApplicationsArguments args);
    }

    /**
    * List the mobile platform applications.
    */
    public QueryRootQuery mobilePlatformApplications(MobilePlatformApplicationConnectionQueryDefinition queryDef) {
        return mobilePlatformApplications(args -> {}, queryDef);
    }

    /**
    * List the mobile platform applications.
    */
    public QueryRootQuery mobilePlatformApplications(MobilePlatformApplicationsArgumentsDefinition argsDef, MobilePlatformApplicationConnectionQueryDefinition queryDef) {
        startField("mobilePlatformApplications");

        MobilePlatformApplicationsArguments args = new MobilePlatformApplicationsArguments(_queryBuilder);
        argsDef.define(args);
        MobilePlatformApplicationsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new MobilePlatformApplicationConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns a specific node (any object that implements the
    * [Node](https://shopify.dev/api/admin-graphql/latest/interfaces/Node)
    * interface) by ID, in accordance with the
    * [Relay
    * specification](https://relay.dev/docs/guides/graphql-server-specification/#object-identification).
    * This field is commonly used for refetching an object.
    */
    public QueryRootQuery node(ID id, NodeQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new NodeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns the list of nodes (any objects that implement the
    * [Node](https://shopify.dev/api/admin-graphql/latest/interfaces/Node)
    * interface) with the given IDs, in accordance with the
    * [Relay
    * specification](https://relay.dev/docs/guides/graphql-server-specification/#object-identification).
    */
    public QueryRootQuery nodes(List<ID> ids, NodeQueryDefinition queryDef) {
        startField("nodes");

        _queryBuilder.append("(ids:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ID item1 : ids) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                Query.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new NodeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The shop's online store channel.
    */
    public QueryRootQuery onlineStore(OnlineStoreQueryDefinition queryDef) {
        startField("onlineStore");

        _queryBuilder.append('{');
        queryDef.define(new OnlineStoreQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The `order` query retrieves an
    * [order](https://shopify.dev/docs/api/admin-graphql/latest/objects/order) by its ID. This query
    * provides access to comprehensive order information such as customer details, line items, financial
    * data, and fulfillment status.
    * Use the `order` query to retrieve information associated with the following processes:
    * - [Order management and
    * fulfillment](https://shopify.dev/docs/apps/build/orders-fulfillment/order-management-apps)
    * - [Financial reporting](https://help.shopify.com/manual/finance)
    * - [Customer purchase
    * history](https://help.shopify.com/manual/reports-and-analytics/shopify-reports/report-types/default-
    * reports/customers-reports) and [transaction
    * analysis](https://shopify.dev/docs/apps/launch/billing/view-charges-earnings#transaction-data-throug
    * h-the-graphql-admin-api)
    * - [Shipping](https://shopify.dev/docs/apps/build/checkout/delivery-shipping) and [inventory
    * management](https://shopify.dev/docs/apps/build/orders-fulfillment/inventory-management-apps)
    * You can only retrieve the last 60 days worth of orders from a store by default. If you want to
    * access older orders, then you need to [request access to all
    * orders](https://shopify.dev/docs/api/usage/access-scopes#orders-permissions).
    * For large order datasets, consider using [bulk
    * operations](https://shopify.dev/docs/api/usage/bulk-operations/queries).
    * Bulk operations handle pagination automatically and allow you to retrieve data asynchronously
    * without being constrained by API rate limits.
    * Learn more about [creating
    * orders](https://shopify.dev/docs/api/admin-graphql/latest/mutations/ordercreate) and [building order
    * management apps](https://shopify.dev/docs/apps/build/orders-fulfillment).
    */
    public QueryRootQuery order(ID id, OrderQueryDefinition queryDef) {
        startField("order");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new OrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Return an order by an identifier.
    */
    public QueryRootQuery orderByIdentifier(OrderIdentifierInput identifier, OrderQueryDefinition queryDef) {
        startField("orderByIdentifier");

        _queryBuilder.append("(identifier:");
        identifier.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new OrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns a payment status by payment reference ID. Used to check the status of a deferred payment.
    */
    public QueryRootQuery orderPaymentStatus(String paymentReferenceId, ID orderId, OrderPaymentStatusQueryDefinition queryDef) {
        startField("orderPaymentStatus");

        _queryBuilder.append("(paymentReferenceId:");
        Query.appendQuotedString(_queryBuilder, paymentReferenceId.toString());

        _queryBuilder.append(",orderId:");
        Query.appendQuotedString(_queryBuilder, orderId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new OrderPaymentStatusQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class OrderSavedSearchesArguments extends Arguments {
        OrderSavedSearchesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public OrderSavedSearchesArguments first(Integer value) {
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
        public OrderSavedSearchesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public OrderSavedSearchesArguments last(Integer value) {
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
        public OrderSavedSearchesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public OrderSavedSearchesArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface OrderSavedSearchesArgumentsDefinition {
        void define(OrderSavedSearchesArguments args);
    }

    /**
    * List of the shop's order saved searches.
    */
    public QueryRootQuery orderSavedSearches(SavedSearchConnectionQueryDefinition queryDef) {
        return orderSavedSearches(args -> {}, queryDef);
    }

    /**
    * List of the shop's order saved searches.
    */
    public QueryRootQuery orderSavedSearches(OrderSavedSearchesArgumentsDefinition argsDef, SavedSearchConnectionQueryDefinition queryDef) {
        startField("orderSavedSearches");

        OrderSavedSearchesArguments args = new OrderSavedSearchesArguments(_queryBuilder);
        argsDef.define(args);
        OrderSavedSearchesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SavedSearchConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class OrdersArguments extends Arguments {
        OrdersArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public OrdersArguments first(Integer value) {
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
        public OrdersArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public OrdersArguments last(Integer value) {
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
        public OrdersArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public OrdersArguments reverse(Boolean value) {
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
        public OrdersArguments sortKey(OrderSortKeys value) {
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
        * | default | string | Filter by a case-insensitive search of multiple fields in a document. | | | -
        * `query=Bob Norman`<br/> - `query=title:green hoodie` |
        * | cart_token | string | Filter by the cart token's unique value to track abandoned cart conversions
        * or troubleshoot checkout issues. The token references the cart that's associated with an order. | |
        * | - `cart_token:abc123` |
        * | channel | string | Filter by the channel information
        * [`handle`](https://shopify.dev/api/admin-graphql/latest/objects/ChannelInformation#field-channeldefi
        * nition) (`ChannelInformation.channelDefinition.handle`) field. | | | - `channel:web`<br/> -
        * `channel:web,pos` |
        * | channel_id | id | Filter by the channel
        * [`id`](https://shopify.dev/api/admin-graphql/latest/objects/Channel#field-id) field. | | | -
        * `channel_id:123` |
        * | chargeback_status | string | Filter by the order's chargeback status. A chargeback occurs when a
        * customer questions the legitimacy of a charge with their financial institution. | - `accepted`<br/>
        * - `charge_refunded`<br/> - `lost`<br/> - `needs_response`<br/> - `under_review`<br/> - `won` | | -
        * `chargeback_status:accepted` |
        * | checkout_token | string | Filter by the checkout token's unique value to analyze conversion
        * funnels or resolve payment issues. The checkout token's value references the checkout that's
        * associated with an order. | | | - `checkout_token:abc123` |
        * | confirmation_number | string | Filter by the randomly generated alpha-numeric identifier for an
        * order that can be displayed to the customer instead of the sequential order name. This value isn't
        * guaranteed to be unique. | | | - `confirmation_number:ABC123` |
        * | created_at | time | Filter by the date and time when the order was created in Shopify's system. |
        * | | - `created_at:2020-10-21T23:39:20Z`<br/> - `created_at:<now`<br/> - `created_at:<=2024` |
        * | credit_card_last4 | string | Filter by the last four digits of the payment card that was used to
        * pay for the order. This filter matches only the last four digits of the card for heightened
        * security. | | | - `credit_card_last4:1234` |
        * | customer_id | id | Filter orders by the customer
        * [`id`](https://shopify.dev/api/admin-graphql/latest/objects/Customer#field-id) field. | | | -
        * `customer_id:123` |
        * | delivery_method | string | Filter by the delivery
        * [`methodType`](https://shopify.dev/api/admin-graphql/2024-07/objects/DeliveryMethod#field-methodtype
        * ) field. | - `shipping`<br/> - `pick-up`<br/> - `retail`<br/> - `local`<br/> - `pickup-point`<br/> -
        * `none` | | - `delivery_method:shipping` |
        * | discount_code | string | Filter by the case-insensitive discount code that was applied to the
        * order at checkout. Maximum characters: 255. | | | - `discount_code:ABC123` |
        * | email | string | Filter by the email address that's associated with the order to provide customer
        * support or analyze purchasing patterns. | | | - `email:example@shopify.com` |
        * | financial_status | string | Filter by the order
        * [`displayFinancialStatus`](https://shopify.dev/api/admin-graphql/latest/objects/Order#field-displayf
        * inancialstatus) field. | - `paid`<br/> - `pending`<br/> - `authorized`<br/> - `partially_paid`<br/>
        * - `partially_refunded`<br/> - `refunded`<br/> - `voided`<br/> - `expired` | | -
        * `financial_status:authorized` |
        * | fraud_protection_level | string | Filter by the level of fraud protection that's applied to the
        * order. Use this filter to manage risk or handle disputes. | - `fully_protected`<br/> -
        * `partially_protected`<br/> - `not_protected`<br/> - `pending`<br/> - `not_eligible`<br/> -
        * `not_available` | | - `fraud_protection_level:fully_protected` |
        * | fulfillment_location_id | id | Filter by the fulfillment location
        * [`id`](https://shopify.dev/api/admin-graphql/latest/objects/Fulfillment#field-location)
        * (`Fulfillment.location.id`) field. | | | - `fulfillment_location_id:123` |
        * | fulfillment_status | string | Filter by the
        * [`displayFulfillmentStatus`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Order#field-d
        * isplayfulfillmentstatus) field to prioritize shipments or monitor order processing. | -
        * `unshipped`<br/> - `shipped`<br/> - `fulfilled`<br/> - `partial`<br/> - `scheduled`<br/> -
        * `on_hold`<br/> - `unfulfilled`<br/> - `request_declined` | | - `fulfillment_status:fulfilled` |
        * | gateway | string | Filter by the
        * [`paymentGatewayNames`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Order#field-paymen
        * tgatewaynames) field. Use this filter to find orders that were processed through specific payment
        * providers like Shopify Payments, PayPal, or other custom payment gateways. | | | -
        * `gateway:shopify_payments` |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | location_id | id | Filter by the location
        * [`id`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Location#field-id) that's
        * associated with the order to view and manage orders for specific locations. For POS orders,
        * locations must be defined in the Shopify admin under **Settings** > **Locations**. If no ID is
        * provided, then the primary location of the shop is returned. | | | - `location_id:123` |
        * | name | string | Filter by the order
        * [`name`](https://shopify.dev/api/admin-graphql/latest/objects/Order#field-name) field. | | | -
        * `name:1001-A` |
        * | payment_id | string | Filter by the payment ID that's associated with the order to reconcile
        * financial records or troubleshoot payment issues. | | | - `payment_id:abc123` |
        * | payment_provider_id | id | Filter by the ID of the payment provider that's associated with the
        * order to manage payment methods or troubleshoot transactions. | | | - `payment_provider_id:123` |
        * | po_number | string | Filter by the order
        * [`poNumber`](https://shopify.dev/api/admin-graphql/latest/objects/Order#field-ponumber) field. | | |
        * - `po_number:P01001` |
        * | processed_at | time | Filter by the order
        * [`processedAt`](https://shopify.dev/api/admin-graphql/latest/objects/Order#field-processedat) field.
        * | | | - `processed_at:2021-01-01T00:00:00Z` |
        * | reference_location_id | id | Filter by the ID of a location that's associated with the order, such
        * as locations from fulfillments, refunds, or the shop's primary location. | | | -
        * `reference_location_id:123` |
        * | return_status | string | Filter by the return status to monitor returns processing and track which
        * orders have active returns. | - `return_requested`<br/> - `in_progress`<br/> -
        * `inspection_complete`<br/> - `returned`<br/> - `return_failed`<br/> - `no_return` | | -
        * `return_status:in_progress` |
        * | risk_level | string | Filter by the order risk assessment
        * [`riskLevel`](https://shopify.dev/api/admin-graphql/latest/objects/OrderRiskAssessment#field-risklev
        * el) field. | - `high`<br/> - `medium`<br/> - `low`<br/> - `none`<br/> - `pending` | | -
        * `risk_level:high` |
        * | sales_channel | string | Filter by the [sales
        * channel](https://shopify.dev/docs/apps/build/sales-channels) where the order was made to analyze
        * performance or manage fulfillment processes. | | | - `sales_channel: some_sales_channel` |
        * | sku | string | Filter by the product variant
        * [`sku`](https://shopify.dev/api/admin-graphql/latest/objects/ProductVariant#field-sku) field. [Learn
        * more about SKUs](https://help.shopify.com/manual/products/details/sku). | | | - `sku:ABC123` |
        * | source_identifier | string | Filter by the ID of the order placed on the originating platform,
        * such as a unique POS or third-party identifier. This value doesn't correspond to the Shopify ID
        * that's generated from a completed draft order. | | | - `source_identifier:1234-12-1000` |
        * | source_name | string | Filter by the platform where the order was placed to distinguish between
        * web orders, POS sales, draft orders, or third-party channels. Use this filter to analyze sales
        * performance across different ordering methods. | | | - `source_name:web`<br/> -
        * `source_name:shopify_draft_order` |
        * | status | string | Filter by the order's status to manage workflows or analyze the order lifecycle.
        * | - `open`<br/> - `closed`<br/> - `cancelled`<br/> - `not_closed` | | - `status:open` |
        * | subtotal_line_items_quantity | string | Filter by the total number of items across all line items
        * in an order. This filter supports both exact values and ranges, and is useful for identifying bulk
        * orders or analyzing purchase volume patterns. | | | - `subtotal_line_items_quantity:10`<br/> -
        * `subtotal_line_items_quantity:5..20` |
        * | tag | string | Filter objects by the `tag` field. | | | - `tag:my_tag` |
        * | tag_not | string | Filter by objects that don’t have the specified tag. | | | - `tag_not:my_tag` |
        * | test | boolean | Filter by test orders. Test orders are made using the [Shopify Bogus
        * Gateway](https://help.shopify.com/manual/checkout-settings/test-orders) or a payment provider with
        * test mode enabled. | | | - `test:true` |
        * | updated_at | time | Filter by the date and time when the order was last updated in Shopify's
        * system. | | | - `updated_at:2020-10-21T23:39:20Z`<br/> - `updated_at:<now`<br/> -
        * `updated_at:<=2024` |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public OrdersArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The ID of a [saved
        * search](https://shopify.dev/api/admin-graphql/latest/objects/savedsearch#field-id).
        * The search’s query string is used as the query argument.
        */
        public OrdersArguments savedSearchId(ID value) {
            if (value != null) {
                startArgument("savedSearchId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface OrdersArgumentsDefinition {
        void define(OrdersArguments args);
    }

    /**
    * Returns a list of [orders](https://shopify.dev/api/admin-graphql/latest/objects/Order) placed in the
    * store, including data such as order status, customer, and line item details.
    * Use the `orders` query to build reports, analyze sales performance, or automate fulfillment
    * workflows. The `orders` query supports
    * [pagination](https://shopify.dev/docs/api/usage/pagination-graphql),
    * [sorting](https://shopify.dev/docs/api/admin-graphql/latest/queries/orders#argument-sortkey), and
    * [filtering](https://shopify.dev/docs/api/admin-graphql/latest/queries/orders#argument-query).
    */
    public QueryRootQuery orders(OrderConnectionQueryDefinition queryDef) {
        return orders(args -> {}, queryDef);
    }

    /**
    * Returns a list of [orders](https://shopify.dev/api/admin-graphql/latest/objects/Order) placed in the
    * store, including data such as order status, customer, and line item details.
    * Use the `orders` query to build reports, analyze sales performance, or automate fulfillment
    * workflows. The `orders` query supports
    * [pagination](https://shopify.dev/docs/api/usage/pagination-graphql),
    * [sorting](https://shopify.dev/docs/api/admin-graphql/latest/queries/orders#argument-sortkey), and
    * [filtering](https://shopify.dev/docs/api/admin-graphql/latest/queries/orders#argument-query).
    */
    public QueryRootQuery orders(OrdersArgumentsDefinition argsDef, OrderConnectionQueryDefinition queryDef) {
        startField("orders");

        OrdersArguments args = new OrdersArguments(_queryBuilder);
        argsDef.define(args);
        OrdersArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new OrderConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class OrdersCountArguments extends Arguments {
        OrdersCountArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * A filter made up of terms, connectives, modifiers, and comparators.
        * | name | type | description | acceptable_values | default_value | example_use |
        * | ---- | ---- | ---- | ---- | ---- | ---- |
        * | default | string | Filter by a case-insensitive search of multiple fields in a document. | | | -
        * `query=Bob Norman`<br/> - `query=title:green hoodie` |
        * | cart_token | string | Filter by the cart token's unique value to track abandoned cart conversions
        * or troubleshoot checkout issues. The token references the cart that's associated with an order. | |
        * | - `cart_token:abc123` |
        * | channel | string | Filter by the channel information
        * [`handle`](https://shopify.dev/api/admin-graphql/latest/objects/ChannelInformation#field-channeldefi
        * nition) (`ChannelInformation.channelDefinition.handle`) field. | | | - `channel:web`<br/> -
        * `channel:web,pos` |
        * | channel_id | id | Filter by the channel
        * [`id`](https://shopify.dev/api/admin-graphql/latest/objects/Channel#field-id) field. | | | -
        * `channel_id:123` |
        * | chargeback_status | string | Filter by the order's chargeback status. A chargeback occurs when a
        * customer questions the legitimacy of a charge with their financial institution. | - `accepted`<br/>
        * - `charge_refunded`<br/> - `lost`<br/> - `needs_response`<br/> - `under_review`<br/> - `won` | | -
        * `chargeback_status:accepted` |
        * | checkout_token | string | Filter by the checkout token's unique value to analyze conversion
        * funnels or resolve payment issues. The checkout token's value references the checkout that's
        * associated with an order. | | | - `checkout_token:abc123` |
        * | confirmation_number | string | Filter by the randomly generated alpha-numeric identifier for an
        * order that can be displayed to the customer instead of the sequential order name. This value isn't
        * guaranteed to be unique. | | | - `confirmation_number:ABC123` |
        * | created_at | time | Filter by the date and time when the order was created in Shopify's system. |
        * | | - `created_at:2020-10-21T23:39:20Z`<br/> - `created_at:<now`<br/> - `created_at:<=2024` |
        * | credit_card_last4 | string | Filter by the last four digits of the payment card that was used to
        * pay for the order. This filter matches only the last four digits of the card for heightened
        * security. | | | - `credit_card_last4:1234` |
        * | customer_id | id | Filter orders by the customer
        * [`id`](https://shopify.dev/api/admin-graphql/latest/objects/Customer#field-id) field. | | | -
        * `customer_id:123` |
        * | delivery_method | string | Filter by the delivery
        * [`methodType`](https://shopify.dev/api/admin-graphql/2024-07/objects/DeliveryMethod#field-methodtype
        * ) field. | - `shipping`<br/> - `pick-up`<br/> - `retail`<br/> - `local`<br/> - `pickup-point`<br/> -
        * `none` | | - `delivery_method:shipping` |
        * | discount_code | string | Filter by the case-insensitive discount code that was applied to the
        * order at checkout. Maximum characters: 255. | | | - `discount_code:ABC123` |
        * | email | string | Filter by the email address that's associated with the order to provide customer
        * support or analyze purchasing patterns. | | | - `email:example@shopify.com` |
        * | financial_status | string | Filter by the order
        * [`displayFinancialStatus`](https://shopify.dev/api/admin-graphql/latest/objects/Order#field-displayf
        * inancialstatus) field. | - `paid`<br/> - `pending`<br/> - `authorized`<br/> - `partially_paid`<br/>
        * - `partially_refunded`<br/> - `refunded`<br/> - `voided`<br/> - `expired` | | -
        * `financial_status:authorized` |
        * | fraud_protection_level | string | Filter by the level of fraud protection that's applied to the
        * order. Use this filter to manage risk or handle disputes. | - `fully_protected`<br/> -
        * `partially_protected`<br/> - `not_protected`<br/> - `pending`<br/> - `not_eligible`<br/> -
        * `not_available` | | - `fraud_protection_level:fully_protected` |
        * | fulfillment_location_id | id | Filter by the fulfillment location
        * [`id`](https://shopify.dev/api/admin-graphql/latest/objects/Fulfillment#field-location)
        * (`Fulfillment.location.id`) field. | | | - `fulfillment_location_id:123` |
        * | fulfillment_status | string | Filter by the
        * [`displayFulfillmentStatus`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Order#field-d
        * isplayfulfillmentstatus) field to prioritize shipments or monitor order processing. | -
        * `unshipped`<br/> - `shipped`<br/> - `fulfilled`<br/> - `partial`<br/> - `scheduled`<br/> -
        * `on_hold`<br/> - `unfulfilled`<br/> - `request_declined` | | - `fulfillment_status:fulfilled` |
        * | gateway | string | Filter by the
        * [`paymentGatewayNames`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Order#field-paymen
        * tgatewaynames) field. Use this filter to find orders that were processed through specific payment
        * providers like Shopify Payments, PayPal, or other custom payment gateways. | | | -
        * `gateway:shopify_payments` |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | location_id | id | Filter by the location
        * [`id`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Location#field-id) that's
        * associated with the order to view and manage orders for specific locations. For POS orders,
        * locations must be defined in the Shopify admin under **Settings** > **Locations**. If no ID is
        * provided, then the primary location of the shop is returned. | | | - `location_id:123` |
        * | name | string | Filter by the order
        * [`name`](https://shopify.dev/api/admin-graphql/latest/objects/Order#field-name) field. | | | -
        * `name:1001-A` |
        * | payment_id | string | Filter by the payment ID that's associated with the order to reconcile
        * financial records or troubleshoot payment issues. | | | - `payment_id:abc123` |
        * | payment_provider_id | id | Filter by the ID of the payment provider that's associated with the
        * order to manage payment methods or troubleshoot transactions. | | | - `payment_provider_id:123` |
        * | po_number | string | Filter by the order
        * [`poNumber`](https://shopify.dev/api/admin-graphql/latest/objects/Order#field-ponumber) field. | | |
        * - `po_number:P01001` |
        * | processed_at | time | Filter by the order
        * [`processedAt`](https://shopify.dev/api/admin-graphql/latest/objects/Order#field-processedat) field.
        * | | | - `processed_at:2021-01-01T00:00:00Z` |
        * | reference_location_id | id | Filter by the ID of a location that's associated with the order, such
        * as locations from fulfillments, refunds, or the shop's primary location. | | | -
        * `reference_location_id:123` |
        * | return_status | string | Filter by the return status to monitor returns processing and track which
        * orders have active returns. | - `return_requested`<br/> - `in_progress`<br/> -
        * `inspection_complete`<br/> - `returned`<br/> - `return_failed`<br/> - `no_return` | | -
        * `return_status:in_progress` |
        * | risk_level | string | Filter by the order risk assessment
        * [`riskLevel`](https://shopify.dev/api/admin-graphql/latest/objects/OrderRiskAssessment#field-risklev
        * el) field. | - `high`<br/> - `medium`<br/> - `low`<br/> - `none`<br/> - `pending` | | -
        * `risk_level:high` |
        * | sales_channel | string | Filter by the [sales
        * channel](https://shopify.dev/docs/apps/build/sales-channels) where the order was made to analyze
        * performance or manage fulfillment processes. | | | - `sales_channel: some_sales_channel` |
        * | sku | string | Filter by the product variant
        * [`sku`](https://shopify.dev/api/admin-graphql/latest/objects/ProductVariant#field-sku) field. [Learn
        * more about SKUs](https://help.shopify.com/manual/products/details/sku). | | | - `sku:ABC123` |
        * | source_identifier | string | Filter by the ID of the order placed on the originating platform,
        * such as a unique POS or third-party identifier. This value doesn't correspond to the Shopify ID
        * that's generated from a completed draft order. | | | - `source_identifier:1234-12-1000` |
        * | source_name | string | Filter by the platform where the order was placed to distinguish between
        * web orders, POS sales, draft orders, or third-party channels. Use this filter to analyze sales
        * performance across different ordering methods. | | | - `source_name:web`<br/> -
        * `source_name:shopify_draft_order` |
        * | status | string | Filter by the order's status to manage workflows or analyze the order lifecycle.
        * | - `open`<br/> - `closed`<br/> - `cancelled`<br/> - `not_closed` | | - `status:open` |
        * | subtotal_line_items_quantity | string | Filter by the total number of items across all line items
        * in an order. This filter supports both exact values and ranges, and is useful for identifying bulk
        * orders or analyzing purchase volume patterns. | | | - `subtotal_line_items_quantity:10`<br/> -
        * `subtotal_line_items_quantity:5..20` |
        * | tag | string | Filter objects by the `tag` field. | | | - `tag:my_tag` |
        * | tag_not | string | Filter by objects that don’t have the specified tag. | | | - `tag_not:my_tag` |
        * | test | boolean | Filter by test orders. Test orders are made using the [Shopify Bogus
        * Gateway](https://help.shopify.com/manual/checkout-settings/test-orders) or a payment provider with
        * test mode enabled. | | | - `test:true` |
        * | updated_at | time | Filter by the date and time when the order was last updated in Shopify's
        * system. | | | - `updated_at:2020-10-21T23:39:20Z`<br/> - `updated_at:<now`<br/> -
        * `updated_at:<=2024` |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public OrdersCountArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The ID of an existing saved search.
        * The search’s query string is used as the query argument.
        * Refer to the [`SavedSearch`](https://shopify.dev/api/admin-graphql/latest/objects/savedsearch)
        * object.
        */
        public OrdersCountArguments savedSearchId(ID value) {
            if (value != null) {
                startArgument("savedSearchId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The upper bound on count value before returning a result. Use `null` to have no limit.
        */
        public OrdersCountArguments limit(Integer value) {
            if (value != null) {
                startArgument("limit");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface OrdersCountArgumentsDefinition {
        void define(OrdersCountArguments args);
    }

    /**
    * Returns the count of orders for the given shop. Limited to a maximum of 10000 by default.
    */
    public QueryRootQuery ordersCount(CountQueryDefinition queryDef) {
        return ordersCount(args -> {}, queryDef);
    }

    /**
    * Returns the count of orders for the given shop. Limited to a maximum of 10000 by default.
    */
    public QueryRootQuery ordersCount(OrdersCountArgumentsDefinition argsDef, CountQueryDefinition queryDef) {
        startField("ordersCount");

        OrdersCountArguments args = new OrdersCountArguments(_queryBuilder);
        argsDef.define(args);
        OrdersCountArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns a Page resource by ID.
    */
    public QueryRootQuery page(ID id, PageQueryDefinition queryDef) {
        startField("page");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new PageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class PagesArguments extends Arguments {
        PagesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public PagesArguments first(Integer value) {
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
        public PagesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public PagesArguments last(Integer value) {
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
        public PagesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public PagesArguments reverse(Boolean value) {
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
        public PagesArguments sortKey(PageSortKeys value) {
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
        * | default | string | Filter by a case-insensitive search of multiple fields in a document. | | | -
        * `query=Bob Norman`<br/> - `query=title:green hoodie` |
        * | created_at | time | Filter by the date and time when the page was created. | | | -
        * `created_at:>'2020-10-21T23:39:20Z'`<br/> - `created_at:<now`<br/> - `created_at:<=2024` |
        * | handle | string | Filter by the handle of the page. |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | published_at | time | Filter by the date and time when the page was published. | | | -
        * `published_at:>'2020-10-21T23:39:20Z'`<br/> - `published_at:<now`<br/> - `published_at:<=2024` |
        * | published_status | string | Filter by published status |
        * | title | string | Filter by the title of the page. |
        * | updated_at | time | Filter by the date and time when the page was last updated. | | | -
        * `updated_at:>'2020-10-21T23:39:20Z'`<br/> - `updated_at:<now`<br/> - `updated_at:<=2024` |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public PagesArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The ID of a [saved
        * search](https://shopify.dev/api/admin-graphql/latest/objects/savedsearch#field-id).
        * The search’s query string is used as the query argument.
        */
        public PagesArguments savedSearchId(ID value) {
            if (value != null) {
                startArgument("savedSearchId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface PagesArgumentsDefinition {
        void define(PagesArguments args);
    }

    /**
    * List of the shop's pages.
    */
    public QueryRootQuery pages(PageConnectionQueryDefinition queryDef) {
        return pages(args -> {}, queryDef);
    }

    /**
    * List of the shop's pages.
    */
    public QueryRootQuery pages(PagesArgumentsDefinition argsDef, PageConnectionQueryDefinition queryDef) {
        startField("pages");

        PagesArguments args = new PagesArguments(_queryBuilder);
        argsDef.define(args);
        PagesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PageConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class PagesCountArguments extends Arguments {
        PagesCountArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The upper bound on count value before returning a result. Use `null` to have no limit.
        */
        public PagesCountArguments limit(Integer value) {
            if (value != null) {
                startArgument("limit");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface PagesCountArgumentsDefinition {
        void define(PagesCountArguments args);
    }

    /**
    * Count of pages. Limited to a maximum of 10000 by default.
    */
    public QueryRootQuery pagesCount(CountQueryDefinition queryDef) {
        return pagesCount(args -> {}, queryDef);
    }

    /**
    * Count of pages. Limited to a maximum of 10000 by default.
    */
    public QueryRootQuery pagesCount(PagesCountArgumentsDefinition argsDef, CountQueryDefinition queryDef) {
        startField("pagesCount");

        PagesCountArguments args = new PagesCountArguments(_queryBuilder);
        argsDef.define(args);
        PagesCountArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The payment customization.
    */
    public QueryRootQuery paymentCustomization(ID id, PaymentCustomizationQueryDefinition queryDef) {
        startField("paymentCustomization");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new PaymentCustomizationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class PaymentCustomizationsArguments extends Arguments {
        PaymentCustomizationsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public PaymentCustomizationsArguments first(Integer value) {
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
        public PaymentCustomizationsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public PaymentCustomizationsArguments last(Integer value) {
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
        public PaymentCustomizationsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public PaymentCustomizationsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * A filter made up of terms, connectives, modifiers, and comparators.
        * | name | type | description | acceptable_values | default_value | example_use |
        * | ---- | ---- | ---- | ---- | ---- | ---- |
        * | enabled | boolean |
        * | function_id | string |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public PaymentCustomizationsArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface PaymentCustomizationsArgumentsDefinition {
        void define(PaymentCustomizationsArguments args);
    }

    /**
    * The payment customizations.
    */
    public QueryRootQuery paymentCustomizations(PaymentCustomizationConnectionQueryDefinition queryDef) {
        return paymentCustomizations(args -> {}, queryDef);
    }

    /**
    * The payment customizations.
    */
    public QueryRootQuery paymentCustomizations(PaymentCustomizationsArgumentsDefinition argsDef, PaymentCustomizationConnectionQueryDefinition queryDef) {
        startField("paymentCustomizations");

        PaymentCustomizationsArguments args = new PaymentCustomizationsArguments(_queryBuilder);
        argsDef.define(args);
        PaymentCustomizationsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PaymentCustomizationConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class PaymentTermsTemplatesArguments extends Arguments {
        PaymentTermsTemplatesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The payment terms type to filter the payment terms templates list.
        */
        public PaymentTermsTemplatesArguments paymentTermsType(PaymentTermsType value) {
            if (value != null) {
                startArgument("paymentTermsType");
                _queryBuilder.append(value.toString());
            }
            return this;
        }
    }

    public interface PaymentTermsTemplatesArgumentsDefinition {
        void define(PaymentTermsTemplatesArguments args);
    }

    /**
    * The list of payment terms templates eligible for all shops and users.
    */
    public QueryRootQuery paymentTermsTemplates(PaymentTermsTemplateQueryDefinition queryDef) {
        return paymentTermsTemplates(args -> {}, queryDef);
    }

    /**
    * The list of payment terms templates eligible for all shops and users.
    */
    public QueryRootQuery paymentTermsTemplates(PaymentTermsTemplatesArgumentsDefinition argsDef, PaymentTermsTemplateQueryDefinition queryDef) {
        startField("paymentTermsTemplates");

        PaymentTermsTemplatesArguments args = new PaymentTermsTemplatesArguments(_queryBuilder);
        argsDef.define(args);
        PaymentTermsTemplatesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PaymentTermsTemplateQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The number of pendings orders. Limited to a maximum of 10000.
    */
    public QueryRootQuery pendingOrdersCount(CountQueryDefinition queryDef) {
        startField("pendingOrdersCount");

        _queryBuilder.append('{');
        queryDef.define(new CountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Lookup a point of sale device by ID.
    */
    public QueryRootQuery pointOfSaleDevice(ID id, PointOfSaleDeviceQueryDefinition queryDef) {
        startField("pointOfSaleDevice");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new PointOfSaleDeviceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns a price list resource by ID.
    */
    public QueryRootQuery priceList(ID id, PriceListQueryDefinition queryDef) {
        startField("priceList");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new PriceListQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class PriceListsArguments extends Arguments {
        PriceListsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public PriceListsArguments first(Integer value) {
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
        public PriceListsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public PriceListsArguments last(Integer value) {
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
        public PriceListsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public PriceListsArguments reverse(Boolean value) {
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
        public PriceListsArguments sortKey(PriceListSortKeys value) {
            if (value != null) {
                startArgument("sortKey");
                _queryBuilder.append(value.toString());
            }
            return this;
        }
    }

    public interface PriceListsArgumentsDefinition {
        void define(PriceListsArguments args);
    }

    /**
    * All price lists for a shop.
    */
    public QueryRootQuery priceLists(PriceListConnectionQueryDefinition queryDef) {
        return priceLists(args -> {}, queryDef);
    }

    /**
    * All price lists for a shop.
    */
    public QueryRootQuery priceLists(PriceListsArgumentsDefinition argsDef, PriceListConnectionQueryDefinition queryDef) {
        startField("priceLists");

        PriceListsArguments args = new PriceListsArguments(_queryBuilder);
        argsDef.define(args);
        PriceListsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PriceListConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Privacy related settings for a shop.
    */
    public QueryRootQuery privacySettings(PrivacySettingsQueryDefinition queryDef) {
        startField("privacySettings");

        _queryBuilder.append('{');
        queryDef.define(new PrivacySettingsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Retrieves a [product](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product) by its ID.
    * A product is an item that a merchant can sell in their store.
    * Use the `product` query when you need to:
    * - Access essential product data (for example, title, description, price, images, SEO metadata, and
    * metafields).
    * - Build product detail pages and manage inventory.
    * - Handle international sales with localized pricing and content.
    * - Manage product variants and product options.
    * Learn more about working with [Shopify's product
    * model](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model/product-model-component
    * s).
    */
    public QueryRootQuery product(ID id, ProductQueryDefinition queryDef) {
        startField("product");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ProductQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Return a product by an identifier.
    */
    public QueryRootQuery productByIdentifier(ProductIdentifierInput identifier, ProductQueryDefinition queryDef) {
        startField("productByIdentifier");

        _queryBuilder.append("(identifier:");
        identifier.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ProductQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns the product duplicate job.
    */
    public QueryRootQuery productDuplicateJob(ID id, ProductDuplicateJobQueryDefinition queryDef) {
        startField("productDuplicateJob");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ProductDuplicateJobQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns a ProductFeed resource by ID.
    */
    public QueryRootQuery productFeed(ID id, ProductFeedQueryDefinition queryDef) {
        startField("productFeed");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ProductFeedQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ProductFeedsArguments extends Arguments {
        ProductFeedsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ProductFeedsArguments first(Integer value) {
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
        public ProductFeedsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ProductFeedsArguments last(Integer value) {
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
        public ProductFeedsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public ProductFeedsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ProductFeedsArgumentsDefinition {
        void define(ProductFeedsArguments args);
    }

    /**
    * The product feeds for the shop.
    */
    public QueryRootQuery productFeeds(ProductFeedConnectionQueryDefinition queryDef) {
        return productFeeds(args -> {}, queryDef);
    }

    /**
    * The product feeds for the shop.
    */
    public QueryRootQuery productFeeds(ProductFeedsArgumentsDefinition argsDef, ProductFeedConnectionQueryDefinition queryDef) {
        startField("productFeeds");

        ProductFeedsArguments args = new ProductFeedsArguments(_queryBuilder);
        argsDef.define(args);
        ProductFeedsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ProductFeedConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns a ProductOperation resource by ID.
    * This can be used to query the
    * [ProductSetOperation](https://shopify.dev/api/admin-graphql/current/objects/ProductSetOperation),
    * using
    * the ID that was returned
    * [when the product was created or
    * updated](https://shopify.dev/api/admin/migrate/new-product-model/sync-data#create-a-product-with-var
    * iants-and-options-asynchronously)
    * by the
    * [ProductSet](https://shopify.dev/api/admin-graphql/current/mutations/productSet) mutation.
    * The `status` field indicates whether the operation is `CREATED`, `ACTIVE`, or `COMPLETE`.
    * The `product` field provides the details of the created or updated product.
    * For the
    * [ProductSetOperation](https://shopify.dev/api/admin-graphql/current/objects/ProductSetOperation),
    * the
    * `userErrors` field provides mutation errors that occurred during the operation.
    */
    public QueryRootQuery productOperation(ID id, ProductOperationQueryDefinition queryDef) {
        startField("productOperation");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ProductOperationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns the product resource feedback for the currently authenticated app.
    */
    public QueryRootQuery productResourceFeedback(ID id, ProductResourceFeedbackQueryDefinition queryDef) {
        startField("productResourceFeedback");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ProductResourceFeedbackQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ProductSavedSearchesArguments extends Arguments {
        ProductSavedSearchesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ProductSavedSearchesArguments first(Integer value) {
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
        public ProductSavedSearchesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ProductSavedSearchesArguments last(Integer value) {
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
        public ProductSavedSearchesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public ProductSavedSearchesArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ProductSavedSearchesArgumentsDefinition {
        void define(ProductSavedSearchesArguments args);
    }

    /**
    * Returns a list of the shop's product saved searches.
    */
    public QueryRootQuery productSavedSearches(SavedSearchConnectionQueryDefinition queryDef) {
        return productSavedSearches(args -> {}, queryDef);
    }

    /**
    * Returns a list of the shop's product saved searches.
    */
    public QueryRootQuery productSavedSearches(ProductSavedSearchesArgumentsDefinition argsDef, SavedSearchConnectionQueryDefinition queryDef) {
        startField("productSavedSearches");

        ProductSavedSearchesArguments args = new ProductSavedSearchesArguments(_queryBuilder);
        argsDef.define(args);
        ProductSavedSearchesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SavedSearchConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ProductTagsArguments extends Arguments {
        ProductTagsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ProductTagsArguments first(Integer value) {
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
        public ProductTagsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ProductTagsArguments last(Integer value) {
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
        public ProductTagsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public ProductTagsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ProductTagsArgumentsDefinition {
        void define(ProductTagsArguments args);
    }

    /**
    * A list of tags that have been added to products.
    * The maximum page size is 5000.
    */
    public QueryRootQuery productTags(StringConnectionQueryDefinition queryDef) {
        return productTags(args -> {}, queryDef);
    }

    /**
    * A list of tags that have been added to products.
    * The maximum page size is 5000.
    */
    public QueryRootQuery productTags(ProductTagsArgumentsDefinition argsDef, StringConnectionQueryDefinition queryDef) {
        startField("productTags");

        ProductTagsArguments args = new ProductTagsArguments(_queryBuilder);
        argsDef.define(args);
        ProductTagsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new StringConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ProductTypesArguments extends Arguments {
        ProductTypesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ProductTypesArguments first(Integer value) {
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
        public ProductTypesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ProductTypesArguments last(Integer value) {
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
        public ProductTypesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public ProductTypesArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ProductTypesArgumentsDefinition {
        void define(ProductTypesArguments args);
    }

    /**
    * The list of types added to products.
    * The maximum page size is 1000.
    */
    public QueryRootQuery productTypes(StringConnectionQueryDefinition queryDef) {
        return productTypes(args -> {}, queryDef);
    }

    /**
    * The list of types added to products.
    * The maximum page size is 1000.
    */
    public QueryRootQuery productTypes(ProductTypesArgumentsDefinition argsDef, StringConnectionQueryDefinition queryDef) {
        startField("productTypes");

        ProductTypesArguments args = new ProductTypesArguments(_queryBuilder);
        argsDef.define(args);
        ProductTypesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new StringConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Retrieves a [product
    * variant](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant) by its ID.
    * A product variant is a specific version of a
    * [product](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product) that comes in more than
    * one [option](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductOption),
    * such as size or color. For example, if a merchant sells t-shirts with options for size and color,
    * then a small, blue t-shirt would be one product variant and a large, blue t-shirt would be another.
    * Use the `productVariant` query when you need to:
    * - Access essential product variant data (for example, title, price, image, and metafields).
    * - Build product detail pages and manage inventory.
    * - Handle international sales with localized pricing and content.
    * - Manage product variants that are part of a bundle or selling plan.
    * Learn more about working with [Shopify's product
    * model](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model/product-model-component
    * s).
    */
    public QueryRootQuery productVariant(ID id, ProductVariantQueryDefinition queryDef) {
        startField("productVariant");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ProductVariantQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Return a product variant by an identifier.
    */
    public QueryRootQuery productVariantByIdentifier(ProductVariantIdentifierInput identifier, ProductVariantQueryDefinition queryDef) {
        startField("productVariantByIdentifier");

        _queryBuilder.append("(identifier:");
        identifier.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ProductVariantQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ProductVariantsArguments extends Arguments {
        ProductVariantsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ProductVariantsArguments first(Integer value) {
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
        public ProductVariantsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ProductVariantsArguments last(Integer value) {
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
        public ProductVariantsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public ProductVariantsArguments reverse(Boolean value) {
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
        public ProductVariantsArguments sortKey(ProductVariantSortKeys value) {
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
        * | default | string | Filter by a case-insensitive search of multiple fields in a document. | | | -
        * `query=Bob Norman`<br/> - `query=title:green hoodie` |
        * | barcode | string | Filter by the product variant
        * [`barcode`](https://shopify.dev/api/admin-graphql/latest/objects/ProductVariant#field-barcode)
        * field. | | | - `barcode:ABC-abc-123` |
        * | collection | string | Filter by the [ID of the
        * collection](https://shopify.dev/api/admin-graphql/latest/objects/Collection#field-id) that the
        * product variant belongs to. | | | - `collection:465903092033` |
        * | delivery_profile_id | id | Filter by the product variant [delivery profile
        * ID](https://shopify.dev/api/admin-graphql/latest/objects/ProductVariant#field-deliveryprofile)
        * (`ProductVariant.deliveryProfile.id`). | | | - `delivery_profile_id:108179161409` |
        * | exclude_composite | boolean | Filter by product variants that aren't composites. | | | -
        * `exclude_composite:true` |
        * | exclude_variants_with_components | boolean | Filter by whether there are
        * [components](https://shopify.dev/docs/apps/build/product-merchandising/bundles/add-product-fixed-bun
        * dle) that are associated with the product variants in a bundle. | | | -
        * `exclude_variants_with_components:true` |
        * | gift_card | boolean | Filter by the product
        * [`isGiftCard`](https://shopify.dev/api/admin-graphql/latest/objects/Product#field-isgiftcard) field.
        * | | | - `gift_card:true` |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | inventory_quantity | integer | Filter by an aggregate of inventory across all locations where the
        * product variant is stocked. | | | - `inventory_quantity:10` |
        * | location_id | id | Filter by the [location
        * ID](https://shopify.dev/api/admin-graphql/latest/objects/Location#field-id) for the product variant.
        * | | | - `location_id:88511152449` |
        * | managed | boolean | Filter by whether there is fulfillment service tracking associated with the
        * product variants. | | | - `managed:true` |
        * | managed_by | string | Filter by the fulfillment service that tracks the number of items in stock
        * for the product variant. | | | - `managed_by:shopify` |
        * | option1 | string | Filter by a custom property that a shop owner uses to define product variants.
        * | | | - `option1:small` |
        * | option2 | string | Filter by a custom property that a shop owner uses to define product variants.
        * | | | - `option2:medium` |
        * | option3 | string | Filter by a custom property that a shop owner uses to define product variants.
        * | | | - `option3:large` |
        * | product_id | id | Filter by the product
        * [`id`](https://shopify.dev/api/admin-graphql/latest/objects/Product#field-id) field. | | | -
        * `product_id:8474977763649` |
        * | product_ids | string | Filter by a comma-separated list of product
        * [IDs](https://shopify.dev/api/admin-graphql/latest/objects/Product#field-id). | | | -
        * `product_ids:8474977763649,8474977796417` |
        * | product_publication_status | string | Filter by the publication status of the resource on a
        * channel, such as the online store. The value is a composite of the [channel `app`
        * ID](https://shopify.dev/api/admin-graphql/latest/objects/Channel#app-price) (`Channel.app.id`) and
        * one of the valid values. | - `approved`<br/> - `rejected`<br/> - `needs_action`<br/> -
        * `awaiting_review`<br/> - `published`<br/> - `demoted`<br/> - `scheduled`<br/> -
        * `provisionally_published` | | - `product_publication_status:189769876-approved` |
        * | product_status | string | Filter by a comma-separated list of product
        * [statuses](https://shopify.dev/api/admin-graphql/latest/objects/Product#field-status). | | | -
        * `product_status:ACTIVE,DRAFT` |
        * | product_type | string | Filter by the product type that's associated with the product variants. |
        * | | - `product_type:snowboard` |
        * | publishable_status | string | Filter by the publishable status of the resource on a channel, such
        * as the online store. The value is a composite of either the [channel `app`
        * ID](https://shopify.dev/api/admin-graphql/latest/objects/Channel#app-price) (`Channel.app.id`) or
        * [channel `name`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Channel#field-name) and
        * one of the valid values. | - `online_store_channel`<br/> - `published`<br/> - `unpublished`<br/> -
        * `visible`<br/> - `unavailable`<br/> - `hidden`<br/> - `intended`<br/> - `visible` | | -
        * `publishable_status:published`<br/> - `publishable_status:189769876-visible`<br/> -
        * `publishable_status:pos-hidden` |
        * | published_status | string | Filter by the published status of the resource on a channel, such as
        * the online store. | - `unset`<br/> - `pending`<br/> - `approved`<br/> - `not approved` | | -
        * `published_status:approved` |
        * | requires_components | boolean | Filter by whether the product variant can only be purchased with
        * components. [Learn
        * more](https://shopify.dev/apps/build/product-merchandising/bundles#store-eligibility). | | | -
        * `requires_components:true` |
        * | sku | string | Filter by the product variant
        * [`sku`](https://shopify.dev/api/admin-graphql/latest/objects/ProductVariant#field-sku) field. [Learn
        * more about SKUs](https://help.shopify.com/manual/products/details/sku). | | | - `sku:XYZ-12345` |
        * | tag | string | Filter objects by the `tag` field. | | | - `tag:my_tag` |
        * | tag_not | string | Filter by objects that don’t have the specified tag. | | | - `tag_not:my_tag` |
        * | taxable | boolean | Filter by the product variant
        * [`taxable`](https://shopify.dev/api/admin-graphql/latest/objects/ProductVariant#field-taxable)
        * field. | | | - `taxable:false` |
        * | title | string | Filter by the product variant
        * [`title`](https://shopify.dev/api/admin-graphql/latest/objects/ProductVariant#field-title) field. |
        * | | - `title:ice` |
        * | updated_at | time | Filter by date and time when the product variant was updated. | | | -
        * `updated_at:>2020-10-21T23:39:20Z`<br/> - `updated_at:<now`<br/> - `updated_at:<=2024` |
        * | vendor | string | Filter by the origin or source of the product variant. Learn more about [vendors
        * and managing vendor information](https://help.shopify.com/manual/products/managing-vendor-info). | |
        * | - `vendor:Snowdevil`<br/> - `vendor:Snowdevil OR vendor:Icedevil` |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public ProductVariantsArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The ID of a [saved
        * search](https://shopify.dev/api/admin-graphql/latest/objects/savedsearch#field-id).
        * The search’s query string is used as the query argument.
        */
        public ProductVariantsArguments savedSearchId(ID value) {
            if (value != null) {
                startArgument("savedSearchId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface ProductVariantsArgumentsDefinition {
        void define(ProductVariantsArguments args);
    }

    /**
    * Retrieves a list of [product
    * variants](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant)
    * associated with a [product](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product).
    * A product variant is a specific version of a product that comes in more than
    * one [option](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductOption),
    * such as size or color. For example, if a merchant sells t-shirts with options for size and color,
    * then a small, blue t-shirt would be one product variant and a large, blue t-shirt would be another.
    * Use the `productVariants` query when you need to:
    * - Search for product variants by attributes such as SKU, barcode, or inventory quantity.
    * - Filter product variants by attributes, such as whether they're gift cards or have custom
    * metafields.
    * - Fetch product variants for bulk operations, such as updating prices or inventory.
    * - Preload data for product variants, such as inventory items, selected options, or associated
    * products.
    * The `productVariants` query supports
    * [pagination](https://shopify.dev/docs/api/usage/pagination-graphql)
    * to handle large product catalogs and [saved
    * searches](https://shopify.dev/docs/api/admin-graphql/latest/queries/productVariants#arguments-savedS
    * earchId)
    * for frequently used product variant queries.
    * The `productVariants` query returns product variants with their associated metadata, including:
    * - Basic product variant information (for example, title, SKU, barcode, price, and inventory)
    * - Media attachments (for example, images and videos)
    * - Associated products, selling plans, bundles, and metafields
    * Learn more about working with [Shopify's product
    * model](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model/product-model-component
    * s).
    */
    public QueryRootQuery productVariants(ProductVariantConnectionQueryDefinition queryDef) {
        return productVariants(args -> {}, queryDef);
    }

    /**
    * Retrieves a list of [product
    * variants](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant)
    * associated with a [product](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product).
    * A product variant is a specific version of a product that comes in more than
    * one [option](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductOption),
    * such as size or color. For example, if a merchant sells t-shirts with options for size and color,
    * then a small, blue t-shirt would be one product variant and a large, blue t-shirt would be another.
    * Use the `productVariants` query when you need to:
    * - Search for product variants by attributes such as SKU, barcode, or inventory quantity.
    * - Filter product variants by attributes, such as whether they're gift cards or have custom
    * metafields.
    * - Fetch product variants for bulk operations, such as updating prices or inventory.
    * - Preload data for product variants, such as inventory items, selected options, or associated
    * products.
    * The `productVariants` query supports
    * [pagination](https://shopify.dev/docs/api/usage/pagination-graphql)
    * to handle large product catalogs and [saved
    * searches](https://shopify.dev/docs/api/admin-graphql/latest/queries/productVariants#arguments-savedS
    * earchId)
    * for frequently used product variant queries.
    * The `productVariants` query returns product variants with their associated metadata, including:
    * - Basic product variant information (for example, title, SKU, barcode, price, and inventory)
    * - Media attachments (for example, images and videos)
    * - Associated products, selling plans, bundles, and metafields
    * Learn more about working with [Shopify's product
    * model](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model/product-model-component
    * s).
    */
    public QueryRootQuery productVariants(ProductVariantsArgumentsDefinition argsDef, ProductVariantConnectionQueryDefinition queryDef) {
        startField("productVariants");

        ProductVariantsArguments args = new ProductVariantsArguments(_queryBuilder);
        argsDef.define(args);
        ProductVariantsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ProductVariantConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ProductVariantsCountArguments extends Arguments {
        ProductVariantsCountArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * No supported search fields.
        */
        public ProductVariantsCountArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The upper bound on count value before returning a result. Use `null` to have no limit.
        */
        public ProductVariantsCountArguments limit(Integer value) {
            if (value != null) {
                startArgument("limit");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ProductVariantsCountArgumentsDefinition {
        void define(ProductVariantsCountArguments args);
    }

    /**
    * Count of product variants. Limited to a maximum of 10000 by default.
    */
    public QueryRootQuery productVariantsCount(CountQueryDefinition queryDef) {
        return productVariantsCount(args -> {}, queryDef);
    }

    /**
    * Count of product variants. Limited to a maximum of 10000 by default.
    */
    public QueryRootQuery productVariantsCount(ProductVariantsCountArgumentsDefinition argsDef, CountQueryDefinition queryDef) {
        startField("productVariantsCount");

        ProductVariantsCountArguments args = new ProductVariantsCountArguments(_queryBuilder);
        argsDef.define(args);
        ProductVariantsCountArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ProductVendorsArguments extends Arguments {
        ProductVendorsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ProductVendorsArguments first(Integer value) {
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
        public ProductVendorsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ProductVendorsArguments last(Integer value) {
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
        public ProductVendorsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public ProductVendorsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ProductVendorsArgumentsDefinition {
        void define(ProductVendorsArguments args);
    }

    /**
    * The list of vendors added to products.
    * The maximum page size is 1000.
    */
    public QueryRootQuery productVendors(StringConnectionQueryDefinition queryDef) {
        return productVendors(args -> {}, queryDef);
    }

    /**
    * The list of vendors added to products.
    * The maximum page size is 1000.
    */
    public QueryRootQuery productVendors(ProductVendorsArgumentsDefinition argsDef, StringConnectionQueryDefinition queryDef) {
        startField("productVendors");

        ProductVendorsArguments args = new ProductVendorsArguments(_queryBuilder);
        argsDef.define(args);
        ProductVendorsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new StringConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ProductsArguments extends Arguments {
        ProductsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ProductsArguments first(Integer value) {
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
        public ProductsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ProductsArguments last(Integer value) {
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
        public ProductsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public ProductsArguments reverse(Boolean value) {
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
        public ProductsArguments sortKey(ProductSortKeys value) {
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
        * | default | string | Filter by a case-insensitive search of multiple fields in a document. | | | -
        * `query=Bob Norman`<br/> - `query=title:green hoodie` |
        * | barcode | string | Filter by the product variant
        * [`barcode`](https://shopify.dev/api/admin-graphql/latest/objects/ProductVariant#field-barcode)
        * field. | | | - `barcode:ABC-abc-1234` |
        * | bundles | boolean | Filter by a [product
        * bundle](https://shopify.dev/docs/apps/build/product-merchandising/bundles). A product bundle is a
        * set of two or more related products, which are commonly offered at a discount. | | | -
        * `bundles:true` |
        * | category_id | string | Filter by the product [category
        * ID](https://shopify.dev/api/admin-graphql/latest/objects/Product#field-category)
        * (`product.category.id`). A product category is the category of a product from [Shopify's Standard
        * Product
        * Taxonomy](https://shopify.github.io/product-taxonomy/releases/unstable/?categoryId=sg-4-17-2-17). |
        * | | - `category_id:sg-4-17-2-17` |
        * | collection_id | id | Filter by the collection
        * [`id`](https://shopify.dev/api/admin-graphql/latest/objects/Collection#field-id) field. | | | -
        * `collection_id:108179161409` |
        * | combined_listing_role | string | Filter by the role of the product in a [combined
        * listing](https://shopify.dev/apps/build/product-merchandising/combined-listings). | - `parent`<br/>
        * - `child`<br/> - `no_role` | | - `combined_listing_role:parent` |
        * | created_at | time | Filter by the date and time when the product was created. | | | -
        * `created_at:>'2020-10-21T23:39:20Z'`<br/> - `created_at:<now`<br/> - `created_at:<='2024'` |
        * | delivery_profile_id | id | Filter by the delivery profile
        * [`id`](https://shopify.dev/api/admin-graphql/latest/objects/DeliveryProfile#field-id) field. | | | -
        * `delivery_profile_id:108179161409` |
        * | error_feedback | string | Filter by products with publishing errors. |
        * | gift_card | boolean | Filter by the product
        * [`isGiftCard`](https://shopify.dev/api/admin-graphql/latest/objects/Product#field-isgiftcard) field.
        * | | | - `gift_card:true` |
        * | handle | string | Filter by a comma-separated list of product
        * [handles](https://shopify.dev/api/admin-graphql/latest/queries/products#argument-query-filter-handle
        * ). | | | - `handle:the-minimal-snowboard` |
        * | has_only_composites | boolean | Filter by products that have only composite variants. | | | -
        * `has_only_composites:true` |
        * | has_only_default_variant | boolean | Filter by products that have only a default variant. A
        * default variant is the only variant if no other variants are specified. | | | -
        * `has_only_default_variant:true` |
        * | has_variant_with_components | boolean | Filter by products that have variants with associated
        * components. | | | - `has_variant_with_components:true` |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | inventory_total | integer | Filter by inventory count. | | | - `inventory_total:0`<br/> -
        * `inventory_total:>150`<br/> - `inventory_total:>=200` |
        * | is_price_reduced | boolean | Filter by products that have a reduced price. For more information,
        * refer to the [`CollectionRule`](https://shopify.dev/api/admin-graphql/latest/objects/CollectionRule)
        * object. | | | - `is_price_reduced:true` |
        * | out_of_stock_somewhere | boolean | Filter by products that are out of stock in at least one
        * location. | | | - `out_of_stock_somewhere:true` |
        * | price | bigdecimal | Filter by the product variant
        * [`price`](https://shopify.dev/api/admin-graphql/latest/objects/Productvariant#field-price) field. |
        * | | - `price:100.57` |
        * | product_configuration_owner | string | Filter by the app
        * [`id`](https://shopify.dev/api/admin-graphql/latest/objects/App#field-id) field. | | | -
        * `product_configuration_owner:10001` |
        * | product_publication_status | string | Filter by the publication status of the resource on a
        * channel, such as the online store. The value is a composite of the [channel `app`
        * ID](https://shopify.dev/api/admin-graphql/latest/objects/Channel#app-price) (`Channel.app.id`) and
        * one of the valid values. | - `approved`<br/> - `rejected`<br/> - `needs_action`<br/> -
        * `awaiting_review`<br/> - `published`<br/> - `demoted`<br/> - `scheduled`<br/> -
        * `provisionally_published` | | - `product_publication_status:189769876-approved` |
        * | product_type | string | Filter by a comma-separated list of [product
        * types](https://help.shopify.com/manual/products/details/product-type). | | | -
        * `product_type:snowboard` |
        * | publication_ids | string | Filter by a comma-separated list of publication IDs that are associated
        * with the product. | | | - `publication_ids:184111530305,184111694145` |
        * | publishable_status | string | Filter by the publishable status of the resource on a channel, such
        * as the online store. The value is a composite of either the [channel `app`
        * ID](https://shopify.dev/api/admin-graphql/latest/objects/Channel#app-price) (`Channel.app.id`) or
        * [channel `name`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Channel#field-name) and
        * one of the valid values. | - `online_store_channel`<br/> - `published`<br/> - `unpublished`<br/> -
        * `visible`<br/> - `unavailable`<br/> - `hidden`<br/> - `intended`<br/> - `visible` | | -
        * `publishable_status:published`<br/> - `publishable_status:189769876-visible`<br/> -
        * `publishable_status:pos-hidden` |
        * | published_at | time | Filter by the date and time when the product was published to the online
        * store and other sales channels. | | | - `published_at:>2020-10-21T23:39:20Z`<br/> -
        * `published_at:<now`<br/> - `published_at:<=2024` |
        * | published_status | string | Filter by the published status of the resource on a channel, such as
        * the online store. | - `unset`<br/> - `pending`<br/> - `approved`<br/> - `not approved` | | -
        * `published_status:approved` |
        * | sku | string | Filter by the product variant
        * [`sku`](https://shopify.dev/api/admin-graphql/latest/objects/ProductVariant#field-sku) field. [Learn
        * more about SKUs](https://help.shopify.com/manual/products/details/sku). | | | - `sku:XYZ-12345` |
        * | status | string | Filter by a comma-separated list of statuses. You can use statuses to manage
        * inventory. Shopify only displays products with an `ACTIVE` status in online stores, sales channels,
        * and apps. | - `ACTIVE`<br/> - `ARCHIVED`<br/> - `DRAFT` | `ACTIVE` | - `status:ACTIVE,DRAFT` |
        * | tag | string | Filter objects by the `tag` field. | | | - `tag:my_tag` |
        * | tag_not | string | Filter by objects that don’t have the specified tag. | | | - `tag_not:my_tag` |
        * | title | string | Filter by the product
        * [`title`](https://shopify.dev/api/admin-graphql/latest/objects/Product#field-title) field. | | | -
        * `title:The Minimal Snowboard` |
        * | updated_at | time | Filter by the date and time when the product was last updated. | | | -
        * `updated_at:>'2020-10-21T23:39:20Z'`<br/> - `updated_at:<now`<br/> - `updated_at:<='2024'` |
        * | variant_id | id | Filter by the product variant
        * [`id`](https://shopify.dev/api/admin-graphql/latest/objects/ProductVariant#field-id) field. | | | -
        * `variant_id:45779434701121` |
        * | variant_title | string | Filter by the product variant
        * [`title`](https://shopify.dev/api/admin-graphql/latest/objects/ProductVariant#field-title) field. |
        * | | - `variant_title:'Special ski wax'` |
        * | vendor | string | Filter by the origin or source of the product. Learn more about [vendors and
        * managing vendor information](https://help.shopify.com/manual/products/managing-vendor-info). | | | -
        * `vendor:Snowdevil`<br/> - `vendor:Snowdevil OR vendor:Icedevil` |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public ProductsArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The ID of a [saved
        * search](https://shopify.dev/api/admin-graphql/latest/objects/savedsearch#field-id).
        * The search’s query string is used as the query argument.
        */
        public ProductsArguments savedSearchId(ID value) {
            if (value != null) {
                startArgument("savedSearchId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface ProductsArgumentsDefinition {
        void define(ProductsArguments args);
    }

    /**
    * Retrieves a list of [products](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product)
    * in a store. Products are the items that merchants can sell in their store.
    * Use the `products` query when you need to:
    * - Build a browsing interface for a product catalog.
    * - Create product [searching](https://shopify.dev/docs/api/usage/search-syntax),
    * [sorting](https://shopify.dev/docs/api/admin-graphql/latest/queries/products#arguments-sortKey), and
    * [filtering](https://shopify.dev/docs/api/admin-graphql/latest/queries/products#arguments-query)
    * experiences.
    * - Implement product recommendations.
    * - Sync product data with external systems.
    * The `products` query supports [pagination](https://shopify.dev/docs/api/usage/pagination-graphql)
    * to handle large product catalogs and [saved
    * searches](https://shopify.dev/docs/api/admin-graphql/latest/queries/products#arguments-savedSearchId
    * )
    * for frequently used product queries.
    * The `products` query returns products with their associated metadata, including:
    * - Basic product information (for example, title, description, vendor, and type)
    * - Product options and product variants, with their prices and inventory
    * - Media attachments (for example, images and videos)
    * - SEO metadata
    * - Product categories and tags
    * - Product availability and publishing statuses
    * Learn more about working with [Shopify's product
    * model](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model/product-model-component
    * s).
    */
    public QueryRootQuery products(ProductConnectionQueryDefinition queryDef) {
        return products(args -> {}, queryDef);
    }

    /**
    * Retrieves a list of [products](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product)
    * in a store. Products are the items that merchants can sell in their store.
    * Use the `products` query when you need to:
    * - Build a browsing interface for a product catalog.
    * - Create product [searching](https://shopify.dev/docs/api/usage/search-syntax),
    * [sorting](https://shopify.dev/docs/api/admin-graphql/latest/queries/products#arguments-sortKey), and
    * [filtering](https://shopify.dev/docs/api/admin-graphql/latest/queries/products#arguments-query)
    * experiences.
    * - Implement product recommendations.
    * - Sync product data with external systems.
    * The `products` query supports [pagination](https://shopify.dev/docs/api/usage/pagination-graphql)
    * to handle large product catalogs and [saved
    * searches](https://shopify.dev/docs/api/admin-graphql/latest/queries/products#arguments-savedSearchId
    * )
    * for frequently used product queries.
    * The `products` query returns products with their associated metadata, including:
    * - Basic product information (for example, title, description, vendor, and type)
    * - Product options and product variants, with their prices and inventory
    * - Media attachments (for example, images and videos)
    * - SEO metadata
    * - Product categories and tags
    * - Product availability and publishing statuses
    * Learn more about working with [Shopify's product
    * model](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model/product-model-component
    * s).
    */
    public QueryRootQuery products(ProductsArgumentsDefinition argsDef, ProductConnectionQueryDefinition queryDef) {
        startField("products");

        ProductsArguments args = new ProductsArguments(_queryBuilder);
        argsDef.define(args);
        ProductsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ProductConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ProductsCountArguments extends Arguments {
        ProductsCountArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * A filter made up of terms, connectives, modifiers, and comparators.
        * | name | type | description | acceptable_values | default_value | example_use |
        * | ---- | ---- | ---- | ---- | ---- | ---- |
        * | default | string | Filter by a case-insensitive search of multiple fields in a document. | | | -
        * `query=Bob Norman`<br/> - `query=title:green hoodie` |
        * | barcode | string | Filter by the product variant
        * [`barcode`](https://shopify.dev/api/admin-graphql/latest/objects/ProductVariant#field-barcode)
        * field. | | | - `barcode:ABC-abc-1234` |
        * | bundles | boolean | Filter by a [product
        * bundle](https://shopify.dev/docs/apps/build/product-merchandising/bundles). A product bundle is a
        * set of two or more related products, which are commonly offered at a discount. | | | -
        * `bundles:true` |
        * | category_id | string | Filter by the product [category
        * ID](https://shopify.dev/api/admin-graphql/latest/objects/Product#field-category)
        * (`product.category.id`). A product category is the category of a product from [Shopify's Standard
        * Product
        * Taxonomy](https://shopify.github.io/product-taxonomy/releases/unstable/?categoryId=sg-4-17-2-17). |
        * | | - `category_id:sg-4-17-2-17` |
        * | collection_id | id | Filter by the collection
        * [`id`](https://shopify.dev/api/admin-graphql/latest/objects/Collection#field-id) field. | | | -
        * `collection_id:108179161409` |
        * | combined_listing_role | string | Filter by the role of the product in a [combined
        * listing](https://shopify.dev/apps/build/product-merchandising/combined-listings). | - `parent`<br/>
        * - `child`<br/> - `no_role` | | - `combined_listing_role:parent` |
        * | created_at | time | Filter by the date and time when the product was created. | | | -
        * `created_at:>'2020-10-21T23:39:20Z'`<br/> - `created_at:<now`<br/> - `created_at:<='2024'` |
        * | delivery_profile_id | id | Filter by the delivery profile
        * [`id`](https://shopify.dev/api/admin-graphql/latest/objects/DeliveryProfile#field-id) field. | | | -
        * `delivery_profile_id:108179161409` |
        * | error_feedback | string | Filter by products with publishing errors. |
        * | gift_card | boolean | Filter by the product
        * [`isGiftCard`](https://shopify.dev/api/admin-graphql/latest/objects/Product#field-isgiftcard) field.
        * | | | - `gift_card:true` |
        * | handle | string | Filter by a comma-separated list of product
        * [handles](https://shopify.dev/api/admin-graphql/latest/queries/products#argument-query-filter-handle
        * ). | | | - `handle:the-minimal-snowboard` |
        * | has_only_composites | boolean | Filter by products that have only composite variants. | | | -
        * `has_only_composites:true` |
        * | has_only_default_variant | boolean | Filter by products that have only a default variant. A
        * default variant is the only variant if no other variants are specified. | | | -
        * `has_only_default_variant:true` |
        * | has_variant_with_components | boolean | Filter by products that have variants with associated
        * components. | | | - `has_variant_with_components:true` |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | inventory_total | integer | Filter by inventory count. | | | - `inventory_total:0`<br/> -
        * `inventory_total:>150`<br/> - `inventory_total:>=200` |
        * | is_price_reduced | boolean | Filter by products that have a reduced price. For more information,
        * refer to the [`CollectionRule`](https://shopify.dev/api/admin-graphql/latest/objects/CollectionRule)
        * object. | | | - `is_price_reduced:true` |
        * | out_of_stock_somewhere | boolean | Filter by products that are out of stock in at least one
        * location. | | | - `out_of_stock_somewhere:true` |
        * | price | bigdecimal | Filter by the product variant
        * [`price`](https://shopify.dev/api/admin-graphql/latest/objects/Productvariant#field-price) field. |
        * | | - `price:100.57` |
        * | product_configuration_owner | string | Filter by the app
        * [`id`](https://shopify.dev/api/admin-graphql/latest/objects/App#field-id) field. | | | -
        * `product_configuration_owner:10001` |
        * | product_publication_status | string | Filter by the publication status of the resource on a
        * channel, such as the online store. The value is a composite of the [channel `app`
        * ID](https://shopify.dev/api/admin-graphql/latest/objects/Channel#app-price) (`Channel.app.id`) and
        * one of the valid values. | - `approved`<br/> - `rejected`<br/> - `needs_action`<br/> -
        * `awaiting_review`<br/> - `published`<br/> - `demoted`<br/> - `scheduled`<br/> -
        * `provisionally_published` | | - `product_publication_status:189769876-approved` |
        * | product_type | string | Filter by a comma-separated list of [product
        * types](https://help.shopify.com/manual/products/details/product-type). | | | -
        * `product_type:snowboard` |
        * | publication_ids | string | Filter by a comma-separated list of publication IDs that are associated
        * with the product. | | | - `publication_ids:184111530305,184111694145` |
        * | publishable_status | string | Filter by the publishable status of the resource on a channel, such
        * as the online store. The value is a composite of either the [channel `app`
        * ID](https://shopify.dev/api/admin-graphql/latest/objects/Channel#app-price) (`Channel.app.id`) or
        * [channel `name`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Channel#field-name) and
        * one of the valid values. | - `online_store_channel`<br/> - `published`<br/> - `unpublished`<br/> -
        * `visible`<br/> - `unavailable`<br/> - `hidden`<br/> - `intended`<br/> - `visible` | | -
        * `publishable_status:published`<br/> - `publishable_status:189769876-visible`<br/> -
        * `publishable_status:pos-hidden` |
        * | published_at | time | Filter by the date and time when the product was published to the online
        * store and other sales channels. | | | - `published_at:>2020-10-21T23:39:20Z`<br/> -
        * `published_at:<now`<br/> - `published_at:<=2024` |
        * | published_status | string | Filter by the published status of the resource on a channel, such as
        * the online store. | - `unset`<br/> - `pending`<br/> - `approved`<br/> - `not approved` | | -
        * `published_status:approved` |
        * | sku | string | Filter by the product variant
        * [`sku`](https://shopify.dev/api/admin-graphql/latest/objects/ProductVariant#field-sku) field. [Learn
        * more about SKUs](https://help.shopify.com/manual/products/details/sku). | | | - `sku:XYZ-12345` |
        * | status | string | Filter by a comma-separated list of statuses. You can use statuses to manage
        * inventory. Shopify only displays products with an `ACTIVE` status in online stores, sales channels,
        * and apps. | - `ACTIVE`<br/> - `ARCHIVED`<br/> - `DRAFT` | `ACTIVE` | - `status:ACTIVE,DRAFT` |
        * | tag | string | Filter objects by the `tag` field. | | | - `tag:my_tag` |
        * | tag_not | string | Filter by objects that don’t have the specified tag. | | | - `tag_not:my_tag` |
        * | title | string | Filter by the product
        * [`title`](https://shopify.dev/api/admin-graphql/latest/objects/Product#field-title) field. | | | -
        * `title:The Minimal Snowboard` |
        * | updated_at | time | Filter by the date and time when the product was last updated. | | | -
        * `updated_at:>'2020-10-21T23:39:20Z'`<br/> - `updated_at:<now`<br/> - `updated_at:<='2024'` |
        * | variant_id | id | Filter by the product variant
        * [`id`](https://shopify.dev/api/admin-graphql/latest/objects/ProductVariant#field-id) field. | | | -
        * `variant_id:45779434701121` |
        * | variant_title | string | Filter by the product variant
        * [`title`](https://shopify.dev/api/admin-graphql/latest/objects/ProductVariant#field-title) field. |
        * | | - `variant_title:'Special ski wax'` |
        * | vendor | string | Filter by the origin or source of the product. Learn more about [vendors and
        * managing vendor information](https://help.shopify.com/manual/products/managing-vendor-info). | | | -
        * `vendor:Snowdevil`<br/> - `vendor:Snowdevil OR vendor:Icedevil` |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public ProductsCountArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The ID of an existing saved search.
        * The search’s query string is used as the query argument.
        * Refer to the [`SavedSearch`](https://shopify.dev/api/admin-graphql/latest/objects/savedsearch)
        * object.
        */
        public ProductsCountArguments savedSearchId(ID value) {
            if (value != null) {
                startArgument("savedSearchId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The upper bound on count value before returning a result. Use `null` to have no limit.
        */
        public ProductsCountArguments limit(Integer value) {
            if (value != null) {
                startArgument("limit");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ProductsCountArgumentsDefinition {
        void define(ProductsCountArguments args);
    }

    /**
    * Count of products. Limited to a maximum of 10000 by default.
    */
    public QueryRootQuery productsCount(CountQueryDefinition queryDef) {
        return productsCount(args -> {}, queryDef);
    }

    /**
    * Count of products. Limited to a maximum of 10000 by default.
    */
    public QueryRootQuery productsCount(ProductsCountArgumentsDefinition argsDef, CountQueryDefinition queryDef) {
        startField("productsCount");

        ProductsCountArguments args = new ProductsCountArguments(_queryBuilder);
        argsDef.define(args);
        ProductsCountArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The list of publicly-accessible Admin API versions, including supported versions, the release
    * candidate, and unstable versions.
    */
    public QueryRootQuery publicApiVersions(ApiVersionQueryDefinition queryDef) {
        startField("publicApiVersions");

        _queryBuilder.append('{');
        queryDef.define(new ApiVersionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Lookup a publication by ID.
    */
    public QueryRootQuery publication(ID id, PublicationQueryDefinition queryDef) {
        startField("publication");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new PublicationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class PublicationsArguments extends Arguments {
        PublicationsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Filter publications by catalog type.
        */
        public PublicationsArguments catalogType(CatalogType value) {
            if (value != null) {
                startArgument("catalogType");
                _queryBuilder.append(value.toString());
            }
            return this;
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public PublicationsArguments first(Integer value) {
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
        public PublicationsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public PublicationsArguments last(Integer value) {
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
        public PublicationsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public PublicationsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface PublicationsArgumentsDefinition {
        void define(PublicationsArguments args);
    }

    /**
    * List of publications.
    */
    public QueryRootQuery publications(PublicationConnectionQueryDefinition queryDef) {
        return publications(args -> {}, queryDef);
    }

    /**
    * List of publications.
    */
    public QueryRootQuery publications(PublicationsArgumentsDefinition argsDef, PublicationConnectionQueryDefinition queryDef) {
        startField("publications");

        PublicationsArguments args = new PublicationsArguments(_queryBuilder);
        argsDef.define(args);
        PublicationsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PublicationConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class PublicationsCountArguments extends Arguments {
        PublicationsCountArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Filter publications by catalog type.
        */
        public PublicationsCountArguments catalogType(CatalogType value) {
            if (value != null) {
                startArgument("catalogType");
                _queryBuilder.append(value.toString());
            }
            return this;
        }

        /**
        * The upper bound on count value before returning a result. Use `null` to have no limit.
        */
        public PublicationsCountArguments limit(Integer value) {
            if (value != null) {
                startArgument("limit");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface PublicationsCountArgumentsDefinition {
        void define(PublicationsCountArguments args);
    }

    /**
    * Count of publications. Limited to a maximum of 10000 by default.
    */
    public QueryRootQuery publicationsCount(CountQueryDefinition queryDef) {
        return publicationsCount(args -> {}, queryDef);
    }

    /**
    * Count of publications. Limited to a maximum of 10000 by default.
    */
    public QueryRootQuery publicationsCount(PublicationsCountArgumentsDefinition argsDef, CountQueryDefinition queryDef) {
        startField("publicationsCount");

        PublicationsCountArguments args = new PublicationsCountArguments(_queryBuilder);
        argsDef.define(args);
        PublicationsCountArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class PublishedProductsCountArguments extends Arguments {
        PublishedProductsCountArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The maximum number of products to count.
        */
        public PublishedProductsCountArguments limit(Integer value) {
            if (value != null) {
                startArgument("limit");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface PublishedProductsCountArgumentsDefinition {
        void define(PublishedProductsCountArguments args);
    }

    /**
    * Returns a count of published products by publication ID. Limited to a maximum of 10000 by default.
    */
    public QueryRootQuery publishedProductsCount(ID publicationId, CountQueryDefinition queryDef) {
        return publishedProductsCount(publicationId, args -> {}, queryDef);
    }

    /**
    * Returns a count of published products by publication ID. Limited to a maximum of 10000 by default.
    */
    public QueryRootQuery publishedProductsCount(ID publicationId, PublishedProductsCountArgumentsDefinition argsDef, CountQueryDefinition queryDef) {
        startField("publishedProductsCount");

        _queryBuilder.append("(publicationId:");
        Query.appendQuotedString(_queryBuilder, publicationId.toString());

        argsDef.define(new PublishedProductsCountArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Retrieves a [refund](https://shopify.dev/docs/api/admin-graphql/latest/objects/Refund) by its ID.
    * A refund represents a financial record of money returned to a customer from an order.
    * It provides a comprehensive view of all refunded amounts, transactions, and restocking
    * instructions associated with returning products or correcting order issues.
    * Use the `refund` query to retrieve information associated with the following workflows:
    * - Displaying refund details in order management interfaces
    * - Building customer service tools for reviewing refund history
    * - Creating reports on refunded amounts and reasons
    * - Auditing refund transactions and payment gateway records
    * - Tracking inventory impacts from refunded items
    * A refund is associated with an
    * [order](https://shopify.dev/docs/api/admin-graphql/latest/objects/Order)
    * and includes [refund line
    * items](https://shopify.dev/docs/api/admin-graphql/latest/objects/RefundLineItem)
    * that specify which items were refunded. Each refund processes through
    * [order transactions](https://shopify.dev/docs/api/admin-graphql/latest/objects/OrderTransaction)
    * that handle the actual money transfer back to the customer.
    */
    public QueryRootQuery refund(ID id, RefundQueryDefinition queryDef) {
        startField("refund");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new RefundQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Retrieves a return by its ID. A return represents the intent of a buyer to ship one or more items
    * from an
    * order back to a merchant or a third-party fulfillment location.
    * Use the `return` query to retrieve information associated with the following workflows:
    * - [Managing
    * returns](https://shopify.dev/docs/apps/build/orders-fulfillment/returns-apps/build-return-management
    * )
    * - [Processing
    * exchanges](https://shopify.dev/docs/apps/build/orders-fulfillment/returns-apps/manage-exchanges)
    * - [Tracking reverse fulfillment
    * orders](https://shopify.dev/docs/apps/build/orders-fulfillment/returns-apps/manage-reverse-fulfillme
    * nt-orders)
    * A return is associated with an
    * [order](https://shopify.dev/docs/api/admin-graphql/latest/objects/Order)
    * and can include multiple return [line
    * items](https://shopify.dev/docs/api/admin-graphql/latest/objects/LineItem).
    * Each return has a
    * [status](https://shopify.dev/docs/apps/build/orders-fulfillment/returns-apps#return-statuses),
    * which indicates the state of the return.
    */
    public QueryRootQuery returnValue(ID id, ReturnQueryDefinition queryDef) {
        startField("return");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ReturnQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The calculated monetary value to be exchanged due to the return.
    */
    public QueryRootQuery returnCalculate(CalculateReturnInput input, CalculatedReturnQueryDefinition queryDef) {
        startField("returnCalculate");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CalculatedReturnQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Lookup a returnable fulfillment by ID.
    */
    public QueryRootQuery returnableFulfillment(ID id, ReturnableFulfillmentQueryDefinition queryDef) {
        startField("returnableFulfillment");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ReturnableFulfillmentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ReturnableFulfillmentsArguments extends Arguments {
        ReturnableFulfillmentsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ReturnableFulfillmentsArguments first(Integer value) {
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
        public ReturnableFulfillmentsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ReturnableFulfillmentsArguments last(Integer value) {
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
        public ReturnableFulfillmentsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public ReturnableFulfillmentsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ReturnableFulfillmentsArgumentsDefinition {
        void define(ReturnableFulfillmentsArguments args);
    }

    /**
    * List of returnable fulfillments.
    */
    public QueryRootQuery returnableFulfillments(ID orderId, ReturnableFulfillmentConnectionQueryDefinition queryDef) {
        return returnableFulfillments(orderId, args -> {}, queryDef);
    }

    /**
    * List of returnable fulfillments.
    */
    public QueryRootQuery returnableFulfillments(ID orderId, ReturnableFulfillmentsArgumentsDefinition argsDef, ReturnableFulfillmentConnectionQueryDefinition queryDef) {
        startField("returnableFulfillments");

        _queryBuilder.append("(orderId:");
        Query.appendQuotedString(_queryBuilder, orderId.toString());

        argsDef.define(new ReturnableFulfillmentsArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ReturnableFulfillmentConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Lookup a reverse delivery by ID.
    */
    public QueryRootQuery reverseDelivery(ID id, ReverseDeliveryQueryDefinition queryDef) {
        startField("reverseDelivery");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ReverseDeliveryQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Lookup a reverse fulfillment order by ID.
    */
    public QueryRootQuery reverseFulfillmentOrder(ID id, ReverseFulfillmentOrderQueryDefinition queryDef) {
        startField("reverseFulfillmentOrder");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ReverseFulfillmentOrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * <div class="note"><h4>Theme app extensions</h4>
    * <p>If your app integrates with a Shopify theme and you plan to submit it to the Shopify App Store,
    * you must use theme app extensions instead of Script tags. Script tags can only be used with vintage
    * themes. <a href="/apps/online-store#what-integration-method-should-i-use" target="_blank">Learn
    * more</a>.</p></div>
    * <div class="note"><h4>Script tag deprecation</h4>
    * <p>Script tags will be sunset for the <b>Order status</b> page on August 28, 2025. <a
    * href="https://www.shopify.com/plus/upgrading-to-checkout-extensibility">Upgrade to Checkout
    * Extensibility</a> before this date. <a href="/docs/api/liquid/objects#script">Shopify Scripts</a>
    * will continue to work alongside Checkout Extensibility until August 28, 2025.</p></div>
    * Lookup a script tag resource by ID.
    */
    public QueryRootQuery scriptTag(ID id, ScriptTagQueryDefinition queryDef) {
        startField("scriptTag");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ScriptTagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ScriptTagsArguments extends Arguments {
        ScriptTagsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ScriptTagsArguments first(Integer value) {
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
        public ScriptTagsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ScriptTagsArguments last(Integer value) {
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
        public ScriptTagsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public ScriptTagsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * A filter made up of terms, connectives, modifiers, and comparators.
        * | name | type | description | acceptable_values | default_value | example_use |
        * | ---- | ---- | ---- | ---- | ---- | ---- |
        * | created_at | time |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | src | string |
        * | updated_at | time |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public ScriptTagsArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The source URL of the script tag to filter by.
        */
        public ScriptTagsArguments src(String value) {
            if (value != null) {
                startArgument("src");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface ScriptTagsArgumentsDefinition {
        void define(ScriptTagsArguments args);
    }

    /**
    * <div class="note"><h4>Theme app extensions</h4>
    * <p>If your app integrates with a Shopify theme and you plan to submit it to the Shopify App Store,
    * you must use theme app extensions instead of Script tags. Script tags can only be used with vintage
    * themes. <a href="/apps/online-store#what-integration-method-should-i-use" target="_blank">Learn
    * more</a>.</p></div>
    * <div class="note"><h4>Script tag deprecation</h4>
    * <p>Script tags will be sunset for the <b>Order status</b> page on August 28, 2025. <a
    * href="https://www.shopify.com/plus/upgrading-to-checkout-extensibility">Upgrade to Checkout
    * Extensibility</a> before this date. <a href="/docs/api/liquid/objects#script">Shopify Scripts</a>
    * will continue to work alongside Checkout Extensibility until August 28, 2025.</p></div>
    * A list of script tags.
    */
    public QueryRootQuery scriptTags(ScriptTagConnectionQueryDefinition queryDef) {
        return scriptTags(args -> {}, queryDef);
    }

    /**
    * <div class="note"><h4>Theme app extensions</h4>
    * <p>If your app integrates with a Shopify theme and you plan to submit it to the Shopify App Store,
    * you must use theme app extensions instead of Script tags. Script tags can only be used with vintage
    * themes. <a href="/apps/online-store#what-integration-method-should-i-use" target="_blank">Learn
    * more</a>.</p></div>
    * <div class="note"><h4>Script tag deprecation</h4>
    * <p>Script tags will be sunset for the <b>Order status</b> page on August 28, 2025. <a
    * href="https://www.shopify.com/plus/upgrading-to-checkout-extensibility">Upgrade to Checkout
    * Extensibility</a> before this date. <a href="/docs/api/liquid/objects#script">Shopify Scripts</a>
    * will continue to work alongside Checkout Extensibility until August 28, 2025.</p></div>
    * A list of script tags.
    */
    public QueryRootQuery scriptTags(ScriptTagsArgumentsDefinition argsDef, ScriptTagConnectionQueryDefinition queryDef) {
        startField("scriptTags");

        ScriptTagsArguments args = new ScriptTagsArguments(_queryBuilder);
        argsDef.define(args);
        ScriptTagsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ScriptTagConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The Customer Segment.
    */
    public QueryRootQuery segment(ID id, SegmentQueryDefinition queryDef) {
        startField("segment");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SegmentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class SegmentFilterSuggestionsArguments extends Arguments {
        SegmentFilterSuggestionsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The elements that come after the specified
        * [cursor](https://shopify.dev/api/usage/pagination-graphql).
        */
        public SegmentFilterSuggestionsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface SegmentFilterSuggestionsArgumentsDefinition {
        void define(SegmentFilterSuggestionsArguments args);
    }

    /**
    * A list of filter suggestions associated with a segment. A segment is a group of members (commonly
    * customers) that meet specific criteria.
    */
    public QueryRootQuery segmentFilterSuggestions(String search, int first, SegmentFilterConnectionQueryDefinition queryDef) {
        return segmentFilterSuggestions(search, first, args -> {}, queryDef);
    }

    /**
    * A list of filter suggestions associated with a segment. A segment is a group of members (commonly
    * customers) that meet specific criteria.
    */
    public QueryRootQuery segmentFilterSuggestions(String search, int first, SegmentFilterSuggestionsArgumentsDefinition argsDef, SegmentFilterConnectionQueryDefinition queryDef) {
        startField("segmentFilterSuggestions");

        _queryBuilder.append("(search:");
        Query.appendQuotedString(_queryBuilder, search.toString());

        _queryBuilder.append(",first:");
        _queryBuilder.append(first);

        argsDef.define(new SegmentFilterSuggestionsArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SegmentFilterConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class SegmentFiltersArguments extends Arguments {
        SegmentFiltersArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public SegmentFiltersArguments first(Integer value) {
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
        public SegmentFiltersArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public SegmentFiltersArguments last(Integer value) {
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
        public SegmentFiltersArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface SegmentFiltersArgumentsDefinition {
        void define(SegmentFiltersArguments args);
    }

    /**
    * A list of filters.
    */
    public QueryRootQuery segmentFilters(SegmentFilterConnectionQueryDefinition queryDef) {
        return segmentFilters(args -> {}, queryDef);
    }

    /**
    * A list of filters.
    */
    public QueryRootQuery segmentFilters(SegmentFiltersArgumentsDefinition argsDef, SegmentFilterConnectionQueryDefinition queryDef) {
        startField("segmentFilters");

        SegmentFiltersArguments args = new SegmentFiltersArguments(_queryBuilder);
        argsDef.define(args);
        SegmentFiltersArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SegmentFilterConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class SegmentMigrationsArguments extends Arguments {
        SegmentMigrationsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Search a segment migration by its saved search ID.
        */
        public SegmentMigrationsArguments savedSearchId(ID value) {
            if (value != null) {
                startArgument("savedSearchId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public SegmentMigrationsArguments first(Integer value) {
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
        public SegmentMigrationsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public SegmentMigrationsArguments last(Integer value) {
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
        public SegmentMigrationsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface SegmentMigrationsArgumentsDefinition {
        void define(SegmentMigrationsArguments args);
    }

    /**
    * A list of a shop's segment migrations.
    */
    public QueryRootQuery segmentMigrations(SegmentMigrationConnectionQueryDefinition queryDef) {
        return segmentMigrations(args -> {}, queryDef);
    }

    /**
    * A list of a shop's segment migrations.
    */
    public QueryRootQuery segmentMigrations(SegmentMigrationsArgumentsDefinition argsDef, SegmentMigrationConnectionQueryDefinition queryDef) {
        startField("segmentMigrations");

        SegmentMigrationsArguments args = new SegmentMigrationsArguments(_queryBuilder);
        argsDef.define(args);
        SegmentMigrationsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SegmentMigrationConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class SegmentValueSuggestionsArguments extends Arguments {
        SegmentValueSuggestionsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * Returns the elements of a list by filter handle.
        */
        public SegmentValueSuggestionsArguments filterQueryName(String value) {
            if (value != null) {
                startArgument("filterQueryName");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Returns the elements of a list by filter parameter name.
        */
        public SegmentValueSuggestionsArguments functionParameterQueryName(String value) {
            if (value != null) {
                startArgument("functionParameterQueryName");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public SegmentValueSuggestionsArguments first(Integer value) {
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
        public SegmentValueSuggestionsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public SegmentValueSuggestionsArguments last(Integer value) {
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
        public SegmentValueSuggestionsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface SegmentValueSuggestionsArgumentsDefinition {
        void define(SegmentValueSuggestionsArguments args);
    }

    /**
    * The list of suggested values corresponding to a particular filter for a segment. A segment is a
    * group of members, such as customers, that meet specific criteria.
    */
    public QueryRootQuery segmentValueSuggestions(String search, SegmentValueConnectionQueryDefinition queryDef) {
        return segmentValueSuggestions(search, args -> {}, queryDef);
    }

    /**
    * The list of suggested values corresponding to a particular filter for a segment. A segment is a
    * group of members, such as customers, that meet specific criteria.
    */
    public QueryRootQuery segmentValueSuggestions(String search, SegmentValueSuggestionsArgumentsDefinition argsDef, SegmentValueConnectionQueryDefinition queryDef) {
        startField("segmentValueSuggestions");

        _queryBuilder.append("(search:");
        Query.appendQuotedString(_queryBuilder, search.toString());

        argsDef.define(new SegmentValueSuggestionsArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SegmentValueConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class SegmentsArguments extends Arguments {
        SegmentsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public SegmentsArguments first(Integer value) {
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
        public SegmentsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public SegmentsArguments last(Integer value) {
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
        public SegmentsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public SegmentsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * Sort the underlying list by the given key.
        */
        public SegmentsArguments sortKey(SegmentSortKeys value) {
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
        * | default | string | Filter by a case-insensitive search of multiple fields in a document. | | | -
        * `query=Bob Norman`<br/> - `query=title:green hoodie` |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | name | string |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public SegmentsArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface SegmentsArgumentsDefinition {
        void define(SegmentsArguments args);
    }

    /**
    * A list of a shop's segments.
    */
    public QueryRootQuery segments(SegmentConnectionQueryDefinition queryDef) {
        return segments(args -> {}, queryDef);
    }

    /**
    * A list of a shop's segments.
    */
    public QueryRootQuery segments(SegmentsArgumentsDefinition argsDef, SegmentConnectionQueryDefinition queryDef) {
        startField("segments");

        SegmentsArguments args = new SegmentsArguments(_queryBuilder);
        argsDef.define(args);
        SegmentsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SegmentConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class SegmentsCountArguments extends Arguments {
        SegmentsCountArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The upper bound on count value before returning a result. Use `null` to have no limit.
        */
        public SegmentsCountArguments limit(Integer value) {
            if (value != null) {
                startArgument("limit");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface SegmentsCountArgumentsDefinition {
        void define(SegmentsCountArguments args);
    }

    /**
    * The number of segments for a shop. Limited to a maximum of 10000 by default.
    */
    public QueryRootQuery segmentsCount(CountQueryDefinition queryDef) {
        return segmentsCount(args -> {}, queryDef);
    }

    /**
    * The number of segments for a shop. Limited to a maximum of 10000 by default.
    */
    public QueryRootQuery segmentsCount(SegmentsCountArgumentsDefinition argsDef, CountQueryDefinition queryDef) {
        startField("segmentsCount");

        SegmentsCountArguments args = new SegmentsCountArguments(_queryBuilder);
        argsDef.define(args);
        SegmentsCountArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns a Selling Plan Group resource by ID.
    */
    public QueryRootQuery sellingPlanGroup(ID id, SellingPlanGroupQueryDefinition queryDef) {
        startField("sellingPlanGroup");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SellingPlanGroupQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class SellingPlanGroupsArguments extends Arguments {
        SellingPlanGroupsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public SellingPlanGroupsArguments first(Integer value) {
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
        public SellingPlanGroupsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public SellingPlanGroupsArguments last(Integer value) {
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
        public SellingPlanGroupsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public SellingPlanGroupsArguments reverse(Boolean value) {
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
        public SellingPlanGroupsArguments sortKey(SellingPlanGroupSortKeys value) {
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
        * | default | string | Filter by a case-insensitive search of multiple fields in a document. | | | -
        * `query=Bob Norman`<br/> - `query=title:green hoodie` |
        * | app_id | id | | - `CURRENT`<br/> - `ALL`<br/> - `* (numeric app ID)` | `CURRENT` |
        * | category | string | A comma-separated list of categories. | - `SUBSCRIPTION`<br/> -
        * `PRE_ORDER`<br/> - `TRY_BEFORE_YOU_BUY`<br/> - `OTHER` |
        * | created_at | time |
        * | delivery_frequency | string |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | name | string |
        * | percentage_off | float |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public SellingPlanGroupsArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface SellingPlanGroupsArgumentsDefinition {
        void define(SellingPlanGroupsArguments args);
    }

    /**
    * List Selling Plan Groups.
    */
    public QueryRootQuery sellingPlanGroups(SellingPlanGroupConnectionQueryDefinition queryDef) {
        return sellingPlanGroups(args -> {}, queryDef);
    }

    /**
    * List Selling Plan Groups.
    */
    public QueryRootQuery sellingPlanGroups(SellingPlanGroupsArgumentsDefinition argsDef, SellingPlanGroupConnectionQueryDefinition queryDef) {
        startField("sellingPlanGroups");

        SellingPlanGroupsArguments args = new SellingPlanGroupsArguments(_queryBuilder);
        argsDef.define(args);
        SellingPlanGroupsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SellingPlanGroupConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The server pixel configured by the app.
    */
    public QueryRootQuery serverPixel(ServerPixelQueryDefinition queryDef) {
        startField("serverPixel");

        _queryBuilder.append('{');
        queryDef.define(new ServerPixelQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns the Shop resource corresponding to the access token used in the request. The Shop resource
    * contains
    * business and store management settings for the shop.
    */
    public QueryRootQuery shop(ShopQueryDefinition queryDef) {
        startField("shop");

        _queryBuilder.append('{');
        queryDef.define(new ShopQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The shop's billing preferences.
    */
    public QueryRootQuery shopBillingPreferences(ShopBillingPreferencesQueryDefinition queryDef) {
        startField("shopBillingPreferences");

        _queryBuilder.append('{');
        queryDef.define(new ShopBillingPreferencesQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ShopLocalesArguments extends Arguments {
        ShopLocalesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Return only published locales.
        */
        public ShopLocalesArguments published(Boolean value) {
            if (value != null) {
                startArgument("published");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ShopLocalesArgumentsDefinition {
        void define(ShopLocalesArguments args);
    }

    /**
    * A list of locales available on a shop.
    */
    public QueryRootQuery shopLocales(ShopLocaleQueryDefinition queryDef) {
        return shopLocales(args -> {}, queryDef);
    }

    /**
    * A list of locales available on a shop.
    */
    public QueryRootQuery shopLocales(ShopLocalesArgumentsDefinition argsDef, ShopLocaleQueryDefinition queryDef) {
        startField("shopLocales");

        ShopLocalesArguments args = new ShopLocalesArguments(_queryBuilder);
        argsDef.define(args);
        ShopLocalesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ShopLocaleQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns a Shop Pay payment request receipt.
    */
    public QueryRootQuery shopPayPaymentRequestReceipt(String token, ShopPayPaymentRequestReceiptQueryDefinition queryDef) {
        startField("shopPayPaymentRequestReceipt");

        _queryBuilder.append("(token:");
        Query.appendQuotedString(_queryBuilder, token.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ShopPayPaymentRequestReceiptQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ShopPayPaymentRequestReceiptsArguments extends Arguments {
        ShopPayPaymentRequestReceiptsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ShopPayPaymentRequestReceiptsArguments first(Integer value) {
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
        public ShopPayPaymentRequestReceiptsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ShopPayPaymentRequestReceiptsArguments last(Integer value) {
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
        public ShopPayPaymentRequestReceiptsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public ShopPayPaymentRequestReceiptsArguments reverse(Boolean value) {
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
        public ShopPayPaymentRequestReceiptsArguments sortKey(ShopPayPaymentRequestReceiptsSortKeys value) {
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
        * | created_at | time | Filter by the creation date of the payment request receipt. | | | -
        * `created_at:2021-01-01`<br/> - `created_at:2021-01-01..2021-01-02`<br/> - `created_at:<now`<br/> -
        * `created_at:<2024-01-01` |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | source_identifier | string | Filter by the source identifier of the payment request receipt. | | |
        * - `source_identifier:1282823` |
        * | state | string | Filter by the state of the payment request receipt. Options include: - COMPLETED
        * - FAILED - PENDING - PROCESSING | | | - `state:COMPLETED` |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public ShopPayPaymentRequestReceiptsArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface ShopPayPaymentRequestReceiptsArgumentsDefinition {
        void define(ShopPayPaymentRequestReceiptsArguments args);
    }

    /**
    * Returns a list of Shop Pay payment request receipts.
    */
    public QueryRootQuery shopPayPaymentRequestReceipts(ShopPayPaymentRequestReceiptConnectionQueryDefinition queryDef) {
        return shopPayPaymentRequestReceipts(args -> {}, queryDef);
    }

    /**
    * Returns a list of Shop Pay payment request receipts.
    */
    public QueryRootQuery shopPayPaymentRequestReceipts(ShopPayPaymentRequestReceiptsArgumentsDefinition argsDef, ShopPayPaymentRequestReceiptConnectionQueryDefinition queryDef) {
        startField("shopPayPaymentRequestReceipts");

        ShopPayPaymentRequestReceiptsArguments args = new ShopPayPaymentRequestReceiptsArguments(_queryBuilder);
        argsDef.define(args);
        ShopPayPaymentRequestReceiptsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ShopPayPaymentRequestReceiptConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns a Shopify Function by its ID.
    * [Functions](https://shopify.dev/apps/build/functions)
    * enable you to customize Shopify's backend logic at defined parts of the commerce loop.
    */
    public QueryRootQuery shopifyFunction(String id, ShopifyFunctionQueryDefinition queryDef) {
        startField("shopifyFunction");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ShopifyFunctionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ShopifyFunctionsArguments extends Arguments {
        ShopifyFunctionsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Filter the functions by the API type.
        */
        public ShopifyFunctionsArguments apiType(String value) {
            if (value != null) {
                startArgument("apiType");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Filter the functions by whether or not the function uses the creation UI in the Admin.
        */
        public ShopifyFunctionsArguments useCreationUi(Boolean value) {
            if (value != null) {
                startArgument("useCreationUi");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ShopifyFunctionsArguments first(Integer value) {
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
        public ShopifyFunctionsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ShopifyFunctionsArguments last(Integer value) {
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
        public ShopifyFunctionsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public ShopifyFunctionsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ShopifyFunctionsArgumentsDefinition {
        void define(ShopifyFunctionsArguments args);
    }

    /**
    * Returns the Shopify Functions owned by the querying API client installed on the shop.
    */
    public QueryRootQuery shopifyFunctions(ShopifyFunctionConnectionQueryDefinition queryDef) {
        return shopifyFunctions(args -> {}, queryDef);
    }

    /**
    * Returns the Shopify Functions owned by the querying API client installed on the shop.
    */
    public QueryRootQuery shopifyFunctions(ShopifyFunctionsArgumentsDefinition argsDef, ShopifyFunctionConnectionQueryDefinition queryDef) {
        startField("shopifyFunctions");

        ShopifyFunctionsArguments args = new ShopifyFunctionsArguments(_queryBuilder);
        argsDef.define(args);
        ShopifyFunctionsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ShopifyFunctionConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Shopify Payments account information, including balances and payouts.
    */
    public QueryRootQuery shopifyPaymentsAccount(ShopifyPaymentsAccountQueryDefinition queryDef) {
        startField("shopifyPaymentsAccount");

        _queryBuilder.append('{');
        queryDef.define(new ShopifyPaymentsAccountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class StaffMemberArguments extends Arguments {
        StaffMemberArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The ID of the staff member to return. If no ID is provided, then the staff member making the query
        * (if any) is returned.
        */
        public StaffMemberArguments id(ID value) {
            if (value != null) {
                startArgument("id");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface StaffMemberArgumentsDefinition {
        void define(StaffMemberArguments args);
    }

    /**
    * The StaffMember resource, by ID.
    */
    public QueryRootQuery staffMember(StaffMemberQueryDefinition queryDef) {
        return staffMember(args -> {}, queryDef);
    }

    /**
    * The StaffMember resource, by ID.
    */
    public QueryRootQuery staffMember(StaffMemberArgumentsDefinition argsDef, StaffMemberQueryDefinition queryDef) {
        startField("staffMember");

        StaffMemberArguments args = new StaffMemberArguments(_queryBuilder);
        argsDef.define(args);
        StaffMemberArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new StaffMemberQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class StaffMembersArguments extends Arguments {
        StaffMembersArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public StaffMembersArguments first(Integer value) {
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
        public StaffMembersArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public StaffMembersArguments last(Integer value) {
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
        public StaffMembersArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public StaffMembersArguments reverse(Boolean value) {
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
        public StaffMembersArguments sortKey(StaffMembersSortKeys value) {
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
        * | account_type | string | Filter by account type. | - `collaborator`<br/> -
        * `collaborator_team_member`<br/> - `invited`<br/> - `regular`<br/> - `requested`<br/> -
        * `restricted`<br/> - `saml` |
        * | email | string | Filter by email. |
        * | first_name | string | Filter by first name. |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | last_name | string | Filter by last name. |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public StaffMembersArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface StaffMembersArgumentsDefinition {
        void define(StaffMembersArguments args);
    }

    /**
    * The shop staff members.
    */
    public QueryRootQuery staffMembers(StaffMemberConnectionQueryDefinition queryDef) {
        return staffMembers(args -> {}, queryDef);
    }

    /**
    * The shop staff members.
    */
    public QueryRootQuery staffMembers(StaffMembersArgumentsDefinition argsDef, StaffMemberConnectionQueryDefinition queryDef) {
        startField("staffMembers");

        StaffMembersArguments args = new StaffMembersArguments(_queryBuilder);
        argsDef.define(args);
        StaffMembersArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new StaffMemberConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class StandardMetafieldDefinitionTemplatesArguments extends Arguments {
        StandardMetafieldDefinitionTemplatesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Filter standard metafield definitions based on whether they apply to a given resource subtype.
        */
        public StandardMetafieldDefinitionTemplatesArguments constraintSubtype(MetafieldDefinitionConstraintSubtypeIdentifier value) {
            if (value != null) {
                startArgument("constraintSubtype");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * Filter standard metafield definitions based on whether they are constrained.
        */
        public StandardMetafieldDefinitionTemplatesArguments constraintStatus(MetafieldDefinitionConstraintStatus value) {
            if (value != null) {
                startArgument("constraintStatus");
                _queryBuilder.append(value.toString());
            }
            return this;
        }

        /**
        * Filter standard metafield definitions that have already been activated.
        */
        public StandardMetafieldDefinitionTemplatesArguments excludeActivated(Boolean value) {
            if (value != null) {
                startArgument("excludeActivated");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public StandardMetafieldDefinitionTemplatesArguments first(Integer value) {
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
        public StandardMetafieldDefinitionTemplatesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public StandardMetafieldDefinitionTemplatesArguments last(Integer value) {
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
        public StandardMetafieldDefinitionTemplatesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public StandardMetafieldDefinitionTemplatesArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface StandardMetafieldDefinitionTemplatesArgumentsDefinition {
        void define(StandardMetafieldDefinitionTemplatesArguments args);
    }

    /**
    * Standard metafield definitions are intended for specific, common use cases. Their namespace and keys
    * reflect these use cases and are reserved.
    * Refer to all available [`Standard Metafield Definition
    * Templates`](https://shopify.dev/api/admin-graphql/latest/objects/StandardMetafieldDefinitionTemplate
    * ).
    */
    public QueryRootQuery standardMetafieldDefinitionTemplates(StandardMetafieldDefinitionTemplateConnectionQueryDefinition queryDef) {
        return standardMetafieldDefinitionTemplates(args -> {}, queryDef);
    }

    /**
    * Standard metafield definitions are intended for specific, common use cases. Their namespace and keys
    * reflect these use cases and are reserved.
    * Refer to all available [`Standard Metafield Definition
    * Templates`](https://shopify.dev/api/admin-graphql/latest/objects/StandardMetafieldDefinitionTemplate
    * ).
    */
    public QueryRootQuery standardMetafieldDefinitionTemplates(StandardMetafieldDefinitionTemplatesArgumentsDefinition argsDef, StandardMetafieldDefinitionTemplateConnectionQueryDefinition queryDef) {
        startField("standardMetafieldDefinitionTemplates");

        StandardMetafieldDefinitionTemplatesArguments args = new StandardMetafieldDefinitionTemplatesArguments(_queryBuilder);
        argsDef.define(args);
        StandardMetafieldDefinitionTemplatesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new StandardMetafieldDefinitionTemplateConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns a store credit account resource by ID.
    */
    public QueryRootQuery storeCreditAccount(ID id, StoreCreditAccountQueryDefinition queryDef) {
        startField("storeCreditAccount");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new StoreCreditAccountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns a SubscriptionBillingAttempt by ID.
    */
    public QueryRootQuery subscriptionBillingAttempt(ID id, SubscriptionBillingAttemptQueryDefinition queryDef) {
        startField("subscriptionBillingAttempt");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionBillingAttemptQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class SubscriptionBillingAttemptsArguments extends Arguments {
        SubscriptionBillingAttemptsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public SubscriptionBillingAttemptsArguments first(Integer value) {
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
        public SubscriptionBillingAttemptsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public SubscriptionBillingAttemptsArguments last(Integer value) {
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
        public SubscriptionBillingAttemptsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public SubscriptionBillingAttemptsArguments reverse(Boolean value) {
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
        public SubscriptionBillingAttemptsArguments sortKey(SubscriptionBillingAttemptsSortKeys value) {
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
        * | created_at | time |
        * | error_code | string |
        * | error_message | string |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public SubscriptionBillingAttemptsArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface SubscriptionBillingAttemptsArgumentsDefinition {
        void define(SubscriptionBillingAttemptsArguments args);
    }

    /**
    * Returns subscription billing attempts on a store.
    */
    public QueryRootQuery subscriptionBillingAttempts(SubscriptionBillingAttemptConnectionQueryDefinition queryDef) {
        return subscriptionBillingAttempts(args -> {}, queryDef);
    }

    /**
    * Returns subscription billing attempts on a store.
    */
    public QueryRootQuery subscriptionBillingAttempts(SubscriptionBillingAttemptsArgumentsDefinition argsDef, SubscriptionBillingAttemptConnectionQueryDefinition queryDef) {
        startField("subscriptionBillingAttempts");

        SubscriptionBillingAttemptsArguments args = new SubscriptionBillingAttemptsArguments(_queryBuilder);
        argsDef.define(args);
        SubscriptionBillingAttemptsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionBillingAttemptConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns a subscription billing cycle found either by cycle index or date.
    */
    public QueryRootQuery subscriptionBillingCycle(SubscriptionBillingCycleInput billingCycleInput, SubscriptionBillingCycleQueryDefinition queryDef) {
        startField("subscriptionBillingCycle");

        _queryBuilder.append("(billingCycleInput:");
        billingCycleInput.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionBillingCycleQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class SubscriptionBillingCycleBulkResultsArguments extends Arguments {
        SubscriptionBillingCycleBulkResultsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public SubscriptionBillingCycleBulkResultsArguments first(Integer value) {
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
        public SubscriptionBillingCycleBulkResultsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public SubscriptionBillingCycleBulkResultsArguments last(Integer value) {
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
        public SubscriptionBillingCycleBulkResultsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public SubscriptionBillingCycleBulkResultsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface SubscriptionBillingCycleBulkResultsArgumentsDefinition {
        void define(SubscriptionBillingCycleBulkResultsArguments args);
    }

    /**
    * Retrieves the results of the asynchronous job for the subscription billing cycle bulk action based
    * on the specified job ID.
    * This query can be used to obtain the billing cycles that match the criteria defined in the
    * subscriptionBillingCycleBulkSearch and subscriptionBillingCycleBulkCharge mutations.
    */
    public QueryRootQuery subscriptionBillingCycleBulkResults(ID jobId, SubscriptionBillingCycleConnectionQueryDefinition queryDef) {
        return subscriptionBillingCycleBulkResults(jobId, args -> {}, queryDef);
    }

    /**
    * Retrieves the results of the asynchronous job for the subscription billing cycle bulk action based
    * on the specified job ID.
    * This query can be used to obtain the billing cycles that match the criteria defined in the
    * subscriptionBillingCycleBulkSearch and subscriptionBillingCycleBulkCharge mutations.
    */
    public QueryRootQuery subscriptionBillingCycleBulkResults(ID jobId, SubscriptionBillingCycleBulkResultsArgumentsDefinition argsDef, SubscriptionBillingCycleConnectionQueryDefinition queryDef) {
        startField("subscriptionBillingCycleBulkResults");

        _queryBuilder.append("(jobId:");
        Query.appendQuotedString(_queryBuilder, jobId.toString());

        argsDef.define(new SubscriptionBillingCycleBulkResultsArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionBillingCycleConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class SubscriptionBillingCyclesArguments extends Arguments {
        SubscriptionBillingCyclesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * Select subscription billing cycles within a date range.
        */
        public SubscriptionBillingCyclesArguments billingCyclesDateRangeSelector(SubscriptionBillingCyclesDateRangeSelector value) {
            if (value != null) {
                startArgument("billingCyclesDateRangeSelector");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * Select subscription billing cycles within an index range.
        */
        public SubscriptionBillingCyclesArguments billingCyclesIndexRangeSelector(SubscriptionBillingCyclesIndexRangeSelector value) {
            if (value != null) {
                startArgument("billingCyclesIndexRangeSelector");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public SubscriptionBillingCyclesArguments first(Integer value) {
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
        public SubscriptionBillingCyclesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public SubscriptionBillingCyclesArguments last(Integer value) {
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
        public SubscriptionBillingCyclesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public SubscriptionBillingCyclesArguments reverse(Boolean value) {
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
        public SubscriptionBillingCyclesArguments sortKey(SubscriptionBillingCyclesSortKeys value) {
            if (value != null) {
                startArgument("sortKey");
                _queryBuilder.append(value.toString());
            }
            return this;
        }
    }

    public interface SubscriptionBillingCyclesArgumentsDefinition {
        void define(SubscriptionBillingCyclesArguments args);
    }

    /**
    * Returns subscription billing cycles for a contract ID.
    */
    public QueryRootQuery subscriptionBillingCycles(ID contractId, SubscriptionBillingCycleConnectionQueryDefinition queryDef) {
        return subscriptionBillingCycles(contractId, args -> {}, queryDef);
    }

    /**
    * Returns subscription billing cycles for a contract ID.
    */
    public QueryRootQuery subscriptionBillingCycles(ID contractId, SubscriptionBillingCyclesArgumentsDefinition argsDef, SubscriptionBillingCycleConnectionQueryDefinition queryDef) {
        startField("subscriptionBillingCycles");

        _queryBuilder.append("(contractId:");
        Query.appendQuotedString(_queryBuilder, contractId.toString());

        argsDef.define(new SubscriptionBillingCyclesArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionBillingCycleConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns a Subscription Contract resource by ID.
    */
    public QueryRootQuery subscriptionContract(ID id, SubscriptionContractQueryDefinition queryDef) {
        startField("subscriptionContract");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionContractQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class SubscriptionContractsArguments extends Arguments {
        SubscriptionContractsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public SubscriptionContractsArguments first(Integer value) {
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
        public SubscriptionContractsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public SubscriptionContractsArguments last(Integer value) {
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
        public SubscriptionContractsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public SubscriptionContractsArguments reverse(Boolean value) {
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
        public SubscriptionContractsArguments sortKey(SubscriptionContractsSortKeys value) {
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
        * | created_at | time |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | last_billing_attempt_error_type | string |
        * | status | string |
        * | updated_at | time |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public SubscriptionContractsArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface SubscriptionContractsArgumentsDefinition {
        void define(SubscriptionContractsArguments args);
    }

    /**
    * List Subscription Contracts.
    */
    public QueryRootQuery subscriptionContracts(SubscriptionContractConnectionQueryDefinition queryDef) {
        return subscriptionContracts(args -> {}, queryDef);
    }

    /**
    * List Subscription Contracts.
    */
    public QueryRootQuery subscriptionContracts(SubscriptionContractsArgumentsDefinition argsDef, SubscriptionContractConnectionQueryDefinition queryDef) {
        startField("subscriptionContracts");

        SubscriptionContractsArguments args = new SubscriptionContractsArguments(_queryBuilder);
        argsDef.define(args);
        SubscriptionContractsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionContractConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns a Subscription Draft resource by ID.
    */
    public QueryRootQuery subscriptionDraft(ID id, SubscriptionDraftQueryDefinition queryDef) {
        startField("subscriptionDraft");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new SubscriptionDraftQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The Taxonomy resource lets you access the categories, attributes and values of the loaded taxonomy
    * tree.
    */
    public QueryRootQuery taxonomy(TaxonomyQueryDefinition queryDef) {
        startField("taxonomy");

        _queryBuilder.append('{');
        queryDef.define(new TaxonomyQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class TenderTransactionsArguments extends Arguments {
        TenderTransactionsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public TenderTransactionsArguments first(Integer value) {
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
        public TenderTransactionsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public TenderTransactionsArguments last(Integer value) {
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
        public TenderTransactionsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public TenderTransactionsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * A filter made up of terms, connectives, modifiers, and comparators.
        * | name | type | description | acceptable_values | default_value | example_use |
        * | ---- | ---- | ---- | ---- | ---- | ---- |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | point_of_sale_device_id | id |
        * | processed_at | time |
        * | test | boolean |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public TenderTransactionsArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface TenderTransactionsArgumentsDefinition {
        void define(TenderTransactionsArguments args);
    }

    /**
    * Returns a list of TenderTransactions associated with the shop.
    */
    public QueryRootQuery tenderTransactions(TenderTransactionConnectionQueryDefinition queryDef) {
        return tenderTransactions(args -> {}, queryDef);
    }

    /**
    * Returns a list of TenderTransactions associated with the shop.
    */
    public QueryRootQuery tenderTransactions(TenderTransactionsArgumentsDefinition argsDef, TenderTransactionConnectionQueryDefinition queryDef) {
        startField("tenderTransactions");

        TenderTransactionsArguments args = new TenderTransactionsArguments(_queryBuilder);
        argsDef.define(args);
        TenderTransactionsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new TenderTransactionConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns a particular theme for the shop.
    */
    public QueryRootQuery theme(ID id, OnlineStoreThemeQueryDefinition queryDef) {
        startField("theme");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new OnlineStoreThemeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ThemesArguments extends Arguments {
        ThemesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The theme roles to filter by.
        */
        public ThemesArguments roles(List<ThemeRole> value) {
            if (value != null) {
                startArgument("roles");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ThemeRole item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        _queryBuilder.append(item1.toString());
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }

        /**
        * The theme names to filter by. Use '*' to match zero or more characters.
        */
        public ThemesArguments names(List<String> value) {
            if (value != null) {
                startArgument("names");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (String item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ThemesArguments first(Integer value) {
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
        public ThemesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ThemesArguments last(Integer value) {
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
        public ThemesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public ThemesArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ThemesArgumentsDefinition {
        void define(ThemesArguments args);
    }

    /**
    * Returns a paginated list of themes for the shop.
    */
    public QueryRootQuery themes(OnlineStoreThemeConnectionQueryDefinition queryDef) {
        return themes(args -> {}, queryDef);
    }

    /**
    * Returns a paginated list of themes for the shop.
    */
    public QueryRootQuery themes(ThemesArgumentsDefinition argsDef, OnlineStoreThemeConnectionQueryDefinition queryDef) {
        startField("themes");

        ThemesArguments args = new ThemesArguments(_queryBuilder);
        argsDef.define(args);
        ThemesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new OnlineStoreThemeConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A resource that can have localized values for different languages.
    */
    public QueryRootQuery translatableResource(ID resourceId, TranslatableResourceQueryDefinition queryDef) {
        startField("translatableResource");

        _queryBuilder.append("(resourceId:");
        Query.appendQuotedString(_queryBuilder, resourceId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new TranslatableResourceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class TranslatableResourcesArguments extends Arguments {
        TranslatableResourcesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public TranslatableResourcesArguments first(Integer value) {
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
        public TranslatableResourcesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public TranslatableResourcesArguments last(Integer value) {
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
        public TranslatableResourcesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public TranslatableResourcesArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface TranslatableResourcesArgumentsDefinition {
        void define(TranslatableResourcesArguments args);
    }

    /**
    * Resources that can have localized values for different languages.
    */
    public QueryRootQuery translatableResources(TranslatableResourceType resourceType, TranslatableResourceConnectionQueryDefinition queryDef) {
        return translatableResources(resourceType, args -> {}, queryDef);
    }

    /**
    * Resources that can have localized values for different languages.
    */
    public QueryRootQuery translatableResources(TranslatableResourceType resourceType, TranslatableResourcesArgumentsDefinition argsDef, TranslatableResourceConnectionQueryDefinition queryDef) {
        startField("translatableResources");

        _queryBuilder.append("(resourceType:");
        _queryBuilder.append(resourceType.toString());

        argsDef.define(new TranslatableResourcesArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new TranslatableResourceConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class TranslatableResourcesByIdsArguments extends Arguments {
        TranslatableResourcesByIdsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public TranslatableResourcesByIdsArguments first(Integer value) {
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
        public TranslatableResourcesByIdsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public TranslatableResourcesByIdsArguments last(Integer value) {
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
        public TranslatableResourcesByIdsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public TranslatableResourcesByIdsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface TranslatableResourcesByIdsArgumentsDefinition {
        void define(TranslatableResourcesByIdsArguments args);
    }

    /**
    * Resources that can have localized values for different languages.
    */
    public QueryRootQuery translatableResourcesByIds(List<ID> resourceIds, TranslatableResourceConnectionQueryDefinition queryDef) {
        return translatableResourcesByIds(resourceIds, args -> {}, queryDef);
    }

    /**
    * Resources that can have localized values for different languages.
    */
    public QueryRootQuery translatableResourcesByIds(List<ID> resourceIds, TranslatableResourcesByIdsArgumentsDefinition argsDef, TranslatableResourceConnectionQueryDefinition queryDef) {
        startField("translatableResourcesByIds");

        _queryBuilder.append("(resourceIds:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ID item1 : resourceIds) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                Query.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

        argsDef.define(new TranslatableResourcesByIdsArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new TranslatableResourceConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns a redirect resource by ID.
    */
    public QueryRootQuery urlRedirect(ID id, UrlRedirectQueryDefinition queryDef) {
        startField("urlRedirect");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UrlRedirectQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns a redirect import resource by ID.
    */
    public QueryRootQuery urlRedirectImport(ID id, UrlRedirectImportQueryDefinition queryDef) {
        startField("urlRedirectImport");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UrlRedirectImportQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class UrlRedirectSavedSearchesArguments extends Arguments {
        UrlRedirectSavedSearchesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public UrlRedirectSavedSearchesArguments first(Integer value) {
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
        public UrlRedirectSavedSearchesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public UrlRedirectSavedSearchesArguments last(Integer value) {
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
        public UrlRedirectSavedSearchesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public UrlRedirectSavedSearchesArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface UrlRedirectSavedSearchesArgumentsDefinition {
        void define(UrlRedirectSavedSearchesArguments args);
    }

    /**
    * A list of the shop's URL redirect saved searches.
    */
    public QueryRootQuery urlRedirectSavedSearches(SavedSearchConnectionQueryDefinition queryDef) {
        return urlRedirectSavedSearches(args -> {}, queryDef);
    }

    /**
    * A list of the shop's URL redirect saved searches.
    */
    public QueryRootQuery urlRedirectSavedSearches(UrlRedirectSavedSearchesArgumentsDefinition argsDef, SavedSearchConnectionQueryDefinition queryDef) {
        startField("urlRedirectSavedSearches");

        UrlRedirectSavedSearchesArguments args = new UrlRedirectSavedSearchesArguments(_queryBuilder);
        argsDef.define(args);
        UrlRedirectSavedSearchesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SavedSearchConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class UrlRedirectsArguments extends Arguments {
        UrlRedirectsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public UrlRedirectsArguments first(Integer value) {
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
        public UrlRedirectsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public UrlRedirectsArguments last(Integer value) {
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
        public UrlRedirectsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public UrlRedirectsArguments reverse(Boolean value) {
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
        public UrlRedirectsArguments sortKey(UrlRedirectSortKeys value) {
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
        * | default | string | Filter by a case-insensitive search of multiple fields in a document. | | | -
        * `query=Bob Norman`<br/> - `query=title:green hoodie` |
        * | created_at | time |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | path | string |
        * | target | string |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public UrlRedirectsArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The ID of a [saved
        * search](https://shopify.dev/api/admin-graphql/latest/objects/savedsearch#field-id).
        * The search’s query string is used as the query argument.
        */
        public UrlRedirectsArguments savedSearchId(ID value) {
            if (value != null) {
                startArgument("savedSearchId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface UrlRedirectsArgumentsDefinition {
        void define(UrlRedirectsArguments args);
    }

    /**
    * A list of redirects for a shop.
    */
    public QueryRootQuery urlRedirects(UrlRedirectConnectionQueryDefinition queryDef) {
        return urlRedirects(args -> {}, queryDef);
    }

    /**
    * A list of redirects for a shop.
    */
    public QueryRootQuery urlRedirects(UrlRedirectsArgumentsDefinition argsDef, UrlRedirectConnectionQueryDefinition queryDef) {
        startField("urlRedirects");

        UrlRedirectsArguments args = new UrlRedirectsArguments(_queryBuilder);
        argsDef.define(args);
        UrlRedirectsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new UrlRedirectConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class UrlRedirectsCountArguments extends Arguments {
        UrlRedirectsCountArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * A filter made up of terms, connectives, modifiers, and comparators.
        * | name | type | description | acceptable_values | default_value | example_use |
        * | ---- | ---- | ---- | ---- | ---- | ---- |
        * | default | string | Filter by a case-insensitive search of multiple fields in a document. | | | -
        * `query=Bob Norman`<br/> - `query=title:green hoodie` |
        * | created_at | time |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | path | string |
        * | target | string |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public UrlRedirectsCountArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The ID of an existing saved search.
        * The search’s query string is used as the query argument.
        * Refer to the [`SavedSearch`](https://shopify.dev/api/admin-graphql/latest/objects/savedsearch)
        * object.
        */
        public UrlRedirectsCountArguments savedSearchId(ID value) {
            if (value != null) {
                startArgument("savedSearchId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The upper bound on count value before returning a result. Use `null` to have no limit.
        */
        public UrlRedirectsCountArguments limit(Integer value) {
            if (value != null) {
                startArgument("limit");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface UrlRedirectsCountArgumentsDefinition {
        void define(UrlRedirectsCountArguments args);
    }

    /**
    * Count of redirects. Limited to a maximum of 10000 by default.
    */
    public QueryRootQuery urlRedirectsCount(CountQueryDefinition queryDef) {
        return urlRedirectsCount(args -> {}, queryDef);
    }

    /**
    * Count of redirects. Limited to a maximum of 10000 by default.
    */
    public QueryRootQuery urlRedirectsCount(UrlRedirectsCountArgumentsDefinition argsDef, CountQueryDefinition queryDef) {
        startField("urlRedirectsCount");

        UrlRedirectsCountArguments args = new UrlRedirectsCountArguments(_queryBuilder);
        argsDef.define(args);
        UrlRedirectsCountArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Validation available on the shop.
    */
    public QueryRootQuery validation(ID id, ValidationQueryDefinition queryDef) {
        startField("validation");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ValidationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ValidationsArguments extends Arguments {
        ValidationsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ValidationsArguments first(Integer value) {
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
        public ValidationsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ValidationsArguments last(Integer value) {
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
        public ValidationsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public ValidationsArguments reverse(Boolean value) {
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
        public ValidationsArguments sortKey(ValidationSortKeys value) {
            if (value != null) {
                startArgument("sortKey");
                _queryBuilder.append(value.toString());
            }
            return this;
        }
    }

    public interface ValidationsArgumentsDefinition {
        void define(ValidationsArguments args);
    }

    /**
    * Validations available on the shop.
    */
    public QueryRootQuery validations(ValidationConnectionQueryDefinition queryDef) {
        return validations(args -> {}, queryDef);
    }

    /**
    * Validations available on the shop.
    */
    public QueryRootQuery validations(ValidationsArgumentsDefinition argsDef, ValidationConnectionQueryDefinition queryDef) {
        startField("validations");

        ValidationsArguments args = new ValidationsArguments(_queryBuilder);
        argsDef.define(args);
        ValidationsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ValidationConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class WebPixelArguments extends Arguments {
        WebPixelArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The ID of the `WebPixel` object to return.
        */
        public WebPixelArguments id(ID value) {
            if (value != null) {
                startArgument("id");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface WebPixelArgumentsDefinition {
        void define(WebPixelArguments args);
    }

    /**
    * Returns a
    * [web pixel](https://shopify.dev/docs/apps/build/marketing-analytics/build-web-pixels)
    * by ID.
    */
    public QueryRootQuery webPixel(WebPixelQueryDefinition queryDef) {
        return webPixel(args -> {}, queryDef);
    }

    /**
    * Returns a
    * [web pixel](https://shopify.dev/docs/apps/build/marketing-analytics/build-web-pixels)
    * by ID.
    */
    public QueryRootQuery webPixel(WebPixelArgumentsDefinition argsDef, WebPixelQueryDefinition queryDef) {
        startField("webPixel");

        WebPixelArguments args = new WebPixelArguments(_queryBuilder);
        argsDef.define(args);
        WebPixelArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new WebPixelQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class WebPresencesArguments extends Arguments {
        WebPresencesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public WebPresencesArguments first(Integer value) {
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
        public WebPresencesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public WebPresencesArguments last(Integer value) {
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
        public WebPresencesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public WebPresencesArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface WebPresencesArgumentsDefinition {
        void define(WebPresencesArguments args);
    }

    /**
    * The web presences for the shop.
    */
    public QueryRootQuery webPresences(MarketWebPresenceConnectionQueryDefinition queryDef) {
        return webPresences(args -> {}, queryDef);
    }

    /**
    * The web presences for the shop.
    */
    public QueryRootQuery webPresences(WebPresencesArgumentsDefinition argsDef, MarketWebPresenceConnectionQueryDefinition queryDef) {
        startField("webPresences");

        WebPresencesArguments args = new WebPresencesArguments(_queryBuilder);
        argsDef.define(args);
        WebPresencesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new MarketWebPresenceConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Returns a webhook subscription by ID.
    * Building an app? If you only use app-specific webhooks, you won't need this. App-specific webhook
    * subscriptions specified in your `shopify.app.toml` may be easier. They are automatically kept up to
    * date by Shopify & require less maintenance. Please read [About managing webhook
    * subscriptions](https://shopify.dev/docs/apps/build/webhooks/subscribe).
    */
    public QueryRootQuery webhookSubscription(ID id, WebhookSubscriptionQueryDefinition queryDef) {
        startField("webhookSubscription");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new WebhookSubscriptionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class WebhookSubscriptionsArguments extends Arguments {
        WebhookSubscriptionsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public WebhookSubscriptionsArguments first(Integer value) {
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
        public WebhookSubscriptionsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public WebhookSubscriptionsArguments last(Integer value) {
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
        public WebhookSubscriptionsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public WebhookSubscriptionsArguments reverse(Boolean value) {
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
        public WebhookSubscriptionsArguments sortKey(WebhookSubscriptionSortKeys value) {
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
        * | created_at | time |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | updated_at | time |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public WebhookSubscriptionsArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Callback URL to filter by.
        */
        public WebhookSubscriptionsArguments callbackUrl(String value) {
            if (value != null) {
                startArgument("callbackUrl");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Response format to filter by.
        */
        public WebhookSubscriptionsArguments format(WebhookSubscriptionFormat value) {
            if (value != null) {
                startArgument("format");
                _queryBuilder.append(value.toString());
            }
            return this;
        }

        /**
        * List of webhook subscription topics to filter by.
        */
        public WebhookSubscriptionsArguments topics(List<WebhookSubscriptionTopic> value) {
            if (value != null) {
                startArgument("topics");
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (WebhookSubscriptionTopic item1 : value) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        _queryBuilder.append(item1.toString());
                    }
                }
                _queryBuilder.append(']');
            }
            return this;
        }
    }

    public interface WebhookSubscriptionsArgumentsDefinition {
        void define(WebhookSubscriptionsArguments args);
    }

    /**
    * Returns a list of webhook subscriptions.
    * Building an app? If you only use app-specific webhooks, you won't need this. App-specific webhook
    * subscriptions specified in your `shopify.app.toml` may be easier. They are automatically kept up to
    * date by Shopify & require less maintenance. Please read [About managing webhook
    * subscriptions](https://shopify.dev/docs/apps/build/webhooks/subscribe).
    */
    public QueryRootQuery webhookSubscriptions(WebhookSubscriptionConnectionQueryDefinition queryDef) {
        return webhookSubscriptions(args -> {}, queryDef);
    }

    /**
    * Returns a list of webhook subscriptions.
    * Building an app? If you only use app-specific webhooks, you won't need this. App-specific webhook
    * subscriptions specified in your `shopify.app.toml` may be easier. They are automatically kept up to
    * date by Shopify & require less maintenance. Please read [About managing webhook
    * subscriptions](https://shopify.dev/docs/apps/build/webhooks/subscribe).
    */
    public QueryRootQuery webhookSubscriptions(WebhookSubscriptionsArgumentsDefinition argsDef, WebhookSubscriptionConnectionQueryDefinition queryDef) {
        startField("webhookSubscriptions");

        WebhookSubscriptionsArguments args = new WebhookSubscriptionsArguments(_queryBuilder);
        argsDef.define(args);
        WebhookSubscriptionsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new WebhookSubscriptionConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class WebhookSubscriptionsCountArguments extends Arguments {
        WebhookSubscriptionsCountArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * A filter made up of terms, connectives, modifiers, and comparators.
        * | name | type | description | acceptable_values | default_value | example_use |
        * | ---- | ---- | ---- | ---- | ---- | ---- |
        * | created_at | time |
        * | endpoint | string |
        * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
        * | topic | string |
        * | updated_at | time |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public WebhookSubscriptionsCountArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The upper bound on count value before returning a result. Use `null` to have no limit.
        */
        public WebhookSubscriptionsCountArguments limit(Integer value) {
            if (value != null) {
                startArgument("limit");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface WebhookSubscriptionsCountArgumentsDefinition {
        void define(WebhookSubscriptionsCountArguments args);
    }

    /**
    * The count of webhook subscriptions.
    * Building an app? If you only use app-specific webhooks, you won't need this. App-specific webhook
    * subscriptions specified in your `shopify.app.toml` may be easier. They are automatically kept up to
    * date by Shopify & require less maintenance. Please read [About managing webhook
    * subscriptions](https://shopify.dev/docs/apps/build/webhooks/subscribe). Limited to a maximum of
    * 10000 by default.
    */
    public QueryRootQuery webhookSubscriptionsCount(CountQueryDefinition queryDef) {
        return webhookSubscriptionsCount(args -> {}, queryDef);
    }

    /**
    * The count of webhook subscriptions.
    * Building an app? If you only use app-specific webhooks, you won't need this. App-specific webhook
    * subscriptions specified in your `shopify.app.toml` may be easier. They are automatically kept up to
    * date by Shopify & require less maintenance. Please read [About managing webhook
    * subscriptions](https://shopify.dev/docs/apps/build/webhooks/subscribe). Limited to a maximum of
    * 10000 by default.
    */
    public QueryRootQuery webhookSubscriptionsCount(WebhookSubscriptionsCountArgumentsDefinition argsDef, CountQueryDefinition queryDef) {
        startField("webhookSubscriptionsCount");

        WebhookSubscriptionsCountArguments args = new WebhookSubscriptionsCountArguments(_queryBuilder);
        argsDef.define(args);
        WebhookSubscriptionsCountArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public String toString() {
        return _queryBuilder.toString();
    }
}
