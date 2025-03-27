// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Query;

/**
* Represents the payment terms for an order or draft order.
*/
public class PaymentTermsQuery extends Query<PaymentTermsQuery> {
    PaymentTermsQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The draft order associated with the payment terms.
    */
    public PaymentTermsQuery draftOrder(DraftOrderQueryDefinition queryDef) {
        startField("draftOrder");

        _queryBuilder.append('{');
        queryDef.define(new DraftOrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Duration of payment terms in days based on the payment terms template used to create the payment
    * terms.
    */
    public PaymentTermsQuery dueInDays() {
        startField("dueInDays");

        return this;
    }

    /**
    * The order associated with the payment terms.
    */
    public PaymentTermsQuery order(OrderQueryDefinition queryDef) {
        startField("order");

        _queryBuilder.append('{');
        queryDef.define(new OrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the payment terms have overdue payment schedules.
    */
    public PaymentTermsQuery overdue() {
        startField("overdue");

        return this;
    }

    public class PaymentSchedulesArguments extends Arguments {
        PaymentSchedulesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public PaymentSchedulesArguments first(Integer value) {
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
        public PaymentSchedulesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public PaymentSchedulesArguments last(Integer value) {
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
        public PaymentSchedulesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public PaymentSchedulesArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface PaymentSchedulesArgumentsDefinition {
        void define(PaymentSchedulesArguments args);
    }

    /**
    * List of schedules for the payment terms.
    */
    public PaymentTermsQuery paymentSchedules(PaymentScheduleConnectionQueryDefinition queryDef) {
        return paymentSchedules(args -> {}, queryDef);
    }

    /**
    * List of schedules for the payment terms.
    */
    public PaymentTermsQuery paymentSchedules(PaymentSchedulesArgumentsDefinition argsDef, PaymentScheduleConnectionQueryDefinition queryDef) {
        startField("paymentSchedules");

        PaymentSchedulesArguments args = new PaymentSchedulesArguments(_queryBuilder);
        argsDef.define(args);
        PaymentSchedulesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PaymentScheduleConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The name of the payment terms template used to create the payment terms.
    */
    public PaymentTermsQuery paymentTermsName() {
        startField("paymentTermsName");

        return this;
    }

    /**
    * The payment terms template type used to create the payment terms.
    */
    public PaymentTermsQuery paymentTermsType() {
        startField("paymentTermsType");

        return this;
    }

    /**
    * The payment terms name, translated into the shop admin's preferred language.
    */
    public PaymentTermsQuery translatedName() {
        startField("translatedName");

        return this;
    }
}
