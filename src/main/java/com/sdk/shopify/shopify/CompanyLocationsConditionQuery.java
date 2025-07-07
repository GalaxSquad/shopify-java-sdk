// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Query;

/**
* A condition checking the company location a visitor is purchasing for.
*/
public class CompanyLocationsConditionQuery extends Query<CompanyLocationsConditionQuery> {
    CompanyLocationsConditionQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The application level for the condition.
    */
    public CompanyLocationsConditionQuery applicationLevel() {
        startField("applicationLevel");

        return this;
    }

    public class CompanyLocationsArguments extends Arguments {
        CompanyLocationsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CompanyLocationsArguments first(Integer value) {
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
        public CompanyLocationsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public CompanyLocationsArguments last(Integer value) {
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
        public CompanyLocationsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public CompanyLocationsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CompanyLocationsArgumentsDefinition {
        void define(CompanyLocationsArguments args);
    }

    /**
    * The company locations that comprise the market.
    */
    public CompanyLocationsConditionQuery companyLocations(CompanyLocationConnectionQueryDefinition queryDef) {
        return companyLocations(args -> {}, queryDef);
    }

    /**
    * The company locations that comprise the market.
    */
    public CompanyLocationsConditionQuery companyLocations(CompanyLocationsArgumentsDefinition argsDef, CompanyLocationConnectionQueryDefinition queryDef) {
        startField("companyLocations");

        CompanyLocationsArguments args = new CompanyLocationsArguments(_queryBuilder);
        argsDef.define(args);
        CompanyLocationsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CompanyLocationConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
