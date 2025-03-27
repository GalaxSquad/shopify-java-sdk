// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Query;

/**
* The product's component information.
*/
public class ProductBundleComponentQuery extends Query<ProductBundleComponentQuery> {
    ProductBundleComponentQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The product that's related as a component.
    */
    public ProductBundleComponentQuery componentProduct(ProductQueryDefinition queryDef) {
        startField("componentProduct");

        _queryBuilder.append('{');
        queryDef.define(new ProductQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
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
    public ProductBundleComponentQuery componentVariants(ProductVariantConnectionQueryDefinition queryDef) {
        return componentVariants(args -> {}, queryDef);
    }

    /**
    * The list of products' variants that are components.
    */
    public ProductBundleComponentQuery componentVariants(ComponentVariantsArgumentsDefinition argsDef, ProductVariantConnectionQueryDefinition queryDef) {
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
    public ProductBundleComponentQuery componentVariantsCount(CountQueryDefinition queryDef) {
        startField("componentVariantsCount");

        _queryBuilder.append('{');
        queryDef.define(new CountQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The options in the parent and the component options they're connected to, along with the chosen
    * option values
    * that appear in the bundle.
    */
    public ProductBundleComponentQuery optionSelections(ProductBundleComponentOptionSelectionQueryDefinition queryDef) {
        startField("optionSelections");

        _queryBuilder.append('{');
        queryDef.define(new ProductBundleComponentOptionSelectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The quantity of the component product set for this bundle line.
    * It will be null if there's a quantityOption present.
    */
    public ProductBundleComponentQuery quantity() {
        startField("quantity");

        return this;
    }

    /**
    * The quantity as option of the component product. It will be null if there's a quantity set.
    */
    public ProductBundleComponentQuery quantityOption(ProductBundleComponentQuantityOptionQueryDefinition queryDef) {
        startField("quantityOption");

        _queryBuilder.append('{');
        queryDef.define(new ProductBundleComponentQuantityOptionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
