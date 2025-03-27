// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Query;

/**
* A contract between a merchant and a customer to do business. Shopify creates a sales agreement
* whenever an order is placed, edited, or refunded. A sales agreement has one or more sales records,
* which provide itemized details about the initial agreement or subsequent changes made to the order.
* For example, when a customer places an order, Shopify creates the order, generates a sales
* agreement, and records a sale for each line item purchased in the order. A sale record is specific
* to a type of order line. Order lines can represent different things such as a purchased product, a
* tip added by a customer, shipping costs collected at checkout, and more.
*/
public class SalesAgreementQuery extends Query<SalesAgreementQuery> {
    SalesAgreementQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    /**
    * The application that created the agreement.
    */
    public SalesAgreementQuery app(AppQueryDefinition queryDef) {
        startField("app");

        _queryBuilder.append('{');
        queryDef.define(new AppQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time at which the agreement occured.
    */
    public SalesAgreementQuery happenedAt() {
        startField("happenedAt");

        return this;
    }

    /**
    * The unique ID for the agreement.
    */
    public SalesAgreementQuery id() {
        startField("id");

        return this;
    }

    /**
    * The reason the agremeent was created.
    */
    public SalesAgreementQuery reason() {
        startField("reason");

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
    public SalesAgreementQuery sales(SaleConnectionQueryDefinition queryDef) {
        return sales(args -> {}, queryDef);
    }

    /**
    * The sales associated with the agreement.
    */
    public SalesAgreementQuery sales(SalesArgumentsDefinition argsDef, SaleConnectionQueryDefinition queryDef) {
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
    public SalesAgreementQuery user(StaffMemberQueryDefinition queryDef) {
        startField("user");

        _queryBuilder.append('{');
        queryDef.define(new StaffMemberQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public SalesAgreementQuery onOrderAgreement(OrderAgreementQueryDefinition queryDef) {
        startInlineFragment("OrderAgreement");
        queryDef.define(new OrderAgreementQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public SalesAgreementQuery onOrderEditAgreement(OrderEditAgreementQueryDefinition queryDef) {
        startInlineFragment("OrderEditAgreement");
        queryDef.define(new OrderEditAgreementQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public SalesAgreementQuery onRefundAgreement(RefundAgreementQueryDefinition queryDef) {
        startInlineFragment("RefundAgreement");
        queryDef.define(new RefundAgreementQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public SalesAgreementQuery onReturnAgreement(ReturnAgreementQueryDefinition queryDef) {
        startInlineFragment("ReturnAgreement");
        queryDef.define(new ReturnAgreementQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
