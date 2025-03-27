// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

/**
* A checkout that was abandoned by the customer.
*/
public class AbandonedCheckoutQuery extends Query<AbandonedCheckoutQuery> {
    AbandonedCheckoutQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The URL for the buyer to recover their checkout.
    */
    public AbandonedCheckoutQuery abandonedCheckoutUrl() {
        startField("abandonedCheckoutUrl");

        return this;
    }

    /**
    * The billing address provided by the buyer.
    * Null if the user did not provide a billing address.
    */
    public AbandonedCheckoutQuery billingAddress(MailingAddressQueryDefinition queryDef) {
        startField("billingAddress");

        _queryBuilder.append('{');
        queryDef.define(new MailingAddressQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time when the buyer completed the checkout.
    * Null if the checkout has not been completed.
    */
    public AbandonedCheckoutQuery completedAt() {
        startField("completedAt");

        return this;
    }

    /**
    * The date and time when the checkout was created.
    */
    public AbandonedCheckoutQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * A list of extra information that has been added to the checkout.
    */
    public AbandonedCheckoutQuery customAttributes(AttributeQueryDefinition queryDef) {
        startField("customAttributes");

        _queryBuilder.append('{');
        queryDef.define(new AttributeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The customer who created this checkout.
    * May be null if the checkout was created from a draft order or via an app.
    */
    public AbandonedCheckoutQuery customer(CustomerQueryDefinition queryDef) {
        startField("customer");

        _queryBuilder.append('{');
        queryDef.define(new CustomerQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A default [cursor](https://shopify.dev/api/usage/pagination-graphql) that returns the single next
    * record, sorted ascending by ID.
    */
    public AbandonedCheckoutQuery defaultCursor() {
        startField("defaultCursor");

        return this;
    }

    /**
    * The discount codes entered by the buyer at checkout.
    */
    public AbandonedCheckoutQuery discountCodes() {
        startField("discountCodes");

        return this;
    }

    public class LineItemsArguments extends Arguments {
        LineItemsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public LineItemsArguments first(Integer value) {
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
        public LineItemsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
        */
        public LineItemsArguments last(Integer value) {
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
        public LineItemsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Reverse the order of the underlying list.
        */
        public LineItemsArguments reverse(Boolean value) {
            if (value != null) {
                startArgument("reverse");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface LineItemsArgumentsDefinition {
        void define(LineItemsArguments args);
    }

    /**
    * A list of the line items in this checkout.
    */
    public AbandonedCheckoutQuery lineItems(AbandonedCheckoutLineItemConnectionQueryDefinition queryDef) {
        return lineItems(args -> {}, queryDef);
    }

    /**
    * A list of the line items in this checkout.
    */
    public AbandonedCheckoutQuery lineItems(LineItemsArgumentsDefinition argsDef, AbandonedCheckoutLineItemConnectionQueryDefinition queryDef) {
        startField("lineItems");

        LineItemsArguments args = new LineItemsArguments(_queryBuilder);
        argsDef.define(args);
        LineItemsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new AbandonedCheckoutLineItemConnectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Unique merchant-facing identifier for the checkout.
    */
    public AbandonedCheckoutQuery name() {
        startField("name");

        return this;
    }

    /**
    * A merchant-facing note added to the checkout. Not visible to the buyer.
    */
    public AbandonedCheckoutQuery note() {
        startField("note");

        return this;
    }

    /**
    * The shipping address to where the line items will be shipped.
    * Null if the user did not provide a shipping address.
    */
    public AbandonedCheckoutQuery shippingAddress(MailingAddressQueryDefinition queryDef) {
        startField("shippingAddress");

        _queryBuilder.append('{');
        queryDef.define(new MailingAddressQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The sum of all items in the checkout, including discounts but excluding shipping, taxes and tips.
    */
    public AbandonedCheckoutQuery subtotalPriceSet(MoneyBagQueryDefinition queryDef) {
        startField("subtotalPriceSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Individual taxes charged on the checkout.
    */
    public AbandonedCheckoutQuery taxLines(TaxLineQueryDefinition queryDef) {
        startField("taxLines");

        _queryBuilder.append('{');
        queryDef.define(new TaxLineQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether taxes are included in line item and shipping line prices.
    */
    public AbandonedCheckoutQuery taxesIncluded() {
        startField("taxesIncluded");

        return this;
    }

    /**
    * The total amount of discounts to be applied.
    */
    public AbandonedCheckoutQuery totalDiscountSet(MoneyBagQueryDefinition queryDef) {
        startField("totalDiscountSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total duties applied to the checkout.
    */
    public AbandonedCheckoutQuery totalDutiesSet(MoneyBagQueryDefinition queryDef) {
        startField("totalDutiesSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The sum of the prices of all line items in the checkout.
    */
    public AbandonedCheckoutQuery totalLineItemsPriceSet(MoneyBagQueryDefinition queryDef) {
        startField("totalLineItemsPriceSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The sum of all items in the checkout, including discounts, shipping, taxes, and tips.
    */
    public AbandonedCheckoutQuery totalPriceSet(MoneyBagQueryDefinition queryDef) {
        startField("totalPriceSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total tax applied to the checkout.
    */
    public AbandonedCheckoutQuery totalTaxSet(MoneyBagQueryDefinition queryDef) {
        startField("totalTaxSet");

        _queryBuilder.append('{');
        queryDef.define(new MoneyBagQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time when the checkout was most recently updated.
    */
    public AbandonedCheckoutQuery updatedAt() {
        startField("updatedAt");

        return this;
    }
}
