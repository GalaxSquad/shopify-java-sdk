// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;

/**
* A channel represents an app where you sell a group of products and collections.
* A channel can be a platform or marketplace such as Facebook or Pinterest, an online store, or POS.
*/
public class ChannelQuery extends Query<ChannelQuery> {
    ChannelQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The underlying app used by the channel.
    */
    public ChannelQuery app(AppQueryDefinition queryDef) {
        startField("app");

        _queryBuilder.append('{');
        queryDef.define(new AppQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CollectionPublicationsV3Arguments extends Arguments {
        CollectionPublicationsV3Arguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CollectionPublicationsV3Arguments first(Integer value) {
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
        public CollectionPublicationsV3Arguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CollectionPublicationsV3Arguments last(Integer value) {
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
        public CollectionPublicationsV3Arguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public CollectionPublicationsV3Arguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CollectionPublicationsV3ArgumentsDefinition {
        void define(CollectionPublicationsV3Arguments args);
    }

    /**
    * The collection publications for the list of collections published to the channel.
    */
    public ChannelQuery collectionPublicationsV3(ResourcePublicationConnectionQueryDefinition queryDef) {
        return collectionPublicationsV3(args -> {}, queryDef);
    }

    /**
    * The collection publications for the list of collections published to the channel.
    */
    public ChannelQuery collectionPublicationsV3(CollectionPublicationsV3ArgumentsDefinition argsDef, ResourcePublicationConnectionQueryDefinition queryDef) {
        startField("collectionPublicationsV3");

        CollectionPublicationsV3Arguments args = new CollectionPublicationsV3Arguments(_queryBuilder);
        argsDef.define(args);
        CollectionPublicationsV3Arguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ResourcePublicationConnectionQuery(_queryBuilder));
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
    }

    public interface CollectionsArgumentsDefinition {
        void define(CollectionsArguments args);
    }

    /**
    * The list of collections published to the channel.
    */
    public ChannelQuery collections(CollectionConnectionQueryDefinition queryDef) {
        return collections(args -> {}, queryDef);
    }

    /**
    * The list of collections published to the channel.
    */
    public ChannelQuery collections(CollectionsArgumentsDefinition argsDef, CollectionConnectionQueryDefinition queryDef) {
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
    * Whether the collection is available to the channel.
    */
    public ChannelQuery hasCollection(ID id) {
        startField("hasCollection");

        _queryBuilder.append("(id:");
        Query.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(')');

        return this;
    }

    /**
    * The name of the channel.
    */
    public ChannelQuery name() {
        startField("name");

        return this;
    }

    public class ProductPublicationsV3Arguments extends Arguments {
        ProductPublicationsV3Arguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ProductPublicationsV3Arguments first(Integer value) {
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
        public ProductPublicationsV3Arguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ProductPublicationsV3Arguments last(Integer value) {
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
        public ProductPublicationsV3Arguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public ProductPublicationsV3Arguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ProductPublicationsV3ArgumentsDefinition {
        void define(ProductPublicationsV3Arguments args);
    }

    /**
    * The product publications for the list of products published to the channel.
    */
    public ChannelQuery productPublicationsV3(ResourcePublicationConnectionQueryDefinition queryDef) {
        return productPublicationsV3(args -> {}, queryDef);
    }

    /**
    * The product publications for the list of products published to the channel.
    */
    public ChannelQuery productPublicationsV3(ProductPublicationsV3ArgumentsDefinition argsDef, ResourcePublicationConnectionQueryDefinition queryDef) {
        startField("productPublicationsV3");

        ProductPublicationsV3Arguments args = new ProductPublicationsV3Arguments(_queryBuilder);
        argsDef.define(args);
        ProductPublicationsV3Arguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ResourcePublicationConnectionQuery(_queryBuilder));
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
    }

    public interface ProductsArgumentsDefinition {
        void define(ProductsArguments args);
    }

    /**
    * The list of products published to the channel.
    */
    public ChannelQuery products(ProductConnectionQueryDefinition queryDef) {
        return products(args -> {}, queryDef);
    }

    /**
    * The list of products published to the channel.
    */
    public ChannelQuery products(ProductsArgumentsDefinition argsDef, ProductConnectionQueryDefinition queryDef) {
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
    * The count of products published to the channel. Limited to a maximum of 10000 by default.
    */
    public ChannelQuery productsCount(CountQueryDefinition queryDef) {
        return productsCount(args -> {}, queryDef);
    }

    /**
    * The count of products published to the channel. Limited to a maximum of 10000 by default.
    */
    public ChannelQuery productsCount(ProductsCountArgumentsDefinition argsDef, CountQueryDefinition queryDef) {
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
    * Whether the channel supports future publishing.
    */
    public ChannelQuery supportsFuturePublishing() {
        startField("supportsFuturePublishing");

        return this;
    }
}
