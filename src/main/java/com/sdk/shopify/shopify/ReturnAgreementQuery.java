// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Query;

/**
* An agreement between the merchant and customer for a return.
*/
public class ReturnAgreementQuery extends Query<ReturnAgreementQuery> {
    ReturnAgreementQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The application that created the agreement.
    */
    public ReturnAgreementQuery app(AppQueryDefinition queryDef) {
        startField("app");

        _queryBuilder.append('{');
        queryDef.define(new AppQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time at which the agreement occured.
    */
    public ReturnAgreementQuery happenedAt() {
        startField("happenedAt");

        return this;
    }

    /**
    * The unique ID for the agreement.
    */
    public ReturnAgreementQuery id() {
        startField("id");

        return this;
    }

    /**
    * The reason the agremeent was created.
    */
    public ReturnAgreementQuery reason() {
        startField("reason");

        return this;
    }

    /**
    * The return associated with the agreement.
    */
    public ReturnAgreementQuery returnValue(ReturnQueryDefinition queryDef) {
        startField("return");

        _queryBuilder.append('{');
        queryDef.define(new ReturnQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class SalesArguments extends Arguments {
        SalesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public SalesArguments first(Integer value) {
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
        public SalesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public SalesArguments last(Integer value) {
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
        public SalesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public SalesArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface SalesArgumentsDefinition {
        void define(SalesArguments args);
    }

    /**
    * The sales associated with the agreement.
    */
    public ReturnAgreementQuery sales(SaleConnectionQueryDefinition queryDef) {
        return sales(args -> {}, queryDef);
    }

    /**
    * The sales associated with the agreement.
    */
    public ReturnAgreementQuery sales(SalesArgumentsDefinition argsDef, SaleConnectionQueryDefinition queryDef) {
        startField("sales");

        SalesArguments args = new SalesArguments(_queryBuilder);
        argsDef.define(args);
        SalesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SaleConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The staff member associated with the agreement.
    */
    public ReturnAgreementQuery user(StaffMemberQueryDefinition queryDef) {
        startField("user");

        _queryBuilder.append('{');
        queryDef.define(new StaffMemberQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
