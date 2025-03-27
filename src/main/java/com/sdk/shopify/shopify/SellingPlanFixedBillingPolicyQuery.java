// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* The fixed selling plan billing policy defines how much of the price of the product will be billed to
* customer
* at checkout. If there is an outstanding balance, it determines when it will be paid.
*/
public class SellingPlanFixedBillingPolicyQuery extends Query<SellingPlanFixedBillingPolicyQuery> {
    SellingPlanFixedBillingPolicyQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The checkout charge when the full amount isn't charged at checkout.
    */
    public SellingPlanFixedBillingPolicyQuery checkoutCharge(SellingPlanCheckoutChargeQueryDefinition queryDef) {
        startField("checkoutCharge");

        _queryBuilder.append('{');
        queryDef.define(new SellingPlanCheckoutChargeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The exact time when to capture the full payment.
    */
    public SellingPlanFixedBillingPolicyQuery remainingBalanceChargeExactTime() {
        startField("remainingBalanceChargeExactTime");

        return this;
    }

    /**
    * The period after remaining_balance_charge_trigger, before capturing the full payment. Expressed as
    * an ISO8601 duration.
    */
    public SellingPlanFixedBillingPolicyQuery remainingBalanceChargeTimeAfterCheckout() {
        startField("remainingBalanceChargeTimeAfterCheckout");

        return this;
    }

    /**
    * When to capture payment for amount due.
    */
    public SellingPlanFixedBillingPolicyQuery remainingBalanceChargeTrigger() {
        startField("remainingBalanceChargeTrigger");

        return this;
    }
}
