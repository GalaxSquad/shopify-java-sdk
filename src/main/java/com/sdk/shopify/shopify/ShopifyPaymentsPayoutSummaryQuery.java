// Generated from graphql_java_gen gem

package com.sdk.shopify.shopify;

import com.shopify.graphql.support.Query;

/**
* Breakdown of the total fees and gross of each of the different types of transactions associated
* with the payout.
*/
public class ShopifyPaymentsPayoutSummaryQuery extends Query<ShopifyPaymentsPayoutSummaryQuery> {
    ShopifyPaymentsPayoutSummaryQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * Total fees for all adjustments including disputes.
    */
    public ShopifyPaymentsPayoutSummaryQuery adjustmentsFee(MoneyV2QueryDefinition queryDef) {
        startField("adjustmentsFee");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Total gross amount for all adjustments including disputes.
    */
    public ShopifyPaymentsPayoutSummaryQuery adjustmentsGross(MoneyV2QueryDefinition queryDef) {
        startField("adjustmentsGross");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Total fees for all advances.
    */
    public ShopifyPaymentsPayoutSummaryQuery advanceFees(MoneyV2QueryDefinition queryDef) {
        startField("advanceFees");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Total gross amount for all advances.
    */
    public ShopifyPaymentsPayoutSummaryQuery advanceGross(MoneyV2QueryDefinition queryDef) {
        startField("advanceGross");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Total fees for all charges.
    */
    public ShopifyPaymentsPayoutSummaryQuery chargesFee(MoneyV2QueryDefinition queryDef) {
        startField("chargesFee");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Total gross amount for all charges.
    */
    public ShopifyPaymentsPayoutSummaryQuery chargesGross(MoneyV2QueryDefinition queryDef) {
        startField("chargesGross");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Total fees for all refunds.
    */
    public ShopifyPaymentsPayoutSummaryQuery refundsFee(MoneyV2QueryDefinition queryDef) {
        startField("refundsFee");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Total gross amount for all refunds.
    */
    public ShopifyPaymentsPayoutSummaryQuery refundsFeeGross(MoneyV2QueryDefinition queryDef) {
        startField("refundsFeeGross");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Total fees for all reserved funds.
    */
    public ShopifyPaymentsPayoutSummaryQuery reservedFundsFee(MoneyV2QueryDefinition queryDef) {
        startField("reservedFundsFee");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Total gross amount for all reserved funds.
    */
    public ShopifyPaymentsPayoutSummaryQuery reservedFundsGross(MoneyV2QueryDefinition queryDef) {
        startField("reservedFundsGross");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Total fees for all retried payouts.
    */
    public ShopifyPaymentsPayoutSummaryQuery retriedPayoutsFee(MoneyV2QueryDefinition queryDef) {
        startField("retriedPayoutsFee");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Total gross amount for all retried payouts.
    */
    public ShopifyPaymentsPayoutSummaryQuery retriedPayoutsGross(MoneyV2QueryDefinition queryDef) {
        startField("retriedPayoutsGross");

        _queryBuilder.append('{');
        queryDef.define(new MoneyV2Query(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
