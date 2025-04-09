// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Query;

/**
* Represents an issued gift card.
*/
public class GiftCardQuery extends Query<GiftCardQuery> {
    GiftCardQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The gift card's remaining balance.
    */
    public GiftCardQuery balance(MoneyV2QueryDefinition queryDef) {
        startField("balance");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time at which the gift card was created.
    */
    public GiftCardQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * The customer who will receive the gift card.
    */
    public GiftCardQuery customer(CustomerQueryDefinition queryDef) {
        startField("customer");

        _queryBuilder.append('{');
        queryDef.define(new CustomerQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time at which the gift card was deactivated.
    */
    public GiftCardQuery deactivatedAt() {
        startField("deactivatedAt");

        return this;
    }

    /**
    * Whether the gift card is enabled.
    */
    public GiftCardQuery enabled() {
        startField("enabled");

        return this;
    }

    /**
    * The date at which the gift card will expire.
    */
    public GiftCardQuery expiresOn() {
        startField("expiresOn");

        return this;
    }

    /**
    * The initial value of the gift card.
    */
    public GiftCardQuery initialValue(MoneyV2QueryDefinition queryDef) {
        startField("initialValue");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The final four characters of the gift card code.
    */
    public GiftCardQuery lastCharacters() {
        startField("lastCharacters");

        return this;
    }

    /**
    * The gift card code. Everything but the final four characters is masked.
    */
    public GiftCardQuery maskedCode() {
        startField("maskedCode");

        return this;
    }

    /**
    * The note associated with the gift card, which isn't visible to the customer.
    */
    public GiftCardQuery note() {
        startField("note");

        return this;
    }

    /**
    * The order associated with the gift card. This value is `null` if the gift card was issued manually.
    */
    public GiftCardQuery order(OrderQueryDefinition queryDef) {
        startField("order");

        _queryBuilder.append('{');
        queryDef.define(new OrderQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The recipient who will receive the gift card.
    */
    public GiftCardQuery recipientAttributes(GiftCardRecipientQueryDefinition queryDef) {
        startField("recipientAttributes");

        _queryBuilder.append('{');
        queryDef.define(new GiftCardRecipientQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The theme template used to render the gift card online.
    */
    public GiftCardQuery templateSuffix() {
        startField("templateSuffix");

        return this;
    }

    public class TransactionsArguments extends Arguments {
        TransactionsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public TransactionsArguments first(Integer value) {
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
        public TransactionsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public TransactionsArguments last(Integer value) {
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
        public TransactionsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public TransactionsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface TransactionsArgumentsDefinition {
        void define(TransactionsArguments args);
    }

    /**
    * The transaction history of the gift card.
    */
    public GiftCardQuery transactions(GiftCardTransactionConnectionQueryDefinition queryDef) {
        return transactions(args -> {}, queryDef);
    }

    /**
    * The transaction history of the gift card.
    */
    public GiftCardQuery transactions(TransactionsArgumentsDefinition argsDef, GiftCardTransactionConnectionQueryDefinition queryDef) {
        startField("transactions");

        TransactionsArguments args = new TransactionsArguments(_queryBuilder);
        argsDef.define(args);
        TransactionsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new GiftCardTransactionConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time at which the gift card was updated.
    */
    public GiftCardQuery updatedAt() {
        startField("updatedAt");

        return this;
    }
}
