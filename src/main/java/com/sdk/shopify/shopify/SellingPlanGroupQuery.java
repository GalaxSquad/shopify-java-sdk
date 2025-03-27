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
* Represents a selling method (for example, "Subscribe and save" or "Pre-paid"). Selling plan groups
* and associated records (selling plans and policies) are deleted 48 hours after a merchant
* uninstalls their subscriptions app. We recommend backing up these records if you need to restore
* them later.
*/
public class SellingPlanGroupQuery extends Query<SellingPlanGroupQuery> {
    SellingPlanGroupQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The ID for app, exposed in Liquid and product JSON.
    */
    public SellingPlanGroupQuery appId() {
        startField("appId");

        return this;
    }

    /**
    * Whether the given product is directly associated to the selling plan group.
    */
    public SellingPlanGroupQuery appliesToProduct(ID productId) {
        startField("appliesToProduct");

        _queryBuilder.append("(productId:");
        Query.appendQuotedString(_queryBuilder, productId.toString());

        _queryBuilder.append(')');

        return this;
    }

    /**
    * Whether the given product variant is directly associated to the selling plan group.
    */
    public SellingPlanGroupQuery appliesToProductVariant(ID productVariantId) {
        startField("appliesToProductVariant");

        _queryBuilder.append("(productVariantId:");
        Query.appendQuotedString(_queryBuilder, productVariantId.toString());

        _queryBuilder.append(')');

        return this;
    }

    /**
    * Whether any of the product variants of the given product are associated to the selling plan group.
    */
    public SellingPlanGroupQuery appliesToProductVariants(ID productId) {
        startField("appliesToProductVariants");

        _queryBuilder.append("(productId:");
        Query.appendQuotedString(_queryBuilder, productId.toString());

        _queryBuilder.append(')');

        return this;
    }

    /**
    * The date and time when the selling plan group was created.
    */
    public SellingPlanGroupQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * The merchant-facing description of the selling plan group.
    */
    public SellingPlanGroupQuery description() {
        startField("description");

        return this;
    }

    /**
    * The merchant-facing label of the selling plan group.
    */
    public SellingPlanGroupQuery merchantCode() {
        startField("merchantCode");

        return this;
    }

    /**
    * The buyer-facing label of the selling plan group.
    */
    public SellingPlanGroupQuery name() {
        startField("name");

        return this;
    }

    /**
    * The values of all options available on the selling plan group. Selling plans are grouped together in
    * Liquid when they're created by the same app, and have the same `selling_plan_group.name` and
    * `selling_plan_group.options` values.
    */
    public SellingPlanGroupQuery options() {
        startField("options");

        return this;
    }

    /**
    * The relative position of the selling plan group for display.
    */
    public SellingPlanGroupQuery position() {
        startField("position");

        return this;
    }

    public class ProductVariantsArguments extends Arguments {
        ProductVariantsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Filters the product variants by a product ID.
        */
        public ProductVariantsArguments productId(ID value) {
            if (value != null) {
                startArgument("productId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
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
    }

    public interface ProductVariantsArgumentsDefinition {
        void define(ProductVariantsArguments args);
    }

    /**
    * Product variants associated to the selling plan group.
    */
    public SellingPlanGroupQuery productVariants(ProductVariantConnectionQueryDefinition queryDef) {
        return productVariants(args -> {}, queryDef);
    }

    /**
    * Product variants associated to the selling plan group.
    */
    public SellingPlanGroupQuery productVariants(ProductVariantsArgumentsDefinition argsDef, ProductVariantConnectionQueryDefinition queryDef) {
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
        * The ID of the product to scope the count to.
        */
        public ProductVariantsCountArguments productId(ID value) {
            if (value != null) {
                startArgument("productId");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface ProductVariantsCountArgumentsDefinition {
        void define(ProductVariantsCountArguments args);
    }

    /**
    * A count of product variants associated to the selling plan group.
    */
    public SellingPlanGroupQuery productVariantsCount(CountQueryDefinition queryDef) {
        return productVariantsCount(args -> {}, queryDef);
    }

    /**
    * A count of product variants associated to the selling plan group.
    */
    public SellingPlanGroupQuery productVariantsCount(ProductVariantsCountArgumentsDefinition argsDef, CountQueryDefinition queryDef) {
        startField("productVariantsCount");

        ProductVariantsCountArguments args = new ProductVariantsCountArguments(_queryBuilder);
        argsDef.define(args);
        ProductVariantsCountArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CountQuery(_queryBuilder));
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
    * Products associated to the selling plan group.
    */
    public SellingPlanGroupQuery products(ProductConnectionQueryDefinition queryDef) {
        return products(args -> {}, queryDef);
    }

    /**
    * Products associated to the selling plan group.
    */
    public SellingPlanGroupQuery products(ProductsArgumentsDefinition argsDef, ProductConnectionQueryDefinition queryDef) {
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
    * A count of products associated to the selling plan group.
    */
    public SellingPlanGroupQuery productsCount(CountQueryDefinition queryDef) {
        startField("productsCount");

        _queryBuilder.append('{');
        queryDef.define(new CountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class SellingPlansArguments extends Arguments {
        SellingPlansArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public SellingPlansArguments first(Integer value) {
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
        public SellingPlansArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public SellingPlansArguments last(Integer value) {
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
        public SellingPlansArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public SellingPlansArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface SellingPlansArgumentsDefinition {
        void define(SellingPlansArguments args);
    }

    /**
    * Selling plans associated to the selling plan group.
    */
    public SellingPlanGroupQuery sellingPlans(SellingPlanConnectionQueryDefinition queryDef) {
        return sellingPlans(args -> {}, queryDef);
    }

    /**
    * Selling plans associated to the selling plan group.
    */
    public SellingPlanGroupQuery sellingPlans(SellingPlansArgumentsDefinition argsDef, SellingPlanConnectionQueryDefinition queryDef) {
        startField("sellingPlans");

        SellingPlansArguments args = new SellingPlansArguments(_queryBuilder);
        argsDef.define(args);
        SellingPlansArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SellingPlanConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A summary of the policies associated to the selling plan group.
    */
    public SellingPlanGroupQuery summary() {
        startField("summary");

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
    public SellingPlanGroupQuery translations(String locale, TranslationQueryDefinition queryDef) {
        return translations(locale, args -> {}, queryDef);
    }

    /**
    * The published translations associated with the resource.
    */
    public SellingPlanGroupQuery translations(String locale, TranslationsArgumentsDefinition argsDef, TranslationQueryDefinition queryDef) {
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
}
