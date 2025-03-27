// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The `DiscountAutomaticApp` object stores information about automatic discounts
* that are managed by an app using
* [Shopify Functions](https://shopify.dev/docs/apps/build/functions).
* Use `DiscountAutomaticApp`when you need advanced, custom, or
* dynamic discount capabilities that aren't supported by
* [Shopify's native discount types](https://help.shopify.com/manual/discounts/discount-types).
* Learn more about creating
* [custom discount
* functionality](https://shopify.dev/docs/apps/build/discounts/build-discount-function).
* > Note:
* > The [`DiscountCodeApp`](https://shopify.dev/docs/api/admin-graphql/latest/objects/DiscountCodeApp)
* object has similar functionality to the `DiscountAutomaticApp` object, with the exception that
* `DiscountCodeApp`
* stores information about discount codes that are managed by an app using Shopify Functions.
*/
public class DiscountAutomaticAppQuery extends Query<DiscountAutomaticAppQuery> {
    DiscountAutomaticAppQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The details about the app extension that's providing the
    * [discount type](https://help.shopify.com/manual/discounts/discount-types).
    * This information includes the app extension's name and
    * [client ID](https://shopify.dev/docs/apps/build/authentication-authorization/client-secrets),
    * [App Bridge configuration](https://shopify.dev/docs/api/app-bridge),
    * [discount
    * class](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations),
    * [function
    * ID](https://shopify.dev/docs/apps/build/functions/input-output/metafields-for-input-queries),
    * and other metadata about the discount type, including the discount type's name and description.
    */
    public DiscountAutomaticAppQuery appDiscountType(AppDiscountTypeQueryDefinition queryDef) {
        startField("appDiscountType");

        _queryBuilder.append('{');
        queryDef.define(new AppDiscountTypeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Whether the discount applies on one-time purchases.
    */
    public DiscountAutomaticAppQuery appliesOnOneTimePurchase() {
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
    public DiscountAutomaticAppQuery appliesOnSubscription() {
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
    public DiscountAutomaticAppQuery asyncUsageCount() {
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
    public DiscountAutomaticAppQuery combinesWith(DiscountCombinesWithQueryDefinition queryDef) {
        startField("combinesWith");

        _queryBuilder.append('{');
        queryDef.define(new DiscountCombinesWithQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date and time when the discount was created.
    */
    public DiscountAutomaticAppQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * The
    * [discount
    * class](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
    * that's used to control how discounts can be combined.
    */
    public DiscountAutomaticAppQuery discountClass() {
        startField("discountClass");

        return this;
    }

    /**
    * The [globally-unique ID](https://shopify.dev/docs/api/usage/gids)
    * for the discount.
    */
    public DiscountAutomaticAppQuery discountId() {
        startField("discountId");

        return this;
    }

    /**
    * The date and time when the discount expires and is no longer available to customers.
    * For discounts without a fixed expiration date, specify `null`.
    */
    public DiscountAutomaticAppQuery endsAt() {
        startField("endsAt");

        return this;
    }

    /**
    * The [error history](https://shopify.dev/docs/apps/build/functions/monitoring-and-errors)
    * for the latest version of the discount type that the app provides.
    */
    public DiscountAutomaticAppQuery errorHistory(FunctionsErrorHistoryQueryDefinition queryDef) {
        startField("errorHistory");

        _queryBuilder.append('{');
        queryDef.define(new FunctionsErrorHistoryQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The number of billing cycles for which the discount can be applied,
    * which is useful for subscription-based discounts. For example, if you set this field
    * to `3`, then the discount only applies to the first three billing cycles of a
    * subscription. If you specify `0`, then the discount applies indefinitely.
    */
    public DiscountAutomaticAppQuery recurringCycleLimit() {
        startField("recurringCycleLimit");

        return this;
    }

    /**
    * The date and time when the discount becomes active and is available to customers.
    */
    public DiscountAutomaticAppQuery startsAt() {
        startField("startsAt");

        return this;
    }

    /**
    * The status of the discount that describes its availability,
    * expiration, or pending activation.
    */
    public DiscountAutomaticAppQuery status() {
        startField("status");

        return this;
    }

    /**
    * The discount's name that displays to merchants in the Shopify admin and to customers.
    */
    public DiscountAutomaticAppQuery title() {
        startField("title");

        return this;
    }

    /**
    * The date and time when the discount was updated.
    */
    public DiscountAutomaticAppQuery updatedAt() {
        startField("updatedAt");

        return this;
    }
}
