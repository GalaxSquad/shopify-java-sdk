// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Query;

/**
* A product and the subset of associated variants that are part of this delivery profile.
*/
public class DeliveryProfileItemQuery extends Query<DeliveryProfileItemQuery> {
    DeliveryProfileItemQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * A product associated with this profile.
    */
    public DeliveryProfileItemQuery product(ProductQueryDefinition queryDef) {
        startField("product");

        _queryBuilder.append('{');
        queryDef.define(new ProductQuery(_queryBuilder));
        _queryBuilder.append('}');

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
    }

    public interface VariantsArgumentsDefinition {
        void define(VariantsArguments args);
    }

    /**
    * The product variants associated with this delivery profile.
    */
    public DeliveryProfileItemQuery variants(ProductVariantConnectionQueryDefinition queryDef) {
        return variants(args -> {}, queryDef);
    }

    /**
    * The product variants associated with this delivery profile.
    */
    public DeliveryProfileItemQuery variants(VariantsArgumentsDefinition argsDef, ProductVariantConnectionQueryDefinition queryDef) {
        startField("variants");

        VariantsArguments args = new VariantsArguments(_queryBuilder);
        argsDef.define(args);
        VariantsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ProductVariantConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
