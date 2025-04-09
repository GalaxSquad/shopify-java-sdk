// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Query;

/**
* An inventory error caused by an issue with one or more of the contract merchandise lines.
*/
public class SubscriptionBillingAttemptInsufficientStockProductVariantsErrorQuery extends Query<SubscriptionBillingAttemptInsufficientStockProductVariantsErrorQuery> {
    SubscriptionBillingAttemptInsufficientStockProductVariantsErrorQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The code for the error.
    */
    public SubscriptionBillingAttemptInsufficientStockProductVariantsErrorQuery code() {
        startField("code");

        return this;
    }

    public class InsufficientStockProductVariantsArguments extends Arguments {
        InsufficientStockProductVariantsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public InsufficientStockProductVariantsArguments first(Integer value) {
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
        public InsufficientStockProductVariantsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public InsufficientStockProductVariantsArguments last(Integer value) {
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
        public InsufficientStockProductVariantsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public InsufficientStockProductVariantsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface InsufficientStockProductVariantsArgumentsDefinition {
        void define(InsufficientStockProductVariantsArguments args);
    }

    /**
    * A list of product variants that caused the insufficient inventory error.
    */
    public SubscriptionBillingAttemptInsufficientStockProductVariantsErrorQuery insufficientStockProductVariants(ProductVariantConnectionQueryDefinition queryDef) {
        return insufficientStockProductVariants(args -> {}, queryDef);
    }

    /**
    * A list of product variants that caused the insufficient inventory error.
    */
    public SubscriptionBillingAttemptInsufficientStockProductVariantsErrorQuery insufficientStockProductVariants(InsufficientStockProductVariantsArgumentsDefinition argsDef, ProductVariantConnectionQueryDefinition queryDef) {
        startField("insufficientStockProductVariants");

        InsufficientStockProductVariantsArguments args = new InsufficientStockProductVariantsArguments(_queryBuilder);
        argsDef.define(args);
        InsufficientStockProductVariantsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ProductVariantConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * An explanation of the error.
    */
    public SubscriptionBillingAttemptInsufficientStockProductVariantsErrorQuery message() {
        startField("message");

        return this;
    }
}
