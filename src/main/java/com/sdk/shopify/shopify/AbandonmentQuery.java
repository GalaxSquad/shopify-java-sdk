// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Query;

/**
* A browse, cart, or checkout that was abandoned by a customer.
*/
public class AbandonmentQuery extends Query<AbandonmentQuery> {
    AbandonmentQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The abandonment payload for the abandoned checkout.
    */
    public AbandonmentQuery abandonedCheckoutPayload(AbandonedCheckoutQueryDefinition queryDef) {
        startField("abandonedCheckoutPayload");

        _queryBuilder.append('{');
        queryDef.define(new AbandonedCheckoutQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The abandonment type.
    */
    public AbandonmentQuery abandonmentType() {
        startField("abandonmentType");

        return this;
    }

    /**
    * The app associated with an abandoned checkout.
    */
    public AbandonmentQuery app(AppQueryDefinition queryDef) {
        startField("app");

        _queryBuilder.append('{');
        queryDef.define(new AppQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Permalink to the cart page.
    */
    public AbandonmentQuery cartUrl() {
        startField("cartUrl");

        return this;
    }

    /**
    * The date and time when the abandonment was created.
    */
    public AbandonmentQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * The customer who abandoned this event.
    */
    public AbandonmentQuery customer(CustomerQueryDefinition queryDef) {
        startField("customer");

        _queryBuilder.append('{');
        queryDef.define(new CustomerQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the customer has a draft order since this abandonment has been abandoned.
    */
    public AbandonmentQuery customerHasNoDraftOrderSinceAbandonment() {
        startField("customerHasNoDraftOrderSinceAbandonment");

        return this;
    }

    /**
    * Whether the customer has completed an order since this checkout has been abandoned.
    */
    public AbandonmentQuery customerHasNoOrderSinceAbandonment() {
        startField("customerHasNoOrderSinceAbandonment");

        return this;
    }

    /**
    * The number of days since the last abandonment email was sent to the customer.
    */
    public AbandonmentQuery daysSinceLastAbandonmentEmail() {
        startField("daysSinceLastAbandonmentEmail");

        return this;
    }

    /**
    * When the email was sent, if that's the case.
    */
    public AbandonmentQuery emailSentAt() {
        startField("emailSentAt");

        return this;
    }

    /**
    * The email state (e.g., sent or not sent).
    */
    public AbandonmentQuery emailState() {
        startField("emailState");

        return this;
    }

    /**
    * The number of hours since the customer has last abandoned a checkout.
    */
    public AbandonmentQuery hoursSinceLastAbandonedCheckout() {
        startField("hoursSinceLastAbandonedCheckout");

        return this;
    }

    /**
    * Whether the products in abandonment are available.
    */
    public AbandonmentQuery inventoryAvailable() {
        startField("inventoryAvailable");

        return this;
    }

    /**
    * Whether the abandonment event comes from a custom storefront channel.
    */
    public AbandonmentQuery isFromCustomStorefront() {
        startField("isFromCustomStorefront");

        return this;
    }

    /**
    * Whether the abandonment event comes from the Online Store sales channel.
    */
    public AbandonmentQuery isFromOnlineStore() {
        startField("isFromOnlineStore");

        return this;
    }

    /**
    * Whether the abandonment event comes from the Shop app sales channel.
    */
    public AbandonmentQuery isFromShopApp() {
        startField("isFromShopApp");

        return this;
    }

    /**
    * Whether the abandonment event comes from Shop Pay.
    */
    public AbandonmentQuery isFromShopPay() {
        startField("isFromShopPay");

        return this;
    }

    /**
    * Whether the customer didn't complete another most significant step since this abandonment.
    */
    public AbandonmentQuery isMostSignificantAbandonment() {
        startField("isMostSignificantAbandonment");

        return this;
    }

    /**
    * The date for the latest browse abandonment.
    */
    public AbandonmentQuery lastBrowseAbandonmentDate() {
        startField("lastBrowseAbandonmentDate");

        return this;
    }

    /**
    * The date for the latest cart abandonment.
    */
    public AbandonmentQuery lastCartAbandonmentDate() {
        startField("lastCartAbandonmentDate");

        return this;
    }

    /**
    * The date for the latest checkout abandonment.
    */
    public AbandonmentQuery lastCheckoutAbandonmentDate() {
        startField("lastCheckoutAbandonmentDate");

        return this;
    }

    /**
    * The most recent step type.
    */
    public AbandonmentQuery mostRecentStep() {
        startField("mostRecentStep");

        return this;
    }

    public class ProductsAddedToCartArguments extends Arguments {
        ProductsAddedToCartArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ProductsAddedToCartArguments first(Integer value) {
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
        public ProductsAddedToCartArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ProductsAddedToCartArguments last(Integer value) {
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
        public ProductsAddedToCartArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public ProductsAddedToCartArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ProductsAddedToCartArgumentsDefinition {
        void define(ProductsAddedToCartArguments args);
    }

    /**
    * The products added to the cart during the customer abandoned visit.
    */
    public AbandonmentQuery productsAddedToCart(CustomerVisitProductInfoConnectionQueryDefinition queryDef) {
        return productsAddedToCart(args -> {}, queryDef);
    }

    /**
    * The products added to the cart during the customer abandoned visit.
    */
    public AbandonmentQuery productsAddedToCart(ProductsAddedToCartArgumentsDefinition argsDef, CustomerVisitProductInfoConnectionQueryDefinition queryDef) {
        startField("productsAddedToCart");

        ProductsAddedToCartArguments args = new ProductsAddedToCartArguments(_queryBuilder);
        argsDef.define(args);
        ProductsAddedToCartArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CustomerVisitProductInfoConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ProductsViewedArguments extends Arguments {
        ProductsViewedArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ProductsViewedArguments first(Integer value) {
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
        public ProductsViewedArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ProductsViewedArguments last(Integer value) {
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
        public ProductsViewedArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public ProductsViewedArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ProductsViewedArgumentsDefinition {
        void define(ProductsViewedArguments args);
    }

    /**
    * The products viewed during the customer abandoned visit.
    */
    public AbandonmentQuery productsViewed(CustomerVisitProductInfoConnectionQueryDefinition queryDef) {
        return productsViewed(args -> {}, queryDef);
    }

    /**
    * The products viewed during the customer abandoned visit.
    */
    public AbandonmentQuery productsViewed(ProductsViewedArgumentsDefinition argsDef, CustomerVisitProductInfoConnectionQueryDefinition queryDef) {
        startField("productsViewed");

        ProductsViewedArguments args = new ProductsViewedArguments(_queryBuilder);
        argsDef.define(args);
        ProductsViewedArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CustomerVisitProductInfoConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time when the visit started.
    */
    public AbandonmentQuery visitStartedAt() {
        startField("visitStartedAt");

        return this;
    }
}
