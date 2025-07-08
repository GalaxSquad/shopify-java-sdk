// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Query;

/**
* The product component information.
*/
public class ProductComponentTypeQuery extends Query<ProductComponentTypeQuery> {
    ProductComponentTypeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class ComponentVariantsArguments extends Arguments {
        ComponentVariantsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ComponentVariantsArguments first(Integer value) {
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
        public ComponentVariantsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ComponentVariantsArguments last(Integer value) {
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
        public ComponentVariantsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public ComponentVariantsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ComponentVariantsArgumentsDefinition {
        void define(ComponentVariantsArguments args);
    }

    /**
    * The list of products' variants that are components.
    */
    public ProductComponentTypeQuery componentVariants(ProductVariantConnectionQueryDefinition queryDef) {
        return componentVariants(args -> {}, queryDef);
    }

    /**
    * The list of products' variants that are components.
    */
    public ProductComponentTypeQuery componentVariants(ComponentVariantsArgumentsDefinition argsDef, ProductVariantConnectionQueryDefinition queryDef) {
        startField("componentVariants");

        ComponentVariantsArguments args = new ComponentVariantsArguments(_queryBuilder);
        argsDef.define(args);
        ComponentVariantsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ProductVariantConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The number of component variants for the product component.
    */
    public ProductComponentTypeQuery componentVariantsCount(CountQueryDefinition queryDef) {
        startField("componentVariantsCount");

        _queryBuilder.append('{');
        queryDef.define(new CountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class NonComponentVariantsArguments extends Arguments {
        NonComponentVariantsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public NonComponentVariantsArguments first(Integer value) {
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
        public NonComponentVariantsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public NonComponentVariantsArguments last(Integer value) {
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
        public NonComponentVariantsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public NonComponentVariantsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface NonComponentVariantsArgumentsDefinition {
        void define(NonComponentVariantsArguments args);
    }

    /**
    * The list of products' variants that are not components.
    */
    public ProductComponentTypeQuery nonComponentVariants(ProductVariantConnectionQueryDefinition queryDef) {
        return nonComponentVariants(args -> {}, queryDef);
    }

    /**
    * The list of products' variants that are not components.
    */
    public ProductComponentTypeQuery nonComponentVariants(NonComponentVariantsArgumentsDefinition argsDef, ProductVariantConnectionQueryDefinition queryDef) {
        startField("nonComponentVariants");

        NonComponentVariantsArguments args = new NonComponentVariantsArguments(_queryBuilder);
        argsDef.define(args);
        NonComponentVariantsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ProductVariantConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The number of non_components variants for the product component.
    */
    public ProductComponentTypeQuery nonComponentVariantsCount(CountQueryDefinition queryDef) {
        startField("nonComponentVariantsCount");

        _queryBuilder.append('{');
        queryDef.define(new CountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The product that's a component.
    */
    public ProductComponentTypeQuery product(ProductQueryDefinition queryDef) {
        startField("product");

        _queryBuilder.append('{');
        queryDef.define(new ProductQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
