// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;
import java.util.List;

/**
* The `Product` object lets you manage products in a merchant’s store.
* Products are the goods and services that merchants offer to customers. They can include various
* details such as title, description, price, images, and options such as size or color.
* You can use [product
* variants](https://shopify.dev/docs/api/admin-graphql/latest/objects/productvariant) to create or
* update different versions of the same product.
* You can also add or update product
* [media](https://shopify.dev/docs/api/admin-graphql/latest/interfaces/media).
* Products can be organized by grouping them into a
* [collection](https://shopify.dev/docs/api/admin-graphql/latest/objects/collection).
* Learn more about working with [Shopify's product
* model](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model/product-model-component
* s),
* including limitations and considerations.
*/
public class ProductQuery extends Query<ProductQuery> {
    ProductQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The number of
    * [publications](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication)
    * that a resource is published to, without
    * [feedback errors](https://shopify.dev/docs/api/admin-graphql/latest/objects/ResourceFeedback).
    */
    public ProductQuery availablePublicationsCount(CountQueryDefinition queryDef) {
        startField("availablePublicationsCount");

        _queryBuilder.append('{');
        queryDef.define(new CountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class BundleComponentsArguments extends Arguments {
        BundleComponentsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public BundleComponentsArguments first(Integer value) {
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
        public BundleComponentsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public BundleComponentsArguments last(Integer value) {
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
        public BundleComponentsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public BundleComponentsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface BundleComponentsArgumentsDefinition {
        void define(BundleComponentsArguments args);
    }

    /**
    * A list of
    * [components](https://shopify.dev/docs/apps/build/product-merchandising/bundles/add-product-fixed-bun
    * dle)
    * that are associated with a product in a bundle.
    */
    public ProductQuery bundleComponents(ProductBundleComponentConnectionQueryDefinition queryDef) {
        return bundleComponents(args -> {}, queryDef);
    }

    /**
    * A list of
    * [components](https://shopify.dev/docs/apps/build/product-merchandising/bundles/add-product-fixed-bun
    * dle)
    * that are associated with a product in a bundle.
    */
    public ProductQuery bundleComponents(BundleComponentsArgumentsDefinition argsDef, ProductBundleComponentConnectionQueryDefinition queryDef) {
        startField("bundleComponents");

        BundleComponentsArguments args = new BundleComponentsArguments(_queryBuilder);
        argsDef.define(args);
        BundleComponentsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ProductBundleComponentConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The category of a product
    * from [Shopify's Standard Product
    * Taxonomy](https://shopify.github.io/product-taxonomy/releases/unstable/?categoryId=sg-4-17-2-17).
    */
    public ProductQuery category(TaxonomyCategoryQueryDefinition queryDef) {
        startField("category");

        _queryBuilder.append('{');
        queryDef.define(new TaxonomyCategoryQuery(_queryBuilder));
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
    }

    public interface CollectionsArgumentsDefinition {
        void define(CollectionsArguments args);
    }

    /**
    * A list of [collections](https://shopify.dev/docs/api/admin-graphql/latest/objects/Collection)
    * that include the product.
    */
    public ProductQuery collections(CollectionConnectionQueryDefinition queryDef) {
        return collections(args -> {}, queryDef);
    }

    /**
    * A list of [collections](https://shopify.dev/docs/api/admin-graphql/latest/objects/Collection)
    * that include the product.
    */
    public ProductQuery collections(CollectionsArgumentsDefinition argsDef, CollectionConnectionQueryDefinition queryDef) {
        startField("collections");

        CollectionsArguments args = new CollectionsArguments(_queryBuilder);
        argsDef.define(args);
        CollectionsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CollectionConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A special product type that combines separate products from a store into a single product listing.
    * [Combined listings](https://shopify.dev/apps/build/product-merchandising/combined-listings) are
    * connected
    * by a shared option, such as color, model, or dimension.
    */
    public ProductQuery combinedListing(CombinedListingQueryDefinition queryDef) {
        startField("combinedListing");

        _queryBuilder.append('{');
        queryDef.define(new CombinedListingQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The [role of the
    * product](https://shopify.dev/docs/apps/build/product-merchandising/combined-listings/build-for-combi
    * ned-listings)
    * in a combined listing.
    * If `null`, then the product isn't part of any combined listing.
    */
    public ProductQuery combinedListingRole() {
        startField("combinedListingRole");

        return this;
    }

    /**
    * The [compare-at price
    * range](https://help.shopify.com/manual/products/details/product-pricing/sale-pricing)
    * of the product in the shop's default currency.
    */
    public ProductQuery compareAtPriceRange(ProductCompareAtPriceRangeQueryDefinition queryDef) {
        startField("compareAtPriceRange");

        _queryBuilder.append('{');
        queryDef.define(new ProductCompareAtPriceRangeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The pricing that applies to a customer in a specific context. For example, a price might vary
    * depending on the customer's location. Only active markets are considered in the price resolution.
    */
    public ProductQuery contextualPricing(ContextualPricingContext context, ProductContextualPricingQueryDefinition queryDef) {
        startField("contextualPricing");

        _queryBuilder.append("(context:");
        context.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ProductContextualPricingQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time when the product was created.
    */
    public ProductQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that returns the single next
    * record, sorted ascending by ID.
    */
    public ProductQuery defaultCursor() {
        startField("defaultCursor");

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
    * A single-line description of the product,
    * with [HTML tags](https://developer.mozilla.org/en-US/docs/Web/HTML) removed.
    */
    public ProductQuery description() {
        return description(args -> {});
    }

    /**
    * A single-line description of the product,
    * with [HTML tags](https://developer.mozilla.org/en-US/docs/Web/HTML) removed.
    */
    public ProductQuery description(DescriptionArgumentsDefinition argsDef) {
        startField("description");

        DescriptionArguments args = new DescriptionArguments(_queryBuilder);
        argsDef.define(args);
        DescriptionArguments.end(args);

        return this;
    }

    /**
    * The description of the product, with
    * HTML tags. For example, the description might include
    * bold `<strong></strong>` and italic `<i></i>` text.
    */
    public ProductQuery descriptionHtml() {
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
    public ProductQuery events(EventConnectionQueryDefinition queryDef) {
        return events(args -> {}, queryDef);
    }

    /**
    * The paginated list of events associated with the host subject.
    */
    public ProductQuery events(EventsArgumentsDefinition argsDef, EventConnectionQueryDefinition queryDef) {
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
    * The featured [media](https://shopify.dev/docs/apps/build/online-store/product-media)
    * associated with the product.
    */
    public ProductQuery featuredMedia(MediaQueryDefinition queryDef) {
        startField("featuredMedia");

        _queryBuilder.append('{');
        queryDef.define(new MediaQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The information that lets merchants know what steps they need to take
    * to make sure that the app is set up correctly.
    * For example, if a merchant hasn't set up a product correctly in the app,
    * then the feedback might include a message that says "You need to add a price
    * to this product".
    */
    public ProductQuery feedback(ResourceFeedbackQueryDefinition queryDef) {
        startField("feedback");

        _queryBuilder.append('{');
        queryDef.define(new ResourceFeedbackQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The [theme template](https://shopify.dev/docs/storefronts/themes/architecture/templates) that's used
    * when customers view the gift card in a store.
    */
    public ProductQuery giftCardTemplateSuffix() {
        startField("giftCardTemplateSuffix");

        return this;
    }

    /**
    * A unique, human-readable string of the product's title. A handle can contain letters, hyphens (`-`),
    * and numbers, but no spaces.
    * The handle is used in the online store URL for the product.
    */
    public ProductQuery handle() {
        startField("handle");

        return this;
    }

    /**
    * Whether the product has only a single variant with the default option and value.
    */
    public ProductQuery hasOnlyDefaultVariant() {
        startField("hasOnlyDefaultVariant");

        return this;
    }

    /**
    * Whether the product has variants that are out of stock.
    */
    public ProductQuery hasOutOfStockVariants() {
        startField("hasOutOfStockVariants");

        return this;
    }

    /**
    * Whether at least one of the product variants requires
    * [bundle
    * components](https://shopify.dev/docs/apps/build/product-merchandising/bundles/add-product-fixed-bund
    * le).
    * Learn more about
    * [store eligibility for
    * bundles](https://shopify.dev/docs/apps/build/product-merchandising/bundles#store-eligibility).
    */
    public ProductQuery hasVariantsThatRequiresComponents() {
        startField("hasVariantsThatRequiresComponents");

        return this;
    }

    /**
    * Whether the product
    * is in a specified
    * [collection](https://shopify.dev/docs/api/admin-graphql/latest/objects/collection).
    */
    public ProductQuery inCollection(ID id) {
        startField("inCollection");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        return this;
    }

    /**
    * Whether the product is a gift card.
    */
    public ProductQuery isGiftCard() {
        startField("isGiftCard");

        return this;
    }

    /**
    * The ID of the corresponding resource in the REST Admin API.
    */
    public ProductQuery legacyResourceId() {
        startField("legacyResourceId");

        return this;
    }

    public class MediaArguments extends Arguments {
        MediaArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public MediaArguments first(Integer value) {
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
        public MediaArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public MediaArguments last(Integer value) {
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
        public MediaArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public MediaArguments reverse(Boolean value) {
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
        public MediaArguments sortKey(ProductMediaSortKeys value) {
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
        * | media_type | string | | - `IMAGE`<br/> - `VIDEO`<br/> - `MODEL_3D`<br/> - `EXTERNAL_VIDEO` |
        * You can apply one or more filters to a query. Learn more about [Shopify API search
        * syntax](https://shopify.dev/api/usage/search-syntax).
        */
        public MediaArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface MediaArgumentsDefinition {
        void define(MediaArguments args);
    }

    /**
    * The [media](https://shopify.dev/docs/apps/build/online-store/product-media) associated with the
    * product. Valid media are images, 3D models, videos.
    */
    public ProductQuery media(MediaConnectionQueryDefinition queryDef) {
        return media(args -> {}, queryDef);
    }

    /**
    * The [media](https://shopify.dev/docs/apps/build/online-store/product-media) associated with the
    * product. Valid media are images, 3D models, videos.
    */
    public ProductQuery media(MediaArgumentsDefinition argsDef, MediaConnectionQueryDefinition queryDef) {
        startField("media");

        MediaArguments args = new MediaArguments(_queryBuilder);
        argsDef.define(args);
        MediaArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new MediaConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total count of [media](https://shopify.dev/docs/apps/build/online-store/product-media)
    * that's associated with a product.
    */
    public ProductQuery mediaCount(CountQueryDefinition queryDef) {
        startField("mediaCount");

        _queryBuilder.append('{');
        queryDef.define(new CountQuery(_queryBuilder));
        _queryBuilder.append('}');

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
    public ProductQuery metafield(String key, MetafieldQueryDefinition queryDef) {
        return metafield(key, args -> {}, queryDef);
    }

    /**
    * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
    * including its `namespace` and `key`, that's associated with a Shopify resource
    * for the purposes of adding and storing additional information.
    */
    public ProductQuery metafield(String key, MetafieldArgumentsDefinition argsDef, MetafieldQueryDefinition queryDef) {
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
    public ProductQuery metafields(MetafieldConnectionQueryDefinition queryDef) {
        return metafields(args -> {}, queryDef);
    }

    /**
    * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
    * that a merchant associates with a Shopify resource.
    */
    public ProductQuery metafields(MetafieldsArgumentsDefinition argsDef, MetafieldConnectionQueryDefinition queryDef) {
        startField("metafields");

        MetafieldsArguments args = new MetafieldsArguments(_queryBuilder);
        argsDef.define(args);
        MetafieldsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new MetafieldConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The [preview URL](https://help.shopify.com/manual/online-store/setting-up#preview-your-store) for
    * the online store.
    */
    public ProductQuery onlineStorePreviewUrl() {
        startField("onlineStorePreviewUrl");

        return this;
    }

    /**
    * The product's URL on the online store.
    * If `null`, then the product isn't published to the online store sales channel.
    */
    public ProductQuery onlineStoreUrl() {
        startField("onlineStoreUrl");

        return this;
    }

    public class OptionsArguments extends Arguments {
        OptionsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Truncate the array result to this size.
        */
        public OptionsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface OptionsArgumentsDefinition {
        void define(OptionsArguments args);
    }

    /**
    * A list of product options. The limit is defined by the
    * [shop's resource limits for product
    * options](https://shopify.dev/docs/api/admin-graphql/latest/objects/Shop#field-resourcelimits)
    * (`Shop.resourceLimits.maxProductOptions`).
    */
    public ProductQuery options(ProductOptionQueryDefinition queryDef) {
        return options(args -> {}, queryDef);
    }

    /**
    * A list of product options. The limit is defined by the
    * [shop's resource limits for product
    * options](https://shopify.dev/docs/api/admin-graphql/latest/objects/Shop#field-resourcelimits)
    * (`Shop.resourceLimits.maxProductOptions`).
    */
    public ProductQuery options(OptionsArgumentsDefinition argsDef, ProductOptionQueryDefinition queryDef) {
        startField("options");

        OptionsArguments args = new OptionsArguments(_queryBuilder);
        argsDef.define(args);
        OptionsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ProductOptionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The minimum and maximum prices of a product, expressed in decimal numbers.
    * For example, if the product is priced between $10.00 and $50.00,
    * then the price range is $10.00 - $50.00.
    */
    public ProductQuery priceRangeV2(ProductPriceRangeV2QueryDefinition queryDef) {
        startField("priceRangeV2");

        _queryBuilder.append('{');
        queryDef.define(new ProductPriceRangeV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ProductComponentsArguments extends Arguments {
        ProductComponentsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ProductComponentsArguments first(Integer value) {
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
        public ProductComponentsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ProductComponentsArguments last(Integer value) {
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
        public ProductComponentsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public ProductComponentsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ProductComponentsArgumentsDefinition {
        void define(ProductComponentsArguments args);
    }

    /**
    * A list of products that contain at least one variant associated with
    * at least one of the current products' variants via group relationship.
    */
    public ProductQuery productComponents(ProductComponentTypeConnectionQueryDefinition queryDef) {
        return productComponents(args -> {}, queryDef);
    }

    /**
    * A list of products that contain at least one variant associated with
    * at least one of the current products' variants via group relationship.
    */
    public ProductQuery productComponents(ProductComponentsArgumentsDefinition argsDef, ProductComponentTypeConnectionQueryDefinition queryDef) {
        startField("productComponents");

        ProductComponentsArguments args = new ProductComponentsArguments(_queryBuilder);
        argsDef.define(args);
        ProductComponentsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ProductComponentTypeConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A count of unique products that contain at least one variant associated with
    * at least one of the current products' variants via group relationship.
    */
    public ProductQuery productComponentsCount(CountQueryDefinition queryDef) {
        startField("productComponentsCount");

        _queryBuilder.append('{');
        queryDef.define(new CountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ProductParentsArguments extends Arguments {
        ProductParentsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ProductParentsArguments first(Integer value) {
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
        public ProductParentsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ProductParentsArguments last(Integer value) {
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
        public ProductParentsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public ProductParentsArguments reverse(Boolean value) {
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
        public ProductParentsArguments query(String value) {
            if (value != null) {
                startArgument("query");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface ProductParentsArgumentsDefinition {
        void define(ProductParentsArguments args);
    }

    /**
    * A list of products that has a variant that contains any of this product's variants as a component.
    */
    public ProductQuery productParents(ProductConnectionQueryDefinition queryDef) {
        return productParents(args -> {}, queryDef);
    }

    /**
    * A list of products that has a variant that contains any of this product's variants as a component.
    */
    public ProductQuery productParents(ProductParentsArgumentsDefinition argsDef, ProductConnectionQueryDefinition queryDef) {
        startField("productParents");

        ProductParentsArguments args = new ProductParentsArguments(_queryBuilder);
        argsDef.define(args);
        ProductParentsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ProductConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The [product type](https://help.shopify.com/manual/products/details/product-type)
    * that merchants define.
    */
    public ProductQuery productType() {
        startField("productType");

        return this;
    }

    /**
    * The date and time when the product was published to the online store.
    */
    public ProductQuery publishedAt() {
        startField("publishedAt");

        return this;
    }

    /**
    * Whether the product is published for a customer only in a specified context. For example, a product
    * might be published for a customer only in a specific location.
    */
    public ProductQuery publishedInContext(ContextualPublicationContext context) {
        startField("publishedInContext");

        _queryBuilder.append("(context:");
        context.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        return this;
    }

    /**
    * Whether the resource is published to the app's
    * [publication](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication).
    * For example, the resource might be published to the app's online store channel.
    */
    public ProductQuery publishedOnCurrentPublication() {
        startField("publishedOnCurrentPublication");

        return this;
    }

    /**
    * Whether the resource is published to a specified
    * [publication](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication).
    */
    public ProductQuery publishedOnPublication(ID publicationId) {
        startField("publishedOnPublication");

        _queryBuilder.append("(publicationId:");
        Query.appendQuotedString(_queryBuilder, publicationId.toString());

        _queryBuilder.append(')');

        return this;
    }

    /**
    * Whether the product can only be purchased with
    * a [selling plan](https://shopify.dev/docs/apps/build/purchase-options/subscriptions/selling-plans).
    * Products that are sold on subscription (`requiresSellingPlan: true`) can be updated only for online
    * stores.
    * If you update a product to be subscription-only (`requiresSellingPlan:false`), then the product is
    * unpublished from all channels, except the online store.
    */
    public ProductQuery requiresSellingPlan() {
        startField("requiresSellingPlan");

        return this;
    }

    /**
    * The resource that's either published or staged to be published to
    * the [publication](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication).
    */
    public ProductQuery resourcePublicationOnCurrentPublication(ResourcePublicationV2QueryDefinition queryDef) {
        startField("resourcePublicationOnCurrentPublication");

        _queryBuilder.append('{');
        queryDef.define(new ResourcePublicationV2Query(_queryBuilder));
        _queryBuilder.append('}');

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
    public ProductQuery resourcePublications(ResourcePublicationConnectionQueryDefinition queryDef) {
        return resourcePublications(args -> {}, queryDef);
    }

    /**
    * The list of resources that are published to a
    * [publication](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication).
    */
    public ProductQuery resourcePublications(ResourcePublicationsArgumentsDefinition argsDef, ResourcePublicationConnectionQueryDefinition queryDef) {
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
    public ProductQuery resourcePublicationsCount(CountQueryDefinition queryDef) {
        return resourcePublicationsCount(args -> {}, queryDef);
    }

    /**
    * The number of
    * [publications](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication)
    * that a resource is published to, without
    * [feedback errors](https://shopify.dev/docs/api/admin-graphql/latest/objects/ResourceFeedback).
    */
    public ProductQuery resourcePublicationsCount(ResourcePublicationsCountArgumentsDefinition argsDef, CountQueryDefinition queryDef) {
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
    public ProductQuery resourcePublicationsV2(ResourcePublicationV2ConnectionQueryDefinition queryDef) {
        return resourcePublicationsV2(args -> {}, queryDef);
    }

    /**
    * The list of resources that are either published or staged to be published to a
    * [publication](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication).
    */
    public ProductQuery resourcePublicationsV2(ResourcePublicationsV2ArgumentsDefinition argsDef, ResourcePublicationV2ConnectionQueryDefinition queryDef) {
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
    * Whether the merchant can make changes to the product when they
    * [edit the
    * order](https://shopify.dev/docs/apps/build/orders-fulfillment/order-management-apps/edit-orders)
    * associated with the product. For example, a merchant might be restricted from changing product
    * details when they
    * edit an order.
    */
    public ProductQuery restrictedForResource(ID calculatedOrderId, RestrictedForResourceQueryDefinition queryDef) {
        startField("restrictedForResource");

        _queryBuilder.append("(calculatedOrderId:");
        Query.appendQuotedString(_queryBuilder, calculatedOrderId.toString());

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new RestrictedForResourceQuery(_queryBuilder));
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
    }

    public interface SellingPlanGroupsArgumentsDefinition {
        void define(SellingPlanGroupsArguments args);
    }

    /**
    * A list of all [selling plan
    * groups](https://shopify.dev/docs/apps/build/purchase-options/subscriptions/selling-plans/build-a-sel
    * ling-plan)
    * that are associated with the product either directly, or through the product's variants.
    */
    public ProductQuery sellingPlanGroups(SellingPlanGroupConnectionQueryDefinition queryDef) {
        return sellingPlanGroups(args -> {}, queryDef);
    }

    /**
    * A list of all [selling plan
    * groups](https://shopify.dev/docs/apps/build/purchase-options/subscriptions/selling-plans/build-a-sel
    * ling-plan)
    * that are associated with the product either directly, or through the product's variants.
    */
    public ProductQuery sellingPlanGroups(SellingPlanGroupsArgumentsDefinition argsDef, SellingPlanGroupConnectionQueryDefinition queryDef) {
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
    * A count of [selling plan
    * groups](https://shopify.dev/docs/apps/build/purchase-options/subscriptions/selling-plans/build-a-sel
    * ling-plan)
    * that are associated with the product.
    */
    public ProductQuery sellingPlanGroupsCount(CountQueryDefinition queryDef) {
        startField("sellingPlanGroupsCount");

        _queryBuilder.append('{');
        queryDef.define(new CountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The [SEO title and
    * description](https://help.shopify.com/manual/promoting-marketing/seo/adding-keywords)
    * that are associated with a product.
    */
    public ProductQuery seo(SEOQueryDefinition queryDef) {
        startField("seo");

        _queryBuilder.append('{');
        queryDef.define(new SEOQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The [product
    * status](https://help.shopify.com/manual/products/details/product-details-page#product-status),
    * which controls visibility across all sales channels.
    */
    public ProductQuery status() {
        startField("status");

        return this;
    }

    /**
    * A comma-separated list of searchable keywords that are
    * associated with the product. For example, a merchant might apply the `sports`
    * and `summer` tags to products that are associated with sportwear for summer.
    * Updating `tags` overwrites
    * any existing tags that were previously added to the product. To add new tags without overwriting
    * existing tags, use the [`tagsAdd`](https://shopify.dev/api/admin-graphql/latest/mutations/tagsadd)
    * mutation.
    */
    public ProductQuery tags() {
        startField("tags");

        return this;
    }

    /**
    * The [theme template](https://shopify.dev/docs/storefronts/themes/architecture/templates) that's used
    * when customers view the product in a store.
    */
    public ProductQuery templateSuffix() {
        startField("templateSuffix");

        return this;
    }

    /**
    * The name for the product that displays to customers. The title is used to construct the product's
    * handle.
    * For example, if a product is titled "Black Sunglasses", then the handle is `black-sunglasses`.
    */
    public ProductQuery title() {
        startField("title");

        return this;
    }

    /**
    * The quantity of inventory that's in stock.
    */
    public ProductQuery totalInventory() {
        startField("totalInventory");

        return this;
    }

    /**
    * Whether [inventory
    * tracking](https://help.shopify.com/manual/products/inventory/getting-started-with-inventory/set-up-i
    * nventory-tracking)
    * has been enabled for the product.
    */
    public ProductQuery tracksInventory() {
        startField("tracksInventory");

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
    public ProductQuery translations(String locale, TranslationQueryDefinition queryDef) {
        return translations(locale, args -> {}, queryDef);
    }

    /**
    * The published translations associated with the resource.
    */
    public ProductQuery translations(String locale, TranslationsArgumentsDefinition argsDef, TranslationQueryDefinition queryDef) {
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
    public ProductQuery unpublishedPublications(PublicationConnectionQueryDefinition queryDef) {
        return unpublishedPublications(args -> {}, queryDef);
    }

    /**
    * The list of [publications](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication)
    * that the resource isn't published to.
    */
    public ProductQuery unpublishedPublications(UnpublishedPublicationsArgumentsDefinition argsDef, PublicationConnectionQueryDefinition queryDef) {
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
    * The date and time when the product was last modified.
    * A product's `updatedAt` value can change for different reasons. For example, if an order
    * is placed for a product that has inventory tracking set up, then the inventory adjustment
    * is counted as an update.
    */
    public ProductQuery updatedAt() {
        startField("updatedAt");

        return this;
    }

    public class VariantsArguments extends Arguments {
        VariantsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public VariantsArguments first(Integer value) {
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
        public VariantsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public VariantsArguments last(Integer value) {
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
        public VariantsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public VariantsArguments reverse(Boolean value) {
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
        public VariantsArguments sortKey(ProductVariantSortKeys value) {
            if (value != null) {
                startArgument("sortKey");
                _queryBuilder.append(value.toString());
            }
            return this;
        }
    }

    public interface VariantsArgumentsDefinition {
        void define(VariantsArguments args);
    }

    /**
    * A list of [variants](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant)
    * associated with the product.
    * If querying a single product at the root, you can fetch up to 2000 variants.
    */
    public ProductQuery variants(ProductVariantConnectionQueryDefinition queryDef) {
        return variants(args -> {}, queryDef);
    }

    /**
    * A list of [variants](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant)
    * associated with the product.
    * If querying a single product at the root, you can fetch up to 2000 variants.
    */
    public ProductQuery variants(VariantsArgumentsDefinition argsDef, ProductVariantConnectionQueryDefinition queryDef) {
        startField("variants");

        VariantsArguments args = new VariantsArguments(_queryBuilder);
        argsDef.define(args);
        VariantsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ProductVariantConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The number of [variants](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant)
    * that are associated with the product.
    */
    public ProductQuery variantsCount(CountQueryDefinition queryDef) {
        startField("variantsCount");

        _queryBuilder.append('{');
        queryDef.define(new CountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The name of the product's vendor.
    */
    public ProductQuery vendor() {
        startField("vendor");

        return this;
    }
}
