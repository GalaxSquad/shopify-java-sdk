// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Query;

/**
* Represents an object that has a list of events.
*/
public class HasEventsQuery extends Query<HasEventsQuery> {
    HasEventsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
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
    public HasEventsQuery events(EventConnectionQueryDefinition queryDef) {
        return events(args -> {}, queryDef);
    }

    /**
    * The paginated list of events associated with the host subject.
    */
    public HasEventsQuery events(EventsArgumentsDefinition argsDef, EventConnectionQueryDefinition queryDef) {
        startField("events");

        EventsArguments args = new EventsArguments(_queryBuilder);
        argsDef.define(args);
        EventsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new EventConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public HasEventsQuery onArticle(ArticleQueryDefinition queryDef) {
        startInlineFragment("Article");
        queryDef.define(new ArticleQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasEventsQuery onBlog(BlogQueryDefinition queryDef) {
        startInlineFragment("Blog");
        queryDef.define(new BlogQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasEventsQuery onCollection(CollectionQueryDefinition queryDef) {
        startInlineFragment("Collection");
        queryDef.define(new CollectionQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasEventsQuery onComment(CommentQueryDefinition queryDef) {
        startInlineFragment("Comment");
        queryDef.define(new CommentQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasEventsQuery onCompany(CompanyQueryDefinition queryDef) {
        startInlineFragment("Company");
        queryDef.define(new CompanyQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasEventsQuery onCompanyLocation(CompanyLocationQueryDefinition queryDef) {
        startInlineFragment("CompanyLocation");
        queryDef.define(new CompanyLocationQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasEventsQuery onCustomer(CustomerQueryDefinition queryDef) {
        startInlineFragment("Customer");
        queryDef.define(new CustomerQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasEventsQuery onDiscountAutomaticBxgy(DiscountAutomaticBxgyQueryDefinition queryDef) {
        startInlineFragment("DiscountAutomaticBxgy");
        queryDef.define(new DiscountAutomaticBxgyQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasEventsQuery onDiscountAutomaticNode(DiscountAutomaticNodeQueryDefinition queryDef) {
        startInlineFragment("DiscountAutomaticNode");
        queryDef.define(new DiscountAutomaticNodeQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasEventsQuery onDiscountCodeNode(DiscountCodeNodeQueryDefinition queryDef) {
        startInlineFragment("DiscountCodeNode");
        queryDef.define(new DiscountCodeNodeQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasEventsQuery onDiscountNode(DiscountNodeQueryDefinition queryDef) {
        startInlineFragment("DiscountNode");
        queryDef.define(new DiscountNodeQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasEventsQuery onDraftOrder(DraftOrderQueryDefinition queryDef) {
        startInlineFragment("DraftOrder");
        queryDef.define(new DraftOrderQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasEventsQuery onInventoryTransfer(InventoryTransferQueryDefinition queryDef) {
        startInlineFragment("InventoryTransfer");
        queryDef.define(new InventoryTransferQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasEventsQuery onOrder(OrderQueryDefinition queryDef) {
        startInlineFragment("Order");
        queryDef.define(new OrderQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasEventsQuery onPage(PageQueryDefinition queryDef) {
        startInlineFragment("Page");
        queryDef.define(new PageQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasEventsQuery onPriceRule(PriceRuleQueryDefinition queryDef) {
        startInlineFragment("PriceRule");
        queryDef.define(new PriceRuleQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasEventsQuery onProduct(ProductQueryDefinition queryDef) {
        startInlineFragment("Product");
        queryDef.define(new ProductQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public HasEventsQuery onProductVariant(ProductVariantQueryDefinition queryDef) {
        startInlineFragment("ProductVariant");
        queryDef.define(new ProductVariantQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
