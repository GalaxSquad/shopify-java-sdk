// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Query;
import java.util.List;

/**
* Represents a product variant.
*/
public class ProductVariantQuery extends Query<ProductVariantQuery> {
    ProductVariantQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * Whether the product variant is available for sale.
    */
    public ProductVariantQuery availableForSale() {
        startField("availableForSale");

        return this;
    }

    /**
    * The value of the barcode associated with the product.
    */
    public ProductVariantQuery barcode() {
        startField("barcode");

        return this;
    }

    /**
    * The compare-at price of the variant in the default shop currency.
    */
    public ProductVariantQuery compareAtPrice() {
        startField("compareAtPrice");

        return this;
    }

    /**
    * The pricing that applies for a customer in a given context. As of API version 2025-04, only active
    * markets are considered in the price resolution.
    */
    public ProductVariantQuery contextualPricing(ContextualPricingContext context, ProductVariantContextualPricingQueryDefinition queryDef) {
        startField("contextualPricing");

        _queryBuilder.append("(context:");
        context.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ProductVariantContextualPricingQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time when the variant was created.
    */
    public ProductVariantQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that returns the single next
    * record, sorted ascending by ID.
    */
    public ProductVariantQuery defaultCursor() {
        startField("defaultCursor");

        return this;
    }

    /**
    * The [delivery profile](https://shopify.dev/api/admin-graphql/latest/objects/DeliveryProfile) for the
    * variant.
    */
    public ProductVariantQuery deliveryProfile(DeliveryProfileQueryDefinition queryDef) {
        startField("deliveryProfile");

        _queryBuilder.append('{');
        queryDef.define(new DeliveryProfileQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Display name of the variant, based on product's title + variant's title.
    */
    public ProductVariantQuery displayName() {
        startField("displayName");

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
    public ProductVariantQuery events(EventConnectionQueryDefinition queryDef) {
        return events(args -> {}, queryDef);
    }

    /**
    * The paginated list of events associated with the host subject.
    */
    public ProductVariantQuery events(EventsArgumentsDefinition argsDef, EventConnectionQueryDefinition queryDef) {
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
    * The featured image for the variant.
    */
    public ProductVariantQuery image(ImageQueryDefinition queryDef) {
        startField("image");

        _queryBuilder.append('{');
        queryDef.define(new ImageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The inventory item, which is used to query for inventory information.
    */
    public ProductVariantQuery inventoryItem(InventoryItemQueryDefinition queryDef) {
        startField("inventoryItem");

        _queryBuilder.append('{');
        queryDef.define(new InventoryItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether customers are allowed to place an order for the product variant when it's out of stock.
    */
    public ProductVariantQuery inventoryPolicy() {
        startField("inventoryPolicy");

        return this;
    }

    /**
    * The total sellable quantity of the variant.
    */
    public ProductVariantQuery inventoryQuantity() {
        startField("inventoryQuantity");

        return this;
    }

    /**
    * The ID of the corresponding resource in the REST Admin API.
    */
    public ProductVariantQuery legacyResourceId() {
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
    }

    public interface MediaArgumentsDefinition {
        void define(MediaArguments args);
    }

    /**
    * The media associated with the product variant.
    */
    public ProductVariantQuery media(MediaConnectionQueryDefinition queryDef) {
        return media(args -> {}, queryDef);
    }

    /**
    * The media associated with the product variant.
    */
    public ProductVariantQuery media(MediaArgumentsDefinition argsDef, MediaConnectionQueryDefinition queryDef) {
        startField("media");

        MediaArguments args = new MediaArguments(_queryBuilder);
        argsDef.define(args);
        MediaArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new MediaConnectionQuery(_queryBuilder));
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
    public ProductVariantQuery metafield(String key, MetafieldQueryDefinition queryDef) {
        return metafield(key, args -> {}, queryDef);
    }

    /**
    * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
    * including its `namespace` and `key`, that's associated with a Shopify resource
    * for the purposes of adding and storing additional information.
    */
    public ProductVariantQuery metafield(String key, MetafieldArgumentsDefinition argsDef, MetafieldQueryDefinition queryDef) {
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
    public ProductVariantQuery metafields(MetafieldConnectionQueryDefinition queryDef) {
        return metafields(args -> {}, queryDef);
    }

    /**
    * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
    * that a merchant associates with a Shopify resource.
    */
    public ProductVariantQuery metafields(MetafieldsArgumentsDefinition argsDef, MetafieldConnectionQueryDefinition queryDef) {
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
    * The order of the product variant in the list of product variants. The first position in the list is
    * 1.
    */
    public ProductVariantQuery position() {
        startField("position");

        return this;
    }

    /**
    * The price of the product variant in the default shop currency.
    */
    public ProductVariantQuery price() {
        startField("price");

        return this;
    }

    /**
    * The product that this variant belongs to.
    */
    public ProductVariantQuery product(ProductQueryDefinition queryDef) {
        startField("product");

        _queryBuilder.append('{');
        queryDef.define(new ProductQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ProductVariantComponentsArguments extends Arguments {
        ProductVariantComponentsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ProductVariantComponentsArguments first(Integer value) {
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
        public ProductVariantComponentsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ProductVariantComponentsArguments last(Integer value) {
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
        public ProductVariantComponentsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public ProductVariantComponentsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ProductVariantComponentsArgumentsDefinition {
        void define(ProductVariantComponentsArguments args);
    }

    /**
    * A list of the product variant components.
    */
    public ProductVariantQuery productVariantComponents(ProductVariantComponentConnectionQueryDefinition queryDef) {
        return productVariantComponents(args -> {}, queryDef);
    }

    /**
    * A list of the product variant components.
    */
    public ProductVariantQuery productVariantComponents(ProductVariantComponentsArgumentsDefinition argsDef, ProductVariantComponentConnectionQueryDefinition queryDef) {
        startField("productVariantComponents");

        ProductVariantComponentsArguments args = new ProductVariantComponentsArguments(_queryBuilder);
        argsDef.define(args);
        ProductVariantComponentsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ProductVariantComponentConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether a product variant requires components. The default value is `false`.
    * If `true`, then the product variant can only be purchased as a parent bundle with components and it
    * will be omitted
    * from channels that don't support bundles.
    */
    public ProductVariantQuery requiresComponents() {
        startField("requiresComponents");

        return this;
    }

    /**
    * List of product options applied to the variant.
    */
    public ProductVariantQuery selectedOptions(SelectedOptionQueryDefinition queryDef) {
        startField("selectedOptions");

        _queryBuilder.append('{');
        queryDef.define(new SelectedOptionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total sellable quantity of the variant for online channels.
    * This doesn't represent the total available inventory or capture
    * [limitations based on customer
    * location](https://help.shopify.com/manual/markets/inventory_and_fulfillment).
    */
    public ProductVariantQuery sellableOnlineQuantity() {
        startField("sellableOnlineQuantity");

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
    * A list of all selling plan groups defined in the current shop associated with the product variant.
    */
    public ProductVariantQuery sellingPlanGroups(SellingPlanGroupConnectionQueryDefinition queryDef) {
        return sellingPlanGroups(args -> {}, queryDef);
    }

    /**
    * A list of all selling plan groups defined in the current shop associated with the product variant.
    */
    public ProductVariantQuery sellingPlanGroups(SellingPlanGroupsArgumentsDefinition argsDef, SellingPlanGroupConnectionQueryDefinition queryDef) {
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
    * Count of selling plan groups associated with the product variant.
    */
    public ProductVariantQuery sellingPlanGroupsCount(CountQueryDefinition queryDef) {
        startField("sellingPlanGroupsCount");

        _queryBuilder.append('{');
        queryDef.define(new CountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A case-sensitive identifier for the product variant in the shop.
    * Required in order to connect to a fulfillment service.
    */
    public ProductVariantQuery sku() {
        startField("sku");

        return this;
    }

    /**
    * The tax code for the product variant.
    */
    public ProductVariantQuery taxCode() {
        startField("taxCode");

        return this;
    }

    /**
    * Whether a tax is charged when the product variant is sold.
    */
    public ProductVariantQuery taxable() {
        startField("taxable");

        return this;
    }

    /**
    * The title of the product variant.
    */
    public ProductVariantQuery title() {
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
    public ProductVariantQuery translations(String locale, TranslationQueryDefinition queryDef) {
        return translations(locale, args -> {}, queryDef);
    }

    /**
    * The published translations associated with the resource.
    */
    public ProductVariantQuery translations(String locale, TranslationsArgumentsDefinition argsDef, TranslationQueryDefinition queryDef) {
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

    /**
    * The unit price measurement for the variant.
    */
    public ProductVariantQuery unitPriceMeasurement(UnitPriceMeasurementQueryDefinition queryDef) {
        startField("unitPriceMeasurement");

        _queryBuilder.append('{');
        queryDef.define(new UnitPriceMeasurementQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time (ISO 8601 format) when the product variant was last modified.
    */
    public ProductVariantQuery updatedAt() {
        startField("updatedAt");

        return this;
    }
}
