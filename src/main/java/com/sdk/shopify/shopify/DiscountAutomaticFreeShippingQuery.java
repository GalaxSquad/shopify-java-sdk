// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The `DiscountAutomaticFreeShipping` object lets you manage
* [free shipping discounts](https://help.shopify.com/manual/discounts/discount-types/free-shipping)
* that are automatically applied on a cart and at checkout. Free shipping discounts are promotional
* deals that
* merchants offer to customers to waive shipping costs and encourage online purchases.
* The `DiscountAutomaticFreeShipping` object stores information about automatic free shipping
* discounts that apply to
* specific [products and
* variants](https://shopify.dev/docs/api/admin-graphql/latest/objects/DiscountProducts),
* [collections](https://shopify.dev/docs/api/admin-graphql/latest/objects/DiscountCollections),
* or [all items in a
* cart](https://shopify.dev/docs/api/admin-graphql/latest/objects/AllDiscountItems).
* Learn more about working with [Shopify's discount
* model](https://shopify.dev/docs/apps/build/discounts),
* including limitations and considerations.
* > Note:
* > The
* [`DiscountCodeFreeShipping`](https://shopify.dev/docs/api/admin-graphql/latest/objects/DiscountCodeF
* reeShipping)
* object has similar functionality to the `DiscountAutomaticFreeShipping` object, but customers need
* to enter a code to
* receive a discount.
*/
public class DiscountAutomaticFreeShippingQuery extends Query<DiscountAutomaticFreeShippingQuery> {
    DiscountAutomaticFreeShippingQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Whether the discount applies on one-time purchases.
    * A one-time purchase is a transaction where you pay a
    * single time for a product, without any ongoing
    * commitments or recurring charges.
    */
    public DiscountAutomaticFreeShippingQuery appliesOnOneTimePurchase() {
        startField("appliesOnOneTimePurchase");

        return this;
    }

    /**
    * Whether the discount applies on subscription items.
    * [Subscriptions](https://shopify.dev/docs/apps/launch/billing/subscription-billing/offer-subscription
    * -discounts)
    * enable customers to purchase products
    * on a recurring basis.
    */
    public DiscountAutomaticFreeShippingQuery appliesOnSubscription() {
        startField("appliesOnSubscription");

        return this;
    }

    /**
    * The number of times that the discount has been used.
    * For example, if a "Buy 3, Get 1 Free" t-shirt discount
    * is automatically applied in 200 transactions, then the
    * discount has been used 200 times.
    * This value is updated asynchronously. As a result,
    * it might be lower than the actual usage count until the
    * asynchronous process is completed.
    */
    public DiscountAutomaticFreeShippingQuery asyncUsageCount() {
        startField("asyncUsageCount");

        return this;
    }

    /**
    * The
    * [discount
    * classes](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
    * that you can use in combination with
    * [Shopify discount types](https://help.shopify.com/manual/discounts/discount-types).
    */
    public DiscountAutomaticFreeShippingQuery combinesWith(DiscountCombinesWithQueryDefinition queryDef) {
        startField("combinesWith");

        _queryBuilder.append('{');
        queryDef.define(new DiscountCombinesWithQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time when the discount was created.
    */
    public DiscountAutomaticFreeShippingQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * The countries that qualify for the discount.
    * You can define
    * [a list of countries](https://shopify.dev/docs/api/admin-graphql/latest/objects/DiscountCountries)
    * or specify [all
    * countries](https://shopify.dev/docs/api/admin-graphql/latest/objects/DiscountCountryAll)
    * to be eligible for the discount.
    */
    public DiscountAutomaticFreeShippingQuery destinationSelection(DiscountShippingDestinationSelectionQueryDefinition queryDef) {
        startField("destinationSelection");

        _queryBuilder.append('{');
        queryDef.define(new DiscountShippingDestinationSelectionQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The classes of the discount.
    */
    public DiscountAutomaticFreeShippingQuery discountClasses() {
        startField("discountClasses");

        return this;
    }

    /**
    * The date and time when the discount expires and is no longer available to customers.
    * For discounts without a fixed expiration date, specify `null`.
    */
    public DiscountAutomaticFreeShippingQuery endsAt() {
        startField("endsAt");

        return this;
    }

    /**
    * Whether there are
    * [timeline
    * comments](https://help.shopify.com/manual/discounts/managing-discount-codes#use-the-discount-timelin
    * e)
    * associated with the discount.
    */
    public DiscountAutomaticFreeShippingQuery hasTimelineComment() {
        startField("hasTimelineComment");

        return this;
    }

    /**
    * The maximum shipping price amount accepted to qualify for the discount.
    */
    public DiscountAutomaticFreeShippingQuery maximumShippingPrice(MoneyV2QueryDefinition queryDef) {
        startField("maximumShippingPrice");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The minimum subtotal or quantity of items that are required for the discount to be applied.
    */
    public DiscountAutomaticFreeShippingQuery minimumRequirement(DiscountMinimumRequirementQueryDefinition queryDef) {
        startField("minimumRequirement");

        _queryBuilder.append('{');
        queryDef.define(new DiscountMinimumRequirementQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The number of billing cycles for which the discount can be applied,
    * which is useful for subscription-based discounts. For example, if you set this field
    * to `3`, then the discount only applies to the first three billing cycles of a
    * subscription. If you specify `0`, then the discount applies indefinitely.
    */
    public DiscountAutomaticFreeShippingQuery recurringCycleLimit() {
        startField("recurringCycleLimit");

        return this;
    }

    /**
    * An abbreviated version of the discount
    * [`summary`](https://shopify.dev/docs/api/admin-graphql/latest/objects/DiscountAutomaticFreeShipping#
    * field-summary)
    * field.
    */
    public DiscountAutomaticFreeShippingQuery shortSummary() {
        startField("shortSummary");

        return this;
    }

    /**
    * The date and time when the discount becomes active and is available to customers.
    */
    public DiscountAutomaticFreeShippingQuery startsAt() {
        startField("startsAt");

        return this;
    }

    /**
    * The status of the discount that describes its availability,
    * expiration, or pending activation.
    */
    public DiscountAutomaticFreeShippingQuery status() {
        startField("status");

        return this;
    }

    /**
    * A detailed explanation of what the discount is,
    * who can use it, when and where it applies, and any associated
    * rules or limitations.
    */
    public DiscountAutomaticFreeShippingQuery summary() {
        startField("summary");

        return this;
    }

    /**
    * The discount's name that displays to merchants in the Shopify admin and to customers.
    */
    public DiscountAutomaticFreeShippingQuery title() {
        startField("title");

        return this;
    }

    /**
    * The total sales from orders where the discount was used.
    */
    public DiscountAutomaticFreeShippingQuery totalSales(MoneyV2QueryDefinition queryDef) {
        startField("totalSales");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time when the discount was updated.
    */
    public DiscountAutomaticFreeShippingQuery updatedAt() {
        startField("updatedAt");

        return this;
    }
}
