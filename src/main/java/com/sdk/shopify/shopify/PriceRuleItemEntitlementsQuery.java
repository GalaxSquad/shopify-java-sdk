// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Query;

/**
* The items to which this price rule applies. This may be multiple products, product variants,
* collections or combinations of the aforementioned.
*/
public class PriceRuleItemEntitlementsQuery extends Query<PriceRuleItemEntitlementsQuery> {
    PriceRuleItemEntitlementsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
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
    * The collections to which the price rule applies.
    */
    public PriceRuleItemEntitlementsQuery collections(CollectionConnectionQueryDefinition queryDef) {
        return collections(args -> {}, queryDef);
    }

    /**
    * The collections to which the price rule applies.
    */
    public PriceRuleItemEntitlementsQuery collections(CollectionsArgumentsDefinition argsDef, CollectionConnectionQueryDefinition queryDef) {
        startField("collections");

        CollectionsArguments args = new CollectionsArguments(_queryBuilder);
        argsDef.define(args);
        CollectionsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CollectionConnectionQuery(_queryBuilder));
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
    }

    public interface ProductVariantsArgumentsDefinition {
        void define(ProductVariantsArguments args);
    }

    /**
    * The product variants to which the price rule applies.
    */
    public PriceRuleItemEntitlementsQuery productVariants(ProductVariantConnectionQueryDefinition queryDef) {
        return productVariants(args -> {}, queryDef);
    }

    /**
    * The product variants to which the price rule applies.
    */
    public PriceRuleItemEntitlementsQuery productVariants(ProductVariantsArgumentsDefinition argsDef, ProductVariantConnectionQueryDefinition queryDef) {
        startField("productVariants");

        ProductVariantsArguments args = new ProductVariantsArguments(_queryBuilder);
        argsDef.define(args);
        ProductVariantsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ProductVariantConnectionQuery(_queryBuilder));
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
    * The products to which the price rule applies.
    */
    public PriceRuleItemEntitlementsQuery products(ProductConnectionQueryDefinition queryDef) {
        return products(args -> {}, queryDef);
    }

    /**
    * The products to which the price rule applies.
    */
    public PriceRuleItemEntitlementsQuery products(ProductsArgumentsDefinition argsDef, ProductConnectionQueryDefinition queryDef) {
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
    * Whether the price rule applies to all line items.
    */
    public PriceRuleItemEntitlementsQuery targetAllLineItems() {
        startField("targetAllLineItems");

        return this;
    }
}
