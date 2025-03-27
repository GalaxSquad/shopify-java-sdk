// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The `DiscountAutomaticBasic` object lets you manage
* [amount off
* discounts](https://help.shopify.com/manual/discounts/discount-types/percentage-fixed-amount)
* that are automatically applied on a cart and at checkout. Amount off discounts give customers a
* fixed value or a percentage off the products in an order, but don't apply to shipping costs.
* The `DiscountAutomaticBasic` object stores information about automatic amount off discounts that
* apply to
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
* [`DiscountCodeBasic`](https://shopify.dev/docs/api/admin-graphql/latest/objects/DiscountCodeBasic)
* object has similar functionality to the `DiscountAutomaticBasic` object, but customers need to enter
* a code to
* receive a discount.
*/
public class DiscountAutomaticBasicQuery extends Query<DiscountAutomaticBasicQuery> {
    DiscountAutomaticBasicQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
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
    public DiscountAutomaticBasicQuery asyncUsageCount() {
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
    public DiscountAutomaticBasicQuery combinesWith(DiscountCombinesWithQueryDefinition queryDef) {
        startField("combinesWith");

        _queryBuilder.append('{');
        queryDef.define(new DiscountCombinesWithQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time when the discount was created.
    */
    public DiscountAutomaticBasicQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * The items in the order that qualify for the discount, their quantities, and the total value of the
    * discount.
    */
    public DiscountAutomaticBasicQuery customerGets(DiscountCustomerGetsQueryDefinition queryDef) {
        startField("customerGets");

        _queryBuilder.append('{');
        queryDef.define(new DiscountCustomerGetsQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The [discount
    * class](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
    * that's used to control how discounts can be combined.
    */
    public DiscountAutomaticBasicQuery discountClass() {
        startField("discountClass");

        return this;
    }

    /**
    * The date and time when the discount expires and is no longer available to customers.
    * For discounts without a fixed expiration date, specify `null`.
    */
    public DiscountAutomaticBasicQuery endsAt() {
        startField("endsAt");

        return this;
    }

    /**
    * The minimum subtotal or quantity of items that are required for the discount to be applied.
    */
    public DiscountAutomaticBasicQuery minimumRequirement(DiscountMinimumRequirementQueryDefinition queryDef) {
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
    public DiscountAutomaticBasicQuery recurringCycleLimit() {
        startField("recurringCycleLimit");

        return this;
    }

    /**
    * An abbreviated version of the discount
    * [`summary`](https://shopify.dev/docs/api/admin-graphql/latest/objects/DiscountAutomaticBasic#field-s
    * ummary)
    * field.
    */
    public DiscountAutomaticBasicQuery shortSummary() {
        startField("shortSummary");

        return this;
    }

    /**
    * The date and time when the discount becomes active and is available to customers.
    */
    public DiscountAutomaticBasicQuery startsAt() {
        startField("startsAt");

        return this;
    }

    /**
    * The status of the discount that describes its availability,
    * expiration, or pending activation.
    */
    public DiscountAutomaticBasicQuery status() {
        startField("status");

        return this;
    }

    /**
    * A detailed explanation of what the discount is,
    * who can use it, when and where it applies, and any associated
    * rules or limitations.
    */
    public DiscountAutomaticBasicQuery summary() {
        startField("summary");

        return this;
    }

    /**
    * The discount's name that displays to merchants in the Shopify admin and to customers.
    */
    public DiscountAutomaticBasicQuery title() {
        startField("title");

        return this;
    }

    /**
    * The date and time when the discount was updated.
    */
    public DiscountAutomaticBasicQuery updatedAt() {
        startField("updatedAt");

        return this;
    }
}
