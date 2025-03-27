// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;
import java.util.List;

/**
* Represents a group of products that can be displayed in online stores and other sales channels in
* categories, which makes it easy for customers to find them. For example, an athletics store might
* create different collections for running attire, shoes, and accessories.
* Collections can be defined by conditions, such as whether they match certain product tags. These are
* called smart or automated collections.
* Collections can also be created for a custom group of products. These are called custom or manual
* collections.
*/
public class CollectionQuery extends Query<CollectionQuery> {
    CollectionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The number of
    * [publications](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication)
    * that a resource is published to, without
    * [feedback errors](https://shopify.dev/docs/api/admin-graphql/latest/objects/ResourceFeedback).
    */
    public CollectionQuery availablePublicationsCount(CountQueryDefinition queryDef) {
        startField("availablePublicationsCount");

        _queryBuilder.append('{');
        queryDef.define(new CountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class DescriptionArguments extends Arguments {
        DescriptionArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Truncates a string after the given length.
        */
        public DescriptionArguments truncateAt(Integer value) {
            if (value != null) {
                startArgument("truncateAt");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface DescriptionArgumentsDefinition {
        void define(DescriptionArguments args);
    }

    /**
    * A single-line, text-only description of the collection, stripped of any HTML tags and formatting
    * that were included in the description.
    */
    public CollectionQuery description() {
        return description(args -> {});
    }

    /**
    * A single-line, text-only description of the collection, stripped of any HTML tags and formatting
    * that were included in the description.
    */
    public CollectionQuery description(DescriptionArgumentsDefinition argsDef) {
        startField("description");

        DescriptionArguments args = new DescriptionArguments(_queryBuilder);
        argsDef.define(args);
        DescriptionArguments.end(args);

        return this;
    }

    /**
    * The description of the collection, including any HTML tags and formatting. This content is typically
    * displayed to customers, such as on an online store, depending on the theme.
    */
    public CollectionQuery descriptionHtml() {
        startField("descriptionHtml");

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
    public CollectionQuery events(EventConnectionQueryDefinition queryDef) {
        return events(args -> {}, queryDef);
    }

    /**
    * The paginated list of events associated with the host subject.
    */
    public CollectionQuery events(EventsArgumentsDefinition argsDef, EventConnectionQueryDefinition queryDef) {
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
    * Information about the collection that's provided through resource feedback.
    */
    public CollectionQuery feedback(ResourceFeedbackQueryDefinition queryDef) {
        startField("feedback");

        _queryBuilder.append('{');
        queryDef.define(new ResourceFeedbackQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A unique string that identifies the collection. If a handle isn't specified when a collection is
    * created, it's automatically generated from the collection's original title, and typically includes
    * words from the title separated by hyphens. For example, a collection that was created with the title
    * `Summer Catalog 2022` might have the handle `summer-catalog-2022`.
    * If the title is changed, the handle doesn't automatically change.
    * The handle can be used in themes by the Liquid templating language to refer to the collection, but
    * using the ID is preferred because it never changes.
    */
    public CollectionQuery handle() {
        startField("handle");

        return this;
    }

    /**
    * Whether the collection includes the specified product.
    */
    public CollectionQuery hasProduct(ID id) {
        startField("hasProduct");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        return this;
    }

    /**
    * The image associated with the collection.
    */
    public CollectionQuery image(ImageQueryDefinition queryDef) {
        startField("image");

        _queryBuilder.append('{');
        queryDef.define(new ImageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The ID of the corresponding resource in the REST Admin API.
    */
    public CollectionQuery legacyResourceId() {
        startField("legacyResourceId");

        return this;
    }

    public class MetafieldArguments extends Arguments {
        MetafieldArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * The container the metafield belongs to. If omitted, the app-reserved namespace will be used.
        */
        public MetafieldArguments namespace(String value) {
            if (value != null) {
                startArgument("namespace");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface MetafieldArgumentsDefinition {
        void define(MetafieldArguments args);
    }

    /**
    * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
    * including its `namespace` and `key`, that's associated with a Shopify resource
    * for the purposes of adding and storing additional information.
    */
    public CollectionQuery metafield(String key, MetafieldQueryDefinition queryDef) {
        return metafield(key, args -> {}, queryDef);
    }

    /**
    * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
    * including its `namespace` and `key`, that's associated with a Shopify resource
    * for the purposes of adding and storing additional information.
    */
    public CollectionQuery metafield(String key, MetafieldArgumentsDefinition argsDef, MetafieldQueryDefinition queryDef) {
        startField("metafield");

        _queryBuilder.append("(key:");
        Query.appendQuotedString(_queryBuilder, key.toString());

        argsDef.define(new MetafieldArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MetafieldQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class MetafieldsArguments extends Arguments {
        MetafieldsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The metafield namespace to filter by. If omitted, the app-reserved namespace will be used.
        */
        public MetafieldsArguments namespace(String value) {
            if (value != null) {
                startArgument("namespace");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * List of keys of metafields in the format `namespace.key`, will be returned in the same format.
        */
        public MetafieldsArguments keys(List<String> value) {
            if (value != null) {
                startArgument("keys");
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
        public MetafieldsArguments first(Integer value) {
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
        public MetafieldsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public MetafieldsArguments last(Integer value) {
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
        public MetafieldsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public MetafieldsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface MetafieldsArgumentsDefinition {
        void define(MetafieldsArguments args);
    }

    /**
    * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
    * that a merchant associates with a Shopify resource.
    */
    public CollectionQuery metafields(MetafieldConnectionQueryDefinition queryDef) {
        return metafields(args -> {}, queryDef);
    }

    /**
    * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
    * that a merchant associates with a Shopify resource.
    */
    public CollectionQuery metafields(MetafieldsArgumentsDefinition argsDef, MetafieldConnectionQueryDefinition queryDef) {
        startField("metafields");

        MetafieldsArguments args = new MetafieldsArguments(_queryBuilder);
        argsDef.define(args);
        MetafieldsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new MetafieldConnectionQuery(_queryBuilder));
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
        public ProductsArguments sortKey(ProductCollectionSortKeys value) {
            if (value != null) {
                startArgument("sortKey");
                _queryBuilder.append(value.toString());
            }
            return this;
        }
    }

    public interface ProductsArgumentsDefinition {
        void define(ProductsArguments args);
    }

    /**
    * The products that are included in the collection.
    */
    public CollectionQuery products(ProductConnectionQueryDefinition queryDef) {
        return products(args -> {}, queryDef);
    }

    /**
    * The products that are included in the collection.
    */
    public CollectionQuery products(ProductsArgumentsDefinition argsDef, ProductConnectionQueryDefinition queryDef) {
        startField("products");

        ProductsArguments args = new ProductsArguments(_queryBuilder);
        argsDef.define(args);
        ProductsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ProductConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The number of products in the collection.
    */
    public CollectionQuery productsCount(CountQueryDefinition queryDef) {
        startField("productsCount");

        _queryBuilder.append('{');
        queryDef.define(new CountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the resource is published to the app's
    * [publication](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication).
    * For example, the resource might be published to the app's online store channel.
    */
    public CollectionQuery publishedOnCurrentPublication() {
        startField("publishedOnCurrentPublication");

        return this;
    }

    /**
    * Whether the resource is published to a specified
    * [publication](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication).
    */
    public CollectionQuery publishedOnPublication(ID publicationId) {
        startField("publishedOnPublication");

        _queryBuilder.append("(publicationId:");
        Query.appendQuotedString(_queryBuilder, publicationId.toString());

        _queryBuilder.append(')');

        return this;
    }

    public class ResourcePublicationsArguments extends Arguments {
        ResourcePublicationsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Whether to return only the resources that are currently published. If false, then also returns the
        * resources that are scheduled to be published.
        */
        public ResourcePublicationsArguments onlyPublished(Boolean value) {
            if (value != null) {
                startArgument("onlyPublished");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ResourcePublicationsArguments first(Integer value) {
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
        public ResourcePublicationsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ResourcePublicationsArguments last(Integer value) {
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
        public ResourcePublicationsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public ResourcePublicationsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ResourcePublicationsArgumentsDefinition {
        void define(ResourcePublicationsArguments args);
    }

    /**
    * The list of resources that are published to a
    * [publication](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication).
    */
    public CollectionQuery resourcePublications(ResourcePublicationConnectionQueryDefinition queryDef) {
        return resourcePublications(args -> {}, queryDef);
    }

    /**
    * The list of resources that are published to a
    * [publication](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication).
    */
    public CollectionQuery resourcePublications(ResourcePublicationsArgumentsDefinition argsDef, ResourcePublicationConnectionQueryDefinition queryDef) {
        startField("resourcePublications");

        ResourcePublicationsArguments args = new ResourcePublicationsArguments(_queryBuilder);
        argsDef.define(args);
        ResourcePublicationsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ResourcePublicationConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ResourcePublicationsCountArguments extends Arguments {
        ResourcePublicationsCountArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Include only the resource's publications that are published. If false, then return all the
        * resource's publications including future publications.
        */
        public ResourcePublicationsCountArguments onlyPublished(Boolean value) {
            if (value != null) {
                startArgument("onlyPublished");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ResourcePublicationsCountArgumentsDefinition {
        void define(ResourcePublicationsCountArguments args);
    }

    /**
    * The number of
    * [publications](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication)
    * that a resource is published to, without
    * [feedback errors](https://shopify.dev/docs/api/admin-graphql/latest/objects/ResourceFeedback).
    */
    public CollectionQuery resourcePublicationsCount(CountQueryDefinition queryDef) {
        return resourcePublicationsCount(args -> {}, queryDef);
    }

    /**
    * The number of
    * [publications](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication)
    * that a resource is published to, without
    * [feedback errors](https://shopify.dev/docs/api/admin-graphql/latest/objects/ResourceFeedback).
    */
    public CollectionQuery resourcePublicationsCount(ResourcePublicationsCountArgumentsDefinition argsDef, CountQueryDefinition queryDef) {
        startField("resourcePublicationsCount");

        ResourcePublicationsCountArguments args = new ResourcePublicationsCountArguments(_queryBuilder);
        argsDef.define(args);
        ResourcePublicationsCountArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ResourcePublicationsV2Arguments extends Arguments {
        ResourcePublicationsV2Arguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Whether to return only the resources that are currently published. If false, then also returns the
        * resources that are scheduled or staged to be published.
        */
        public ResourcePublicationsV2Arguments onlyPublished(Boolean value) {
            if (value != null) {
                startArgument("onlyPublished");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * Filter publications by catalog type.
        */
        public ResourcePublicationsV2Arguments catalogType(CatalogType value) {
            if (value != null) {
                startArgument("catalogType");
                _queryBuilder.append(value.toString());
            }
            return this;
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ResourcePublicationsV2Arguments first(Integer value) {
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
        public ResourcePublicationsV2Arguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ResourcePublicationsV2Arguments last(Integer value) {
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
        public ResourcePublicationsV2Arguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public ResourcePublicationsV2Arguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ResourcePublicationsV2ArgumentsDefinition {
        void define(ResourcePublicationsV2Arguments args);
    }

    /**
    * The list of resources that are either published or staged to be published to a
    * [publication](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication).
    */
    public CollectionQuery resourcePublicationsV2(ResourcePublicationV2ConnectionQueryDefinition queryDef) {
        return resourcePublicationsV2(args -> {}, queryDef);
    }

    /**
    * The list of resources that are either published or staged to be published to a
    * [publication](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication).
    */
    public CollectionQuery resourcePublicationsV2(ResourcePublicationsV2ArgumentsDefinition argsDef, ResourcePublicationV2ConnectionQueryDefinition queryDef) {
        startField("resourcePublicationsV2");

        ResourcePublicationsV2Arguments args = new ResourcePublicationsV2Arguments(_queryBuilder);
        argsDef.define(args);
        ResourcePublicationsV2Arguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ResourcePublicationV2ConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * For a smart (automated) collection, specifies the rules that determine whether a product is
    * included.
    */
    public CollectionQuery ruleSet(CollectionRuleSetQueryDefinition queryDef) {
        startField("ruleSet");

        _queryBuilder.append('{');
        queryDef.define(new CollectionRuleSetQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * If the default SEO fields for page title and description have been modified, contains the modified
    * information.
    */
    public CollectionQuery seo(SEOQueryDefinition queryDef) {
        startField("seo");

        _queryBuilder.append('{');
        queryDef.define(new SEOQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The order in which the products in the collection are displayed by default in the Shopify admin and
    * in sales channels, such as an online store.
    */
    public CollectionQuery sortOrder() {
        startField("sortOrder");

        return this;
    }

    /**
    * The suffix of the Liquid template being used to show the collection in an online store. For example,
    * if the value is `custom`, then the collection is using the `collection.custom.liquid` template. If
    * the value is `null`, then the collection is using the default `collection.liquid` template.
    */
    public CollectionQuery templateSuffix() {
        startField("templateSuffix");

        return this;
    }

    /**
    * The name of the collection. It's displayed in the Shopify admin and is typically displayed in sales
    * channels, such as an online store.
    */
    public CollectionQuery title() {
        startField("title");

        return this;
    }

    public class TranslationsArguments extends Arguments {
        TranslationsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, false);
        }

        /**
        * Filters translations by market ID. Use this argument to retrieve content specific to a market.
        */
        public TranslationsArguments marketId(ID value) {
            if (value != null) {
                startArgument("marketId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface TranslationsArgumentsDefinition {
        void define(TranslationsArguments args);
    }

    /**
    * The published translations associated with the resource.
    */
    public CollectionQuery translations(String locale, TranslationQueryDefinition queryDef) {
        return translations(locale, args -> {}, queryDef);
    }

    /**
    * The published translations associated with the resource.
    */
    public CollectionQuery translations(String locale, TranslationsArgumentsDefinition argsDef, TranslationQueryDefinition queryDef) {
        startField("translations");

        _queryBuilder.append("(locale:");
        Query.appendQuotedString(_queryBuilder, locale.toString());

        argsDef.define(new TranslationsArguments(_queryBuilder));

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new TranslationQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class UnpublishedPublicationsArguments extends Arguments {
        UnpublishedPublicationsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public UnpublishedPublicationsArguments first(Integer value) {
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
        public UnpublishedPublicationsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public UnpublishedPublicationsArguments last(Integer value) {
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
        public UnpublishedPublicationsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public UnpublishedPublicationsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface UnpublishedPublicationsArgumentsDefinition {
        void define(UnpublishedPublicationsArguments args);
    }

    /**
    * The list of [publications](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication)
    * that the resource isn't published to.
    */
    public CollectionQuery unpublishedPublications(PublicationConnectionQueryDefinition queryDef) {
        return unpublishedPublications(args -> {}, queryDef);
    }

    /**
    * The list of [publications](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication)
    * that the resource isn't published to.
    */
    public CollectionQuery unpublishedPublications(UnpublishedPublicationsArgumentsDefinition argsDef, PublicationConnectionQueryDefinition queryDef) {
        startField("unpublishedPublications");

        UnpublishedPublicationsArguments args = new UnpublishedPublicationsArguments(_queryBuilder);
        argsDef.define(args);
        UnpublishedPublicationsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PublicationConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the collection was
    * last modified.
    */
    public CollectionQuery updatedAt() {
        startField("updatedAt");

        return this;
    }
}
