// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Query;

/**
* A Shopify product taxonomy choice list attribute.
*/
public class TaxonomyChoiceListAttributeQuery extends Query<TaxonomyChoiceListAttributeQuery> {
    TaxonomyChoiceListAttributeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The name of the product taxonomy attribute. For example, Color.
    */
    public TaxonomyChoiceListAttributeQuery name() {
        startField("name");

        return this;
    }

    public class ValuesArguments extends Arguments {
        ValuesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ValuesArguments first(Integer value) {
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
        public ValuesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public ValuesArguments last(Integer value) {
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
        public ValuesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }
    }

    public interface ValuesArgumentsDefinition {
        void define(ValuesArguments args);
    }

    /**
    * A list of values on the choice list attribute.
    */
    public TaxonomyChoiceListAttributeQuery values(TaxonomyValueConnectionQueryDefinition queryDef) {
        return values(args -> {}, queryDef);
    }

    /**
    * A list of values on the choice list attribute.
    */
    public TaxonomyChoiceListAttributeQuery values(ValuesArgumentsDefinition argsDef, TaxonomyValueConnectionQueryDefinition queryDef) {
        startField("values");

        ValuesArguments args = new ValuesArguments(_queryBuilder);
        argsDef.define(args);
        ValuesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new TaxonomyValueConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
